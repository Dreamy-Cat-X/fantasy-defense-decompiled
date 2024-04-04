package com.google.android.gms.internal.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.provider.CalendarContract;
import android.text.TextUtils;
import com.google.android.gms.ads.impl.R;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapu extends zzaqf {
    private final Context context;
    private final Map<String, String> zzdak;
    private String zzdnu;
    private long zzdnv;
    private long zzdnw;
    private String zzdnx;
    private String zzdny;

    public zzapu(zzbdh zzbdhVar, Map<String, String> map) {
        super(zzbdhVar, "createCalendarEvent");
        this.zzdak = map;
        this.context = zzbdhVar.zzaba();
        this.zzdnu = zzdq("description");
        this.zzdnx = zzdq("summary");
        this.zzdnv = zzdr("start_ticks");
        this.zzdnw = zzdr("end_ticks");
        this.zzdny = zzdq("location");
    }

    private final String zzdq(String str) {
        return TextUtils.isEmpty(this.zzdak.get(str)) ? "" : this.zzdak.get(str);
    }

    private final long zzdr(String str) {
        String str2 = this.zzdak.get(str);
        if (str2 == null) {
            return -1L;
        }
        try {
            return Long.parseLong(str2);
        } catch (NumberFormatException unused) {
            return -1L;
        }
    }

    public final void execute() {
        if (this.context == null) {
            zzds("Activity context is not available.");
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzkq();
        if (!com.google.android.gms.ads.internal.util.zzm.zzap(this.context).zzrz()) {
            zzds("This feature is not available on the device.");
            return;
        }
        com.google.android.gms.ads.internal.zzp.zzkq();
        AlertDialog.Builder zzao = com.google.android.gms.ads.internal.util.zzm.zzao(this.context);
        Resources resources = com.google.android.gms.ads.internal.zzp.zzku().getResources();
        zzao.setTitle(resources != null ? resources.getString(R.string.s5) : "Create calendar event");
        zzao.setMessage(resources != null ? resources.getString(R.string.s6) : "Allow Ad to create a calendar event?");
        zzao.setPositiveButton(resources != null ? resources.getString(R.string.s3) : "Accept", new zzapt(this));
        zzao.setNegativeButton(resources != null ? resources.getString(R.string.s4) : "Decline", new zzapw(this));
        zzao.create().show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Intent createIntent() {
        Intent data = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
        data.putExtra("title", this.zzdnu);
        data.putExtra("eventLocation", this.zzdny);
        data.putExtra("description", this.zzdnx);
        long j = this.zzdnv;
        if (j > -1) {
            data.putExtra("beginTime", j);
        }
        long j2 = this.zzdnw;
        if (j2 > -1) {
            data.putExtra("endTime", j2);
        }
        data.setFlags(268435456);
        return data;
    }
}
