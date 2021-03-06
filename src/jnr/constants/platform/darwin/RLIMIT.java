// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated 2010-07-31 18:57:12 +1000
package jnr.constants.platform.darwin;
public enum RLIMIT implements jnr.constants.Constant {
RLIMIT_AS(5L),
RLIMIT_CORE(4L),
RLIMIT_CPU(0L),
RLIMIT_DATA(2L),
RLIMIT_FSIZE(1L),
// RLIMIT_LOCKS not defined
RLIMIT_MEMLOCK(6L),
// RLIMIT_MSGQUEUE not defined
// RLIMIT_NICE not defined
// RLIMIT_NLIMITS not defined
RLIMIT_NOFILE(8L),
RLIMIT_NPROC(7L),
// RLIMIT_OFILE not defined
RLIMIT_RSS(5L),
// RLIMIT_RTPRIO not defined
// RLIMIT_RTTIME not defined
// RLIMIT_SIGPENDING not defined
RLIMIT_STACK(3L);
private final long value;
private RLIMIT(long value) { this.value = value; }
public static final long MIN_VALUE = 0L;
public static final long MAX_VALUE = 8L;

public final int intValue() { return (int) value; }
public final long longValue() { return value; }
}
