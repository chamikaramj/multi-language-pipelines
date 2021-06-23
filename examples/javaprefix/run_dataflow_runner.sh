#!/bin/bash
cd python
export OUTPUT_DIR=<GCS Output Dir>
export PROJECT=<GCP Project>
export TEMP_LOCATION=<GCS Temp Dir>
export REGION=<GCP Region>
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
    --output $OUTPUT_DIR
