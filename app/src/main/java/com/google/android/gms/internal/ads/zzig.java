package com.google.android.gms.internal.ads;

import com.sncompany.newtower.GameRenderer;
import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzig {
    private static final int[] zzait = {1, 2, 3, 6};
    private static final int[] zzaiu = {48000, 44100, 32000};
    private static final int[] zzaiv = {24000, 22050, 16000};
    private static final int[] zzaiw = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] zzaix = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, GameRenderer.GAME_SHOP_EQUIP_SKILL_START_Y, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] zzaiy = {69, 87, 104, GameRenderer.PHONE_INPUT_WIDTH_X, 139, 174, 208, 243, 278, GameRenderer.VOLUMEBAR_WIDTH, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static zzhs zza(zzpm zzpmVar, String str, String str2, zzjn zzjnVar) {
        int i = zzaiu[(zzpmVar.readUnsignedByte() & 192) >> 6];
        int readUnsignedByte = zzpmVar.readUnsignedByte();
        int i2 = zzaiw[(readUnsignedByte & 56) >> 3];
        if ((readUnsignedByte & 4) != 0) {
            i2++;
        }
        return zzhs.zza(str, "audio/ac3", null, -1, -1, i2, i, null, zzjnVar, 0, str2);
    }

    public static int zzfi() {
        return 1536;
    }

    public static zzhs zzb(zzpm zzpmVar, String str, String str2, zzjn zzjnVar) {
        zzpmVar.zzbj(2);
        int i = zzaiu[(zzpmVar.readUnsignedByte() & 192) >> 6];
        int readUnsignedByte = zzpmVar.readUnsignedByte();
        int i2 = zzaiw[(readUnsignedByte & 14) >> 1];
        if ((readUnsignedByte & 1) != 0) {
            i2++;
        }
        return zzhs.zza(str, "audio/eac3", null, -1, -1, i2, i, null, zzjnVar, 0, str2);
    }

    public static int zzm(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? zzait[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4] : 6) * 256;
    }
}
