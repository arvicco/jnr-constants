// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Feb 23 15:25:12 -0800 2009
package com.kenai.constantine.platform.freebsd;
public enum NameInfo implements com.kenai.constantine.Constant {
NI_MAXHOST(1025),
NI_MAXSERV(32),
NI_NOFQDN(1),
NI_NUMERICHOST(2),
NI_NAMEREQD(4),
NI_NUMERICSERV(8),
NI_DGRAM(16);
// NI_WITHSCOPEID not defined
private final int value;
private NameInfo(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 1025;

public final int value() { return value; }
}
