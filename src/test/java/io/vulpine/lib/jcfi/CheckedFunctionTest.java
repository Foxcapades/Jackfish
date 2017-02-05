package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.Function;

public class CheckedFunctionTest
{
  @Test
  public void validate_signature() throws Exception
  {
    Function < Void, String >        jvm = this::function;
    CheckedFunction < Void, String > jf  = this::function;
  }

  public String function( final Void v )
  {
    return null;
  }
}