# Example multi-language pipelines

* Example 1 - JavaPrefix: A python pipeline that reads a text file and attaches a prefix in Java side to each input.
* Example 2 - JavaCount: A Python WordCount example that utilizes a *Count* transform in Java side.

## Instructions for running the pipelines

* Start the expansion service by running script *start_expansion_service.sh*

* To run the pipeline using DirectRunner, run corresponding *run_<example>_direct.sh* script.

* To run the pipeline using DataflowRunner,
  * Follow the instructions [here](https://cloud.google.com/dataflow/docs/quickstarts/quickstart-python) to setup a GCP project
  * Open the corresponding *run_<example>_dataflow.sh* script
  * Update the enironment variables at the top of the script.
  * Save and run the script.

