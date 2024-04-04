package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqg extends zzaqf implements zzahv<zzbdh> {
    private final Context context;
    private float density;
    private int maxHeight;
    private int maxWidth;
    private int rotation;
    private final WindowManager zzbqu;
    private final zzbdh zzdhu;
    private final zzaas zzdoy;
    private int zzdoz;
    private int zzdpa;
    private int zzdpb;
    private int zzdpc;
    private DisplayMetrics zzxh;

    public zzaqg(zzbdh zzbdhVar, Context context, zzaas zzaasVar) {
        super(zzbdhVar);
        this.zzdoz = -1;
        this.zzdpa = -1;
        this.maxWidth = -1;
        this.maxHeight = -1;
        this.zzdpb = -1;
        this.zzdpc = -1;
        this.zzdhu = zzbdhVar;
        this.context = context;
        this.zzdoy = zzaasVar;
        this.zzbqu = (WindowManager) context.getSystemService("window");
    }

    public final void zzj(int i, int i2) {
        int i3 = 0;
        if (this.context instanceof Activity) {
            com.google.android.gms.ads.internal.zzp.zzkq();
            i3 = com.google.android.gms.ads.internal.util.zzm.zzh((Activity) this.context)[0];
        }
        if (this.zzdhu.zzadg() == null || !this.zzdhu.zzadg().zzaem()) {
            int width = this.zzdhu.getWidth();
            int height = this.zzdhu.getHeight();
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcnc)).booleanValue()) {
                if (width == 0 && this.zzdhu.zzadg() != null) {
                    width = this.zzdhu.zzadg().widthPixels;
                }
                if (height == 0 && this.zzdhu.zzadg() != null) {
                    height = this.zzdhu.zzadg().heightPixels;
                }
            }
            this.zzdpb = zzwo.zzqm().zzd(this.context, width);
            this.zzdpc = zzwo.zzqm().zzd(this.context, height);
        }
        zzb(i, i2 - i3, this.zzdpb, this.zzdpc);
        this.zzdhu.zzadi().zzi(i, i2);
    }

    @Override // com.google.android.gms.internal.ads.zzahv
    public final /* synthetic */ void zza(zzbdh zzbdhVar, Map map) {
        this.zzxh = new DisplayMetrics();
        Display defaultDisplay = this.zzbqu.getDefaultDisplay();
        defaultDisplay.getMetrics(this.zzxh);
        this.density = this.zzxh.density;
        this.rotation = defaultDisplay.getRotation();
        zzwo.zzqm();
        DisplayMetrics displayMetrics = this.zzxh;
        this.zzdoz = zzayd.zzb(displayMetrics, displayMetrics.widthPixels);
        zzwo.zzqm();
        DisplayMetrics displayMetrics2 = this.zzxh;
        this.zzdpa = zzayd.zzb(displayMetrics2, displayMetrics2.heightPixels);
        Activity zzaba = this.zzdhu.zzaba();
        if (zzaba == null || zzaba.getWindow() == null) {
            this.maxWidth = this.zzdoz;
            this.maxHeight = this.zzdpa;
        } else {
            com.google.android.gms.ads.internal.zzp.zzkq();
            int[] zzf = com.google.android.gms.ads.internal.util.zzm.zzf(zzaba);
            zzwo.zzqm();
            this.maxWidth = zzayd.zzb(this.zzxh, zzf[0]);
            zzwo.zzqm();
            this.maxHeight = zzayd.zzb(this.zzxh, zzf[1]);
        }
        if (this.zzdhu.zzadg().zzaem()) {
            this.zzdpb = this.zzdoz;
            this.zzdpc = this.zzdpa;
        } else {
            this.zzdhu.measure(0, 0);
        }
        zza(this.zzdoz, this.zzdpa, this.maxWidth, this.maxHeight, this.density, this.rotation);
        this.zzdhu.zza("onDeviceFeaturesReceived", new zzaqb(new zzaqd().zzae(this.zzdoy.zzrw()).zzad(this.zzdoy.zzrx()).zzaf(this.zzdoy.zzrz()).zzag(this.zzdoy.zzry()).zzah(true)).zzdq());
        int[] iArr = new int[2];
        this.zzdhu.getLocationOnScreen(iArr);
        zzj(zzwo.zzqm().zzd(this.context, iArr[0]), zzwo.zzqm().zzd(this.context, iArr[1]));
        if (com.google.android.gms.ads.internal.util.zzd.isLoggable(2)) {
            com.google.android.gms.ads.internal.util.zzd.zzew("Dispatching Ready Event.");
        }
        zzdt(this.zzdhu.zzabf().zzbrf);
    }
}
