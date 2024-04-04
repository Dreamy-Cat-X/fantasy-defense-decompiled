package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzega;
import java.security.GeneralSecurityException;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzebb {
    private static final Logger logger = Logger.getLogger(zzebb.class.getName());
    private static final ConcurrentMap<String, zzb> zziak = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zza> zzial = new ConcurrentHashMap();
    private static final ConcurrentMap<String, Boolean> zziam = new ConcurrentHashMap();
    private static final ConcurrentMap<String, zzeae<?>> zzian = new ConcurrentHashMap();
    private static final ConcurrentMap<Class<?>, zzeaw<?, ?>> zziao = new ConcurrentHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public interface zza {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public interface zzb {
        <P> zzeal<P> zzb(Class<P> cls) throws GeneralSecurityException;

        Set<Class<?>> zzbap();

        zzeal<?> zzbba();

        Class<?> zzbbb();

        Class<?> zzbbc();
    }

    private static <KeyProtoT extends zzemd> zzb zza(zzeam<KeyProtoT> zzeamVar) {
        return new zzebd(zzeamVar);
    }

    private static <KeyProtoT extends zzemd> zza zzb(zzeam<KeyProtoT> zzeamVar) {
        return new zzebe(zzeamVar);
    }

    private static synchronized zzb zzhs(String str) throws GeneralSecurityException {
        zzb zzbVar;
        synchronized (zzebb.class) {
            if (!zziak.containsKey(str)) {
                String valueOf = String.valueOf(str);
                throw new GeneralSecurityException(valueOf.length() != 0 ? "No key manager found for key type ".concat(valueOf) : new String("No key manager found for key type "));
            }
            zzbVar = zziak.get(str);
        }
        return zzbVar;
    }

    @Deprecated
    public static zzeae<?> zzht(String str) throws GeneralSecurityException {
        if (str == null) {
            throw new IllegalArgumentException("catalogueName must be non-null.");
        }
        zzeae<?> zzeaeVar = zzian.get(str.toLowerCase(Locale.US));
        if (zzeaeVar != null) {
            return zzeaeVar;
        }
        String format = String.format("no catalogue found for %s. ", str);
        if (str.toLowerCase(Locale.US).startsWith("tinkaead")) {
            format = String.valueOf(format).concat("Maybe call AeadConfig.register().");
        }
        if (str.toLowerCase(Locale.US).startsWith("tinkdeterministicaead")) {
            format = String.valueOf(format).concat("Maybe call DeterministicAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkstreamingaead")) {
            format = String.valueOf(format).concat("Maybe call StreamingAeadConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkhybriddecrypt") || str.toLowerCase(Locale.US).startsWith("tinkhybridencrypt")) {
            format = String.valueOf(format).concat("Maybe call HybridConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkmac")) {
            format = String.valueOf(format).concat("Maybe call MacConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tinkpublickeysign") || str.toLowerCase(Locale.US).startsWith("tinkpublickeyverify")) {
            format = String.valueOf(format).concat("Maybe call SignatureConfig.register().");
        } else if (str.toLowerCase(Locale.US).startsWith("tink")) {
            format = String.valueOf(format).concat("Maybe call TinkConfig.register().");
        }
        throw new GeneralSecurityException(format);
    }

    private static <T> T checkNotNull(T t) {
        if (t != null) {
            return t;
        }
        throw null;
    }

    private static synchronized void zza(String str, Class<?> cls, boolean z) throws GeneralSecurityException {
        synchronized (zzebb.class) {
            if (zziak.containsKey(str)) {
                zzb zzbVar = zziak.get(str);
                if (!zzbVar.zzbbb().equals(cls)) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(str);
                    logger2.logp(level, "com.google.crypto.tink.Registry", "ensureKeyManagerInsertable", valueOf.length() != 0 ? "Attempted overwrite of a registered key manager for key type ".concat(valueOf) : new String("Attempted overwrite of a registered key manager for key type "));
                    throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, zzbVar.zzbbb().getName(), cls.getName()));
                }
                if (!z || zziam.get(str).booleanValue()) {
                    return;
                }
                String valueOf2 = String.valueOf(str);
                throw new GeneralSecurityException(valueOf2.length() != 0 ? "New keys are already disallowed for key type ".concat(valueOf2) : new String("New keys are already disallowed for key type "));
            }
        }
    }

    public static synchronized <P> void zza(zzeal<P> zzealVar, boolean z) throws GeneralSecurityException {
        synchronized (zzebb.class) {
            if (zzealVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String keyType = zzealVar.getKeyType();
            zza(keyType, zzealVar.getClass(), z);
            zziak.putIfAbsent(keyType, new zzeba(zzealVar));
            zziam.put(keyType, Boolean.valueOf(z));
        }
    }

    public static synchronized <KeyProtoT extends zzemd> void zza(zzeam<KeyProtoT> zzeamVar, boolean z) throws GeneralSecurityException {
        synchronized (zzebb.class) {
            String keyType = zzeamVar.getKeyType();
            zza(keyType, zzeamVar.getClass(), true);
            if (!zziak.containsKey(keyType)) {
                zziak.put(keyType, zza(zzeamVar));
                zzial.put(keyType, zzb(zzeamVar));
            }
            zziam.put(keyType, true);
        }
    }

    public static synchronized <KeyProtoT extends zzemd, PublicKeyProtoT extends zzemd> void zza(zzeay<KeyProtoT, PublicKeyProtoT> zzeayVar, zzeam<PublicKeyProtoT> zzeamVar, boolean z) throws GeneralSecurityException {
        Class<?> zzbbc;
        synchronized (zzebb.class) {
            String keyType = zzeayVar.getKeyType();
            String keyType2 = zzeamVar.getKeyType();
            zza(keyType, zzeayVar.getClass(), true);
            zza(keyType2, zzeamVar.getClass(), false);
            if (keyType.equals(keyType2)) {
                throw new GeneralSecurityException("Private and public key type must be different.");
            }
            if (zziak.containsKey(keyType) && (zzbbc = zziak.get(keyType).zzbbc()) != null && !zzbbc.equals(zzeamVar.getClass())) {
                Logger logger2 = logger;
                Level level = Level.WARNING;
                StringBuilder sb = new StringBuilder(String.valueOf(keyType).length() + 96 + String.valueOf(keyType2).length());
                sb.append("Attempted overwrite of a registered key manager for key type ");
                sb.append(keyType);
                sb.append(" with inconsistent public key type ");
                sb.append(keyType2);
                logger2.logp(level, "com.google.crypto.tink.Registry", "registerAsymmetricKeyManagers", sb.toString());
                throw new GeneralSecurityException(String.format("public key manager corresponding to %s is already registered with %s, cannot be re-registered with %s", zzeayVar.getClass().getName(), zzbbc.getName(), zzeamVar.getClass().getName()));
            }
            if (!zziak.containsKey(keyType) || zziak.get(keyType).zzbbc() == null) {
                zziak.put(keyType, new zzebc(zzeayVar, zzeamVar));
                zzial.put(keyType, zzb(zzeayVar));
            }
            zziam.put(keyType, true);
            if (!zziak.containsKey(keyType2)) {
                zziak.put(keyType2, zza(zzeamVar));
            }
            zziam.put(keyType2, false);
        }
    }

    public static synchronized <B, P> void zza(zzeaw<B, P> zzeawVar) throws GeneralSecurityException {
        synchronized (zzebb.class) {
            if (zzeawVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> zzbal = zzeawVar.zzbal();
            if (zziao.containsKey(zzbal)) {
                zzeaw<?, ?> zzeawVar2 = zziao.get(zzbal);
                if (!zzeawVar.getClass().equals(zzeawVar2.getClass())) {
                    Logger logger2 = logger;
                    Level level = Level.WARNING;
                    String valueOf = String.valueOf(zzbal);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 56);
                    sb.append("Attempted overwrite of a registered SetWrapper for type ");
                    sb.append(valueOf);
                    logger2.logp(level, "com.google.crypto.tink.Registry", "registerPrimitiveWrapper", sb.toString());
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", zzbal.getName(), zzeawVar2.getClass().getName(), zzeawVar.getClass().getName()));
                }
            }
            zziao.put(zzbal, zzeawVar);
        }
    }

    private static zzeal<?> zzhu(String str) throws GeneralSecurityException {
        return zzhs(str).zzbba();
    }

    private static <P> zzeal<P> zza(String str, Class<P> cls) throws GeneralSecurityException {
        zzb zzhs = zzhs(str);
        if (cls == null) {
            return (zzeal<P>) zzhs.zzbba();
        }
        if (zzhs.zzbap().contains(cls)) {
            return zzhs.zzb(cls);
        }
        String name = cls.getName();
        String valueOf = String.valueOf(zzhs.zzbbb());
        Set<Class<?>> zzbap = zzhs.zzbap();
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Class<?> cls2 : zzbap) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(cls2.getCanonicalName());
            z = false;
        }
        String sb2 = sb.toString();
        StringBuilder sb3 = new StringBuilder(String.valueOf(name).length() + 77 + String.valueOf(valueOf).length() + String.valueOf(sb2).length());
        sb3.append("Primitive type ");
        sb3.append(name);
        sb3.append(" not supported by key manager of type ");
        sb3.append(valueOf);
        sb3.append(", supported primitives: ");
        sb3.append(sb2);
        throw new GeneralSecurityException(sb3.toString());
    }

    public static synchronized zzefs zza(zzefv zzefvVar) throws GeneralSecurityException {
        zzefs zzo;
        synchronized (zzebb.class) {
            zzeal<?> zzhu = zzhu(zzefvVar.zzbea());
            if (zziam.get(zzefvVar.zzbea()).booleanValue()) {
                zzo = zzhu.zzo(zzefvVar.zzbeb());
            } else {
                String valueOf = String.valueOf(zzefvVar.zzbea());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzo;
    }

    public static synchronized zzemd zzb(zzefv zzefvVar) throws GeneralSecurityException {
        zzemd zzn;
        synchronized (zzebb.class) {
            zzeal<?> zzhu = zzhu(zzefvVar.zzbea());
            if (zziam.get(zzefvVar.zzbea()).booleanValue()) {
                zzn = zzhu.zzn(zzefvVar.zzbeb());
            } else {
                String valueOf = String.valueOf(zzefvVar.zzbea());
                throw new GeneralSecurityException(valueOf.length() != 0 ? "newKey-operation not permitted for key type ".concat(valueOf) : new String("newKey-operation not permitted for key type "));
            }
        }
        return zzn;
    }

    public static <P> P zza(String str, zzemd zzemdVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, (Class) checkNotNull(cls)).zza(zzemdVar);
    }

    private static <P> P zza(String str, zzejg zzejgVar, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, cls).zzm(zzejgVar);
    }

    public static <P> P zza(String str, byte[] bArr, Class<P> cls) throws GeneralSecurityException {
        return (P) zza(str, zzejg.zzt(bArr), (Class) checkNotNull(cls));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <P> zzeau<P> zza(zzear zzearVar, zzeal<P> zzealVar, Class<P> cls) throws GeneralSecurityException {
        Class cls2 = (Class) checkNotNull(cls);
        zzebf.zzc(zzearVar.zzbat());
        zzeau<P> zzeauVar = (zzeau<P>) zzeau.zza(cls2);
        for (zzega.zzb zzbVar : zzearVar.zzbat().zzbeo()) {
            if (zzbVar.zzbax() == zzeft.ENABLED) {
                zzeax zza2 = zzeauVar.zza(zza(zzbVar.zzbes().zzbea(), zzbVar.zzbes().zzbeb(), cls2), zzbVar);
                if (zzbVar.zzbet() == zzearVar.zzbat().zzben()) {
                    zzeauVar.zza(zza2);
                }
            }
        }
        return zzeauVar;
    }

    public static <P> P zza(zzeau<P> zzeauVar) throws GeneralSecurityException {
        zzeaw<?, ?> zzeawVar = zziao.get(zzeauVar.zzbal());
        if (zzeawVar == null) {
            String valueOf = String.valueOf(zzeauVar.zzbal().getName());
            throw new GeneralSecurityException(valueOf.length() != 0 ? "No wrapper found for ".concat(valueOf) : new String("No wrapper found for "));
        }
        if (!zzeawVar.zzbav().equals(zzeauVar.zzbal())) {
            String valueOf2 = String.valueOf(zzeawVar.zzbav());
            String valueOf3 = String.valueOf(zzeauVar.zzbal());
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf2).length() + 44 + String.valueOf(valueOf3).length());
            sb.append("Wrong input primitive class, expected ");
            sb.append(valueOf2);
            sb.append(", got ");
            sb.append(valueOf3);
            throw new GeneralSecurityException(sb.toString());
        }
        return (P) zzeawVar.zza(zzeauVar);
    }

    private zzebb() {
    }
}
