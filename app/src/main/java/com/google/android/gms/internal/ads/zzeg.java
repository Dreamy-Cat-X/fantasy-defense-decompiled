package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzby;
import com.google.android.gms.internal.ads.zzcf;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeg extends zzdx {
    public static zzeg zzb(String str, Context context, boolean z) {
        return zzb(str, context, false, zzcw.zzng);
    }

    public static zzeg zzb(String str, Context context, boolean z, int i) {
        zza(context, z);
        zza(str, context, z, i);
        return new zzeg(context, str, z, i);
    }

    private zzeg(Context context, String str, boolean z, int i) {
        super(context, str, z, i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.gms.internal.ads.zzdx
    public final List<Callable<Void>> zza(zzez zzezVar, Context context, zzcf.zza.C0009zza c0009zza, zzby.zza zzaVar) {
        if (zzezVar.zzcg() == null || !this.zzwj) {
            return super.zza(zzezVar, context, c0009zza, zzaVar);
        }
        int zzbu = zzezVar.zzbu();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(super.zza(zzezVar, context, c0009zza, zzaVar));
        arrayList.add(new zzft(zzezVar, "OWd9rVZHQHX0ZS0khfLk9EbaV5B3660u9zEaKwzJiuzlEk0jPLbdFO63rEPIwHWE", "XTJhw9owXn6RPlXdkw8MehSfVDAvl+AxD3gfvf4NYBI=", c0009zza, zzbu, 24));
        return arrayList;
    }
}
