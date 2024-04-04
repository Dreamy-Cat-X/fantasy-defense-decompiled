package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbho extends zzyb {
    private final Context context;
    private final zzayt zzbpd;
    private final zzawg zzbql;
    private final zzchu zzfoo;
    private final zzcqv<zzdno, zzcsn> zzfop;
    private final zzcwq zzfoq;
    private final zzckx zzfor;
    private final zzchw zzfos;
    private boolean zzze = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbho(Context context, zzayt zzaytVar, zzchu zzchuVar, zzcqv<zzdno, zzcsn> zzcqvVar, zzcwq zzcwqVar, zzckx zzckxVar, zzawg zzawgVar, zzchw zzchwVar) {
        this.context = context;
        this.zzbpd = zzaytVar;
        this.zzfoo = zzchuVar;
        this.zzfop = zzcqvVar;
        this.zzfoq = zzcwqVar;
        this.zzfor = zzckxVar;
        this.zzbql = zzawgVar;
        this.zzfos = zzchwVar;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final synchronized void initialize() {
        if (this.zzze) {
            com.google.android.gms.ads.internal.util.zzd.zzex("Mobile ads is initialized already.");
            return;
        }
        zzabh.initialize(this.context);
        com.google.android.gms.ads.internal.zzp.zzku().zzd(this.context, this.zzbpd);
        com.google.android.gms.ads.internal.zzp.zzkw().initialize(this.context);
        this.zzze = true;
        this.zzfor.zzard();
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcqi)).booleanValue()) {
            this.zzfoq.zzapz();
        }
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsz)).booleanValue()) {
            this.zzfos.zzapz();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final synchronized void setAppVolume(float f) {
        com.google.android.gms.ads.internal.zzp.zzkv().setAppVolume(f);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final synchronized float zzqz() {
        return com.google.android.gms.ads.internal.zzp.zzkv().zzqz();
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final synchronized void setAppMuted(boolean z) {
        com.google.android.gms.ads.internal.zzp.zzkv().setAppMuted(z);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final synchronized boolean zzra() {
        return com.google.android.gms.ads.internal.zzp.zzkv().zzra();
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final synchronized void zzcd(String str) {
        zzabh.initialize(this.context);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcsy)).booleanValue()) {
                com.google.android.gms.ads.internal.zzp.zzky().zza(this.context, this.zzbpd, str, (Runnable) null);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzb(IObjectWrapper iObjectWrapper, String str) {
        if (iObjectWrapper == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        if (context == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("Context is null. Failed to open debug menu.");
            return;
        }
        com.google.android.gms.ads.internal.util.zzag zzagVar = new com.google.android.gms.ads.internal.util.zzag(context);
        zzagVar.setAdUnitId(str);
        zzagVar.zzad(this.zzbpd.zzbrf);
        zzagVar.showDialog();
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(String str, IObjectWrapper iObjectWrapper) {
        String str2;
        zzabh.initialize(this.context);
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcta)).booleanValue()) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            str2 = com.google.android.gms.ads.internal.util.zzm.zzaz(this.context);
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        boolean booleanValue = ((Boolean) zzwo.zzqq().zzd(zzabh.zzcsy)).booleanValue() | ((Boolean) zzwo.zzqq().zzd(zzabh.zzcop)).booleanValue();
        Runnable runnable = null;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcop)).booleanValue()) {
            booleanValue = true;
            final Runnable runnable2 = (Runnable) ObjectWrapper.unwrap(iObjectWrapper);
            runnable = new Runnable(this, runnable2) { // from class: com.google.android.gms.internal.ads.zzbhr
                private final zzbho zzfot;
                private final Runnable zzfou;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzfot = this;
                    this.zzfou = runnable2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzayv.zzegm.execute(new Runnable(this.zzfot, this.zzfou) { // from class: com.google.android.gms.internal.ads.zzbhq
                        private final zzbho zzfot;
                        private final Runnable zzfou;

                        /* JADX INFO: Access modifiers changed from: package-private */
                        {
                            this.zzfot = r1;
                            this.zzfou = r2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.zzfot.zzd(this.zzfou);
                        }
                    });
                }
            };
        }
        if (booleanValue) {
            com.google.android.gms.ads.internal.zzp.zzky().zza(this.context, this.zzbpd, str, runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final String getVersionString() {
        return this.zzbpd.zzbrf;
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzce(String str) {
        this.zzfoq.zzgp(str);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzamt zzamtVar) throws RemoteException {
        this.zzfoo.zzb(zzamtVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzajc zzajcVar) throws RemoteException {
        this.zzfor.zzb(zzajcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final List<zzaiv> zzrb() throws RemoteException {
        return this.zzfor.zzare();
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zza(zzaak zzaakVar) throws RemoteException {
        this.zzbql.zza(this.context, zzaakVar);
    }

    @Override // com.google.android.gms.internal.ads.zzxy
    public final void zzrc() {
        this.zzfor.disable();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzd(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map<String, zzams> zzxy = com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyl().zzxy();
        if (zzxy == null || zzxy.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.zzfoo.zzapw()) {
            HashMap hashMap = new HashMap();
            Iterator<zzams> it = zzxy.values().iterator();
            while (it.hasNext()) {
                for (zzamp zzampVar : it.next().zzdlf) {
                    String str = zzampVar.zzdks;
                    for (String str2 : zzampVar.zzdkk) {
                        if (!hashMap.containsKey(str2)) {
                            hashMap.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((Collection) hashMap.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hashMap.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    zzcqs<zzdno, zzcsn> zzf = this.zzfop.zzf(str3, jSONObject);
                    if (zzf != null) {
                        zzdno zzdnoVar = zzf.zzdmc;
                        if (!zzdnoVar.isInitialized() && zzdnoVar.zzuy()) {
                            zzdnoVar.zza(this.context, zzf.zzgrc, (List<String>) entry.getValue());
                            String valueOf = String.valueOf(str3);
                            com.google.android.gms.ads.internal.util.zzd.zzdy(valueOf.length() != 0 ? "Initialized rewarded video mediation adapter ".concat(valueOf) : new String("Initialized rewarded video mediation adapter "));
                        }
                    }
                } catch (zzdnf e) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 56);
                    sb.append("Failed to initialize rewarded video mediation adapter \"");
                    sb.append(str3);
                    sb.append("\"");
                    com.google.android.gms.ads.internal.util.zzd.zzd(sb.toString(), e);
                }
            }
        }
    }
}
