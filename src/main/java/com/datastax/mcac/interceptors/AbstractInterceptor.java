package com.datastax.mcac.interceptors;

import com.google.common.base.Supplier;
import com.google.common.base.Suppliers;

import com.datastax.mcac.UnixSocketClient;

public abstract class AbstractInterceptor
{
    /*
     * Needs to be visible for Advice that cannot add fields
     */
    public static final Supplier<UnixSocketClient> client = Suppliers.memoize(() -> new UnixSocketClient());
}
