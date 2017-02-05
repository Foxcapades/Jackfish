package io.vulpine.lib.jcfie;


/**
 *
 * @param <P1> First input parameter type
 * @param <P2> Second input parameter type
 * @param <R>  Return Type
 * @param <E>  Throwable Type
 *
 * @see java.util.function.BiFunction
 */
public interface ExtensibleCheckedBiFunction < P1, P2, R, E extends Throwable >
{
  R apply( final P1 param1, final P2 param2 ) throws E;
}
