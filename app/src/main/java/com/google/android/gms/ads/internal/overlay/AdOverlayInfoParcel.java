package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.util.zzbf;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzahc;
import com.google.android.gms.internal.ads.zzahe;
import com.google.android.gms.internal.ads.zzayt;
import com.google.android.gms.internal.ads.zzbdh;
import com.google.android.gms.internal.ads.zzcju;
import com.google.android.gms.internal.ads.zzcpy;
import com.google.android.gms.internal.ads.zzdro;
import com.google.android.gms.internal.ads.zzuz;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AdOverlayInfoParcel> CREATOR = new zzn();
    public final int orientation;
    public final String url;
    public final zzayt zzbpd;
    public final String zzbvf;
    public final zzuz zzcgr;
    public final zzahc zzdfv;
    public final zzahe zzdfx;
    public final zzcju zzdgu;
    public final zzdro zzdgv;
    public final zzbdh zzdhu;
    public final zzb zzdqz;
    public final zzp zzdra;
    public final String zzdrb;
    public final boolean zzdrc;
    public final String zzdrd;
    public final zzu zzdre;
    public final int zzdrf;
    public final String zzdrg;
    public final com.google.android.gms.ads.internal.zzi zzdrh;
    public final zzcpy zzdri;
    public final zzbf zzdrj;
    public final String zzdrk;

    public static void zza(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    public static AdOverlayInfoParcel zzd(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(zzbdh zzbdhVar, zzayt zzaytVar, zzbf zzbfVar, zzcpy zzcpyVar, zzcju zzcjuVar, zzdro zzdroVar, String str, String str2, int i) {
        this.zzdqz = null;
        this.zzcgr = null;
        this.zzdra = null;
        this.zzdhu = zzbdhVar;
        this.zzdfv = null;
        this.zzdfx = null;
        this.zzdrb = null;
        this.zzdrc = false;
        this.zzdrd = null;
        this.zzdre = null;
        this.orientation = i;
        this.zzdrf = 5;
        this.url = null;
        this.zzbpd = zzaytVar;
        this.zzdrg = null;
        this.zzdrh = null;
        this.zzbvf = str;
        this.zzdrk = str2;
        this.zzdri = zzcpyVar;
        this.zzdgu = zzcjuVar;
        this.zzdgv = zzdroVar;
        this.zzdrj = zzbfVar;
    }

    public AdOverlayInfoParcel(zzuz zzuzVar, zzp zzpVar, zzu zzuVar, zzbdh zzbdhVar, int i, zzayt zzaytVar, String str, com.google.android.gms.ads.internal.zzi zziVar, String str2, String str3) {
        this.zzdqz = null;
        this.zzcgr = null;
        this.zzdra = zzpVar;
        this.zzdhu = zzbdhVar;
        this.zzdfv = null;
        this.zzdfx = null;
        this.zzdrb = str2;
        this.zzdrc = false;
        this.zzdrd = str3;
        this.zzdre = null;
        this.orientation = i;
        this.zzdrf = 1;
        this.url = null;
        this.zzbpd = zzaytVar;
        this.zzdrg = str;
        this.zzdrh = zziVar;
        this.zzbvf = null;
        this.zzdrk = null;
        this.zzdri = null;
        this.zzdgu = null;
        this.zzdgv = null;
        this.zzdrj = null;
    }

    public AdOverlayInfoParcel(zzuz zzuzVar, zzp zzpVar, zzu zzuVar, zzbdh zzbdhVar, boolean z, int i, zzayt zzaytVar) {
        this.zzdqz = null;
        this.zzcgr = zzuzVar;
        this.zzdra = zzpVar;
        this.zzdhu = zzbdhVar;
        this.zzdfv = null;
        this.zzdfx = null;
        this.zzdrb = null;
        this.zzdrc = z;
        this.zzdrd = null;
        this.zzdre = zzuVar;
        this.orientation = i;
        this.zzdrf = 2;
        this.url = null;
        this.zzbpd = zzaytVar;
        this.zzdrg = null;
        this.zzdrh = null;
        this.zzbvf = null;
        this.zzdrk = null;
        this.zzdri = null;
        this.zzdgu = null;
        this.zzdgv = null;
        this.zzdrj = null;
    }

    public AdOverlayInfoParcel(zzuz zzuzVar, zzp zzpVar, zzahc zzahcVar, zzahe zzaheVar, zzu zzuVar, zzbdh zzbdhVar, boolean z, int i, String str, zzayt zzaytVar) {
        this.zzdqz = null;
        this.zzcgr = zzuzVar;
        this.zzdra = zzpVar;
        this.zzdhu = zzbdhVar;
        this.zzdfv = zzahcVar;
        this.zzdfx = zzaheVar;
        this.zzdrb = null;
        this.zzdrc = z;
        this.zzdrd = null;
        this.zzdre = zzuVar;
        this.orientation = i;
        this.zzdrf = 3;
        this.url = str;
        this.zzbpd = zzaytVar;
        this.zzdrg = null;
        this.zzdrh = null;
        this.zzbvf = null;
        this.zzdrk = null;
        this.zzdri = null;
        this.zzdgu = null;
        this.zzdgv = null;
        this.zzdrj = null;
    }

    public AdOverlayInfoParcel(zzuz zzuzVar, zzp zzpVar, zzahc zzahcVar, zzahe zzaheVar, zzu zzuVar, zzbdh zzbdhVar, boolean z, int i, String str, String str2, zzayt zzaytVar) {
        this.zzdqz = null;
        this.zzcgr = zzuzVar;
        this.zzdra = zzpVar;
        this.zzdhu = zzbdhVar;
        this.zzdfv = zzahcVar;
        this.zzdfx = zzaheVar;
        this.zzdrb = str2;
        this.zzdrc = z;
        this.zzdrd = str;
        this.zzdre = zzuVar;
        this.orientation = i;
        this.zzdrf = 3;
        this.url = null;
        this.zzbpd = zzaytVar;
        this.zzdrg = null;
        this.zzdrh = null;
        this.zzbvf = null;
        this.zzdrk = null;
        this.zzdri = null;
        this.zzdgu = null;
        this.zzdgv = null;
        this.zzdrj = null;
    }

    public AdOverlayInfoParcel(zzb zzbVar, zzuz zzuzVar, zzp zzpVar, zzu zzuVar, zzayt zzaytVar) {
        this.zzdqz = zzbVar;
        this.zzcgr = zzuzVar;
        this.zzdra = zzpVar;
        this.zzdhu = null;
        this.zzdfv = null;
        this.zzdfx = null;
        this.zzdrb = null;
        this.zzdrc = false;
        this.zzdrd = null;
        this.zzdre = zzuVar;
        this.orientation = -1;
        this.zzdrf = 4;
        this.url = null;
        this.zzbpd = zzaytVar;
        this.zzdrg = null;
        this.zzdrh = null;
        this.zzbvf = null;
        this.zzdrk = null;
        this.zzdri = null;
        this.zzdgu = null;
        this.zzdgv = null;
        this.zzdrj = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AdOverlayInfoParcel(zzb zzbVar, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzayt zzaytVar, String str4, com.google.android.gms.ads.internal.zzi zziVar, IBinder iBinder6, String str5, IBinder iBinder7, IBinder iBinder8, IBinder iBinder9, IBinder iBinder10, String str6) {
        this.zzdqz = zzbVar;
        this.zzcgr = (zzuz) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder));
        this.zzdra = (zzp) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder2));
        this.zzdhu = (zzbdh) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder3));
        this.zzdfv = (zzahc) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder6));
        this.zzdfx = (zzahe) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder4));
        this.zzdrb = str;
        this.zzdrc = z;
        this.zzdrd = str2;
        this.zzdre = (zzu) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder5));
        this.orientation = i;
        this.zzdrf = i2;
        this.url = str3;
        this.zzbpd = zzaytVar;
        this.zzdrg = str4;
        this.zzdrh = zziVar;
        this.zzbvf = str5;
        this.zzdrk = str6;
        this.zzdri = (zzcpy) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder7));
        this.zzdgu = (zzcju) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder8));
        this.zzdgv = (zzdro) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder9));
        this.zzdrj = (zzbf) ObjectWrapper.unwrap(IObjectWrapper.Stub.asInterface(iBinder10));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zzdqz, i, false);
        SafeParcelWriter.writeIBinder(parcel, 3, ObjectWrapper.wrap(this.zzcgr).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 4, ObjectWrapper.wrap(this.zzdra).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 5, ObjectWrapper.wrap(this.zzdhu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 6, ObjectWrapper.wrap(this.zzdfx).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 7, this.zzdrb, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zzdrc);
        SafeParcelWriter.writeString(parcel, 9, this.zzdrd, false);
        SafeParcelWriter.writeIBinder(parcel, 10, ObjectWrapper.wrap(this.zzdre).asBinder(), false);
        SafeParcelWriter.writeInt(parcel, 11, this.orientation);
        SafeParcelWriter.writeInt(parcel, 12, this.zzdrf);
        SafeParcelWriter.writeString(parcel, 13, this.url, false);
        SafeParcelWriter.writeParcelable(parcel, 14, this.zzbpd, i, false);
        SafeParcelWriter.writeString(parcel, 16, this.zzdrg, false);
        SafeParcelWriter.writeParcelable(parcel, 17, this.zzdrh, i, false);
        SafeParcelWriter.writeIBinder(parcel, 18, ObjectWrapper.wrap(this.zzdfv).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 19, this.zzbvf, false);
        SafeParcelWriter.writeIBinder(parcel, 20, ObjectWrapper.wrap(this.zzdri).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 21, ObjectWrapper.wrap(this.zzdgu).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 22, ObjectWrapper.wrap(this.zzdgv).asBinder(), false);
        SafeParcelWriter.writeIBinder(parcel, 23, ObjectWrapper.wrap(this.zzdrj).asBinder(), false);
        SafeParcelWriter.writeString(parcel, 24, this.zzdrk, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}
