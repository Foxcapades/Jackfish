package io.vulpine.lib.jcfi;

import org.junit.Test;

import java.util.function.Supplier;

public class CheckedSupplierTest
{
  @Test
  public void validate_signature() throws Exception
  {
    Supplier < String > jvm = this::supplier;
    CheckedSupplier < String > jf = this::supplier;
  }

  public String supplier()
  {
    return null;
  }
}