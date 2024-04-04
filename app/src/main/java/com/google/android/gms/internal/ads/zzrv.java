package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import java.lang.Character;
import java.util.ArrayList;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
@ParametersAreNonnullByDefault
/* loaded from: D:\decomp\classes.dex */
public final class zzrv {
    public static int zzbr(String str) {
        byte[] bytes;
        try {
            bytes = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bytes = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bytes, 0, bytes.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x007f, code lost:
    
        if (((r6 >= 65382 && r6 <= 65437) || (r6 >= 65441 && r6 <= 65500)) != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00c4, code lost:
    
        if (r4 == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00d7, code lost:
    
        r4 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x00d6, code lost:
    
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00d4, code lost:
    
        if (r4 == false) goto L76;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String[] zze(String str, boolean z) {
        boolean z2;
        if (str == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        char[] charArray = str.toCharArray();
        int length = str.length();
        int i = 0;
        boolean z3 = false;
        int i2 = 0;
        while (i < length) {
            int codePointAt = Character.codePointAt(charArray, i);
            int charCount = Character.charCount(codePointAt);
            if (Character.isLetter(codePointAt)) {
                Character.UnicodeBlock of = Character.UnicodeBlock.of(codePointAt);
                if (!(of == Character.UnicodeBlock.BOPOMOFO || of == Character.UnicodeBlock.BOPOMOFO_EXTENDED || of == Character.UnicodeBlock.CJK_COMPATIBILITY || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_COMPATIBILITY_IDEOGRAPHS_SUPPLEMENT || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_A || of == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS_EXTENSION_B || of == Character.UnicodeBlock.ENCLOSED_CJK_LETTERS_AND_MONTHS || of == Character.UnicodeBlock.HANGUL_JAMO || of == Character.UnicodeBlock.HANGUL_SYLLABLES || of == Character.UnicodeBlock.HIRAGANA || of == Character.UnicodeBlock.KATAKANA || of == Character.UnicodeBlock.KATAKANA_PHONETIC_EXTENSIONS)) {
                }
                z2 = true;
                if (!z2) {
                    if (z3) {
                        arrayList.add(new String(charArray, i2, i - i2));
                    }
                    arrayList.add(new String(charArray, i, charCount));
                } else {
                    if (!Character.isLetterOrDigit(codePointAt) && Character.getType(codePointAt) != 6 && Character.getType(codePointAt) != 8) {
                        if (!z || Character.charCount(codePointAt) != 1 || Character.toChars(codePointAt)[0] != '\'') {
                            if (z3) {
                                arrayList.add(new String(charArray, i2, i - i2));
                            }
                        }
                    }
                    i += charCount;
                }
                z3 = false;
                i += charCount;
            }
            z2 = false;
            if (!z2) {
            }
            z3 = false;
            i += charCount;
        }
        if (z3) {
            arrayList.add(new String(charArray, i2, i - i2));
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }
}
