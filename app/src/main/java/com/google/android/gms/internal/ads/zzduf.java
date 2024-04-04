package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.Base64;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzcf;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzduf implements zzdst {
    private final Object zzhss;
    private final zzdue zzhst;
    private final zzduq zzhsu;
    private final zzdsn zzvo;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzduf(Object obj, zzdue zzdueVar, zzduq zzduqVar, zzdsn zzdsnVar) {
        this.zzhss = obj;
        this.zzhst = zzdueVar;
        this.zzhsu = zzduqVar;
        this.zzvo = zzdsnVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zzdue zzayr() {
        return this.zzhst;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean zzays() throws zzduo {
        try {
        } catch (Exception e) {
            throw new zzduo(2001, e);
        }
        return ((Boolean) this.zzhss.getClass().getDeclaredMethod("init", new Class[0]).invoke(this.zzhss, new Object[0])).booleanValue();
    }

    public final synchronized void close() throws zzduo {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            this.zzhss.getClass().getDeclaredMethod("close", new Class[0]).invoke(this.zzhss, new Object[0]);
            this.zzvo.zzh(3001, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzduo(2003, e);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdst
    public final synchronized String zzt(Context context, String str) {
        Map<String, Object> zzcd;
        zzcd = this.zzhsu.zzcd();
        zzcd.put("f", "q");
        zzcd.put("ctx", context);
        zzcd.put("aid", null);
        return zzj(zzc(null, zzcd));
    }

    @Override // com.google.android.gms.internal.ads.zzdst
    public final synchronized String zzb(Context context, String str, View view, Activity activity) {
        Map<String, Object> zzce;
        zzce = this.zzhsu.zzce();
        zzce.put("f", "v");
        zzce.put("ctx", context);
        zzce.put("aid", null);
        zzce.put("view", view);
        zzce.put("act", activity);
        return zzj(zzc(null, zzce));
    }

    @Override // com.google.android.gms.internal.ads.zzdst
    public final synchronized String zza(Context context, String str, String str2, View view, Activity activity) {
        Map<String, Object> zzcf;
        zzcf = this.zzhsu.zzcf();
        zzcf.put("f", "c");
        zzcf.put("ctx", context);
        zzcf.put("cs", str2);
        zzcf.put("aid", null);
        zzcf.put("view", view);
        zzcf.put("act", activity);
        return zzj(zzc(null, zzcf));
    }

    @Override // com.google.android.gms.internal.ads.zzdst
    public final synchronized void zza(String str, MotionEvent motionEvent) throws zzduo {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            HashMap hashMap = new HashMap();
            hashMap.put("aid", null);
            hashMap.put("evt", motionEvent);
            this.zzhss.getClass().getDeclaredMethod("he", Map.class).invoke(this.zzhss, hashMap);
            this.zzvo.zzh(3003, System.currentTimeMillis() - currentTimeMillis);
        } catch (Exception e) {
            throw new zzduo(2005, e);
        }
    }

    public final synchronized int zzayt() throws zzduo {
        try {
        } catch (Exception e) {
            throw new zzduo(2006, e);
        }
        return ((Integer) this.zzhss.getClass().getDeclaredMethod("lcs", new Class[0]).invoke(this.zzhss, new Object[0])).intValue();
    }

    private static String zzj(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(((zzcf.zzf) ((zzekq) zzcf.zzf.zzbl().zzb(zzcm.DG).zzj(zzejg.zzt(bArr)).zzbiz())).toByteArray(), 11);
    }

    private final synchronized byte[] zzc(Map<String, String> map, Map<String, Object> map2) {
        long currentTimeMillis = System.currentTimeMillis();
        try {
        } catch (Exception e) {
            this.zzvo.zza(2007, System.currentTimeMillis() - currentTimeMillis, e);
            return null;
        }
        return (byte[]) this.zzhss.getClass().getDeclaredMethod("xss", Map.class, Map.class).invoke(this.zzhss, null, map2);
    }
}
