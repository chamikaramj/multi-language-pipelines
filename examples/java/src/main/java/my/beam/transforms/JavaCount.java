package my.beam.transforms;

import org.apache.beam.sdk.transforms.Count;
import org.apache.beam.sdk.transforms.DoFn;
import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.transforms.ParDo;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;

public class JavaCount extends PTransform<PCollection<String>, PCollection<KV<String, Long>>> {

  public JavaCount() {
  }

  @Override
  public PCollection<KV<String, Long>> expand(PCollection<String> input) {
    return input
        .apply(
            "JavaCount", Count.perElement());
  }
}
