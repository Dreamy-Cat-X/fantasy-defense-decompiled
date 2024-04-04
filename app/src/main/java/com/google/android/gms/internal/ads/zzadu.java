package com.google.android.gms.internal.ads;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzadu extends zzaee {
    private static final int zzdeh = Color.rgb(12, 174, 206);
    private static final int zzdei;
    private static final int zzdej;
    private static final int zzdek;
    private final int backgroundColor;
    private final int textColor;
    private final int textSize;
    private final String zzdel;
    private final List<zzadv> zzdem = new ArrayList();
    private final List<zzaej> zzden = new ArrayList();
    private final int zzdeo;
    private final int zzdep;
    private final boolean zzdeq;

    public zzadu(String str, List<zzadv> list, Integer num, Integer num2, Integer num3, int i, int i2, boolean z) {
        this.zzdel = str;
        if (list != null) {
            for (int i3 = 0; i3 < list.size(); i3++) {
                zzadv zzadvVar = list.get(i3);
                this.zzdem.add(zzadvVar);
                this.zzden.add(zzadvVar);
            }
        }
        this.backgroundColor = num != null ? num.intValue() : zzdej;
        this.textColor = num2 != null ? num2.intValue() : zzdek;
        this.textSize = num3 != null ? num3.intValue() : 12;
        this.zzdeo = i;
        this.zzdep = i2;
        this.zzdeq = z;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final String getText() {
        return this.zzdel;
    }

    @Override // com.google.android.gms.internal.ads.zzaeb
    public final List<zzaej> zztc() {
        return this.zzden;
    }

    public final List<zzadv> zztd() {
        return this.zzdem;
    }

    public final int getBackgroundColor() {
        return this.backgroundColor;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final int getTextSize() {
        return this.textSize;
    }

    public final int zzte() {
        return this.zzdeo;
    }

    public final int zztf() {
        return this.zzdep;
    }

    static {
        int rgb = Color.rgb(204, 204, 204);
        zzdei = rgb;
        zzdej = rgb;
        zzdek = zzdeh;
    }
}
