package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzeat {
    private static final CopyOnWriteArrayList<zzeaq> zzhzy = new CopyOnWriteArrayList<>();

    public static zzeaq zzhr(String str) throws GeneralSecurityException {
        Iterator<zzeaq> it = zzhzy.iterator();
        while (it.hasNext()) {
            zzeaq next = it.next();
            if (next.zzhp(str)) {
                return next;
            }
        }
        String valueOf = String.valueOf(str);
        throw new GeneralSecurityException(valueOf.length() != 0 ? "No KMS client does support: ".concat(valueOf) : new String("No KMS client does support: "));
    }
}
