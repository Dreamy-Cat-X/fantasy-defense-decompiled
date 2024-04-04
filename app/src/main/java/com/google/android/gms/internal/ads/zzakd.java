package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.common.util.Predicate;
import java.util.Map;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzakd implements zzaka, zzakb {
    private final zzbdh zzdhu;

    public zzakd(Context context, zzayt zzaytVar, zzef zzefVar, com.google.android.gms.ads.internal.zzb zzbVar) throws zzbdt {
        com.google.android.gms.ads.internal.zzp.zzkr();
        zzbdh zza = zzbdp.zza(context, zzbew.zzaej(), "", false, false, zzefVar, null, zzaytVar, null, null, null, zztu.zzne(), null, null);
        this.zzdhu = zza;
        zza.getView().setWillNotDraw(true);
    }

    @Override // com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, Map map) {
        zzajz.zza(this, str, map);
    }

    @Override // com.google.android.gms.internal.ads.zzaka, com.google.android.gms.internal.ads.zzajx
    public final void zza(String str, JSONObject jSONObject) {
        zzajz.zzb(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzakl
    public final void zzb(String str, JSONObject jSONObject) {
        zzajz.zza(this, str, jSONObject);
    }

    @Override // com.google.android.gms.internal.ads.zzaka
    public final void zzi(String str, String str2) {
        zzajz.zza(this, str, str2);
    }

    private static void runOnUiThread(Runnable runnable) {
        zzwo.zzqm();
        if (zzayd.zzzv()) {
            runnable.run();
        } else {
            com.google.android.gms.ads.internal.util.zzm.zzecu.post(runnable);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaka, com.google.android.gms.internal.ads.zzakl
    public final void zzcv(final String str) {
        runOnUiThread(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzakg
            private final zzakd zzdhv;
            private final String zzdhw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdhv = this;
                this.zzdhw = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdhv.zzdc(this.zzdhw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzcw(String str) {
        final String format = String.format("<!DOCTYPE html><html><head><script src=\"%s\"></script></head><body></body></html>", str);
        runOnUiThread(new Runnable(this, format) { // from class: com.google.android.gms.internal.ads.zzakf
            private final zzakd zzdhv;
            private final String zzdhw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdhv = this;
                this.zzdhw = format;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdhv.zzdb(this.zzdhw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzcy(final String str) {
        runOnUiThread(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzaki
            private final zzakd zzdhv;
            private final String zzdhw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdhv = this;
                this.zzdhw = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdhv.zzda(this.zzdhw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zzcx(final String str) {
        runOnUiThread(new Runnable(this, str) { // from class: com.google.android.gms.internal.ads.zzakh
            private final zzakd zzdhv;
            private final String zzdhw;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdhv = this;
                this.zzdhw = str;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.zzdhv.zzcz(this.zzdhw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zza(String str, zzahv<? super zzalm> zzahvVar) {
        this.zzdhu.zza(str, new zzakm(this, zzahvVar));
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    public final void zzb(String str, final zzahv<? super zzalm> zzahvVar) {
        this.zzdhu.zza(str, new Predicate(zzahvVar) { // from class: com.google.android.gms.internal.ads.zzakk
            private final zzahv zzdhy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdhy = zzahvVar;
            }

            @Override // com.google.android.gms.common.util.Predicate
            public final boolean apply(Object obj) {
                zzahv zzahvVar2;
                zzahv zzahvVar3 = this.zzdhy;
                zzahv zzahvVar4 = (zzahv) obj;
                if (!(zzahvVar4 instanceof zzakm)) {
                    return false;
                }
                zzahvVar2 = ((zzakm) zzahvVar4).zzdhz;
                return zzahvVar2.equals(zzahvVar3);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void zza(zzake zzakeVar) {
        zzbet zzadi = this.zzdhu.zzadi();
        zzakeVar.getClass();
        zzadi.zza(zzakj.zzb(zzakeVar));
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final zzall zzui() {
        return new zzalo(this);
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final void destroy() {
        this.zzdhu.destroy();
    }

    @Override // com.google.android.gms.internal.ads.zzakb
    public final boolean isDestroyed() {
        return this.zzdhu.isDestroyed();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzcz(String str) {
        this.zzdhu.loadUrl(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzda(String str) {
        this.zzdhu.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdb(String str) {
        this.zzdhu.loadData(str, "text/html", "UTF-8");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zzdc(String str) {
        this.zzdhu.zzcv(str);
    }
}
