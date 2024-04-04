package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsIntent;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcsd implements zzcqq<zzbyd> {
    private final Context context;
    private final zzdmg zzfph;
    private final Executor zzfqs;
    private final zzbzd zzgsh;

    public zzcsd(Context context, Executor executor, zzbzd zzbzdVar, zzdmg zzdmgVar) {
        this.context = context;
        this.zzgsh = zzbzdVar;
        this.zzfqs = executor;
        this.zzfph = zzdmgVar;
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final boolean zza(zzdmt zzdmtVar, zzdmi zzdmiVar) {
        return (this.context instanceof Activity) && PlatformVersion.isAtLeastIceCreamSandwichMR1() && zzach.zzj(this.context) && !TextUtils.isEmpty(zze(zzdmiVar));
    }

    @Override // com.google.android.gms.internal.ads.zzcqq
    public final zzdzl<zzbyd> zzb(final zzdmt zzdmtVar, final zzdmi zzdmiVar) {
        String zze = zze(zzdmiVar);
        final Uri parse = zze != null ? Uri.parse(zze) : null;
        return zzdyz.zzb(zzdyz.zzag(null), new zzdyj(this, parse, zzdmtVar, zzdmiVar) { // from class: com.google.android.gms.internal.ads.zzcsc
            private final zzdmt zzgrk;
            private final zzcsd zzgse;
            private final Uri zzgsf;
            private final zzdmi zzgsg;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgse = this;
                this.zzgsf = parse;
                this.zzgrk = zzdmtVar;
                this.zzgsg = zzdmiVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdyj
            public final zzdzl zzf(Object obj) {
                return this.zzgse.zza(this.zzgsf, this.zzgrk, this.zzgsg, obj);
            }
        }, this.zzfqs);
    }

    private static String zze(zzdmi zzdmiVar) {
        try {
            return zzdmiVar.zzhhw.getString("tab_url");
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdzl zza(Uri uri, zzdmt zzdmtVar, zzdmi zzdmiVar, Object obj) throws Exception {
        try {
            CustomTabsIntent build = new CustomTabsIntent.Builder().build();
            build.intent.setData(uri);
            com.google.android.gms.ads.internal.overlay.zzb zzbVar = new com.google.android.gms.ads.internal.overlay.zzb(build.intent);
            final zzazc zzazcVar = new zzazc();
            zzbyf zza = this.zzgsh.zza(new zzbnp(zzdmtVar, zzdmiVar, null), new zzbye(new zzbzl(zzazcVar) { // from class: com.google.android.gms.internal.ads.zzcsf
                private final zzazc zzbvl;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzbvl = zzazcVar;
                }

                @Override // com.google.android.gms.internal.ads.zzbzl
                public final void zza(boolean z, Context context) {
                    zzazc zzazcVar2 = this.zzbvl;
                    try {
                        com.google.android.gms.ads.internal.zzp.zzkp();
                        com.google.android.gms.ads.internal.overlay.zzo.zza(context, (AdOverlayInfoParcel) zzazcVar2.get(), true);
                    } catch (Exception unused) {
                    }
                }
            }));
            zzazcVar.set(new AdOverlayInfoParcel(zzbVar, null, zza.zzahx(), null, new zzayt(0, 0, false)));
            this.zzfph.zzxm();
            return zzdyz.zzag(zza.zzahw());
        } catch (Throwable th) {
            com.google.android.gms.ads.internal.util.zzd.zzc("Error in CustomTabsAdRenderer", th);
            throw th;
        }
    }
}
