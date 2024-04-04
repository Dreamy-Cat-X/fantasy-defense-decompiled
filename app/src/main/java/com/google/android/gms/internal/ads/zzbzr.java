package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.internal.ads.zzuc;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbzr implements zzbqr, zzbwu {
    private final Context context;
    private final View view;
    private final zzawg zzbql;
    private final zzawh zzfui;
    private final zzuc.zza.EnumC0024zza zzfzw;
    private String zzfzy;

    public zzbzr(zzawh zzawhVar, Context context, zzawg zzawgVar, View view, zzuc.zza.EnumC0024zza enumC0024zza) {
        this.zzfui = zzawhVar;
        this.context = context;
        this.zzbql = zzawgVar;
        this.view = view;
        this.zzfzw = enumC0024zza;
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdLeftApplication() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoCompleted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onRewardedVideoStarted() {
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzala() {
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdOpened() {
        View view = this.view;
        if (view != null && this.zzfzy != null) {
            this.zzbql.zzf(view.getContext(), this.zzfzy);
        }
        this.zzfui.zzam(true);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    public final void onAdClosed() {
        this.zzfui.zzam(false);
    }

    @Override // com.google.android.gms.internal.ads.zzbwu
    public final void zzalc() {
        String zzab = this.zzbql.zzab(this.context);
        this.zzfzy = zzab;
        String valueOf = String.valueOf(zzab);
        String str = this.zzfzw == zzuc.zza.EnumC0024zza.REWARD_BASED_VIDEO_AD ? "/Rewarded" : "/Interstitial";
        this.zzfzy = str.length() != 0 ? valueOf.concat(str) : new String(valueOf);
    }

    @Override // com.google.android.gms.internal.ads.zzbqr
    @ParametersAreNonnullByDefault
    public final void zzb(zzato zzatoVar, String str, String str2) {
        if (this.zzbql.zzz(this.context)) {
            try {
                this.zzbql.zza(this.context, this.zzbql.zzae(this.context), this.zzfui.getAdUnitId(), zzatoVar.getType(), zzatoVar.getAmount());
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.zzd.zzd("Remote Exception to get reward item.", e);
            }
        }
    }
}
