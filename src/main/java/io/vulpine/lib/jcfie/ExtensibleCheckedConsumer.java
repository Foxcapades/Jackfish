package io.vulpine.lib.jcfie;

/**
 *
 * @param <P> Input parameter type.
 *
 * @param <E> Throwable Exception Type
 *
 * @see java.util.function.Consumer
 */
@FunctionalInterface
public interface ExtensibleCheckedConsumer < P, E extends Throwable >
{
  void accept( final P param ) throws E;
}
