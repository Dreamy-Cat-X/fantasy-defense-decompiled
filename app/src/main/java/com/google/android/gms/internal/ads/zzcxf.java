package com.google.android.gms.internal.ads;

import android.util.Pair;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import java.util.Iterator;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcxf implements AppEventListener, zzbqr, zzbqw, zzbrf, zzbrj, zzbsg, zzbsy, zzbtf, zzuz {
    private final zzdro zzdgv;
    private final AtomicReference<zzwv> zzgwj = new AtomicReference<>();
    private final AtomicReference<zzxo> zzgwk = new AtomicReference<>();
    private final AtomicReference<zzyo> zzgwl = new AtomicReference<>();
    private final AtomicReference<zzww> zzgwm = new AtomicReference<>();
    private final AtomicReference<zzxw> zzgwn = new AtomicReference<>();
    private final AtomicBoolean zzgwo = new AtomicBoolean(true);
    private final BlockingQueue<Pair<String, String>> zzgwp = new ArrayBlockingQueue(((Integer) zzwo.zzqq().zzd(zzabh.zzczo)).intValue());

    public zzcxf(zzdro zzdroVar) {
        this.zzdgv = zzdroVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void zzb(zzato zzatoVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzd(zzasu zzasuVar) {
    }

    public final synchronized zzwv zzasl() {
        return this.zzgwj.get();
    }

    public final synchronized zzxo zzasm() {
        return this.zzgwk.get();
    }

    public final void zzc(zzwv zzwvVar) {
        this.zzgwj.set(zzwvVar);
    }

    public final void zzb(zzxo zzxoVar) {
        this.zzgwk.set(zzxoVar);
    }

    public final void zzb(zzyo zzyoVar) {
        this.zzgwl.set(zzyoVar);
    }

    public final void zza(zzww zzwwVar) {
        this.zzgwm.set(zzwwVar);
    }

    public final void zzb(zzxw zzxwVar) {
        this.zzgwn.set(zzxwVar);
    }

    @Override // com.google.android.gms.internal.ads.zzbtf
    public final void zzb(zzdmt zzdmtVar) {
        this.zzgwo.set(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
        zzdjl.zza(this.zzgwj, zzcxe.zzgwi);
        zzdjl.zza(this.zzgwn, zzcxh.zzgwi);
    }

    @Override // com.google.android.gms.internal.ads.zzbqw
    public final void zzd(final zzvc zzvcVar) {
        zzdjl.zza(this.zzgwj, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzcxm
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdjo
            public final void zzp(Object obj) {
                ((zzwv) obj).zzc(this.zzfxo);
            }
        });
        zzdjl.zza(this.zzgwj, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzcxp
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdjo
            public final void zzp(Object obj) {
                ((zzwv) obj).onAdFailedToLoad(this.zzfxo.errorCode);
            }
        });
        zzdjl.zza(this.zzgwm, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzcxo
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdjo
            public final void zzp(Object obj) {
                ((zzww) obj).zzd(this.zzfxo);
            }
        });
        this.zzgwo.set(false);
        this.zzgwp.clear();
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
        zzdjl.zza(this.zzgwj, zzcxr.zzgwi);
    }

    @Override // com.google.android.gms.internal.ads.zzbsg
    public final synchronized void onAdLoaded() {
        zzdjl.zza(this.zzgwj, zzcxq.zzgwi);
        zzdjl.zza(this.zzgwm, zzcxt.zzgwi);
        Iterator it = this.zzgwp.iterator();
        while (it.hasNext()) {
            final Pair pair = (Pair) it.next();
            zzdjl.zza(this.zzgwk, new zzdjo(pair) { // from class: com.google.android.gms.internal.ads.zzcxn
                private final Pair zzgwq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzgwq = pair;
                }

                @Override // com.google.android.gms.internal.ads.zzdjo
                public final void zzp(Object obj) {
                    Pair pair2 = this.zzgwq;
                    ((zzxo) obj).onAppEvent((String) pair2.first, (String) pair2.second);
                }
            });
        }
        this.zzgwp.clear();
        this.zzgwo.set(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
        zzdjl.zza(this.zzgwj, zzcxs.zzgwi);
        zzdjl.zza(this.zzgwn, zzcxv.zzgwi);
    }

    @Override // com.google.android.gms.internal.ads.zzuz
    public final void onAdClicked() {
        zzdjl.zza(this.zzgwj, zzcxg.zzgwi);
    }

    @Override // com.google.android.gms.internal.ads.zzbrj
    public final void onAdImpression() {
        zzdjl.zza(this.zzgwj, zzcxj.zzgwi);
    }

    @Override // com.google.android.gms.internal.ads.zzbsy
    public final void zzb(final zzvr zzvrVar) {
        zzdjl.zza(this.zzgwl, new zzdjo(zzvrVar) { // from class: com.google.android.gms.internal.ads.zzcxi
            private final zzvr zzfyh;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfyh = zzvrVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdjo
            public final void zzp(Object obj) {
                ((zzyo) obj).zza(this.zzfyh);
            }
        });
    }

    @Override // com.google.android.gms.ads.doubleclick.AppEventListener
    public final synchronized void onAppEvent(final String str, final String str2) {
        if (this.zzgwo.get()) {
            if (!this.zzgwp.offer(new Pair<>(str, str2))) {
                com.google.android.gms.ads.internal.util.zzd.zzdy("The queue for app events is full, dropping the new event.");
                if (this.zzdgv != null) {
                    this.zzdgv.zzb(zzdrp.zzgz("dae_action").zzu("dae_name", str).zzu("dae_data", str2));
                }
            }
            return;
        }
        zzdjl.zza(this.zzgwk, new zzdjo(str, str2) { // from class: com.google.android.gms.internal.ads.zzcxl
            private final String zzdhw;
            private final String zzdjy;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzdjy = str;
                this.zzdhw = str2;
            }

            @Override // com.google.android.gms.internal.ads.zzdjo
            public final void zzp(Object obj) {
                ((zzxo) obj).onAppEvent(this.zzdjy, this.zzdhw);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzbrf
    public final void zzk(final zzvc zzvcVar) {
        zzdjl.zza(this.zzgwn, new zzdjo(zzvcVar) { // from class: com.google.android.gms.internal.ads.zzcxk
            private final zzvc zzfxo;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzfxo = zzvcVar;
            }

            @Override // com.google.android.gms.internal.ads.zzdjo
            public final void zzp(Object obj) {
                ((zzxw) obj).zzb(this.zzfxo);
            }
        });
    }
}
