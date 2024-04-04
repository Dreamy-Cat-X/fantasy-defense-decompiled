package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-gass@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public class zzeld extends IOException {
    private zzemd zzipp;

    public zzeld(String str) {
        super(str);
        this.zzipp = null;
    }

    public final zzeld zzl(zzemd zzemdVar) {
        this.zzipp = zzemdVar;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbjd() {
        return new zzeld("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbje() {
        return new zzeld("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbjf() {
        return new zzeld("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbjg() {
        return new zzeld("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbjh() {
        return new zzeld("Protocol message end-group tag did not match expected tag.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzelc zzbji() {
        return new zzelc("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbjj() {
        return new zzeld("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbjk() {
        return new zzeld("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzeld zzbjl() {
        return new zzeld("Protocol message had invalid UTF-8.");
    }
}
