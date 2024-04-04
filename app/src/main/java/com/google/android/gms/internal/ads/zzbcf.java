package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.kt.olleh.inapp.net.InAppError;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzbcf implements zzahv<zzbaq> {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0085 A[Catch: NumberFormatException -> 0x00ca, NullPointerException | NumberFormatException -> 0x00cc, TryCatch #2 {NullPointerException | NumberFormatException -> 0x00cc, blocks: (B:24:0x000c, B:3:0x0033, B:8:0x0069, B:11:0x007f, B:13:0x0085, B:14:0x00c3, B:21:0x007a), top: B:23:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007a A[Catch: NumberFormatException -> 0x00ca, NullPointerException | NumberFormatException -> 0x00cc, TryCatch #2 {NullPointerException | NumberFormatException -> 0x00cc, blocks: (B:24:0x000c, B:3:0x0033, B:8:0x0069, B:11:0x007f, B:13:0x0085, B:14:0x00c3, B:21:0x007a), top: B:23:0x000c }] */
    @Override // com.google.android.gms.internal.ads.zzahv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final /* synthetic */ void zza(zzbaq zzbaqVar, Map map) {
        int i;
        zzbaq zzbaqVar2 = zzbaqVar;
        zzbeb zzaay = zzbaqVar2.zzaay();
        if (zzaay == null) {
            try {
                zzbeb zzbebVar = new zzbeb(zzbaqVar2, Float.parseFloat((String) map.get("duration")), InAppError.FAILED.equals(map.get("customControlsAllowed")), InAppError.FAILED.equals(map.get("clickToExpandAllowed")));
                zzbaqVar2.zza(zzbebVar);
                zzaay = zzbebVar;
            } catch (NullPointerException | NumberFormatException e) {
                com.google.android.gms.ads.internal.util.zzd.zzc("Unable to parse videoMeta message.", e);
                com.google.android.gms.ads.internal.zzp.zzku().zza(e, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get("duration"));
        boolean equals = InAppError.FAILED.equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt >= 0 && 3 >= parseInt) {
            i = parseInt;
            String str = (String) map.get("aspectRatio");
            float parseFloat3 = !TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
            if (com.google.android.gms.ads.internal.util.zzd.isLoggable(3)) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 140);
                sb.append("Video Meta GMSG: currentTime : ");
                sb.append(parseFloat2);
                sb.append(" , duration : ");
                sb.append(parseFloat);
                sb.append(" , isMuted : ");
                sb.append(equals);
                sb.append(" , playbackState : ");
                sb.append(i);
                sb.append(" , aspectRatio : ");
                sb.append(str);
                com.google.android.gms.ads.internal.util.zzd.zzdy(sb.toString());
            }
            zzaay.zza(parseFloat2, parseFloat, i, equals, parseFloat3);
        }
        i = 0;
        String str2 = (String) map.get("aspectRatio");
        if (!TextUtils.isEmpty(str2)) {
        }
        if (com.google.android.gms.ads.internal.util.zzd.isLoggable(3)) {
        }
        zzaay.zza(parseFloat2, parseFloat, i, equals, parseFloat3);
    }
}
