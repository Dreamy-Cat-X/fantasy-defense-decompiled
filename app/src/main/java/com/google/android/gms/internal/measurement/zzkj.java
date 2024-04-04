package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@17.5.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzkj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static String zza(zzgm zzgmVar) {
        zzkm zzkmVar = new zzkm(zzgmVar);
        StringBuilder sb = new StringBuilder(zzkmVar.zza());
        for (int i = 0; i < zzkmVar.zza(); i++) {
            byte zza = zzkmVar.zza(i);
            if (zza == 34) {
                sb.append("\\\"");
            } else if (zza == 39) {
                sb.append("\\'");
            } else if (zza != 92) {
                switch (zza) {
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
                        if (zza >= 32 && zza <= 126) {
                            sb.append((char) zza);
                            break;
                        } else {
                            sb.append('\\');
                            sb.append((char) (((zza >>> 6) & 3) + 48));
                            sb.append((char) (((zza >>> 3) & 7) + 48));
                            sb.append((char) ((zza & 7) + 48));
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
