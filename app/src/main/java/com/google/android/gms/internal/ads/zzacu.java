package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzacu<T> extends zzacp<T> {
    public static zzacp<Boolean> zzg(String str, boolean z) {
        return new zzacu(str, true, zzacr.zzdbh);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Incorrect types in method signature: (Ljava/lang/String;TT;Ljava/lang/Integer;)V */
    public zzacu(String str, Object obj, int i) {
        super(str, obj, i);
    }

    @Override // com.google.android.gms.internal.ads.zzacp
    public final T get() {
        if (!zzads.zzdee.get()) {
            throw new IllegalStateException("Striped code is accessed: 54c42518-856a-44fb-aae0-cd6676d514e5");
        }
        return (T) super.get();
    }
}
