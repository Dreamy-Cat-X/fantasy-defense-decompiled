package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzuc;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcif implements zzepq<zztu> {
    private final zzeqd<Context> zzeuo;
    private final zzeqd<zzuc.zza.EnumC0024zza> zzfrl;
    private final zzeqd<String> zzfww;
    private final zzeqd<zzayt> zzfxl;
    private final zzeqd<String> zzgjc;

    private zzcif(zzeqd<Context> zzeqdVar, zzeqd<String> zzeqdVar2, zzeqd<zzayt> zzeqdVar3, zzeqd<zzuc.zza.EnumC0024zza> zzeqdVar4, zzeqd<String> zzeqdVar5) {
        this.zzeuo = zzeqdVar;
        this.zzfww = zzeqdVar2;
        this.zzfxl = zzeqdVar3;
        this.zzfrl = zzeqdVar4;
        this.zzgjc = zzeqdVar5;
    }

    public static zzcif zze(zzeqd<Context> zzeqdVar, zzeqd<String> zzeqdVar2, zzeqd<zzayt> zzeqdVar3, zzeqd<zzuc.zza.EnumC0024zza> zzeqdVar4, zzeqd<String> zzeqdVar5) {
        return new zzcif(zzeqdVar, zzeqdVar2, zzeqdVar3, zzeqdVar4, zzeqdVar5);
    }

    @Override // com.google.android.gms.internal.ads.zzeqd
    public final /* synthetic */ Object get() {
        Context context = this.zzeuo.get();
        final String str = this.zzfww.get();
        zzayt zzaytVar = this.zzfxl.get();
        final zzuc.zza.EnumC0024zza enumC0024zza = this.zzfrl.get();
        final String str2 = this.zzgjc.get();
        zztu zztuVar = new zztu(new zztz(context));
        final zzuc.zzu zzuVar = (zzuc.zzu) ((zzekq) zzuc.zzu.zzpm().zzcn(zzaytVar.zzege).zzco(zzaytVar.zzegf).zzcp(zzaytVar.zzegg ? 0 : 2).zzbiz());
        zztuVar.zza(new zztt(enumC0024zza, str, zzuVar, str2) { // from class: com.google.android.gms.internal.ads.zzcic
            private final String zzdhw;
            private final zzuc.zza.EnumC0024zza zzgiz;
            private final zzuc.zzu zzgja;
            private final String zzgjb;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgiz = enumC0024zza;
                this.zzdhw = str;
                this.zzgja = zzuVar;
                this.zzgjb = str2;
            }

            @Override // com.google.android.gms.internal.ads.zztt
            public final void zza(zzuc.zzi.zza zzaVar) {
                zzuc.zza.EnumC0024zza enumC0024zza2 = this.zzgiz;
                String str3 = this.zzdhw;
                zzuc.zzu zzuVar2 = this.zzgja;
                zzaVar.zza(zzaVar.zzod().zzbim().zzb(enumC0024zza2)).zza(zzaVar.zzoc().zzbim().zzbv(str3).zza(zzuVar2)).zzbx(this.zzgjb);
            }
        });
        return (zztu) zzepw.zza(zztuVar, "Cannot return null from a non-@Nullable @Provides method");
    }
}
