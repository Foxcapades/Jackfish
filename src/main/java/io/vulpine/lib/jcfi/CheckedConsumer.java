package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedConsumer;

@FunctionalInterface
public interface CheckedConsumer < P >
extends ExtensibleCheckedConsumer < P, Exception >
{}
