// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Wed Feb 25 18:33:07 +1000 2009
package com.kenai.constantine.platform.openbsd;
public enum INAddr implements com.kenai.constantine.Constant {
INADDR_ANY(0),
INADDR_BROADCAST(0xffffffff),
INADDR_NONE(0xffffffff),
INADDR_LOOPBACK(0x7f000001),
INADDR_UNSPEC_GROUP(0xe0000000),
INADDR_ALLHOSTS_GROUP(0xe0000001),
// INADDR_ALLRTRS_GROUP not defined
INADDR_MAX_LOCAL_GROUP(0xe00000ff);
private final int value;
private INAddr(int value) { this.value = value; }
public static final long MIN_VALUE = 0;
public static final long MAX_VALUE = 0xffffffff;

public final int value() { return value; }
}
