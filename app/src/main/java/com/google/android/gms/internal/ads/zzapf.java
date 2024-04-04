package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzapf {
    public static zzaoz zzdo(String str) throws RemoteException {
        return new zzapi((RtbAdapter) Class.forName(str, false, zzapf.class.getClassLoader()).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
    }
}
