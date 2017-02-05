package io.vulpine.lib.jcfie;

/**
 * @param <P1> First input param type
 * @param <P2> Second input param type
 * @param <E>  Throwable type
 *
 * @see java.util.function.BiPredicate
 */
@FunctionalInterface
public interface ExtensibleCheckedBiPredicate < P1, P2, E extends Throwable >
{
  boolean test( P1 param1, P2 param2 ) throws E;
}
