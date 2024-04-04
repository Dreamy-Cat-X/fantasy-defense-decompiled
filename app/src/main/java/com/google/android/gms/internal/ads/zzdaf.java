package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdaf implements zzdeu<zzdag> {
    private final Context context;
    private final zzaxs zzbpt;
    private final zzdmx zzfve;
    private final zzdeu<zzdex> zzgyw;

    public zzdaf(zzdbo<zzdex> zzdboVar, zzdmx zzdmxVar, Context context, zzaxs zzaxsVar) {
        this.zzgyw = zzdboVar;
        this.zzfve = zzdmxVar;
        this.context = context;
        this.zzbpt = zzaxsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdeu
    public final zzdzl<zzdag> zzata() {
        return zzdyz.zzb(this.zzgyw.zzata(), new zzdvo(this) { // from class: com.google.android.gms.internal.ads.zzdai
            private final zzdaf zzgzb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgzb = this;
            }

            @Override // com.google.android.gms.internal.ads.zzdvo
            public final Object apply(Object obj) {
                return this.zzgzb.zza((zzdex) obj);
            }
        }, zzayv.zzegn);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ zzdag zza(zzdex zzdexVar) {
        String str;
        boolean z;
        String str2;
        float f;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        DisplayMetrics displayMetrics;
        zzvp zzvpVar = this.zzfve.zzbpe;
        if (zzvpVar.zzchr == null) {
            str = zzvpVar.zzacv;
            z = zzvpVar.zzchs;
        } else {
            str = null;
            boolean z2 = false;
            boolean z3 = false;
            z = false;
            for (zzvp zzvpVar2 : zzvpVar.zzchr) {
                if (!zzvpVar2.zzchs && !z2) {
                    str = zzvpVar2.zzacv;
                    z2 = true;
                }
                if (zzvpVar2.zzchs && !z3) {
                    z3 = true;
                    z = true;
                }
                if (z2 && z3) {
                    break;
                }
            }
        }
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            str2 = null;
            f = 0.0f;
            i = 0;
            i2 = 0;
        } else {
            float f2 = displayMetrics.density;
            int i6 = displayMetrics.widthPixels;
            i2 = displayMetrics.heightPixels;
            str2 = this.zzbpt.zzxq().zzyr();
            i = i6;
            f = f2;
        }
        StringBuilder sb = new StringBuilder();
        if (zzvpVar.zzchr != null) {
            boolean z4 = false;
            for (zzvp zzvpVar3 : zzvpVar.zzchr) {
                if (zzvpVar3.zzchs) {
                    z4 = true;
                } else {
                    if (sb.length() != 0) {
                        sb.append("|");
                    }
                    if (zzvpVar3.width == -1 && f != 0.0f) {
                        i4 = (int) (zzvpVar3.widthPixels / f);
                    } else {
                        i4 = zzvpVar3.width;
                    }
                    sb.append(i4);
                    sb.append("x");
                    if (zzvpVar3.height == -2 && f != 0.0f) {
                        i5 = (int) (zzvpVar3.heightPixels / f);
                        sb.append(i5);
                    }
                    i5 = zzvpVar3.height;
                    sb.append(i5);
                }
            }
            if (z4) {
                if (sb.length() != 0) {
                    i3 = 0;
                    sb.insert(0, "|");
                } else {
                    i3 = 0;
                }
                sb.insert(i3, "320x50");
            }
        }
        return new zzdag(zzvpVar, str, z, sb.toString(), f, i, i2, str2, this.zzfve.zzgyz);
    }
}
