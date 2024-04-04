package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzble {
    private final View view;
    private final zzbdh zzdhu;
    private final zzdmh zzfrt;
    private final zzbmw zzfsw;

    public zzble(View view, zzbdh zzbdhVar, zzbmw zzbmwVar, zzdmh zzdmhVar) {
        this.view = view;
        this.zzdhu = zzbdhVar;
        this.zzfsw = zzbmwVar;
        this.zzfrt = zzdmhVar;
    }

    public final zzbdh zzajb() {
        return this.zzdhu;
    }

    public final View zzajo() {
        return this.view;
    }

    public final zzbmw zzaka() {
        return this.zzfsw;
    }

    public final zzdmh zzakb() {
        return this.zzfrt;
    }

    public zzbsb zza(Set<zzbxf<zzbsg>> set) {
        return new zzbsb(set);
    }
}
