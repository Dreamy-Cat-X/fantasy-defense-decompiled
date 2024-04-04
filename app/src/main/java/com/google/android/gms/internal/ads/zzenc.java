package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzenc<FieldDescriptorType> extends zzend<FieldDescriptorType, Object> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzenc(int i) {
        super(i, null);
    }

    @Override // com.google.android.gms.internal.ads.zzend
    public final void zzbgi() {
        if (!isImmutable()) {
            for (int i = 0; i < zzbkt(); i++) {
                Map.Entry<FieldDescriptorType, Object> zzhu = zzhu(i);
                if (((zzekl) zzhu.getKey()).zzbii()) {
                    zzhu.setValue(Collections.unmodifiableList((List) zzhu.getValue()));
                }
            }
            for (Map.Entry<FieldDescriptorType, Object> entry : zzbku()) {
                if (((zzekl) entry.getKey()).zzbii()) {
                    entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                }
            }
        }
        super.zzbgi();
    }
}
