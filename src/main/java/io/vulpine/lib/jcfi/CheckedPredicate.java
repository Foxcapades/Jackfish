package io.vulpine.lib.jcfi;

import io.vulpine.lib.jcfie.ExtensibleCheckedPredicate;

@FunctionalInterface
public interface CheckedPredicate < P >
extends ExtensibleCheckedPredicate < P, Exception >
{}
