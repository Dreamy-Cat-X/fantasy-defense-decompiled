package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzdvj {
    public static zzdvj zzb(char c) {
        return new zzdvl(c);
    }

    public abstract boolean zzc(char c);

    public int zza(CharSequence charSequence, int i) {
        int length = charSequence.length();
        zzdwa.zzb(i, length, "index");
        while (i < length) {
            if (zzc(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String zzd(char c) {
        char[] cArr = {'\\', 'u', 0, 0, 0, 0};
        for (int i = 0; i < 4; i++) {
            cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
            c = (char) (c >> 4);
        }
        return String.copyValueOf(cArr);
    }
}
