package com.google.android.gms.ads.internal;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.internal.ads.zzef;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzl implements View.OnTouchListener {
    private final /* synthetic */ zzj zzbpl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzj zzjVar) {
        this.zzbpl = zzjVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        zzef zzefVar;
        zzef zzefVar2;
        zzefVar = this.zzbpl.zzbpj;
        if (zzefVar == null) {
            return false;
        }
        zzefVar2 = this.zzbpl.zzbpj;
        zzefVar2.zza(motionEvent);
        return false;
    }
}
