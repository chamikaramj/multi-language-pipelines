package my.beam.transforms;

import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.PCollection;

public class JavaPrefix extends PTransform<PCollection<String>, PCollection<String>> {

  final String prefix;

  public JavaPrefix(String prefix) {
    this.prefix = prefix;
  }

  class AddPrefixDoFn extends DoFn<String, String> {

    @ProcessElement
    public void process(@Element String input, OutputReceiver<String> o) {
      o.output(prefix + input);
    }
  }

  @Override
  public PCollection<String> expand(PCollection<String> input) {
    return input
        .apply(
            "AddPrefix",
            ParDo.of(new AddPrefixDoFn()));
  }
}
