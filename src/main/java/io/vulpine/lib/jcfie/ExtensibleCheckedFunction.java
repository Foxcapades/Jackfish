package io.vulpine.lib.jcfie;

/**
 * @param <P> Input parameter type
 * @param <R> Return Type
 * @param <E> Throwable Type
 *
 * @see java.util.function.Function
 */
@FunctionalInterface
public interface ExtensibleCheckedFunction < P, R, E extends Throwable >
{
  R apply( final P param ) throws E;
}
