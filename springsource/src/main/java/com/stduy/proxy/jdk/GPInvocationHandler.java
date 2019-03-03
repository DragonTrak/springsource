package com.stduy.proxy.jdk;

import java.lang.reflect.Method;

public interface GPInvocationHandler {
    Object invoke(Object var1, Method var2, Object[] var3) throws Throwable;
}
