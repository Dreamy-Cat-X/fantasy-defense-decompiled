package com.google.android.gms.internal.ads;

import java.lang.reflect.Type;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public enum zzekk {
    DOUBLE(0, zzekm.SCALAR, zzelf.DOUBLE),
    FLOAT(1, zzekm.SCALAR, zzelf.FLOAT),
    INT64(2, zzekm.SCALAR, zzelf.LONG),
    UINT64(3, zzekm.SCALAR, zzelf.LONG),
    INT32(4, zzekm.SCALAR, zzelf.INT),
    FIXED64(5, zzekm.SCALAR, zzelf.LONG),
    FIXED32(6, zzekm.SCALAR, zzelf.INT),
    BOOL(7, zzekm.SCALAR, zzelf.BOOLEAN),
    STRING(8, zzekm.SCALAR, zzelf.STRING),
    MESSAGE(9, zzekm.SCALAR, zzelf.MESSAGE),
    BYTES(10, zzekm.SCALAR, zzelf.BYTE_STRING),
    UINT32(11, zzekm.SCALAR, zzelf.INT),
    ENUM(12, zzekm.SCALAR, zzelf.ENUM),
    SFIXED32(13, zzekm.SCALAR, zzelf.INT),
    SFIXED64(14, zzekm.SCALAR, zzelf.LONG),
    SINT32(15, zzekm.SCALAR, zzelf.INT),
    SINT64(16, zzekm.SCALAR, zzelf.LONG),
    GROUP(17, zzekm.SCALAR, zzelf.MESSAGE),
    DOUBLE_LIST(18, zzekm.VECTOR, zzelf.DOUBLE),
    FLOAT_LIST(19, zzekm.VECTOR, zzelf.FLOAT),
    INT64_LIST(20, zzekm.VECTOR, zzelf.LONG),
    UINT64_LIST(21, zzekm.VECTOR, zzelf.LONG),
    INT32_LIST(22, zzekm.VECTOR, zzelf.INT),
    FIXED64_LIST(23, zzekm.VECTOR, zzelf.LONG),
    FIXED32_LIST(24, zzekm.VECTOR, zzelf.INT),
    BOOL_LIST(25, zzekm.VECTOR, zzelf.BOOLEAN),
    STRING_LIST(26, zzekm.VECTOR, zzelf.STRING),
    MESSAGE_LIST(27, zzekm.VECTOR, zzelf.MESSAGE),
    BYTES_LIST(28, zzekm.VECTOR, zzelf.BYTE_STRING),
    UINT32_LIST(29, zzekm.VECTOR, zzelf.INT),
    ENUM_LIST(30, zzekm.VECTOR, zzelf.ENUM),
    SFIXED32_LIST(31, zzekm.VECTOR, zzelf.INT),
    SFIXED64_LIST(32, zzekm.VECTOR, zzelf.LONG),
    SINT32_LIST(33, zzekm.VECTOR, zzelf.INT),
    SINT64_LIST(34, zzekm.VECTOR, zzelf.LONG),
    DOUBLE_LIST_PACKED(35, zzekm.PACKED_VECTOR, zzelf.DOUBLE),
    FLOAT_LIST_PACKED(36, zzekm.PACKED_VECTOR, zzelf.FLOAT),
    INT64_LIST_PACKED(37, zzekm.PACKED_VECTOR, zzelf.LONG),
    UINT64_LIST_PACKED(38, zzekm.PACKED_VECTOR, zzelf.LONG),
    INT32_LIST_PACKED(39, zzekm.PACKED_VECTOR, zzelf.INT),
    FIXED64_LIST_PACKED(40, zzekm.PACKED_VECTOR, zzelf.LONG),
    FIXED32_LIST_PACKED(41, zzekm.PACKED_VECTOR, zzelf.INT),
    BOOL_LIST_PACKED(42, zzekm.PACKED_VECTOR, zzelf.BOOLEAN),
    UINT32_LIST_PACKED(43, zzekm.PACKED_VECTOR, zzelf.INT),
    ENUM_LIST_PACKED(44, zzekm.PACKED_VECTOR, zzelf.ENUM),
    SFIXED32_LIST_PACKED(45, zzekm.PACKED_VECTOR, zzelf.INT),
    SFIXED64_LIST_PACKED(46, zzekm.PACKED_VECTOR, zzelf.LONG),
    SINT32_LIST_PACKED(47, zzekm.PACKED_VECTOR, zzelf.INT),
    SINT64_LIST_PACKED(48, zzekm.PACKED_VECTOR, zzelf.LONG),
    GROUP_LIST(49, zzekm.VECTOR, zzelf.MESSAGE),
    MAP(50, zzekm.MAP, zzelf.VOID);

    private static final zzekk[] zziog;
    private static final Type[] zzioh = new Type[0];
    private final int id;
    private final zzelf zzioc;
    private final zzekm zziod;
    private final Class<?> zzioe;
    private final boolean zziof;

    zzekk(int i, zzekm zzekmVar, zzelf zzelfVar) {
        int i2;
        this.id = i;
        this.zziod = zzekmVar;
        this.zzioc = zzelfVar;
        int i3 = zzekn.zziop[zzekmVar.ordinal()];
        if (i3 == 1) {
            this.zzioe = zzelfVar.zzbjn();
        } else if (i3 == 2) {
            this.zzioe = zzelfVar.zzbjn();
        } else {
            this.zzioe = null;
        }
        this.zziof = (zzekmVar != zzekm.SCALAR || (i2 = zzekn.zzioq[zzelfVar.ordinal()]) == 1 || i2 == 2 || i2 == 3) ? false : true;
    }

    public final int id() {
        return this.id;
    }

    static {
        zzekk[] values = values();
        zziog = new zzekk[values.length];
        for (zzekk zzekkVar : values) {
            zziog[zzekkVar.id] = zzekkVar;
        }
    }
}
