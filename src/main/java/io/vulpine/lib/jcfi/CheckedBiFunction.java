package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedBiFunction;

@FunctionalInterface
public interface CheckedBiFunction < P1, P2, R >
extends ExtensibleCheckedBiFunction < P1, P2, R, Exception >
{}
