package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.UnaryOperator;

import static org.junit.Assert.*;

public class CheckedUnaryOperatorTest
{
  @Test
  public void validate_signature()
  {
    final CheckedUnaryOperator < String > checked = this::unaryFunction;
    final UnaryOperator < String >        normal  = this::unaryFunction;
  }

  public String unaryFunction( final String string )
  {
    return string;
  }
}