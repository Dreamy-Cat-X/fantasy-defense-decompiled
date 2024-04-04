package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.Arrays;
import java.util.Collection;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
class zzdwq<E> extends zzdwp<E> {
    int size;
    Object[] zzhvy;
    boolean zzhvz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdwq(int i) {
        zzdwm.zzh(i, "initialCapacity");
        this.zzhvy = new Object[i];
        this.size = 0;
    }

    private final void zzeq(int i) {
        Object[] objArr = this.zzhvy;
        if (objArr.length < i) {
            int length = objArr.length;
            if (i < 0) {
                throw new AssertionError("cannot store more than MAX_VALUE elements");
            }
            int i2 = length + (length >> 1) + 1;
            if (i2 < i) {
                i2 = Integer.highestOneBit(i - 1) << 1;
            }
            if (i2 < 0) {
                i2 = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
            }
            this.zzhvy = Arrays.copyOf(objArr, i2);
            this.zzhvz = false;
            return;
        }
        if (this.zzhvz) {
            this.zzhvy = (Object[]) objArr.clone();
            this.zzhvz = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdwp
    /* renamed from: zzab, reason: merged with bridge method [inline-methods] */
    public zzdwq<E> zzaa(E e) {
        zzdwa.checkNotNull(e);
        zzeq(this.size + 1);
        Object[] objArr = this.zzhvy;
        int i = this.size;
        this.size = i + 1;
        objArr[i] = e;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzdwp
    public zzdwp<E> zzg(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            zzeq(this.size + collection.size());
            if (collection instanceof zzdwn) {
                this.size = ((zzdwn) collection).zza(this.zzhvy, this.size);
                return this;
            }
        }
        super.zzg(iterable);
        return this;
    }
}
