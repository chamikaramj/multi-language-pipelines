#!/bin/bash
export GCP_PROJECT=<project>
export GCS_BUCKET=<bucket>
export TEMP_LOCATION=gs://$GCS_BUCKET/tmp
export GCP_REGION=<region>
export JOB_NAME="javacount-`date +%Y%m%d-%H%M%S`"
export NUM_WORKERS="1"
cd python
gsutil rm gs://$GCS_BUCKET/javacount/*
python javacount.py \
    --runner DataflowRunner \
    --temp_location $TEMP_LOCATION \
    --project $PROJECT \
    --region $GCP_REGION \
    --job_name $JOB_NAME \
    --num_workers $NUM_WORKERS \
    --experiments=use_runner_v2 \  # This is optional for Beam 2.32.0 and later.
    --input "gs://dataflow-samples/shakespeare/kinglear.txt" \
    --output "gs://$GCS_BUCKET/javacount/output"

