// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Nov 10 21:45:50 +1000 2008
package com.kenai.constantine.platform;
public enum Shutdown implements com.kenai.constantine.Constant {
SHUT_RD,
SHUT_WR,
SHUT_RDWR,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<Shutdown> resolver = ConstantResolver.getResolver(Shutdown.class);
public final int value() { return resolver.intValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static Shutdown valueOf(int value) { 
    return resolver.valueOf(value);
}
}
