package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedFunction;

@FunctionalInterface
public interface CheckedFunction < P, R >
extends ExtensibleCheckedFunction < P, R, Exception >
{}
