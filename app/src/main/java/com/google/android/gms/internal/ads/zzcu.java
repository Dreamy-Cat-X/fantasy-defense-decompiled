package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzcu<K, V> {
    private static final String TAG = zzcu.class.getSimpleName();

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void zzam(String str);

    protected abstract HashMap<K, V> zzbn();

    public String toString() {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(zzbn());
            objectOutputStream.close();
            return Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
        } catch (IOException unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static <K, V> HashMap<K, V> zzan(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            return (HashMap) new ObjectInputStream(new ByteArrayInputStream(Base64.decode(str.getBytes(), 0))).readObject();
        } catch (IOException | ClassNotFoundException unused) {
            Log.d(TAG, "decode object failure");
            return null;
        }
    }
}
