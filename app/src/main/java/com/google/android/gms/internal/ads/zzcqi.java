package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.RemoteException;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.AdService;
import com.google.android.gms.ads.impl.R;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzcqi extends zzaqk {
    private final Context context;
    private final zzcju zzdgu;
    private final zzdro zzdgv;
    private final zzayq zzdgw;
    private final zzcpy zzdgy;

    public zzcqi(Context context, zzcpy zzcpyVar, zzayq zzayqVar, zzcju zzcjuVar, zzdro zzdroVar) {
        this.context = context;
        this.zzdgu = zzcjuVar;
        this.zzdgw = zzayqVar;
        this.zzdgy = zzcpyVar;
        this.zzdgv = zzdroVar;
    }

    public static void zza(final Activity activity, final com.google.android.gms.ads.internal.overlay.zze zzeVar, final com.google.android.gms.ads.internal.util.zzbf zzbfVar, final zzcpy zzcpyVar, final zzcju zzcjuVar, final zzdro zzdroVar, final String str, final String str2) {
        com.google.android.gms.ads.internal.zzp.zzkq();
        AlertDialog.Builder zzc = com.google.android.gms.ads.internal.util.zzm.zzc(activity, com.google.android.gms.ads.internal.zzp.zzks().zzzd());
        final Resources resources = com.google.android.gms.ads.internal.zzp.zzku().getResources();
        zzc.setTitle(resources == null ? "Open ad when you're back online." : resources.getString(R.string.offline_opt_in_title)).setMessage(resources == null ? "We'll send you a notification with a link to the advertiser site." : resources.getString(R.string.offline_opt_in_message)).setPositiveButton(resources == null ? "OK" : resources.getString(R.string.offline_opt_in_confirm), new DialogInterface.OnClickListener(zzcjuVar, activity, zzdroVar, zzcpyVar, str, zzbfVar, str2, resources, zzeVar) { // from class: com.google.android.gms.internal.ads.zzcql
            private final Activity zzede;
            private final String zzepz;
            private final zzcju zzgqo;
            private final zzdro zzgqp;
            private final zzcpy zzgqq;
            private final com.google.android.gms.ads.internal.util.zzbf zzgqr;
            private final String zzgqs;
            private final Resources zzgqt;
            private final com.google.android.gms.ads.internal.overlay.zze zzgqu;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqo = zzcjuVar;
                this.zzede = activity;
                this.zzgqp = zzdroVar;
                this.zzgqq = zzcpyVar;
                this.zzepz = str;
                this.zzgqr = zzbfVar;
                this.zzgqs = str2;
                this.zzgqt = resources;
                this.zzgqu = zzeVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                final com.google.android.gms.ads.internal.overlay.zze zzeVar2;
                zzcju zzcjuVar2 = this.zzgqo;
                Activity activity2 = this.zzede;
                zzdro zzdroVar2 = this.zzgqp;
                zzcpy zzcpyVar2 = this.zzgqq;
                String str3 = this.zzepz;
                com.google.android.gms.ads.internal.util.zzbf zzbfVar2 = this.zzgqr;
                String str4 = this.zzgqs;
                Resources resources2 = this.zzgqt;
                com.google.android.gms.ads.internal.overlay.zze zzeVar3 = this.zzgqu;
                if (zzcjuVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "confirm");
                    zzeVar2 = zzeVar3;
                    zzcqi.zza(activity2, zzcjuVar2, zzdroVar2, zzcpyVar2, str3, "dialog_click", hashMap);
                } else {
                    zzeVar2 = zzeVar3;
                }
                boolean z = false;
                try {
                    z = zzbfVar2.zzd(ObjectWrapper.wrap(activity2), str4, str3);
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.zzd.zzc("Failed to schedule offline notification poster.", e);
                }
                if (!z) {
                    zzcpyVar2.zzgm(str3);
                    if (zzcjuVar2 != null) {
                        zzcqi.zza(activity2, zzcjuVar2, zzdroVar2, zzcpyVar2, str3, "offline_notification_worker_not_scheduled");
                    }
                }
                com.google.android.gms.ads.internal.zzp.zzkq();
                AlertDialog.Builder zzc2 = com.google.android.gms.ads.internal.util.zzm.zzc(activity2, com.google.android.gms.ads.internal.zzp.zzks().zzzd());
                zzc2.setMessage(resources2 == null ? "You'll get a notification with the link when you're back online" : resources2.getString(R.string.offline_opt_in_confirmation)).setOnCancelListener(new DialogInterface.OnCancelListener(zzeVar2) { // from class: com.google.android.gms.internal.ads.zzcqm
                    private final com.google.android.gms.ads.internal.overlay.zze zzdpu;

                    /* JADX INFO: Access modifiers changed from: package-private */
                    {
                        this.zzdpu = zzeVar2;
                    }

                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface2) {
                        com.google.android.gms.ads.internal.overlay.zze zzeVar4 = this.zzdpu;
                        if (zzeVar4 != null) {
                            zzeVar4.close();
                        }
                    }
                });
                AlertDialog create = zzc2.create();
                create.show();
                Timer timer = new Timer();
                timer.schedule(new zzcqp(create, timer, zzeVar2), 3000L);
            }
        }).setNegativeButton(resources == null ? "No thanks" : resources.getString(R.string.offline_opt_in_decline), new DialogInterface.OnClickListener(zzcpyVar, str, zzcjuVar, activity, zzdroVar, zzeVar) { // from class: com.google.android.gms.internal.ads.zzcqk
            private final String zzdhw;
            private final zzcpy zzgqe;
            private final zzcju zzgqk;
            private final Activity zzgql;
            private final zzdro zzgqm;
            private final com.google.android.gms.ads.internal.overlay.zze zzgqn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqe = zzcpyVar;
                this.zzdhw = str;
                this.zzgqk = zzcjuVar;
                this.zzgql = activity;
                this.zzgqm = zzdroVar;
                this.zzgqn = zzeVar;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                zzcpy zzcpyVar2 = this.zzgqe;
                String str3 = this.zzdhw;
                zzcju zzcjuVar2 = this.zzgqk;
                Activity activity2 = this.zzgql;
                zzdro zzdroVar2 = this.zzgqm;
                com.google.android.gms.ads.internal.overlay.zze zzeVar2 = this.zzgqn;
                zzcpyVar2.zzgm(str3);
                if (zzcjuVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzcqi.zza(activity2, zzcjuVar2, zzdroVar2, zzcpyVar2, str3, "dialog_click", hashMap);
                }
                if (zzeVar2 != null) {
                    zzeVar2.close();
                }
            }
        }).setOnCancelListener(new DialogInterface.OnCancelListener(zzcpyVar, str, zzcjuVar, activity, zzdroVar, zzeVar) { // from class: com.google.android.gms.internal.ads.zzcqn
            private final String zzdhw;
            private final zzcpy zzgqe;
            private final zzcju zzgqk;
            private final Activity zzgql;
            private final zzdro zzgqm;
            private final com.google.android.gms.ads.internal.overlay.zze zzgqn;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.zzgqe = zzcpyVar;
                this.zzdhw = str;
                this.zzgqk = zzcjuVar;
                this.zzgql = activity;
                this.zzgqm = zzdroVar;
                this.zzgqn = zzeVar;
            }

            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                zzcpy zzcpyVar2 = this.zzgqe;
                String str3 = this.zzdhw;
                zzcju zzcjuVar2 = this.zzgqk;
                Activity activity2 = this.zzgql;
                zzdro zzdroVar2 = this.zzgqm;
                com.google.android.gms.ads.internal.overlay.zze zzeVar2 = this.zzgqn;
                zzcpyVar2.zzgm(str3);
                if (zzcjuVar2 != null) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("dialog_action", "dismiss");
                    zzcqi.zza(activity2, zzcjuVar2, zzdroVar2, zzcpyVar2, str3, "dialog_click", hashMap);
                }
                if (zzeVar2 != null) {
                    zzeVar2.close();
                }
            }
        });
        zzc.create().show();
    }

    public static void zza(Context context, zzcju zzcjuVar, zzdro zzdroVar, zzcpy zzcpyVar, String str, String str2) {
        zza(context, zzcjuVar, zzdroVar, zzcpyVar, str, str2, new HashMap());
    }

    public static void zza(Context context, zzcju zzcjuVar, zzdro zzdroVar, zzcpy zzcpyVar, String str, String str2, Map<String, String> map) {
        String zzaqw;
        if (((Boolean) zzwo.zzqq().zzd(zzabh.zzczk)).booleanValue()) {
            zzdrp zzu = zzdrp.zzgz(str2).zzu("gqi", str);
            com.google.android.gms.ads.internal.zzp.zzkq();
            zzdrp zzu2 = zzu.zzu("device_connectivity", com.google.android.gms.ads.internal.util.zzm.zzbb(context) ? "online" : "offline").zzu("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()));
            for (Map.Entry<String, String> entry : map.entrySet()) {
                zzu2.zzu(entry.getKey(), entry.getValue());
            }
            zzaqw = zzdroVar.zzc(zzu2);
        } else {
            zzcjx zzaqt = zzcjuVar.zzaqt();
            zzaqt.zzr("gqi", str);
            zzaqt.zzr("action", str2);
            com.google.android.gms.ads.internal.zzp.zzkq();
            zzaqt.zzr("device_connectivity", com.google.android.gms.ads.internal.util.zzm.zzbb(context) ? "online" : "offline");
            zzaqt.zzr("event_timestamp", String.valueOf(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis()));
            for (Map.Entry<String, String> entry2 : map.entrySet()) {
                zzaqt.zzr(entry2.getKey(), entry2.getValue());
            }
            zzaqw = zzaqt.zzaqw();
        }
        zzcpyVar.zza(new zzcqj(com.google.android.gms.ads.internal.zzp.zzkx().currentTimeMillis(), str, zzaqw, zzcpz.zzgqc));
    }

    private final void zza(String str, String str2, Map<String, String> map) {
        zza(this.context, this.zzdgu, this.zzdgv, this.zzdgy, str, str2, map);
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(Intent intent) {
        String stringExtra = intent.getStringExtra("offline_notification_action");
        if (stringExtra.equals("offline_notification_clicked") || stringExtra.equals("offline_notification_dismissed")) {
            String stringExtra2 = intent.getStringExtra("gws_query_id");
            String stringExtra3 = intent.getStringExtra("uri");
            com.google.android.gms.ads.internal.zzp.zzkq();
            boolean zzbb = com.google.android.gms.ads.internal.util.zzm.zzbb(this.context);
            int i = zzcqo.zzgqw;
            HashMap hashMap = new HashMap();
            if (stringExtra.equals("offline_notification_clicked")) {
                hashMap.put("offline_notification_action", "offline_notification_clicked");
                if (zzbb) {
                    i = zzcqo.zzgqv;
                }
                Context context = this.context;
                Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(stringExtra3);
                if (launchIntentForPackage == null) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW");
                    launchIntentForPackage.setData(Uri.parse(stringExtra3));
                }
                launchIntentForPackage.addFlags(268435456);
                context.startActivity(launchIntentForPackage);
            } else {
                hashMap.put("offline_notification_action", "offline_notification_dismissed");
            }
            zza(stringExtra2, "offline_notification_action", hashMap);
            try {
                SQLiteDatabase writableDatabase = this.zzdgy.getWritableDatabase();
                if (i == zzcqo.zzgqv) {
                    this.zzdgy.zza(writableDatabase, this.zzdgw, stringExtra2);
                } else {
                    zzcpy.zza(writableDatabase, stringExtra2);
                }
            } catch (SQLiteException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 51);
                sb.append("Failed to get writable offline buffering database: ");
                sb.append(valueOf);
                com.google.android.gms.ads.internal.util.zzd.zzev(sb.toString());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzc(IObjectWrapper iObjectWrapper, String str, String str2) {
        Context context = (Context) ObjectWrapper.unwrap(iObjectWrapper);
        int i = PlatformVersion.isAtLeastM() ? 1140850688 : 1073741824;
        Intent intent = new Intent();
        intent.setClass(context, AdService.class);
        intent.setAction("offline_notification_clicked");
        intent.putExtra("offline_notification_action", "offline_notification_clicked");
        intent.putExtra("gws_query_id", str2);
        intent.putExtra("uri", str);
        PendingIntent service = zzdvc.getService(context, 0, intent, i);
        Intent intent2 = new Intent();
        intent2.setClass(context, AdService.class);
        intent2.setAction("offline_notification_dismissed");
        intent2.putExtra("offline_notification_action", "offline_notification_dismissed");
        intent2.putExtra("gws_query_id", str2);
        PendingIntent service2 = zzdvc.getService(context, 0, intent2, i);
        Resources resources = com.google.android.gms.ads.internal.zzp.zzku().getResources();
        ((NotificationManager) context.getSystemService("notification")).notify(str2, 54321, new NotificationCompat.Builder(context, "offline_notification_channel").setContentTitle(resources == null ? "View the ad you saved when you were offline" : resources.getString(R.string.offline_notification_title)).setContentText(resources == null ? "Tap to open ad" : resources.getString(R.string.offline_notification_text)).setAutoCancel(true).setDeleteIntent(service2).setContentIntent(service).setSmallIcon(context.getApplicationInfo().icon).build());
        zza(str2, "offline_notification_impression", new HashMap());
    }

    @Override // com.google.android.gms.internal.ads.zzaqh
    public final void zzvp() {
        this.zzdgy.zza(this.zzdgw);
    }
}
