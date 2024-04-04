package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public abstract class zzapc extends zzgv implements zzaoz {
    public zzapc() {
        super("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
    }

    public static zzaoz zzaf(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRtbAdapter");
        if (queryLocalInterface instanceof zzaoz) {
            return (zzaoz) queryLocalInterface;
        }
        return new zzapb(iBinder);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x001c. Please report as an issue. */
    @Override // com.google.android.gms.internal.ads.zzgv
    protected final boolean zza(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        zzape zzapgVar;
        zzape zzapeVar;
        zzaon zzaonVar = null;
        zzaoy zzapaVar = null;
        zzaot zzaovVar = null;
        zzaoy zzapaVar2 = null;
        zzaos zzaouVar = null;
        if (i == 1) {
            IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
            String readString = parcel.readString();
            Bundle bundle = (Bundle) zzgy.zza(parcel, Bundle.CREATOR);
            Bundle bundle2 = (Bundle) zzgy.zza(parcel, Bundle.CREATOR);
            zzvp zzvpVar = (zzvp) zzgy.zza(parcel, zzvp.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                zzapeVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.ISignalsCallback");
                if (queryLocalInterface instanceof zzape) {
                    zzapgVar = (zzape) queryLocalInterface;
                } else {
                    zzapgVar = new zzapg(readStrongBinder);
                }
                zzapeVar = zzapgVar;
            }
            zza(asInterface, readString, bundle, bundle2, zzvpVar, zzapeVar);
            parcel2.writeNoException();
        } else if (i == 2) {
            zzapn zzvb = zzvb();
            parcel2.writeNoException();
            zzgy.zzb(parcel2, zzvb);
        } else if (i == 3) {
            zzapn zzvc = zzvc();
            parcel2.writeNoException();
            zzgy.zzb(parcel2, zzvc);
        } else if (i == 5) {
            zzyu videoController = getVideoController();
            parcel2.writeNoException();
            zzgy.zza(parcel2, videoController);
        } else if (i == 10) {
            zzy(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 11) {
            zza(parcel.createStringArray(), (Bundle[]) parcel.createTypedArray(Bundle.CREATOR));
            parcel2.writeNoException();
        } else {
            switch (i) {
                case 13:
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    zzvi zzviVar = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder2 = parcel.readStrongBinder();
                    if (readStrongBinder2 != null) {
                        IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IBannerCallback");
                        if (queryLocalInterface2 instanceof zzaon) {
                            zzaonVar = (zzaon) queryLocalInterface2;
                        } else {
                            zzaonVar = new zzaop(readStrongBinder2);
                        }
                    }
                    zza(readString2, readString3, zzviVar, asInterface2, zzaonVar, zzanc.zzad(parcel.readStrongBinder()), (zzvp) zzgy.zza(parcel, zzvp.CREATOR));
                    parcel2.writeNoException();
                    break;
                case 14:
                    String readString4 = parcel.readString();
                    String readString5 = parcel.readString();
                    zzvi zzviVar2 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IInterstitialCallback");
                        if (queryLocalInterface3 instanceof zzaos) {
                            zzaouVar = (zzaos) queryLocalInterface3;
                        } else {
                            zzaouVar = new zzaou(readStrongBinder3);
                        }
                    }
                    zza(readString4, readString5, zzviVar2, asInterface3, zzaouVar, zzanc.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 15:
                    boolean zzz = zzz(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgy.writeBoolean(parcel2, zzz);
                    break;
                case 16:
                    String readString6 = parcel.readString();
                    String readString7 = parcel.readString();
                    zzvi zzviVar3 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                    IObjectWrapper asInterface4 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder4 = parcel.readStrongBinder();
                    if (readStrongBinder4 != null) {
                        IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface4 instanceof zzaoy) {
                            zzapaVar2 = (zzaoy) queryLocalInterface4;
                        } else {
                            zzapaVar2 = new zzapa(readStrongBinder4);
                        }
                    }
                    zza(readString6, readString7, zzviVar3, asInterface4, zzapaVar2, zzanc.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 17:
                    boolean zzaa = zzaa(IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    zzgy.writeBoolean(parcel2, zzaa);
                    break;
                case 18:
                    String readString8 = parcel.readString();
                    String readString9 = parcel.readString();
                    zzvi zzviVar4 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder5 = parcel.readStrongBinder();
                    if (readStrongBinder5 != null) {
                        IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback");
                        if (queryLocalInterface5 instanceof zzaot) {
                            zzaovVar = (zzaot) queryLocalInterface5;
                        } else {
                            zzaovVar = new zzaov(readStrongBinder5);
                        }
                    }
                    zza(readString8, readString9, zzviVar4, asInterface5, zzaovVar, zzanc.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                case 19:
                    zzdm(parcel.readString());
                    parcel2.writeNoException();
                    break;
                case 20:
                    String readString10 = parcel.readString();
                    String readString11 = parcel.readString();
                    zzvi zzviVar5 = (zzvi) zzgy.zza(parcel, zzvi.CREATOR);
                    IObjectWrapper asInterface6 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                    IBinder readStrongBinder6 = parcel.readStrongBinder();
                    if (readStrongBinder6 != null) {
                        IInterface queryLocalInterface6 = readStrongBinder6.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.rtb.IRewardedCallback");
                        if (queryLocalInterface6 instanceof zzaoy) {
                            zzapaVar = (zzaoy) queryLocalInterface6;
                        } else {
                            zzapaVar = new zzapa(readStrongBinder6);
                        }
                    }
                    zzb(readString10, readString11, zzviVar5, asInterface6, zzapaVar, zzanc.zzad(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    break;
                default:
                    return false;
            }
        }
        return true;
    }
}
