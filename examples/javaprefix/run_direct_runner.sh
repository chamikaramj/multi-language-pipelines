#!/bin/bash
cd python
echo "Note: Setup a Beam virtual environment before executing this."
rm output*
python addprefix.py --runner DirectRunner --environment_type=DOCKER --input input1 --output output
