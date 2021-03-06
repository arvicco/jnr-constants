require 'gen/ConstGenerator'
def gen_errno_java(options)
  ConstGenerator.new 'platform.errno', options do |cg|
    cg.include "errno.h"
    cg.include "string.h"
    cg.strfunc = "strerror"
    cg.unknown_range=[20000, 20999]
    consts = %w[
      EPERM
      ENOENT
      ESRCH
      EINTR
      EIO
      ENXIO
      E2BIG
      ENOEXEC
      EBADF
      ECHILD
      EDEADLK
      ENOMEM
      EACCES
      EFAULT
      ENOTBLK
      EBUSY
      EEXIST
      EXDEV
      ENODEV
      ENOTDIR
      EISDIR
      EINVAL
      ENFILE
      EMFILE
      ENOTTY
      ETXTBSY
      EFBIG
      ENOSPC
      ESPIPE
      EROFS
      EMLINK
      EPIPE
      EDOM
      ERANGE
      EWOULDBLOCK
      EAGAIN
      EINPROGRESS
      EALREADY
      ENOTSOCK
      EDESTADDRREQ
      EMSGSIZE
      EPROTOTYPE
      ENOPROTOOPT
      EPROTONOSUPPORT
      ESOCKTNOSUPPORT
      EOPNOTSUPP
      EPFNOSUPPORT
      EAFNOSUPPORT
      EADDRINUSE
      EADDRNOTAVAIL
      ENETDOWN
      ENETUNREACH
      ENETRESET
      ECONNABORTED
      ECONNRESET
      ENOBUFS
      EISCONN
      ENOTCONN
      ESHUTDOWN
      ETOOMANYREFS
      ETIMEDOUT
      ECONNREFUSED
      ELOOP
      ENAMETOOLONG
      EHOSTDOWN
      EHOSTUNREACH
      ENOTEMPTY
      EUSERS
      EDQUOT
      ESTALE
      EREMOTE
      ENOLCK
      ENOSYS
      EOVERFLOW
      EIDRM
      ENOMSG
      EILSEQ
      EBADMSG
      EMULTIHOP
      ENODATA
      ENOLINK
      ENOSR
      ENOSTR
      EPROTO
      ETIME
    ]
    consts.each { |c| cg.const c }
  end
end
