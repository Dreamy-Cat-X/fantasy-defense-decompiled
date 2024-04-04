package com.google.android.gms.ads.internal.overlay;

import android.R;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import com.google.android.gms.internal.ads.zzayd;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzr extends FrameLayout implements View.OnClickListener {
    private final ImageButton zzdrl;
    private final zzy zzdrm;

    public zzr(Context context, zzq zzqVar, zzy zzyVar) {
        super(context);
        this.zzdrm = zzyVar;
        setOnClickListener(this);
        ImageButton imageButton = new ImageButton(context);
        this.zzdrl = imageButton;
        imageButton.setImageResource(R.drawable.btn_dialog);
        this.zzdrl.setBackgroundColor(0);
        this.zzdrl.setOnClickListener(this);
        ImageButton imageButton2 = this.zzdrl;
        zzwo.zzqm();
        int zze = zzayd.zze(context, zzqVar.paddingLeft);
        zzwo.zzqm();
        int zze2 = zzayd.zze(context, 0);
        zzwo.zzqm();
        int zze3 = zzayd.zze(context, zzqVar.paddingRight);
        zzwo.zzqm();
        imageButton2.setPadding(zze, zze2, zze3, zzayd.zze(context, zzqVar.paddingBottom));
        this.zzdrl.setContentDescription("Interstitial close button");
        ImageButton imageButton3 = this.zzdrl;
        zzwo.zzqm();
        int zze4 = zzayd.zze(context, zzqVar.size + zzqVar.paddingLeft + zzqVar.paddingRight);
        zzwo.zzqm();
        addView(imageButton3, new FrameLayout.LayoutParams(zze4, zzayd.zze(context, zzqVar.size + zzqVar.paddingBottom), 17));
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        zzy zzyVar = this.zzdrm;
        if (zzyVar != null) {
            zzyVar.zzvt();
        }
    }

    public final void zzal(boolean z) {
        if (z) {
            this.zzdrl.setVisibility(8);
        } else {
            this.zzdrl.setVisibility(0);
        }
    }
}
