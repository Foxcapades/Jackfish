package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.BiConsumer;

public class CheckedBiConsumerTest
{

  @Test
  public void validate_signature() throws Exception
  {
    final BiConsumer < String, Integer >        jvmFunc = this::biConsumer;
    final CheckedBiConsumer < String, Integer > jfFunc  = this::biConsumer;
  }

  public void biConsumer( final String a, final Integer b )
  {
  }
}