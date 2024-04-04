package com.google.android.gms.ads.formats;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzagd;
import com.google.android.gms.internal.ads.zzagg;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdManagerAdViewOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AdManagerAdViewOptions> CREATOR = new zza();
    private final boolean zzbnf;
    private final IBinder zzbnh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdManagerAdViewOptions(boolean z, IBinder iBinder) {
        this.zzbnf = z;
        this.zzbnh = iBinder;
    }

    /* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        private boolean zzbnf = false;
        private ShouldDelayBannerRenderingListener zzbng;

        public final Builder setShouldDelayBannerRenderingListener(ShouldDelayBannerRenderingListener shouldDelayBannerRenderingListener) {
            this.zzbng = shouldDelayBannerRenderingListener;
            return this;
        }
    }

    public final boolean getManualImpressionsEnabled() {
        return this.zzbnf;
    }

    public final zzagd zzjr() {
        return zzagg.zzy(this.zzbnh);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeBoolean(parcel, 1, this.zzbnf);
        SafeParcelWriter.writeIBinder(parcel, 2, this.zzbnh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
