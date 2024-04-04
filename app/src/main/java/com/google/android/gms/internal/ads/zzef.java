package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzef {
    private static final String[] zzxu = {"/aclk", "/pcs/click", "/dbm/clk"};
    private String zzxq = "googleads.g.doubleclick.net";
    private String zzxr = "/pagead/ads";
    private String zzxs = "ad.doubleclick.net";
    private String[] zzxt = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
    private zzdv zzxv;

    public zzef(zzdv zzdvVar) {
        this.zzxv = zzdvVar;
    }

    private final boolean zza(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            return uri.getHost().equals(this.zzxs);
        } catch (NullPointerException unused) {
            return false;
        }
    }

    public final boolean zzb(Uri uri) {
        if (uri == null) {
            throw null;
        }
        try {
            String host = uri.getHost();
            for (String str : this.zzxt) {
                if (host.endsWith(str)) {
                    return true;
                }
            }
        } catch (NullPointerException unused) {
        }
        return false;
    }

    public final zzdv zzca() {
        return this.zzxv;
    }

    public final Uri zza(Uri uri, Context context) throws zzei {
        return zza(uri, this.zzxv.zzb(context));
    }

    public final void zza(MotionEvent motionEvent) {
        this.zzxv.zza(motionEvent);
    }

    public final Uri zza(Uri uri, Context context, View view, Activity activity) throws zzei {
        try {
            return zza(uri, this.zzxv.zza(context, uri.getQueryParameter("ai"), view, activity));
        } catch (UnsupportedOperationException unused) {
            throw new zzei("Provided Uri is not in a valid state");
        }
    }

    public final boolean zzc(Uri uri) {
        if (zzb(uri)) {
            for (String str : zzxu) {
                if (uri.getPath().endsWith(str)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final Uri zza(Uri uri, String str) throws zzei {
        try {
            boolean zza = zza(uri);
            if (zza) {
                if (uri.toString().contains("dc_ms=")) {
                    throw new zzei("Parameter already exists: dc_ms");
                }
            } else if (uri.getQueryParameter("ms") != null) {
                throw new zzei("Query parameter already exists: ms");
            }
            if (zza) {
                String uri2 = uri.toString();
                int indexOf = uri2.indexOf(";adurl");
                if (indexOf != -1) {
                    int i = indexOf + 1;
                    return Uri.parse(uri2.substring(0, i) + "dc_ms=" + str + ";" + uri2.substring(i));
                }
                String encodedPath = uri.getEncodedPath();
                int indexOf2 = uri2.indexOf(encodedPath);
                return Uri.parse(uri2.substring(0, encodedPath.length() + indexOf2) + ";dc_ms=" + str + ";" + uri2.substring(indexOf2 + encodedPath.length()));
            }
            String uri3 = uri.toString();
            int indexOf3 = uri3.indexOf("&adurl");
            if (indexOf3 == -1) {
                indexOf3 = uri3.indexOf("?adurl");
            }
            if (indexOf3 != -1) {
                int i2 = indexOf3 + 1;
                return Uri.parse(uri3.substring(0, i2) + "ms=" + str + "&" + uri3.substring(i2));
            }
            return uri.buildUpon().appendQueryParameter("ms", str).build();
        } catch (UnsupportedOperationException unused) {
            throw new zzei("Provided Uri is not in a valid state");
        }
    }
}
