package io.vulpine.lib.jcfie;

/**
 * @param <T> Param & return type
 * @param <E> Throwable type
 *
 * @see java.util.function.UnaryOperator
 */
@FunctionalInterface
public interface ExtensibleCheckedUnaryOperator < T, E extends Throwable >
  extends ExtensibleCheckedFunction < T, T, E >
{}
