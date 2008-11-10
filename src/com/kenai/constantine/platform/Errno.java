// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Mon Nov 10 21:45:49 +1000 2008
package com.kenai.constantine.platform;
public enum Errno implements com.kenai.constantine.Constant {
EPERM,
ENOENT,
ESRCH,
EINTR,
EIO,
ENXIO,
E2BIG,
ENOEXEC,
EBADF,
ECHILD,
EDEADLK,
ENOMEM,
EACCES,
EFAULT,
ENOTBLK,
EBUSY,
EEXIST,
EXDEV,
ENODEV,
ENOTDIR,
EISDIR,
EINVAL,
ENFILE,
EMFILE,
ENOTTY,
ETXTBSY,
EFBIG,
ENOSPC,
ESPIPE,
EROFS,
EMLINK,
EPIPE,
EDOM,
ERANGE,
EWOULDBLOCK,
EAGAIN,
EINPROGRESS,
EALREADY,
ENOTSOCK,
EDESTADDRREQ,
EMSGSIZE,
EPROTOTYPE,
ENOPROTOOPT,
EPROTONOSUPPORT,
ESOCKTNOSUPPORT,
EOPNOTSUPP,
EPFNOSUPPORT,
EAFNOSUPPORT,
EADDRINUSE,
EADDRNOTAVAIL,
ENETDOWN,
ENETUNREACH,
ENETRESET,
ECONNABORTED,
ECONNRESET,
ENOBUFS,
EISCONN,
ENOTCONN,
ESHUTDOWN,
ETOOMANYREFS,
ETIMEDOUT,
ECONNREFUSED,
ELOOP,
ENAMETOOLONG,
EHOSTDOWN,
EHOSTUNREACH,
ENOTEMPTY,
EUSERS,
EDQUOT,
ESTALE,
EREMOTE,
ENOLCK,
ENOSYS,
EOVERFLOW,
EIDRM,
ENOMSG,
EILSEQ,
EBADMSG,
EMULTIHOP,
ENODATA,
ENOLINK,
ENOSR,
ENOSTR,
EPROTO,
ETIME,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<Errno> resolver = ConstantResolver.getResolver(Errno.class);
public final int value() { return resolver.intValue(this); }
public final String description() { return resolver.description(this); }
public final String toString() { return description(); }
public final static Errno valueOf(int value) { 
    return resolver.valueOf(value);
}
}
