package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzamy extends IInterface {
    void destroy() throws RemoteException;

    Bundle getInterstitialAdapterInfo() throws RemoteException;

    zzyu getVideoController() throws RemoteException;

    boolean isInitialized() throws RemoteException;

    void pause() throws RemoteException;

    void resume() throws RemoteException;

    void setImmersiveMode(boolean z) throws RemoteException;

    void showInterstitial() throws RemoteException;

    void showVideo() throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzaix zzaixVar, List<zzajf> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzauj zzaujVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzauj zzaujVar, String str2) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, String str2, zzamz zzamzVar, zzadz zzadzVar, List<String> list) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException;

    void zza(IObjectWrapper iObjectWrapper, zzvp zzvpVar, zzvi zzviVar, String str, String str2, zzamz zzamzVar) throws RemoteException;

    void zza(zzvi zzviVar, String str) throws RemoteException;

    void zza(zzvi zzviVar, String str, String str2) throws RemoteException;

    void zzb(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException;

    void zzc(IObjectWrapper iObjectWrapper, zzvi zzviVar, String str, zzamz zzamzVar) throws RemoteException;

    void zzs(IObjectWrapper iObjectWrapper) throws RemoteException;

    void zzt(IObjectWrapper iObjectWrapper) throws RemoteException;

    IObjectWrapper zzut() throws RemoteException;

    zzang zzuu() throws RemoteException;

    zzanh zzuv() throws RemoteException;

    Bundle zzuw() throws RemoteException;

    Bundle zzux() throws RemoteException;

    boolean zzuy() throws RemoteException;

    zzaff zzuz() throws RemoteException;

    zzanm zzva() throws RemoteException;

    zzapn zzvb() throws RemoteException;

    zzapn zzvc() throws RemoteException;
}
