package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.google.android.gms.common.util.CollectionUtils;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class zzapv extends zzaqf {
    private static final Set<String> zzdnz = CollectionUtils.setOf("top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
    private int height;
    private final Object lock;
    private int width;
    private zzaqi zzdgz;
    private final zzbdh zzdhu;
    private final Activity zzdnp;
    private String zzdoa;
    private boolean zzdob;
    private int zzdoc;
    private int zzdod;
    private int zzdoe;
    private int zzdof;
    private zzbew zzdog;
    private ImageView zzdoh;
    private LinearLayout zzdoi;
    private PopupWindow zzdoj;
    private RelativeLayout zzdok;
    private ViewGroup zzdol;

    public zzapv(zzbdh zzbdhVar, zzaqi zzaqiVar) {
        super(zzbdhVar, "resize");
        this.zzdoa = "top-right";
        this.zzdob = true;
        this.zzdoc = 0;
        this.zzdod = 0;
        this.height = -1;
        this.zzdoe = 0;
        this.zzdof = 0;
        this.width = -1;
        this.lock = new Object();
        this.zzdhu = zzbdhVar;
        this.zzdnp = zzbdhVar.zzaba();
        this.zzdgz = zzaqiVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:152:0x023b A[Catch: all -> 0x04b6, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0132, B:62:0x0138, B:64:0x013c, B:67:0x0142, B:69:0x0146, B:71:0x014a, B:76:0x0297, B:77:0x029c, B:79:0x029e, B:81:0x02c0, B:83:0x02c4, B:85:0x02d4, B:86:0x0306, B:89:0x0338, B:90:0x036c, B:102:0x03c2, B:103:0x03f1, B:105:0x0409, B:106:0x0428, B:108:0x0430, B:109:0x0439, B:110:0x045e, B:114:0x0461, B:116:0x0471, B:117:0x047b, B:119:0x048d, B:120:0x04a6, B:122:0x0476, B:123:0x03c9, B:124:0x03d0, B:125:0x03d7, B:126:0x03de, B:127:0x03e4, B:128:0x03eb, B:129:0x0370, B:132:0x037a, B:135:0x0384, B:138:0x038e, B:141:0x0398, B:144:0x03a2, B:148:0x0301, B:149:0x04a8, B:150:0x04ad, B:152:0x023b, B:154:0x023f, B:155:0x0250, B:158:0x027b, B:160:0x027f, B:161:0x028f, B:162:0x0282, B:164:0x0289, B:165:0x0272, B:167:0x0277, B:168:0x0151, B:170:0x0155, B:171:0x015b, B:180:0x01a8, B:181:0x0219, B:183:0x021c, B:185:0x021f, B:187:0x0223, B:190:0x01b6, B:191:0x01e6, B:192:0x01c7, B:193:0x01da, B:194:0x01e9, B:195:0x0200, B:196:0x0210, B:197:0x015f, B:200:0x0169, B:203:0x0173, B:206:0x017d, B:209:0x0187, B:212:0x0191, B:216:0x022b, B:217:0x0231, B:218:0x04af, B:219:0x04b4), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x021c A[Catch: all -> 0x04b6, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0132, B:62:0x0138, B:64:0x013c, B:67:0x0142, B:69:0x0146, B:71:0x014a, B:76:0x0297, B:77:0x029c, B:79:0x029e, B:81:0x02c0, B:83:0x02c4, B:85:0x02d4, B:86:0x0306, B:89:0x0338, B:90:0x036c, B:102:0x03c2, B:103:0x03f1, B:105:0x0409, B:106:0x0428, B:108:0x0430, B:109:0x0439, B:110:0x045e, B:114:0x0461, B:116:0x0471, B:117:0x047b, B:119:0x048d, B:120:0x04a6, B:122:0x0476, B:123:0x03c9, B:124:0x03d0, B:125:0x03d7, B:126:0x03de, B:127:0x03e4, B:128:0x03eb, B:129:0x0370, B:132:0x037a, B:135:0x0384, B:138:0x038e, B:141:0x0398, B:144:0x03a2, B:148:0x0301, B:149:0x04a8, B:150:0x04ad, B:152:0x023b, B:154:0x023f, B:155:0x0250, B:158:0x027b, B:160:0x027f, B:161:0x028f, B:162:0x0282, B:164:0x0289, B:165:0x0272, B:167:0x0277, B:168:0x0151, B:170:0x0155, B:171:0x015b, B:180:0x01a8, B:181:0x0219, B:183:0x021c, B:185:0x021f, B:187:0x0223, B:190:0x01b6, B:191:0x01e6, B:192:0x01c7, B:193:0x01da, B:194:0x01e9, B:195:0x0200, B:196:0x0210, B:197:0x015f, B:200:0x0169, B:203:0x0173, B:206:0x017d, B:209:0x0187, B:212:0x0191, B:216:0x022b, B:217:0x0231, B:218:0x04af, B:219:0x04b4), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0297 A[Catch: all -> 0x04b6, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0132, B:62:0x0138, B:64:0x013c, B:67:0x0142, B:69:0x0146, B:71:0x014a, B:76:0x0297, B:77:0x029c, B:79:0x029e, B:81:0x02c0, B:83:0x02c4, B:85:0x02d4, B:86:0x0306, B:89:0x0338, B:90:0x036c, B:102:0x03c2, B:103:0x03f1, B:105:0x0409, B:106:0x0428, B:108:0x0430, B:109:0x0439, B:110:0x045e, B:114:0x0461, B:116:0x0471, B:117:0x047b, B:119:0x048d, B:120:0x04a6, B:122:0x0476, B:123:0x03c9, B:124:0x03d0, B:125:0x03d7, B:126:0x03de, B:127:0x03e4, B:128:0x03eb, B:129:0x0370, B:132:0x037a, B:135:0x0384, B:138:0x038e, B:141:0x0398, B:144:0x03a2, B:148:0x0301, B:149:0x04a8, B:150:0x04ad, B:152:0x023b, B:154:0x023f, B:155:0x0250, B:158:0x027b, B:160:0x027f, B:161:0x028f, B:162:0x0282, B:164:0x0289, B:165:0x0272, B:167:0x0277, B:168:0x0151, B:170:0x0155, B:171:0x015b, B:180:0x01a8, B:181:0x0219, B:183:0x021c, B:185:0x021f, B:187:0x0223, B:190:0x01b6, B:191:0x01e6, B:192:0x01c7, B:193:0x01da, B:194:0x01e9, B:195:0x0200, B:196:0x0210, B:197:0x015f, B:200:0x0169, B:203:0x0173, B:206:0x017d, B:209:0x0187, B:212:0x0191, B:216:0x022b, B:217:0x0231, B:218:0x04af, B:219:0x04b4), top: B:3:0x0007, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x029e A[Catch: all -> 0x04b6, TryCatch #0 {, blocks: (B:4:0x0007, B:6:0x000b, B:7:0x0010, B:10:0x0012, B:12:0x001a, B:13:0x001f, B:15:0x0021, B:17:0x002d, B:18:0x0032, B:20:0x0034, B:22:0x003c, B:23:0x0041, B:25:0x0043, B:27:0x0051, B:28:0x0062, B:30:0x0070, B:31:0x0081, B:33:0x008f, B:34:0x00a0, B:36:0x00ae, B:37:0x00bf, B:39:0x00cd, B:40:0x00db, B:42:0x00e9, B:43:0x00eb, B:45:0x00f1, B:49:0x00fa, B:50:0x00ff, B:52:0x0101, B:54:0x0109, B:57:0x0111, B:59:0x0132, B:62:0x0138, B:64:0x013c, B:67:0x0142, B:69:0x0146, B:71:0x014a, B:76:0x0297, B:77:0x029c, B:79:0x029e, B:81:0x02c0, B:83:0x02c4, B:85:0x02d4, B:86:0x0306, B:89:0x0338, B:90:0x036c, B:102:0x03c2, B:103:0x03f1, B:105:0x0409, B:106:0x0428, B:108:0x0430, B:109:0x0439, B:110:0x045e, B:114:0x0461, B:116:0x0471, B:117:0x047b, B:119:0x048d, B:120:0x04a6, B:122:0x0476, B:123:0x03c9, B:124:0x03d0, B:125:0x03d7, B:126:0x03de, B:127:0x03e4, B:128:0x03eb, B:129:0x0370, B:132:0x037a, B:135:0x0384, B:138:0x038e, B:141:0x0398, B:144:0x03a2, B:148:0x0301, B:149:0x04a8, B:150:0x04ad, B:152:0x023b, B:154:0x023f, B:155:0x0250, B:158:0x027b, B:160:0x027f, B:161:0x028f, B:162:0x0282, B:164:0x0289, B:165:0x0272, B:167:0x0277, B:168:0x0151, B:170:0x0155, B:171:0x015b, B:180:0x01a8, B:181:0x0219, B:183:0x021c, B:185:0x021f, B:187:0x0223, B:190:0x01b6, B:191:0x01e6, B:192:0x01c7, B:193:0x01da, B:194:0x01e9, B:195:0x0200, B:196:0x0210, B:197:0x015f, B:200:0x0169, B:203:0x0173, B:206:0x017d, B:209:0x0187, B:212:0x0191, B:216:0x022b, B:217:0x0231, B:218:0x04af, B:219:0x04b4), top: B:3:0x0007, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zzg(Map<String, String> map) {
        boolean z;
        int[] iArr;
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        synchronized (this.lock) {
            if (this.zzdnp == null) {
                zzds("Not an activity context. Cannot resize.");
                return;
            }
            if (this.zzdhu.zzadg() == null) {
                zzds("Webview is not yet available, size is not set.");
                return;
            }
            if (this.zzdhu.zzadg().zzaem()) {
                zzds("Is interstitial. Cannot resize an interstitial.");
                return;
            }
            if (this.zzdhu.zzadn()) {
                zzds("Cannot resize an expanded banner.");
                return;
            }
            if (!TextUtils.isEmpty(map.get("width"))) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                this.width = com.google.android.gms.ads.internal.util.zzm.zzeg(map.get("width"));
            }
            if (!TextUtils.isEmpty(map.get("height"))) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                this.height = com.google.android.gms.ads.internal.util.zzm.zzeg(map.get("height"));
            }
            if (!TextUtils.isEmpty(map.get("offsetX"))) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                this.zzdoe = com.google.android.gms.ads.internal.util.zzm.zzeg(map.get("offsetX"));
            }
            if (!TextUtils.isEmpty(map.get("offsetY"))) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                this.zzdof = com.google.android.gms.ads.internal.util.zzm.zzeg(map.get("offsetY"));
            }
            if (!TextUtils.isEmpty(map.get("allowOffscreen"))) {
                this.zzdob = Boolean.parseBoolean(map.get("allowOffscreen"));
            }
            String str = map.get("customClosePosition");
            if (!TextUtils.isEmpty(str)) {
                this.zzdoa = str;
            }
            if (!(this.width >= 0 && this.height >= 0)) {
                zzds("Invalid width and height options. Cannot resize.");
                return;
            }
            Window window = this.zzdnp.getWindow();
            if (window != null && window.getDecorView() != null) {
                com.google.android.gms.ads.internal.zzp.zzkq();
                int[] zzg = com.google.android.gms.ads.internal.util.zzm.zzg(this.zzdnp);
                com.google.android.gms.ads.internal.zzp.zzkq();
                int[] zzh = com.google.android.gms.ads.internal.util.zzm.zzh(this.zzdnp);
                int i7 = zzg[0];
                int i8 = zzg[1];
                char c2 = 65535;
                if (this.width >= 50 && this.width <= i7) {
                    if (this.height >= 50 && this.height <= i8) {
                        if (this.height == i8 && this.width == i7) {
                            com.google.android.gms.ads.internal.util.zzd.zzex("Cannot resize to a full-screen ad.");
                        } else {
                            if (this.zzdob) {
                                String str2 = this.zzdoa;
                                switch (str2.hashCode()) {
                                    case -1364013995:
                                        if (str2.equals("center")) {
                                            c = 2;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -1012429441:
                                        if (str2.equals("top-left")) {
                                            c = 0;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case -655373719:
                                        if (str2.equals("bottom-left")) {
                                            c = 3;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1163912186:
                                        if (str2.equals("bottom-right")) {
                                            c = 5;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1288627767:
                                        if (str2.equals("bottom-center")) {
                                            c = 4;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    case 1755462605:
                                        if (str2.equals("top-center")) {
                                            c = 1;
                                            break;
                                        }
                                        c = 65535;
                                        break;
                                    default:
                                        c = 65535;
                                        break;
                                }
                                if (c == 0) {
                                    i = this.zzdoc + this.zzdoe;
                                    i2 = this.zzdod;
                                    i3 = this.zzdof;
                                } else if (c != 1) {
                                    if (c != 2) {
                                        if (c == 3) {
                                            i = this.zzdoc + this.zzdoe;
                                            i5 = this.zzdod + this.zzdof;
                                            i6 = this.height;
                                        } else if (c == 4) {
                                            i = ((this.zzdoc + this.zzdoe) + (this.width / 2)) - 25;
                                            i5 = this.zzdod + this.zzdof;
                                            i6 = this.height;
                                        } else if (c == 5) {
                                            i = ((this.zzdoc + this.zzdoe) + this.width) - 50;
                                            i5 = this.zzdod + this.zzdof;
                                            i6 = this.height;
                                        } else {
                                            i = ((this.zzdoc + this.zzdoe) + this.width) - 50;
                                            i2 = this.zzdod;
                                            i3 = this.zzdof;
                                        }
                                        i4 = (i5 + i6) - 50;
                                    } else {
                                        i = ((this.zzdoc + this.zzdoe) + (this.width / 2)) - 25;
                                        i4 = ((this.zzdod + this.zzdof) + (this.height / 2)) - 25;
                                    }
                                    if (i >= 0) {
                                        if (i + 50 <= i7) {
                                            if (i4 >= zzh[0]) {
                                                if (i4 + 50 <= zzh[1]) {
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    i = ((this.zzdoc + this.zzdoe) + (this.width / 2)) - 25;
                                    i2 = this.zzdod;
                                    i3 = this.zzdof;
                                }
                                i4 = i2 + i3;
                                if (i >= 0) {
                                }
                            }
                            z = true;
                            if (z) {
                                iArr = null;
                            } else if (this.zzdob) {
                                iArr = new int[]{this.zzdoc + this.zzdoe, this.zzdod + this.zzdof};
                            } else {
                                com.google.android.gms.ads.internal.zzp.zzkq();
                                int[] zzg2 = com.google.android.gms.ads.internal.util.zzm.zzg(this.zzdnp);
                                com.google.android.gms.ads.internal.zzp.zzkq();
                                int[] zzh2 = com.google.android.gms.ads.internal.util.zzm.zzh(this.zzdnp);
                                int i9 = zzg2[0];
                                int i10 = this.zzdoc + this.zzdoe;
                                int i11 = this.zzdod + this.zzdof;
                                if (i10 < 0) {
                                    i10 = 0;
                                } else if (this.width + i10 > i9) {
                                    i10 = i9 - this.width;
                                }
                                if (i11 < zzh2[0]) {
                                    i11 = zzh2[0];
                                } else if (this.height + i11 > zzh2[1]) {
                                    i11 = zzh2[1] - this.height;
                                }
                                iArr = new int[]{i10, i11};
                            }
                            if (iArr != null) {
                                zzds("Resize location out of screen or close button is not visible.");
                                return;
                            }
                            zzwo.zzqm();
                            int zze = zzayd.zze(this.zzdnp, this.width);
                            zzwo.zzqm();
                            int zze2 = zzayd.zze(this.zzdnp, this.height);
                            ViewParent parent = this.zzdhu.getView().getParent();
                            if (parent != null && (parent instanceof ViewGroup)) {
                                ((ViewGroup) parent).removeView(this.zzdhu.getView());
                                if (this.zzdoj == null) {
                                    this.zzdol = (ViewGroup) parent;
                                    com.google.android.gms.ads.internal.zzp.zzkq();
                                    Bitmap zzm = com.google.android.gms.ads.internal.util.zzm.zzm(this.zzdhu.getView());
                                    ImageView imageView = new ImageView(this.zzdnp);
                                    this.zzdoh = imageView;
                                    imageView.setImageBitmap(zzm);
                                    this.zzdog = this.zzdhu.zzadg();
                                    this.zzdol.addView(this.zzdoh);
                                } else {
                                    this.zzdoj.dismiss();
                                }
                                RelativeLayout relativeLayout = new RelativeLayout(this.zzdnp);
                                this.zzdok = relativeLayout;
                                relativeLayout.setBackgroundColor(0);
                                this.zzdok.setLayoutParams(new ViewGroup.LayoutParams(zze, zze2));
                                com.google.android.gms.ads.internal.zzp.zzkq();
                                PopupWindow zza = com.google.android.gms.ads.internal.util.zzm.zza(this.zzdok, zze, zze2, false);
                                this.zzdoj = zza;
                                zza.setOutsideTouchable(true);
                                this.zzdoj.setTouchable(true);
                                this.zzdoj.setClippingEnabled(!this.zzdob);
                                this.zzdok.addView(this.zzdhu.getView(), -1, -1);
                                this.zzdoi = new LinearLayout(this.zzdnp);
                                zzwo.zzqm();
                                int zze3 = zzayd.zze(this.zzdnp, 50);
                                zzwo.zzqm();
                                RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(zze3, zzayd.zze(this.zzdnp, 50));
                                String str3 = this.zzdoa;
                                switch (str3.hashCode()) {
                                    case -1364013995:
                                        if (str3.equals("center")) {
                                            c2 = 2;
                                            break;
                                        }
                                        break;
                                    case -1012429441:
                                        if (str3.equals("top-left")) {
                                            c2 = 0;
                                            break;
                                        }
                                        break;
                                    case -655373719:
                                        if (str3.equals("bottom-left")) {
                                            c2 = 3;
                                            break;
                                        }
                                        break;
                                    case 1163912186:
                                        if (str3.equals("bottom-right")) {
                                            c2 = 5;
                                            break;
                                        }
                                        break;
                                    case 1288627767:
                                        if (str3.equals("bottom-center")) {
                                            c2 = 4;
                                            break;
                                        }
                                        break;
                                    case 1755462605:
                                        if (str3.equals("top-center")) {
                                            c2 = 1;
                                            break;
                                        }
                                        break;
                                }
                                if (c2 == 0) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(9);
                                } else if (c2 == 1) {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(14);
                                } else if (c2 == 2) {
                                    layoutParams.addRule(13);
                                } else if (c2 == 3) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(9);
                                } else if (c2 == 4) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(14);
                                } else if (c2 == 5) {
                                    layoutParams.addRule(12);
                                    layoutParams.addRule(11);
                                } else {
                                    layoutParams.addRule(10);
                                    layoutParams.addRule(11);
                                }
                                this.zzdoi.setOnClickListener(new zzapy(this));
                                this.zzdoi.setContentDescription("Close button");
                                this.zzdok.addView(this.zzdoi, layoutParams);
                                try {
                                    PopupWindow popupWindow = this.zzdoj;
                                    View decorView = window.getDecorView();
                                    zzwo.zzqm();
                                    int zze4 = zzayd.zze(this.zzdnp, iArr[0]);
                                    zzwo.zzqm();
                                    popupWindow.showAtLocation(decorView, 0, zze4, zzayd.zze(this.zzdnp, iArr[1]));
                                    int i12 = iArr[0];
                                    int i13 = iArr[1];
                                    if (this.zzdgz != null) {
                                        this.zzdgz.zzc(i12, i13, this.width, this.height);
                                    }
                                    this.zzdhu.zza(zzbew.zzq(zze, zze2));
                                    int i14 = iArr[0];
                                    int i15 = iArr[1];
                                    com.google.android.gms.ads.internal.zzp.zzkq();
                                    zza(i14, i15 - com.google.android.gms.ads.internal.util.zzm.zzh(this.zzdnp)[0], this.width, this.height);
                                    zzdu("resized");
                                    return;
                                } catch (RuntimeException e) {
                                    String valueOf = String.valueOf(e.getMessage());
                                    zzds(valueOf.length() != 0 ? "Cannot show popup window: ".concat(valueOf) : new String("Cannot show popup window: "));
                                    this.zzdok.removeView(this.zzdhu.getView());
                                    if (this.zzdol != null) {
                                        this.zzdol.removeView(this.zzdoh);
                                        this.zzdol.addView(this.zzdhu.getView());
                                        this.zzdhu.zza(this.zzdog);
                                    }
                                    return;
                                }
                            }
                            zzds("Webview is detached, probably in the middle of a resize or expand.");
                            return;
                        }
                        z = false;
                        if (z) {
                        }
                        if (iArr != null) {
                        }
                    }
                    com.google.android.gms.ads.internal.util.zzd.zzex("Height is too small or too large.");
                    z = false;
                    if (z) {
                    }
                    if (iArr != null) {
                    }
                }
                com.google.android.gms.ads.internal.util.zzd.zzex("Width is too small or too large.");
                z = false;
                if (z) {
                }
                if (iArr != null) {
                }
            }
            zzds("Activity context is not ready, cannot get window or decor view.");
        }
    }

    public final void zzac(boolean z) {
        synchronized (this.lock) {
            if (this.zzdoj != null) {
                this.zzdoj.dismiss();
                this.zzdok.removeView(this.zzdhu.getView());
                if (this.zzdol != null) {
                    this.zzdol.removeView(this.zzdoh);
                    this.zzdol.addView(this.zzdhu.getView());
                    this.zzdhu.zza(this.zzdog);
                }
                if (z) {
                    zzdu("default");
                    if (this.zzdgz != null) {
                        this.zzdgz.zzvq();
                    }
                }
                this.zzdoj = null;
                this.zzdok = null;
                this.zzdol = null;
                this.zzdoi = null;
            }
        }
    }

    public final void zza(int i, int i2, boolean z) {
        synchronized (this.lock) {
            this.zzdoc = i;
            this.zzdod = i2;
            PopupWindow popupWindow = this.zzdoj;
        }
    }

    public final boolean zzvo() {
        boolean z;
        synchronized (this.lock) {
            z = this.zzdoj != null;
        }
        return z;
    }

    public final void zzi(int i, int i2) {
        this.zzdoc = i;
        this.zzdod = i2;
    }
}
