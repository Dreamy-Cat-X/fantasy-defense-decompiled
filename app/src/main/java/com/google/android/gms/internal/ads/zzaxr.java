package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaxr {
    private final Clock zzbpw;
    private final String zzdsu;
    private final zzayc zzeaa;
    private final String zzeac;
    private final Object lock = new Object();
    private long zzduh = -1;
    private long zzead = -1;
    private boolean zzdud = false;
    private long zzeae = -1;
    private long zzeaf = 0;
    private long zzeag = -1;
    private long zzeah = -1;
    private final LinkedList<zzaxq> zzeab = new LinkedList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaxr(Clock clock, zzayc zzaycVar, String str, String str2) {
        this.zzbpw = clock;
        this.zzeaa = zzaycVar;
        this.zzeac = str;
        this.zzdsu = str2;
    }

    public final void zze(zzvi zzviVar) {
        synchronized (this.lock) {
            long elapsedRealtime = this.zzbpw.elapsedRealtime();
            this.zzeag = elapsedRealtime;
            this.zzeaa.zza(zzviVar, elapsedRealtime);
        }
    }

    public final void zzey(long j) {
        synchronized (this.lock) {
            this.zzeah = j;
            if (j != -1) {
                this.zzeaa.zzb(this);
            }
        }
    }

    public final void zzxg() {
        synchronized (this.lock) {
            if (this.zzeah != -1 && this.zzead == -1) {
                this.zzead = this.zzbpw.elapsedRealtime();
                this.zzeaa.zzb(this);
            }
            this.zzeaa.zzxg();
        }
    }

    public final void zzxh() {
        synchronized (this.lock) {
            if (this.zzeah != -1) {
                zzaxq zzaxqVar = new zzaxq(this);
                zzaxqVar.zzxf();
                this.zzeab.add(zzaxqVar);
                this.zzeaf++;
                this.zzeaa.zzxh();
                this.zzeaa.zzb(this);
            }
        }
    }

    public final void zzxi() {
        synchronized (this.lock) {
            if (this.zzeah != -1 && !this.zzeab.isEmpty()) {
                zzaxq last = this.zzeab.getLast();
                if (last.zzxd() == -1) {
                    last.zzxe();
                    this.zzeaa.zzb(this);
                }
            }
        }
    }

    public final void zzan(boolean z) {
        synchronized (this.lock) {
            if (this.zzeah != -1) {
                this.zzeae = this.zzbpw.elapsedRealtime();
            }
        }
    }

    public final Bundle toBundle() {
        Bundle bundle;
        synchronized (this.lock) {
            bundle = new Bundle();
            bundle.putString("seq_num", this.zzeac);
            bundle.putString("slotid", this.zzdsu);
            bundle.putBoolean("ismediation", false);
            bundle.putLong("treq", this.zzeag);
            bundle.putLong("tresponse", this.zzeah);
            bundle.putLong("timp", this.zzead);
            bundle.putLong("tload", this.zzeae);
            bundle.putLong("pcc", this.zzeaf);
            bundle.putLong("tfetch", this.zzduh);
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            Iterator<zzaxq> it = this.zzeab.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().toBundle());
            }
            bundle.putParcelableArrayList("tclick", arrayList);
        }
        return bundle;
    }

    public final String zzxj() {
        return this.zzeac;
    }
}
