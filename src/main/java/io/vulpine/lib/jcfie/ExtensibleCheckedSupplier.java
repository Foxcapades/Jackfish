package io.vulpine.lib.jcfie;

/**
 * @param <R> Return type
 * @param <E> Throwable type
 *
 * @see java.util.function.Supplier
 */
@FunctionalInterface
public interface ExtensibleCheckedSupplier < R, E extends Throwable >
{
  R get() throws E;
}
