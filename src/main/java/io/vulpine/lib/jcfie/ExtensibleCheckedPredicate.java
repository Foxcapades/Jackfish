package io.vulpine.lib.jcfie;

/**
 * @param <P> Input param type
 * @param <E> Throwable type
 *
 * @see java.util.function.Predicate
 */
@FunctionalInterface
public interface ExtensibleCheckedPredicate< P, E extends Throwable >
{
  boolean test( P param ) throws E;
}
