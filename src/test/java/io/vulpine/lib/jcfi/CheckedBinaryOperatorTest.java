package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.BinaryOperator;

public class CheckedBinaryOperatorTest
{
  @Test
  public void validate_signature() throws Exception
  {
    final BinaryOperator < Double >        jvm = this::binaryOperator;
    final CheckedBinaryOperator < Double > jf  = this::binaryOperator;
  }

  public Double binaryOperator( Double a, Double b )
  {
    return null;
  }
}