package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzenw {
    private static final boolean zzilm;
    private static final zzd zzitr;
    private static final boolean zzits;
    private static final long zzitt;
    private static final long zzitu;
    private static final long zzitv;
    private static final long zzitw;
    private static final long zzitx;
    private static final long zzity;
    private static final long zzitz;
    private static final long zziua;
    private static final long zziub;
    private static final long zziuc;
    private static final long zziud;
    private static final long zziue;
    private static final long zziuf;
    private static final long zziug;
    private static final int zziuh;
    static final boolean zziui;
    private static final Logger logger = Logger.getLogger(zzenw.class.getName());
    private static final Unsafe zzhxt = zzblh();
    private static final Class<?> zzika = zzeiz.zzbgg();
    private static final boolean zzitp = zzm(Long.TYPE);
    private static final boolean zzitq = zzm(Integer.TYPE);

    private zzenw() {
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zza extends zzd {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final byte zzy(Object obj, long j) {
            if (zzenw.zziui) {
                return zzenw.zzq(obj, j);
            }
            return zzenw.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzenw.zziui) {
                zzenw.zza(obj, j, b);
            } else {
                zzenw.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzenw.zziui) {
                return zzenw.zzs(obj, j);
            }
            return zzenw.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzenw.zziui) {
                zzenw.zzb(obj, j, z);
            } else {
                zzenw.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zzb extends zzd {
        zzb(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final byte zzy(Object obj, long j) {
            return this.zziul.getByte(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zze(Object obj, long j, byte b) {
            this.zziul.putByte(obj, j, b);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final boolean zzm(Object obj, long j) {
            return this.zziul.getBoolean(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, boolean z) {
            this.zziul.putBoolean(obj, j, z);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final float zzn(Object obj, long j) {
            return this.zziul.getFloat(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, float f) {
            this.zziul.putFloat(obj, j, f);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final double zzo(Object obj, long j) {
            return this.zziul.getDouble(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, double d) {
            this.zziul.putDouble(obj, j, d);
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zzc extends zzd {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final byte zzy(Object obj, long j) {
            if (zzenw.zziui) {
                return zzenw.zzq(obj, j);
            }
            return zzenw.zzr(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zze(Object obj, long j, byte b) {
            if (zzenw.zziui) {
                zzenw.zza(obj, j, b);
            } else {
                zzenw.zzb(obj, j, b);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final boolean zzm(Object obj, long j) {
            if (zzenw.zziui) {
                return zzenw.zzs(obj, j);
            }
            return zzenw.zzt(obj, j);
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, boolean z) {
            if (zzenw.zziui) {
                zzenw.zzb(obj, j, z);
            } else {
                zzenw.zzc(obj, j, z);
            }
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final float zzn(Object obj, long j) {
            return Float.intBitsToFloat(zzk(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, float f) {
            zzb(obj, j, Float.floatToIntBits(f));
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final double zzo(Object obj, long j) {
            return Double.longBitsToDouble(zzl(obj, j));
        }

        @Override // com.google.android.gms.internal.ads.zzenw.zzd
        public final void zza(Object obj, long j, double d) {
            zza(obj, j, Double.doubleToLongBits(d));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzblf() {
        return zzilm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class zzd {
        Unsafe zziul;

        zzd(Unsafe unsafe) {
            this.zziul = unsafe;
        }

        public abstract void zza(Object obj, long j, double d);

        public abstract void zza(Object obj, long j, float f);

        public abstract void zza(Object obj, long j, boolean z);

        public abstract void zze(Object obj, long j, byte b);

        public abstract boolean zzm(Object obj, long j);

        public abstract float zzn(Object obj, long j);

        public abstract double zzo(Object obj, long j);

        public abstract byte zzy(Object obj, long j);

        public final int zzk(Object obj, long j) {
            return this.zziul.getInt(obj, j);
        }

        public final void zzb(Object obj, long j, int i) {
            this.zziul.putInt(obj, j, i);
        }

        public final long zzl(Object obj, long j) {
            return this.zziul.getLong(obj, j);
        }

        public final void zza(Object obj, long j, long j2) {
            this.zziul.putLong(obj, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzblg() {
        return zzits;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T zzj(Class<T> cls) {
        try {
            return (T) zzhxt.allocateInstance(cls);
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        }
    }

    private static int zzk(Class<?> cls) {
        if (zzilm) {
            return zzitr.zziul.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzl(Class<?> cls) {
        if (zzilm) {
            return zzitr.zziul.arrayIndexScale(cls);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int zzk(Object obj, long j) {
        return zzitr.zzk(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zzb(Object obj, long j, int i) {
        zzitr.zzb(obj, j, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long zzl(Object obj, long j) {
        return zzitr.zzl(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, long j2) {
        zzitr.zza(obj, j, j2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean zzm(Object obj, long j) {
        return zzitr.zzm(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, boolean z) {
        zzitr.zza(obj, j, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static float zzn(Object obj, long j) {
        return zzitr.zzn(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, float f) {
        zzitr.zza(obj, j, f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static double zzo(Object obj, long j) {
        return zzitr.zzo(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, double d) {
        zzitr.zza(obj, j, d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zzp(Object obj, long j) {
        return zzitr.zziul.getObject(obj, j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(Object obj, long j, Object obj2) {
        zzitr.zziul.putObject(obj, j, obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static byte zza(byte[] bArr, long j) {
        return zzitr.zzy(bArr, zzitt + j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void zza(byte[] bArr, long j, byte b) {
        zzitr.zze(bArr, zzitt + j, b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Unsafe zzblh() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzeny());
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean zzbli() {
        Unsafe unsafe = zzhxt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("arrayBaseOffset", Class.class);
            cls.getMethod("arrayIndexScale", Class.class);
            cls.getMethod("getInt", Object.class, Long.TYPE);
            cls.getMethod("putInt", Object.class, Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            cls.getMethod("putLong", Object.class, Long.TYPE, Long.TYPE);
            cls.getMethod("getObject", Object.class, Long.TYPE);
            cls.getMethod("putObject", Object.class, Long.TYPE, Object.class);
            if (zzeiz.zzbgf()) {
                return true;
            }
            cls.getMethod("getByte", Object.class, Long.TYPE);
            cls.getMethod("putByte", Object.class, Long.TYPE, Byte.TYPE);
            cls.getMethod("getBoolean", Object.class, Long.TYPE);
            cls.getMethod("putBoolean", Object.class, Long.TYPE, Boolean.TYPE);
            cls.getMethod("getFloat", Object.class, Long.TYPE);
            cls.getMethod("putFloat", Object.class, Long.TYPE, Float.TYPE);
            cls.getMethod("getDouble", Object.class, Long.TYPE);
            cls.getMethod("putDouble", Object.class, Long.TYPE, Double.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeArrayOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzblj() {
        Unsafe unsafe = zzhxt;
        if (unsafe == null) {
            return false;
        }
        try {
            Class<?> cls = unsafe.getClass();
            cls.getMethod("objectFieldOffset", Field.class);
            cls.getMethod("getLong", Object.class, Long.TYPE);
            if (zzblk() == null) {
                return false;
            }
            if (zzeiz.zzbgf()) {
                return true;
            }
            cls.getMethod("getByte", Long.TYPE);
            cls.getMethod("putByte", Long.TYPE, Byte.TYPE);
            cls.getMethod("getInt", Long.TYPE);
            cls.getMethod("putInt", Long.TYPE, Integer.TYPE);
            cls.getMethod("getLong", Long.TYPE);
            cls.getMethod("putLong", Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Long.TYPE, Long.TYPE, Long.TYPE);
            cls.getMethod("copyMemory", Object.class, Long.TYPE, Object.class, Long.TYPE, Long.TYPE);
            return true;
        } catch (Throwable th) {
            Logger logger2 = logger;
            Level level = Level.WARNING;
            String valueOf = String.valueOf(th);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 71);
            sb.append("platform method missing - proto runtime falling back to safer methods: ");
            sb.append(valueOf);
            logger2.logp(level, "com.google.protobuf.UnsafeUtil", "supportsUnsafeByteBufferOperations", sb.toString());
            return false;
        }
    }

    private static boolean zzm(Class<?> cls) {
        if (!zzeiz.zzbgf()) {
            return false;
        }
        try {
            Class<?> cls2 = zzika;
            cls2.getMethod("peekLong", cls, Boolean.TYPE);
            cls2.getMethod("pokeLong", cls, Long.TYPE, Boolean.TYPE);
            cls2.getMethod("pokeInt", cls, Integer.TYPE, Boolean.TYPE);
            cls2.getMethod("peekInt", cls, Boolean.TYPE);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            cls2.getMethod("peekByteArray", cls, byte[].class, Integer.TYPE, Integer.TYPE);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Field zzblk() {
        Field zzb2;
        if (zzeiz.zzbgf() && (zzb2 = zzb(Buffer.class, "effectiveDirectAddress")) != null) {
            return zzb2;
        }
        Field zzb3 = zzb(Buffer.class, "address");
        if (zzb3 == null || zzb3.getType() != Long.TYPE) {
            return null;
        }
        return zzb3;
    }

    private static Field zzb(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzq(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) (((j ^ (-1)) & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static byte zzr(Object obj, long j) {
        return (byte) (zzk(obj, (-4) & j) >>> ((int) ((j & 3) << 3)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zza(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = ((((int) j) ^ (-1)) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, byte b) {
        long j2 = (-4) & j;
        int i = (((int) j) & 3) << 3;
        zzb(obj, j2, ((255 & b) << i) | (zzk(obj, j2) & ((255 << i) ^ (-1))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzs(Object obj, long j) {
        return zzq(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean zzt(Object obj, long j) {
        return zzr(obj, j) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzb(Object obj, long j, boolean z) {
        zza(obj, j, z ? (byte) 1 : (byte) 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j, boolean z) {
        zzb(obj, j, z ? (byte) 1 : (byte) 0);
    }

    static {
        zzd zzdVar;
        zzd zzdVar2 = null;
        if (zzhxt != null) {
            if (zzeiz.zzbgf()) {
                if (zzitp) {
                    zzdVar2 = new zzc(zzhxt);
                } else if (zzitq) {
                    zzdVar2 = new zza(zzhxt);
                }
            } else {
                zzdVar2 = new zzb(zzhxt);
            }
        }
        zzitr = zzdVar2;
        zzits = zzblj();
        zzilm = zzbli();
        zzitt = zzk(byte[].class);
        zzitu = zzk(boolean[].class);
        zzitv = zzl(boolean[].class);
        zzitw = zzk(int[].class);
        zzitx = zzl(int[].class);
        zzity = zzk(long[].class);
        zzitz = zzl(long[].class);
        zziua = zzk(float[].class);
        zziub = zzl(float[].class);
        zziuc = zzk(double[].class);
        zziud = zzl(double[].class);
        zziue = zzk(Object[].class);
        zziuf = zzl(Object[].class);
        Field zzblk = zzblk();
        zziug = (zzblk == null || (zzdVar = zzitr) == null) ? -1L : zzdVar.zziul.objectFieldOffset(zzblk);
        zziuh = (int) (zzitt & 7);
        zziui = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }
}
