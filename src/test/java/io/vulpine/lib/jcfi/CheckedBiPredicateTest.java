package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.BiPredicate;

public class CheckedBiPredicateTest
{
  @Test
  public void validate_signature() throws Exception
  {
    final BiPredicate < Double, String > jvm = this::biPredicate;
    final CheckedBiPredicate < Double, String > jf = this::biPredicate;
  }

  public boolean biPredicate( Double a, String b )
  {
    return true;
  }
}