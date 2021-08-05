package my.beam.transforms;

import org.apache.beam.sdk.transforms.PTransform;
import org.apache.beam.sdk.values.KV;
import org.apache.beam.sdk.values.PCollection;
import org.apache.beam.sdk.transforms.ExternalTransformBuilder;

public class JavaPrefixBuilder implements
    ExternalTransformBuilder<JavaPrefixConfiguration, PCollection<String>, PCollection<String>> {

  @Override
  public PTransform<PCollection<String>, PCollection<String>> buildExternal(
      JavaPrefixConfiguration configuration) {
    return new JavaPrefix(configuration.prefix);
  }
}
