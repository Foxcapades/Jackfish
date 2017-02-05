package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedBiConsumer;

@FunctionalInterface
public interface CheckedBiConsumer < P1, P2 >
extends ExtensibleCheckedBiConsumer < P1, P2, Exception >
{}
