package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.Predicate;

public class CheckedPredicateTest
{
  @Test
  public void validate_signature() throws Exception
  {
    Predicate < String > jvm = this::predicate;
    CheckedPredicate < String > jf = this::predicate;
  }

  public boolean predicate( final String s )
  {
    return true;
  }
}