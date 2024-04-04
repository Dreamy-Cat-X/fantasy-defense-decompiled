package com.google.android.gms.internal.ads;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'zziuu' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:372)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:337)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:322)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzeoh {
    public static final zzeoh zzium = new zzeoh("DOUBLE", 0, zzeok.DOUBLE, 1);
    public static final zzeoh zziun = new zzeoh("FLOAT", 1, zzeok.FLOAT, 5);
    public static final zzeoh zziuo = new zzeoh("INT64", 2, zzeok.LONG, 0);
    public static final zzeoh zziup = new zzeoh("UINT64", 3, zzeok.LONG, 0);
    public static final zzeoh zziuq = new zzeoh("INT32", 4, zzeok.INT, 0);
    public static final zzeoh zziur = new zzeoh("FIXED64", 5, zzeok.LONG, 1);
    public static final zzeoh zzius = new zzeoh("FIXED32", 6, zzeok.INT, 5);
    public static final zzeoh zziut = new zzeoh("BOOL", 7, zzeok.BOOLEAN, 0);
    public static final zzeoh zziuu;
    public static final zzeoh zziuv;
    public static final zzeoh zziuw;
    public static final zzeoh zziux;
    public static final zzeoh zziuy;
    public static final zzeoh zziuz;
    public static final zzeoh zziva;
    public static final zzeoh zzivb;
    public static final zzeoh zzivc;
    public static final zzeoh zzivd;
    private static final /* synthetic */ zzeoh[] zzivg;
    private final zzeok zzive;
    private final int zzivf;

    public static zzeoh[] values() {
        return (zzeoh[]) zzivg.clone();
    }

    private zzeoh(String str, int i, zzeok zzeokVar, int i2) {
        this.zzive = zzeokVar;
        this.zzivf = i2;
    }

    public final zzeok zzbll() {
        return this.zzive;
    }

    public final int zzblm() {
        return this.zzivf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzeoh(String str, int i, zzeok zzeokVar, int i2, zzeoe zzeoeVar) {
        this(str, i, zzeokVar, i2);
    }

    static {
        final int i = 2;
        final int i2 = 3;
        final zzeok zzeokVar = zzeok.STRING;
        final String str = "STRING";
        final int i3 = 8;
        zziuu = new zzeoh(str, i3, zzeokVar, i) { // from class: com.google.android.gms.internal.ads.zzeog
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i4 = 8;
                int i5 = 2;
                zzeoe zzeoeVar = null;
            }
        };
        final zzeok zzeokVar2 = zzeok.MESSAGE;
        final String str2 = "GROUP";
        final int i4 = 9;
        zziuv = new zzeoh(str2, i4, zzeokVar2, i2) { // from class: com.google.android.gms.internal.ads.zzeoj
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i5 = 9;
                int i6 = 3;
                zzeoe zzeoeVar = null;
            }
        };
        final zzeok zzeokVar3 = zzeok.MESSAGE;
        final String str3 = "MESSAGE";
        final int i5 = 10;
        zziuw = new zzeoh(str3, i5, zzeokVar3, i) { // from class: com.google.android.gms.internal.ads.zzeoi
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i6 = 10;
                int i7 = 2;
                zzeoe zzeoeVar = null;
            }
        };
        final zzeok zzeokVar4 = zzeok.BYTE_STRING;
        final String str4 = "BYTES";
        final int i6 = 11;
        zziux = new zzeoh(str4, i6, zzeokVar4, i) { // from class: com.google.android.gms.internal.ads.zzeol
            /* JADX INFO: Access modifiers changed from: package-private */
            {
                int i7 = 11;
                int i8 = 2;
                zzeoe zzeoeVar = null;
            }
        };
        zziuy = new zzeoh("UINT32", 12, zzeok.INT, 0);
        zziuz = new zzeoh("ENUM", 13, zzeok.ENUM, 0);
        zziva = new zzeoh("SFIXED32", 14, zzeok.INT, 5);
        zzivb = new zzeoh("SFIXED64", 15, zzeok.LONG, 1);
        zzivc = new zzeoh("SINT32", 16, zzeok.INT, 0);
        zzeoh zzeohVar = new zzeoh("SINT64", 17, zzeok.LONG, 0);
        zzivd = zzeohVar;
        zzivg = new zzeoh[]{zzium, zziun, zziuo, zziup, zziuq, zziur, zzius, zziut, zziuu, zziuv, zziuw, zziux, zziuy, zziuz, zziva, zzivb, zzivc, zzeohVar};
    }
}
