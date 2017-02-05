package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedBiPredicate;

@FunctionalInterface
public interface CheckedBiPredicate < P1, P2 >
extends ExtensibleCheckedBiPredicate < P1, P2, Exception >
{}
