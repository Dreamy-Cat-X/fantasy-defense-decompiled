package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdwy<E> extends zzdwq<E> {
    private int zzahu;

    @NullableDecl
    private Object[] zzhwk;

    public zzdwy() {
        super(4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwy(int i) {
        super(i);
        this.zzhwk = new Object[zzdwv.zzer(i)];
    }

    public final zzdwv<E> zzazv() {
        zzdwv<E> zza;
        boolean zzw;
        int i = this.size;
        if (i == 0) {
            return zzdxm.zzhwx;
        }
        if (i == 1) {
            return zzdwv.zzad(this.zzhvy[0]);
        }
        if (this.zzhwk != null && zzdwv.zzer(this.size) == this.zzhwk.length) {
            zzw = zzdwv.zzw(this.size, this.zzhvy.length);
            Object[] copyOf = zzw ? Arrays.copyOf(this.zzhvy, this.size) : this.zzhvy;
            zza = new zzdxm<>(copyOf, this.zzahu, this.zzhwk, r5.length - 1, this.size);
        } else {
            zza = zzdwv.zza(this.size, this.zzhvy);
            this.size = zza.size();
        }
        this.zzhvz = true;
        this.zzhwk = null;
        return zza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdwq, com.google.android.gms.internal.ads.zzdwp
    public final /* synthetic */ zzdwp zzg(Iterable iterable) {
        zzdwa.checkNotNull(iterable);
        if (this.zzhwk != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                zzaa(it.next());
            }
        } else {
            super.zzg(iterable);
        }
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdwq
    /* renamed from: zzab */
    public final /* synthetic */ zzdwq zzaa(Object obj) {
        return (zzdwy) zzaa(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdwp
    public final /* synthetic */ zzdwp zza(Iterator it) {
        zzdwa.checkNotNull(it);
        while (it.hasNext()) {
            zzaa(it.next());
        }
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwq, com.google.android.gms.internal.ads.zzdwp
    public final /* synthetic */ zzdwp zzaa(Object obj) {
        zzdwa.checkNotNull(obj);
        if (this.zzhwk != null) {
            int zzer = zzdwv.zzer(this.size);
            Object[] objArr = this.zzhwk;
            if (zzer <= objArr.length) {
                int length = objArr.length - 1;
                int hashCode = obj.hashCode();
                int zzep = zzdwo.zzep(hashCode);
                while (true) {
                    int i = zzep & length;
                    Object[] objArr2 = this.zzhwk;
                    Object obj2 = objArr2[i];
                    if (obj2 == null) {
                        objArr2[i] = obj;
                        this.zzahu += hashCode;
                        super.zzaa(obj);
                        break;
                    }
                    if (obj2.equals(obj)) {
                        break;
                    }
                    zzep = i + 1;
                }
                return this;
            }
        }
        this.zzhwk = null;
        super.zzaa(obj);
        return this;
    }
}
