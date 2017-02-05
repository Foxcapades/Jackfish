package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedBinaryOperator;

@FunctionalInterface
public interface CheckedBinaryOperator < P >
extends ExtensibleCheckedBinaryOperator < P, Exception >
{}
