package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzemu extends zzejh {
    private final zzemw zzisb;
    private zzejl zzisc = zzbkl();
    private final /* synthetic */ zzemv zzisd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzemu(zzemv zzemvVar) {
        this.zzisd = zzemvVar;
        this.zzisb = new zzemw(this.zzisd, null);
    }

    private final zzejl zzbkl() {
        if (this.zzisb.hasNext()) {
            return (zzejl) ((zzejn) this.zzisb.next()).iterator();
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzisc != null;
    }

    @Override // com.google.android.gms.internal.ads.zzejl
    public final byte nextByte() {
        zzejl zzejlVar = this.zzisc;
        if (zzejlVar == null) {
            throw new NoSuchElementException();
        }
        byte nextByte = zzejlVar.nextByte();
        if (!this.zzisc.hasNext()) {
            this.zzisc = zzbkl();
        }
        return nextByte;
    }
}
