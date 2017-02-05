package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedUnaryOperator;

@FunctionalInterface
public interface CheckedUnaryOperator < T >
extends ExtensibleCheckedUnaryOperator < T, Exception >
{}
