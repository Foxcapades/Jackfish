package io.vulpine.lib.jcfie;

/**
 * @param <P1> First input param type
 * @param <P2> Second input param type
 * @param <E>  Throwable Type
 *
 * @see java.util.function.BiConsumer
 */
@FunctionalInterface
public interface ExtensibleCheckedBiConsumer< P1, P2, E extends Throwable >
{
  void accept( final P1 param1, final P2 param2 ) throws E;
}
