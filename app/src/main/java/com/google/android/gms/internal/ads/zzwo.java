package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.Random;
import java.util.WeakHashMap;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzwo {
    private static zzwo zzciu = new zzwo();
    private final zzayd zzciv;
    private final zzvz zzciw;
    private final String zzcix;
    private final zzabc zzciy;
    private final zzabe zzciz;
    private final zzabd zzcja;
    private final zzayt zzcjb;
    private final Random zzcjc;
    private final WeakHashMap<QueryInfo, String> zzcjd;

    protected zzwo() {
        this(new zzayd(), new zzvz(new zzvg(), new zzvh(), new zzzr(), new zzagn(), new zzauc(), new zzavg(), new zzaqt(), new zzagq()), new zzabc(), new zzabe(), new zzabd(), zzayd.zzzw(), new zzayt(0, ModuleDescriptor.MODULE_VERSION, true), new Random(), new WeakHashMap());
    }

    private zzwo(zzayd zzaydVar, zzvz zzvzVar, zzabc zzabcVar, zzabe zzabeVar, zzabd zzabdVar, String str, zzayt zzaytVar, Random random, WeakHashMap<QueryInfo, String> weakHashMap) {
        this.zzciv = zzaydVar;
        this.zzciw = zzvzVar;
        this.zzciy = zzabcVar;
        this.zzciz = zzabeVar;
        this.zzcja = zzabdVar;
        this.zzcix = str;
        this.zzcjb = zzaytVar;
        this.zzcjc = random;
        this.zzcjd = weakHashMap;
    }

    public static zzayd zzqm() {
        return zzciu.zzciv;
    }

    public static zzvz zzqn() {
        return zzciu.zzciw;
    }

    public static zzabe zzqo() {
        return zzciu.zzciz;
    }

    public static zzabc zzqp() {
        return zzciu.zzciy;
    }

    public static zzabd zzqq() {
        return zzciu.zzcja;
    }

    public static String zzqr() {
        return zzciu.zzcix;
    }

    public static zzayt zzqs() {
        return zzciu.zzcjb;
    }

    public static Random zzqt() {
        return zzciu.zzcjc;
    }

    public static WeakHashMap<QueryInfo, String> zzqu() {
        return zzciu.zzcjd;
    }
}
