package com.google.android.gms.internal.ads;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzdxt implements FilenameFilter {
    private final Pattern zzhju;

    public zzdxt(Pattern pattern) {
        this.zzhju = (Pattern) zzdwa.checkNotNull(pattern);
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(@NullableDecl File file, String str) {
        return this.zzhju.matcher(str).matches();
    }
}
