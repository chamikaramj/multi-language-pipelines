package my.beam.transforms;

import com.google.auto.service.AutoService;

import java.util.Map;
import org.apache.beam.sdk.expansion.ExternalTransformRegistrar;
import org.apache.beam.sdk.transforms.ExternalTransformBuilder;
import org.apache.beam.vendor.guava.v26_0_jre.com.google.common.collect.ImmutableMap;

@AutoService(ExternalTransformRegistrar.class)
public class JavaPrefixRegistrar implements ExternalTransformRegistrar {

  final String URN = "my.beam.transform.javaprefix";

  @Override
  public Map<String, ExternalTransformBuilder<?, ?, ?>> knownBuilderInstances() {
    return ImmutableMap.of(URN,new JavaPrefixBuilder());
  }
}
