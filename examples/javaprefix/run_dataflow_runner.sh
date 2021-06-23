#!/bin/bash
cd python
gsutil rm gs://clouddfe-chamikara/javaprefix/*
export PROJECT=google.com:clouddfe
export TEMP_LOCATION=gs://clouddfe-chamikara/tmp
export REGION="us-central1"
export JOB_NAME="javaprefix-`date +%Y%m%d-%H%M%S`"
export NUM_WORKERS="1"
python addprefix.py \
    --runner DataflowRunner \
    --temp_location $TEMP_LOCATION \
    --project $PROJECT \
    --region $REGION \
    --job_name $JOB_NAME \
    --num_workers $NUM_WORKERS \
    --experiments=use_runner_v2 \
    --input "gs://dataflow-samples/shakespeare/kinglear.txt" \
    --output "gs://clouddfe-chamikara/javaprefix/output"

