package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzehs;
import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeht<T_WRAPPER extends zzehs<T_ENGINE>, T_ENGINE> {
    private static final Logger logger = Logger.getLogger(zzeht.class.getName());
    private static final List<Provider> zziip;
    public static final zzeht<zzehv, Cipher> zziiq;
    public static final zzeht<zzehz, Mac> zziir;
    private static final zzeht<zzeib, Signature> zziis;
    private static final zzeht<zzehy, MessageDigest> zziit;
    public static final zzeht<zzehu, KeyAgreement> zziiu;
    public static final zzeht<zzehw, KeyPairGenerator> zziiv;
    public static final zzeht<zzehx, KeyFactory> zziiw;
    private T_WRAPPER zziix;
    private List<Provider> zziiy = zziip;
    private boolean zziiz = true;

    private zzeht(T_WRAPPER t_wrapper) {
        this.zziix = t_wrapper;
    }

    public final T_ENGINE zzhy(String str) throws GeneralSecurityException {
        Iterator<Provider> it = this.zziiy.iterator();
        Exception exc = null;
        while (it.hasNext()) {
            try {
                return (T_ENGINE) this.zziix.zza(str, it.next());
            } catch (Exception e) {
                if (exc == null) {
                    exc = e;
                }
            }
        }
        if (this.zziiz) {
            return (T_ENGINE) this.zziix.zza(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.", exc);
    }

    static {
        if (zzeil.zzbfz()) {
            String[] strArr = {ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    logger.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", String.format("Provider %s not available", str));
                }
            }
            zziip = arrayList;
        } else {
            zziip = new ArrayList();
        }
        zziiq = new zzeht<>(new zzehv());
        zziir = new zzeht<>(new zzehz());
        zziis = new zzeht<>(new zzeib());
        zziit = new zzeht<>(new zzehy());
        zziiu = new zzeht<>(new zzehu());
        zziiv = new zzeht<>(new zzehw());
        zziiw = new zzeht<>(new zzehx());
    }
}
