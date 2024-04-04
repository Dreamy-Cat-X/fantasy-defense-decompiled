package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import android.webkit.WebView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzaqo {
    private zzdsi zzdpf;
    private static final Object lock = new Object();
    private static boolean zzze = false;
    private static boolean zzdpe = false;

    public final boolean zzm(Context context) {
        synchronized (lock) {
            if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue()) {
                return false;
            }
            if (zzze) {
                return true;
            }
            try {
                zzn(context);
                boolean zzav = this.zzdpf.zzav(ObjectWrapper.wrap(context));
                zzze = zzav;
                return zzav;
            } catch (RemoteException e) {
                e = e;
                zzaym.zze("#007 Could not call remote method.", e);
                return false;
            } catch (NullPointerException e2) {
                e = e2;
                zzaym.zze("#007 Could not call remote method.", e);
                return false;
            }
        }
    }

    private final void zzn(Context context) {
        synchronized (lock) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && !zzdpe) {
                try {
                    zzdpe = true;
                    this.zzdpf = (zzdsi) zzayp.zza(context, "com.google.android.gms.ads.omid.DynamiteOmid", zzaqq.zzbxt);
                } catch (zzayr e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final String getVersion(Context context) {
        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue()) {
            return null;
        }
        try {
            zzn(context);
            String valueOf = String.valueOf(this.zzdpf.getVersion());
            return valueOf.length() != 0 ? "a.".concat(valueOf) : new String("a.");
        } catch (RemoteException | NullPointerException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            return null;
        }
    }

    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4) {
        return zza(str, webView, str2, str3, str4, "Google");
    }

    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, String str5) {
        synchronized (lock) {
            try {
            } catch (Throwable th) {
                th = th;
            }
            try {
                if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && zzze) {
                    try {
                        return this.zzdpf.zza(str, ObjectWrapper.wrap(webView), str2, str3, str4, str5);
                    } catch (RemoteException | NullPointerException e) {
                        zzaym.zze("#007 Could not call remote method.", e);
                        return null;
                    }
                }
                return null;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, zzaqr zzaqrVar, zzaqp zzaqpVar, String str5) {
        return zza(str, webView, str2, str3, str4, "Google", zzaqrVar, zzaqpVar, str5);
    }

    private final IObjectWrapper zza(String str, WebView webView, String str2, String str3, String str4, String str5, zzaqr zzaqrVar, zzaqp zzaqpVar, String str6) {
        synchronized (lock) {
            try {
                try {
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && zzze) {
                        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcus)).booleanValue()) {
                            return zza(str, webView, str2, str3, str4, str5);
                        }
                        try {
                            return this.zzdpf.zzb(str, ObjectWrapper.wrap(webView), str2, str3, str4, str5, zzaqrVar.toString(), zzaqpVar.toString(), str6);
                        } catch (RemoteException | NullPointerException e) {
                            zzaym.zze("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final IObjectWrapper zzb(String str, WebView webView, String str2, String str3, String str4, String str5, zzaqr zzaqrVar, zzaqp zzaqpVar, String str6) {
        synchronized (lock) {
            try {
                try {
                    if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && zzze) {
                        if (!((Boolean) zzwo.zzqq().zzd(zzabh.zzcut)).booleanValue()) {
                            return zza(str, webView, str2, str3, str4, str5);
                        }
                        try {
                            return this.zzdpf.zza(str, ObjectWrapper.wrap(webView), str2, str3, str4, str5, zzaqrVar.toString(), zzaqpVar.toString(), str6);
                        } catch (RemoteException | NullPointerException e) {
                            zzaym.zze("#007 Could not call remote method.", e);
                            return null;
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        }
    }

    public final void zzab(IObjectWrapper iObjectWrapper) {
        synchronized (lock) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && zzze) {
                try {
                    this.zzdpf.zzab(iObjectWrapper);
                } catch (RemoteException | NullPointerException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zzac(IObjectWrapper iObjectWrapper) {
        synchronized (lock) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && zzze) {
                try {
                    this.zzdpf.zzac(iObjectWrapper);
                } catch (RemoteException | NullPointerException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zza(IObjectWrapper iObjectWrapper, View view) {
        synchronized (lock) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && zzze) {
                try {
                    this.zzdpf.zzc(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }

    public final void zzb(IObjectWrapper iObjectWrapper, View view) {
        synchronized (lock) {
            if (((Boolean) zzwo.zzqq().zzd(zzabh.zzcup)).booleanValue() && zzze) {
                try {
                    this.zzdpf.zzd(iObjectWrapper, ObjectWrapper.wrap(view));
                } catch (RemoteException | NullPointerException e) {
                    zzaym.zze("#007 Could not call remote method.", e);
                }
            }
        }
    }
}
