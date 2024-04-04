package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzhc implements zzhx, zzia {
    private int index;
    private int state;
    private final int zzaea;
    private zzhz zzaeb;
    private zznm zzaec;
    private long zzaed;
    private boolean zzaee = true;
    private boolean zzaef;

    public zzhc(int i) {
        this.zzaea = i;
    }

    protected void onStarted() throws zzhd {
    }

    protected void onStopped() throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzhi
    public void zza(int i, Object obj) throws zzhd {
    }

    protected void zza(long j, boolean z) throws zzhd {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(zzhs[] zzhsVarArr, long j) throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final zzia zzdz() {
        return this;
    }

    protected void zze(boolean z) throws zzhd {
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public zzpj zzea() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzia
    public int zzeg() throws zzhd {
        return 0;
    }

    protected void zzeh() {
    }

    @Override // com.google.android.gms.internal.ads.zzhx, com.google.android.gms.internal.ads.zzia
    public final int getTrackType() {
        return this.zzaea;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void setIndex(int i) {
        this.index = i;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final int getState() {
        return this.state;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zza(zzhz zzhzVar, zzhs[] zzhsVarArr, zznm zznmVar, long j, boolean z, long j2) throws zzhd {
        zzpf.checkState(this.state == 0);
        this.zzaeb = zzhzVar;
        this.state = 1;
        zze(z);
        zza(zzhsVarArr, zznmVar, j2);
        zza(j, z);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void start() throws zzhd {
        zzpf.checkState(this.state == 1);
        this.state = 2;
        onStarted();
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zza(zzhs[] zzhsVarArr, zznm zznmVar, long j) throws zzhd {
        zzpf.checkState(!this.zzaef);
        this.zzaec = zznmVar;
        this.zzaee = false;
        this.zzaed = j;
        zza(zzhsVarArr, j);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final zznm zzeb() {
        return this.zzaec;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final boolean zzec() {
        return this.zzaee;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzed() {
        this.zzaef = true;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final boolean zzee() {
        return this.zzaef;
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzef() throws IOException {
        this.zzaec.zzhs();
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void zzdm(long j) throws zzhd {
        this.zzaef = false;
        this.zzaee = false;
        zza(j, false);
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void stop() throws zzhd {
        zzpf.checkState(this.state == 2);
        this.state = 1;
        onStopped();
    }

    @Override // com.google.android.gms.internal.ads.zzhx
    public final void disable() {
        zzpf.checkState(this.state == 1);
        this.state = 0;
        this.zzaec = null;
        this.zzaef = false;
        zzeh();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzhz zzei() {
        return this.zzaeb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int getIndex() {
        return this.index;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int zza(zzhu zzhuVar, zzjo zzjoVar, boolean z) {
        int zzb = this.zzaec.zzb(zzhuVar, zzjoVar, z);
        if (zzb == -4) {
            if (zzjoVar.zzgi()) {
                this.zzaee = true;
                return this.zzaef ? -4 : -3;
            }
            zzjoVar.zzaoi += this.zzaed;
        } else if (zzb == -5) {
            zzhs zzhsVar = zzhuVar.zzahw;
            if (zzhsVar.zzahq != Long.MAX_VALUE) {
                zzhuVar.zzahw = zzhsVar.zzds(zzhsVar.zzahq + this.zzaed);
            }
        }
        return zzb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzdn(long j) {
        this.zzaec.zzeh(j - this.zzaed);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean zzej() {
        return this.zzaee ? this.zzaef : this.zzaec.isReady();
    }
}
