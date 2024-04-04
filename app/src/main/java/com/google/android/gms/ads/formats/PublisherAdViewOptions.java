package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.doubleclick.AppEventListener;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzaao;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzagg;
import com.google.android.gms.internal.ads.zzvv;
import com.google.android.gms.internal.ads.zzxo;
import com.google.android.gms.internal.ads.zzxr;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class PublisherAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PublisherAdViewOptions> CREATOR = new zzd();
    private final boolean zzbnf;
    private final IBinder zzbnh;
    private final zzxo zzboa;
    private AppEventListener zzbob;

    private PublisherAdViewOptions(Builder builder) {
        this.zzbnf = builder.zzbnf;
        AppEventListener appEventListener = builder.zzbob;
        this.zzbob = appEventListener;
        this.zzboa = appEventListener != null ? new zzvv(this.zzbob) : null;
        this.zzbnh = builder.zzbng != null ? new zzaao(builder.zzbng) : null;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private boolean zzbnf = false;
        private ShouldDelayBannerRenderingListener zzbng;
        private AppEventListener zzbob;

        public final Builder setManualImpressionsEnabled(boolean z) {
            this.zzbnf = z;
            return this;
        }

        public final Builder setAppEventListener(AppEventListener appEventListener) {
            this.zzbob = appEventListener;
            return this;
        }

        public final Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzbng = shouldDelayBannerRenderingListener;
            return this;
        }

        public final PublisherAdViewOptions build() {
            return new PublisherAdViewOptions(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PublisherAdViewOptions(boolean z, IBinder iBinder, IBinder iBinder2) {
        this.zzbnf = z;
        this.zzboa = iBinder != null ? zzxr.zze(iBinder) : null;
        this.zzbnh = iBinder2;
    }

    public final AppEventListener getAppEventListener() {
        return this.zzbob;
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbnf;
    }

    public final zzxo zzjv() {
        return this.zzboa;
    }

    public final zzagd zzjr() {
        return zzagg.zzy(this.zzbnh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, getManualImpressionsEnabled());
        zzxo zzxoVar = this.zzboa;
        SafeParcelWriter.writeIBinder(parcel, 2, zzxoVar == null ? null : zzxoVar.asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 3, this.zzbnh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
