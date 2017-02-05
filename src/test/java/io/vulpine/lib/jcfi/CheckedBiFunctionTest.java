package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.BiFunction;

public class CheckedBiFunctionTest
{
  @Test
  public void validate_signature() throws Exception
  {
    final BiFunction < String, Object, Void >        jvm = this::biFunction;
    final CheckedBiFunction < String, Object, Void > jf  = this::biFunction;
  }

  public Void biFunction( String a, Object b )
  {
    return null;
  }
}