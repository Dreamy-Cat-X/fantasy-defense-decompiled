package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzekq;
import com.google.android.gms.internal.ads.zzekq.zzb;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzekq<MessageType extends zzekq<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeiw<MessageType, BuilderType> {
    private static Map<Object, zzekq<?, ?>> zziow = new ConcurrentHashMap();
    protected zzent zziou = zzent.zzblc();
    private int zziov = -1;

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    protected static class zza<T extends zzekq<T, ?>> extends zzeix<T> {
        private final T zzioy;

        public zza(T t) {
            this.zzioy = t;
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    static final class zzc implements zzekl<zzc> {
        @Override // com.google.android.gms.internal.ads.zzekl
        public final int zzv() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzekl
        public final zzeoh zzbig() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzekl
        public final zzeok zzbih() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzekl
        public final boolean zzbii() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzekl
        public final boolean zzbij() {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzekl
        public final zzemc zza(zzemc zzemcVar, zzemd zzemdVar) {
            throw new NoSuchMethodError();
        }

        @Override // com.google.android.gms.internal.ads.zzekl
        public final zzemi zza(zzemi zzemiVar, zzemi zzemiVar2) {
            throw new NoSuchMethodError();
        }

        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public enum zze {
        public static final int zzipc = 1;
        public static final int zzipd = 2;
        public static final int zzipe = 3;
        public static final int zzipf = 4;
        public static final int zzipg = 5;
        public static final int zziph = 6;
        public static final int zzipi = 7;
        private static final /* synthetic */ int[] zzipj = {1, 2, 3, 4, 5, 6, 7};

        public static int[] zzbjb() {
            return (int[]) zzipj.clone();
        }
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static class zzf<ContainingType extends zzemd, Type> extends zzeke<ContainingType, Type> {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract Object zza(int i, Object obj, Object obj2);

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class zzd<MessageType extends zzd<MessageType, BuilderType>, BuilderType> extends zzekq<MessageType, BuilderType> implements zzemf {
        protected zzekj<zzc> zzipb = zzekj.zzbie();

        /* JADX INFO: Access modifiers changed from: package-private */
        public final zzekj<zzc> zzbja() {
            if (this.zzipb.isImmutable()) {
                this.zzipb = (zzekj) this.zzipb.clone();
            }
            return this.zzipb;
        }
    }

    public String toString() {
        return zzeme.zza(this, super.toString());
    }

    public int hashCode() {
        if (this.zzijw != 0) {
            return this.zzijw;
        }
        this.zzijw = zzemr.zzbki().zzax(this).hashCode(this);
        return this.zzijw;
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static abstract class zzb<MessageType extends zzekq<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> extends zzeiv<MessageType, BuilderType> {
        private final MessageType zzioy;
        protected MessageType zzioz;
        protected boolean zzipa = false;

        /* JADX INFO: Access modifiers changed from: protected */
        public zzb(MessageType messagetype) {
            this.zzioy = messagetype;
            this.zzioz = (MessageType) messagetype.zza(zze.zzipf, null, null);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public void zzbiv() {
            MessageType messagetype = (MessageType) this.zzioz.zza(zze.zzipf, null, null);
            zza(messagetype, this.zzioz);
            this.zzioz = messagetype;
        }

        @Override // com.google.android.gms.internal.ads.zzemf
        public final boolean isInitialized() {
            return zzekq.zza(this.zzioz, false);
        }

        @Override // com.google.android.gms.internal.ads.zzemc
        /* renamed from: zzbiw, reason: merged with bridge method [inline-methods] */
        public MessageType zzbiy() {
            if (this.zzipa) {
                return this.zzioz;
            }
            MessageType messagetype = this.zzioz;
            zzemr.zzbki().zzax(messagetype).zzak(messagetype);
            this.zzipa = true;
            return this.zzioz;
        }

        @Override // com.google.android.gms.internal.ads.zzemc
        /* renamed from: zzbix, reason: merged with bridge method [inline-methods] */
        public final MessageType zzbiz() {
            MessageType messagetype = (MessageType) zzbiy();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw new zzenr(messagetype);
        }

        @Override // com.google.android.gms.internal.ads.zzeiv
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public final BuilderType zza(MessageType messagetype) {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            zza(this.zzioz, messagetype);
            return this;
        }

        private static void zza(MessageType messagetype, MessageType messagetype2) {
            zzemr.zzbki().zzax(messagetype).zzg(messagetype, messagetype2);
        }

        private final BuilderType zzb(byte[] bArr, int i, int i2, zzekd zzekdVar) throws zzeld {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            try {
                zzemr.zzbki().zzax(this.zzioz).zza(this.zzioz, bArr, 0, i2, new zzejb(zzekdVar));
                return this;
            } catch (zzeld e) {
                throw e;
            } catch (IOException e2) {
                throw new RuntimeException("Reading from byte array should not throw IOException.", e2);
            } catch (IndexOutOfBoundsException unused) {
                throw zzeld.zzbjd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // com.google.android.gms.internal.ads.zzeiv
        /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
        public final BuilderType zza(zzejr zzejrVar, zzekd zzekdVar) throws IOException {
            if (this.zzipa) {
                zzbiv();
                this.zzipa = false;
            }
            try {
                zzemr.zzbki().zzax(this.zzioz).zza(this.zzioz, zzejy.zza(zzejrVar), zzekdVar);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }

        @Override // com.google.android.gms.internal.ads.zzeiv
        public final /* synthetic */ zzeiv zza(byte[] bArr, int i, int i2, zzekd zzekdVar) throws zzeld {
            return zzb(bArr, 0, i2, zzekdVar);
        }

        @Override // com.google.android.gms.internal.ads.zzeiv
        /* renamed from: zzbgb */
        public final /* synthetic */ zzeiv clone() {
            return (zzb) clone();
        }

        @Override // com.google.android.gms.internal.ads.zzemf
        public final /* synthetic */ zzemd zzbit() {
            return this.zzioy;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.android.gms.internal.ads.zzeiv
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            zzb zzbVar = (zzb) this.zzioy.zza(zze.zzipg, null, null);
            zzbVar.zza((zzekq) zzbiy());
            return zzbVar;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return zzemr.zzbki().zzax(this).equals(this, (zzekq) obj);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final <MessageType extends zzekq<MessageType, BuilderType>, BuilderType extends zzb<MessageType, BuilderType>> BuilderType zzbil() {
        return (BuilderType) zza(zze.zzipg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzemf
    public final boolean isInitialized() {
        return zza(this, Boolean.TRUE.booleanValue());
    }

    public final BuilderType zzbim() {
        BuilderType buildertype = (BuilderType) zza(zze.zzipg, (Object) null, (Object) null);
        buildertype.zza(this);
        return buildertype;
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    final int zzbgd() {
        return this.zziov;
    }

    @Override // com.google.android.gms.internal.ads.zzeiw
    final void zzfv(int i) {
        this.zziov = i;
    }

    @Override // com.google.android.gms.internal.ads.zzemd
    public final void zzb(zzeka zzekaVar) throws IOException {
        zzemr.zzbki().zzax(this).zza(this, zzekc.zza(zzekaVar));
    }

    @Override // com.google.android.gms.internal.ads.zzemd
    public final int zzbin() {
        if (this.zziov == -1) {
            this.zziov = zzemr.zzbki().zzax(this).zzau(this);
        }
        return this.zziov;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T extends zzekq<?, ?>> T zzd(Class<T> cls) {
        zzekq<?, ?> zzekqVar = zziow.get(cls);
        if (zzekqVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zzekqVar = zziow.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (zzekqVar == null) {
            zzekqVar = (T) ((zzekq) zzenw.zzj(cls)).zza(zze.zziph, (Object) null, (Object) null);
            if (zzekqVar == null) {
                throw new IllegalStateException();
            }
            zziow.put(cls, zzekqVar);
        }
        return (T) zzekqVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzekq<?, ?>> void zza(Class<T> cls, T t) {
        zziow.put(cls, t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static Object zza(zzemd zzemdVar, String str, Object[] objArr) {
        return new zzemt(zzemdVar, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object zza(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    protected static final <T extends zzekq<T, ?>> boolean zza(T t, boolean z) {
        byte byteValue = ((Byte) t.zza(zze.zzipc, null, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean zzaw = zzemr.zzbki().zzax(t).zzaw(t);
        if (z) {
            t.zza(zze.zzipd, zzaw ? t : null, null);
        }
        return zzaw;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzekw zzbio() {
        return zzekt.zzbjc();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzekw zza(zzekw zzekwVar) {
        int size = zzekwVar.size();
        return zzekwVar.zzfy(size == 0 ? 10 : size << 1);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static zzelb zzbip() {
        return zzelr.zzbju();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzela<E> zzbiq() {
        return zzemq.zzbkh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <E> zzela<E> zza(zzela<E> zzelaVar) {
        int size = zzelaVar.size();
        return zzelaVar.zzfy(size == 0 ? 10 : size << 1);
    }

    private static <T extends zzekq<T, ?>> T zza(T t, zzejr zzejrVar, zzekd zzekdVar) throws zzeld {
        T t2 = (T) t.zza(zze.zzipf, null, null);
        try {
            zzemy zzax = zzemr.zzbki().zzax(t2);
            zzax.zza(t2, zzejy.zza(zzejrVar), zzekdVar);
            zzax.zzak(t2);
            return t2;
        } catch (IOException e) {
            if (e.getCause() instanceof zzeld) {
                throw ((zzeld) e.getCause());
            }
            throw new zzeld(e.getMessage()).zzl(t2);
        } catch (RuntimeException e2) {
            if (e2.getCause() instanceof zzeld) {
                throw ((zzeld) e2.getCause());
            }
            throw e2;
        }
    }

    private static <T extends zzekq<T, ?>> T zza(T t, byte[] bArr, int i, int i2, zzekd zzekdVar) throws zzeld {
        T t2 = (T) t.zza(zze.zzipf, null, null);
        try {
            zzemy zzax = zzemr.zzbki().zzax(t2);
            zzax.zza(t2, bArr, 0, i2, new zzejb(zzekdVar));
            zzax.zzak(t2);
            if (t2.zzijw == 0) {
                return t2;
            }
            throw new RuntimeException();
        } catch (IOException e) {
            if (e.getCause() instanceof zzeld) {
                throw ((zzeld) e.getCause());
            }
            throw new zzeld(e.getMessage()).zzl(t2);
        } catch (IndexOutOfBoundsException unused) {
            throw zzeld.zzbjd().zzl(t2);
        }
    }

    private static <T extends zzekq<T, ?>> T zza(T t) throws zzeld {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw new zzeld(new zzenr(t).getMessage()).zzl(t);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzekq<T, ?>> T zza(T t, zzejg zzejgVar) throws zzeld {
        return (T) zza(zza(zzb(t, zzejgVar, zzekd.zzbhz())));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzekq<T, ?>> T zza(T t, zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        return (T) zza(zzb(t, zzejgVar, zzekdVar));
    }

    private static <T extends zzekq<T, ?>> T zzb(T t, zzejg zzejgVar, zzekd zzekdVar) throws zzeld {
        try {
            zzejr zzbgn = zzejgVar.zzbgn();
            T t2 = (T) zza(t, zzbgn, zzekdVar);
            try {
                zzbgn.zzgd(0);
                return t2;
            } catch (zzeld e) {
                throw e.zzl(t2);
            }
        } catch (zzeld e2) {
            throw e2;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzekq<T, ?>> T zza(T t, byte[] bArr) throws zzeld {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzekd.zzbhz()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <T extends zzekq<T, ?>> T zza(T t, byte[] bArr, zzekd zzekdVar) throws zzeld {
        return (T) zza(zza(t, bArr, 0, bArr.length, zzekdVar));
    }

    @Override // com.google.android.gms.internal.ads.zzemd
    public final /* synthetic */ zzemc zzbir() {
        zzb zzbVar = (zzb) zza(zze.zzipg, (Object) null, (Object) null);
        zzbVar.zza(this);
        return zzbVar;
    }

    @Override // com.google.android.gms.internal.ads.zzemd
    public final /* synthetic */ zzemc zzbis() {
        return (zzb) zza(zze.zzipg, (Object) null, (Object) null);
    }

    @Override // com.google.android.gms.internal.ads.zzemf
    public final /* synthetic */ zzemd zzbit() {
        return (zzekq) zza(zze.zziph, (Object) null, (Object) null);
    }
}
