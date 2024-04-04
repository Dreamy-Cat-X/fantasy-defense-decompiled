package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzenm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zzan(zzejg zzejgVar) {
        zzenp zzenpVar = new zzenp(zzejgVar);
        StringBuilder sb = new StringBuilder(zzenpVar.size());
        for (int i = 0; i < zzenpVar.size(); i++) {
            byte zzfz = zzenpVar.zzfz(i);
            if (zzfz == 34) {
                sb.append("\\\"");
            } else if (zzfz == 39) {
                sb.append("\\'");
            } else if (zzfz != 92) {
                switch (zzfz) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (zzfz >= 32 && zzfz <= 126) {
                            sb.append((char) zzfz);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zzfz >>> 6) & 3) + 48));
                            sb.append((char) (((zzfz >>> 3) & 7) + 48));
                            sb.append((char) ((zzfz & 7) + 48));
                            break;
                        }
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
