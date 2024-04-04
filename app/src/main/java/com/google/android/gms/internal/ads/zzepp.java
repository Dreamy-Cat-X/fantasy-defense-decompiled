package com.google.android.gms.internal.ads;

import androidx.appcompat.widget.ActivityChooserView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzepp {
    private static int zzig(int i) {
        return i < 3 ? i + 1 : i < 1073741824 ? (int) ((i / 0.75f) + 1.0f) : ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static <T> List<T> zzid(int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        return new ArrayList(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> HashSet<T> zzie(int i) {
        return new HashSet<>(zzig(i));
    }

    public static <K, V> LinkedHashMap<K, V> zzif(int i) {
        return new LinkedHashMap<>(zzig(i));
    }
}
