package my.beam.transforms;

import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.transforms.ExternalTransformBuilder;

public class JavaCountBuilder implements
    ExternalTransformBuilder<JavaCountConfiguration, PCollection<String>, PCollection<KV<String, Long>>> {

  @Override
  public PTransform<PCollection<String>, PCollection<KV<String, Long>>> buildExternal(
      JavaCountConfiguration configuration) {
    return new JavaCount();
  }
}
