package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.Consumer;

public class CheckedConsumerTest
{
  @Test
  public void validate_signature() throws Exception
  {
    Consumer < String >        jvm = this::consumer;
    CheckedConsumer < String > jf  = this::consumer;
  }

  public void consumer( final String s )
  {
  }
}