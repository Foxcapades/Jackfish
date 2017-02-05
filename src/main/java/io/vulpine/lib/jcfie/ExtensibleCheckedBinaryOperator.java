package io.vulpine.lib.jcfie;

/**
 * @param <T> Input parameter &amp;: return type
 * @param <E> Throwable type
 *
 * @see java.util.function.BinaryOperator
 */
@FunctionalInterface
public interface ExtensibleCheckedBinaryOperator< T, E extends Throwable >
extends ExtensibleCheckedBiFunction < T, T, T, E >
{}
