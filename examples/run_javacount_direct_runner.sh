#!/bin/bash
cd python
echo "Note: Setup a Beam virtual environment before executing this."
rm output*
python javacount.py --runner DirectRunner --environment_type=DOCKER --input input1 --output output --sdk_harness_container_image_overrides ".*java.*,chamikaramj/beam_java11_sdk:latest"
