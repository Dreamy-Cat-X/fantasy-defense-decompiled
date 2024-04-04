package com.google.android.gms.internal.ads;

import com.sncompany.newtower.GameThread;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzrf {
    private int score;
    private final int zzbrv;
    private final int zzbrw;
    private final int zzbrx;
    private final boolean zzbry;
    private final zzru zzbrz;
    private final zzsb zzbsa;
    private final Object lock = new Object();
    private ArrayList<String> zzbsb = new ArrayList<>();
    private ArrayList<String> zzbsc = new ArrayList<>();
    private ArrayList<zzrs> zzbsd = new ArrayList<>();
    private int zzbse = 0;
    private int zzbsf = 0;
    private int zzbsg = 0;
    private String zzbsh = "";
    private String zzbsi = "";
    private String zzbsj = "";

    public zzrf(int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z) {
        this.zzbrv = i;
        this.zzbrw = i2;
        this.zzbrx = i3;
        this.zzbry = z;
        this.zzbrz = new zzru(i4);
        this.zzbsa = new zzsb(i5, i6, i7);
    }

    public final boolean zzlx() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzbsg == 0;
        }
        return z;
    }

    public final String zzly() {
        return this.zzbsh;
    }

    public final String zzlz() {
        return this.zzbsi;
    }

    public final String zzma() {
        return this.zzbsj;
    }

    public final void zzmb() {
        synchronized (this.lock) {
            this.score -= 100;
        }
    }

    public final void zzmc() {
        synchronized (this.lock) {
            this.zzbsg--;
        }
    }

    public final void zzmd() {
        synchronized (this.lock) {
            this.zzbsg++;
        }
    }

    public final void zza(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
        synchronized (this.lock) {
            if (this.zzbsg < 0) {
                com.google.android.gms.ads.internal.util.zzd.zzdy("ActivityContent: negative number of WebViews.");
            }
            zzmf();
        }
    }

    public final void zzb(String str, boolean z, float f, float f2, float f3, float f4) {
        zzc(str, z, f, f2, f3, f4);
    }

    private final void zzc(String str, boolean z, float f, float f2, float f3, float f4) {
        if (str == null || str.length() < this.zzbrx) {
            return;
        }
        synchronized (this.lock) {
            this.zzbsb.add(str);
            this.zzbse += str.length();
            if (z) {
                this.zzbsc.add(str);
                this.zzbsd.add(new zzrs(f, f2, f3, f4, this.zzbsc.size() - 1));
            }
        }
    }

    public final void zzme() {
        synchronized (this.lock) {
            int zzh = zzh(this.zzbse, this.zzbsf);
            if (zzh > this.score) {
                this.score = zzh;
            }
        }
    }

    public final void zzmf() {
        synchronized (this.lock) {
            int zzh = zzh(this.zzbse, this.zzbsf);
            if (zzh > this.score) {
                this.score = zzh;
                if (!com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyg()) {
                    this.zzbsh = this.zzbrz.zza(this.zzbsb);
                    this.zzbsi = this.zzbrz.zza(this.zzbsc);
                }
                if (!com.google.android.gms.ads.internal.zzp.zzku().zzxq().zzyi()) {
                    this.zzbsj = this.zzbsa.zza(this.zzbsc, this.zzbsd);
                }
            }
        }
    }

    private final int zzh(int i, int i2) {
        if (this.zzbry) {
            return this.zzbrw;
        }
        return (i * this.zzbrv) + (i2 * this.zzbrw);
    }

    public final int getScore() {
        return this.score;
    }

    public final void zzbt(int i) {
        this.zzbsf = i;
    }

    private static String zza(ArrayList<String> arrayList, int i) {
        if (arrayList.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        ArrayList<String> arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            String str = arrayList2.get(i2);
            i2++;
            sb.append(str);
            sb.append(' ');
            if (sb.length() > 100) {
                break;
            }
        }
        sb.deleteCharAt(sb.length() - 1);
        String sb2 = sb.toString();
        return sb2.length() < 100 ? sb2 : sb2.substring(0, 100);
    }

    public final String toString() {
        int i = this.zzbsf;
        int i2 = this.score;
        int i3 = this.zzbse;
        String zza = zza(this.zzbsb, 100);
        String zza2 = zza(this.zzbsc, 100);
        String str = this.zzbsh;
        String str2 = this.zzbsi;
        String str3 = this.zzbsj;
        StringBuilder sb = new StringBuilder(String.valueOf(zza).length() + GameThread.SPECIAL_ATTACK_ARROW_UNIT_START_FRAME + String.valueOf(zza2).length() + String.valueOf(str).length() + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append("ActivityContent fetchId: ");
        sb.append(i);
        sb.append(" score:");
        sb.append(i2);
        sb.append(" total_length:");
        sb.append(i3);
        sb.append("\n text: ");
        sb.append(zza);
        sb.append("\n viewableText");
        sb.append(zza2);
        sb.append("\n signture: ");
        sb.append(str);
        sb.append("\n viewableSignture: ");
        sb.append(str2);
        sb.append("\n viewableSignatureForVertical: ");
        sb.append(str3);
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int zzmg() {
        return this.zzbse;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzrf)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        String str = ((zzrf) obj).zzbsh;
        return str != null && str.equals(this.zzbsh);
    }

    public final int hashCode() {
        return this.zzbsh.hashCode();
    }
}
