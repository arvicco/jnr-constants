// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Fri Nov 28 12:28:00 +1000 2008
package com.kenai.constantine.platform.linux;
public enum NameInfo implements com.kenai.constantine.Constant {
NI_NUMERICSERV(2),
NI_DGRAM(16),
NI_NAMEREQD(8),
NI_MAXSERV(32),
// NI_WITHSCOPEID not defined
NI_NUMERICHOST(1),
NI_NOFQDN(4),
NI_MAXHOST(1025);
private final int value;
private NameInfo(int value) { this.value = value; }
public static final long MIN_VALUE = 1;
public static final long MAX_VALUE = 1025;

public final int value() { return value; }
}