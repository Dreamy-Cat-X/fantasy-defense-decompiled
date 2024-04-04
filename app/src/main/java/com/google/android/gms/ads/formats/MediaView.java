package com.google.android.gms.ads.formats;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.internal.ads.zzady;
import com.google.android.gms.internal.ads.zzaea;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zzbni;
    private boolean zzbnj;
    private zzady zzbnk;
    private ImageView.ScaleType zzbnl;
    private boolean zzbnm;
    private zzaea zzbnn;

    public MediaView(Context context) {
        super(context);
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public void setMediaContent(MediaContent mediaContent) {
        this.zzbnj = true;
        this.zzbni = mediaContent;
        zzady zzadyVar = this.zzbnk;
        if (zzadyVar != null) {
            zzadyVar.setMediaContent(mediaContent);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzady zzadyVar) {
        this.zzbnk = zzadyVar;
        if (this.zzbnj) {
            zzadyVar.setMediaContent(this.zzbni);
        }
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzbnm = true;
        this.zzbnl = scaleType;
        zzaea zzaeaVar = this.zzbnn;
        if (zzaeaVar != null) {
            zzaeaVar.setImageScaleType(scaleType);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final synchronized void zza(zzaea zzaeaVar) {
        this.zzbnn = zzaeaVar;
        if (this.zzbnm) {
            zzaeaVar.setImageScaleType(this.zzbnl);
        }
    }
}
