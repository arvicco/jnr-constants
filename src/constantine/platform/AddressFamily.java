// WARNING: This file is autogenerated. DO NOT EDIT!
// Generated Tue Oct 14 15:42:08 +1000 2008
package constantine.platform;
public enum AddressFamily implements constantine.Constant {
AF_UNSPEC,
AF_UNIX,
AF_LOCAL,
AF_INET,
AF_IMPLINK,
AF_PUP,
AF_CHAOS,
AF_NS,
AF_ISO,
AF_OSI,
AF_ECMA,
AF_DATAKIT,
AF_CCITT,
AF_SNA,
AF_DECnet,
AF_DLI,
AF_LAT,
AF_HYLINK,
AF_APPLETALK,
AF_ROUTE,
AF_LINK,
pseudo_AF_XTP,
AF_COIP,
AF_CNT,
pseudo_AF_RTIP,
AF_IPX,
AF_SIP,
pseudo_AF_PIP,
AF_NDRV,
AF_ISDN,
AF_E164,
pseudo_AF_KEY,
AF_INET6,
AF_NATM,
AF_SYSTEM,
AF_NETBIOS,
AF_PPP,
AF_ATM,
pseudo_AF_HDRCMPLT,
AF_RESERVED_36,
AF_NETGRAPH,
AF_MAX,
__UNKNOWN_CONSTANT__;
private static final ConstantResolver<AddressFamily> resolver = ConstantResolver.getResolver(AddressFamily.class);
private volatile Integer value;
public final int value() { return resolver.intValue(this); }
public final static AddressFamily valueOf(int value) { 
    return resolver.valueOf(value);
}
}
