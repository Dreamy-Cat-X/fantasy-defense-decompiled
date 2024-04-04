package com.google.android.gms.internal.ads;

import androidx.core.internal.view.SupportMenu;
import com.google.android.gms.internal.ads.zzekq;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzekd {
    private static volatile boolean zzilq = false;
    private static boolean zzilr = true;
    private static volatile zzekd zzils;
    private static volatile zzekd zzilt;
    private static final zzekd zzilu = new zzekd(true);
    private final Map<zza, zzekq.zzf<?, ?>> zzilv;

    public static zzekd zzbhz() {
        zzekd zzekdVar = zzils;
        if (zzekdVar == null) {
            synchronized (zzekd.class) {
                zzekdVar = zzils;
                if (zzekdVar == null) {
                    zzekdVar = zzilu;
                    zzils = zzekdVar;
                }
            }
        }
        return zzekdVar;
    }

    /* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
    /* loaded from: D:\decomp\classes.dex */
    private static final class zza {
        private final int number;
        private final Object object;

        zza(Object obj, int i) {
            this.object = obj;
            this.number = i;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.object) * SupportMenu.USER_MASK) + this.number;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            zza zzaVar = (zza) obj;
            return this.object == zzaVar.object && this.number == zzaVar.number;
        }
    }

    public static zzekd zzbia() {
        zzekd zzekdVar = zzilt;
        if (zzekdVar != null) {
            return zzekdVar;
        }
        synchronized (zzekd.class) {
            zzekd zzekdVar2 = zzilt;
            if (zzekdVar2 != null) {
                return zzekdVar2;
            }
            zzekd zzc = zzeko.zzc(zzekd.class);
            zzilt = zzc;
            return zzc;
        }
    }

    public final <ContainingType extends zzemd> zzekq.zzf<ContainingType, ?> zza(ContainingType containingtype, int i) {
        return (zzekq.zzf) this.zzilv.get(new zza(containingtype, i));
    }

    zzekd() {
        this.zzilv = new HashMap();
    }

    private zzekd(boolean z) {
        this.zzilv = Collections.emptyMap();
    }
}
