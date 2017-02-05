package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedSupplier;

@FunctionalInterface
public interface CheckedSupplier < R >
extends ExtensibleCheckedSupplier < R, Exception >
{}
