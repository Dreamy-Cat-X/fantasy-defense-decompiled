package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public interface zzems {
    int getTag();

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    String readString() throws IOException;

    void readStringList(List<String> list) throws IOException;

    <T> T zza(zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException;

    <T> void zza(List<T> list, zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException;

    <K, V> void zza(Map<K, V> map, zzelu<K, V> zzeluVar, zzekd zzekdVar) throws IOException;

    void zzaa(List<Integer> list) throws IOException;

    void zzab(List<Long> list) throws IOException;

    @Deprecated
    <T> T zzb(zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException;

    @Deprecated
    <T> void zzb(List<T> list, zzemy<T> zzemyVar, zzekd zzekdVar) throws IOException;

    long zzbgw() throws IOException;

    long zzbgx() throws IOException;

    int zzbgy() throws IOException;

    long zzbgz() throws IOException;

    int zzbha() throws IOException;

    boolean zzbhb() throws IOException;

    String zzbhc() throws IOException;

    zzejg zzbhd() throws IOException;

    int zzbhe() throws IOException;

    int zzbhf() throws IOException;

    int zzbhg() throws IOException;

    long zzbhh() throws IOException;

    int zzbhi() throws IOException;

    long zzbhj() throws IOException;

    int zzbht() throws IOException;

    boolean zzbhu() throws IOException;

    void zzm(List<Double> list) throws IOException;

    void zzn(List<Float> list) throws IOException;

    void zzo(List<Long> list) throws IOException;

    void zzp(List<Long> list) throws IOException;

    void zzq(List<Integer> list) throws IOException;

    void zzr(List<Long> list) throws IOException;

    void zzs(List<Integer> list) throws IOException;

    void zzt(List<Boolean> list) throws IOException;

    void zzu(List<String> list) throws IOException;

    void zzv(List<zzejg> list) throws IOException;

    void zzw(List<Integer> list) throws IOException;

    void zzx(List<Integer> list) throws IOException;

    void zzy(List<Integer> list) throws IOException;

    void zzz(List<Long> list) throws IOException;
}
