package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzepa implements zzbs, Closeable, Iterator<zzbp> {
    protected zzepc zzizn;
    protected zzbo zzizq;
    private static final zzbp zzizp = new zzepd("eof ");
    private static zzepi zzcz = zzepi.zzn(zzepa.class);
    private zzbp zzizr = null;
    long zzizs = 0;
    long zzbfx = 0;
    long zzasr = 0;
    private List<zzbp> zzizt = new ArrayList();

    public final List<zzbp> zzbmn() {
        if (this.zzizn != null && this.zzizr != zzizp) {
            return new zzepg(this.zzizt, this);
        }
        return this.zzizt;
    }

    public void zza(zzepc zzepcVar, long j, zzbo zzboVar) throws IOException {
        this.zzizn = zzepcVar;
        long position = zzepcVar.position();
        this.zzbfx = position;
        this.zzizs = position;
        zzepcVar.zzfc(zzepcVar.position() + j);
        this.zzasr = zzepcVar.position();
        this.zzizq = zzboVar;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zzbp zzbpVar = this.zzizr;
        if (zzbpVar == zzizp) {
            return false;
        }
        if (zzbpVar != null) {
            return true;
        }
        try {
            this.zzizr = (zzbp) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.zzizr = zzizp;
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: zzbmo, reason: merged with bridge method [inline-methods] */
    public final zzbp next() {
        zzbp zza;
        zzbp zzbpVar = this.zzizr;
        if (zzbpVar != null && zzbpVar != zzizp) {
            this.zzizr = null;
            return zzbpVar;
        }
        zzepc zzepcVar = this.zzizn;
        if (zzepcVar == null || this.zzizs >= this.zzasr) {
            this.zzizr = zzizp;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzepcVar) {
                this.zzizn.zzfc(this.zzizs);
                zza = this.zzizq.zza(this.zzizn, this);
                this.zzizs = this.zzizn.position();
            }
            return zza;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i = 0; i < this.zzizt.size(); i++) {
            if (i > 0) {
                sb.append(";");
            }
            sb.append(this.zzizt.get(i).toString());
        }
        sb.append("]");
        return sb.toString();
    }

    public void close() throws IOException {
        this.zzizn.close();
    }
}
