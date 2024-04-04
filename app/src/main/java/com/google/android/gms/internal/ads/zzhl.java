package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.Pair;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzhl implements Handler.Callback, zzna, zznc, zzoj {
    private final Handler handler;
    private int repeatMode = 0;
    private int state = 1;
    private final zzhx[] zzaen;
    private final zzog zzaeo;
    private final Handler zzaeq;
    private final zzid zzaet;
    private final zzie zzaeu;
    private boolean zzaew;
    private boolean zzafa;
    private zzic zzafb;
    private zzhy zzaff;
    private zzhn zzafg;
    private final zzia[] zzafk;
    private final zzhw zzafl;
    private final zzpr zzafm;
    private final HandlerThread zzafn;
    private final zzhg zzafo;
    private zzhx zzafp;
    private zzpj zzafq;
    private zznd zzafr;
    private zzhx[] zzafs;
    private boolean zzaft;
    private boolean zzafu;
    private int zzafv;
    private int zzafw;
    private long zzafx;
    private int zzafy;
    private zzhq zzafz;
    private long zzaga;
    private zzho zzagb;
    private zzho zzagc;
    private zzho zzagd;

    public zzhl(zzhx[] zzhxVarArr, zzog zzogVar, zzhw zzhwVar, boolean z, int i, Handler handler, zzhn zzhnVar, zzhg zzhgVar) {
        this.zzaen = zzhxVarArr;
        this.zzaeo = zzogVar;
        this.zzafl = zzhwVar;
        this.zzaew = z;
        this.zzaeq = handler;
        this.zzafg = zzhnVar;
        this.zzafo = zzhgVar;
        this.zzafk = new zzia[zzhxVarArr.length];
        for (int i2 = 0; i2 < zzhxVarArr.length; i2++) {
            zzhxVarArr[i2].setIndex(i2);
            this.zzafk[i2] = zzhxVarArr[i2].zzdz();
        }
        this.zzafm = new zzpr();
        this.zzafs = new zzhx[0];
        this.zzaet = new zzid();
        this.zzaeu = new zzie();
        zzogVar.zza(this);
        this.zzaff = zzhy.zzahx;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.zzafn = handlerThread;
        handlerThread.start();
        this.handler = new Handler(this.zzafn.getLooper(), this);
    }

    public final void zza(zznd zzndVar, boolean z) {
        this.handler.obtainMessage(0, 1, 0, zzndVar).sendToTarget();
    }

    public final void zzg(boolean z) {
        this.handler.obtainMessage(1, z ? 1 : 0, 0).sendToTarget();
    }

    public final void zza(zzic zzicVar, int i, long j) {
        this.handler.obtainMessage(3, new zzhq(zzicVar, i, j)).sendToTarget();
    }

    public final void stop() {
        this.handler.sendEmptyMessage(5);
    }

    public final void zza(zzhh... zzhhVarArr) {
        if (this.zzaft) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        } else {
            this.zzafv++;
            this.handler.obtainMessage(11, zzhhVarArr).sendToTarget();
        }
    }

    public final synchronized void zzb(zzhh... zzhhVarArr) {
        if (this.zzaft) {
            Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
            return;
        }
        int i = this.zzafv;
        this.zzafv = i + 1;
        this.handler.obtainMessage(11, zzhhVarArr).sendToTarget();
        while (this.zzafw <= i) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public final synchronized void release() {
        if (this.zzaft) {
            return;
        }
        this.handler.sendEmptyMessage(6);
        while (!this.zzaft) {
            try {
                wait();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
        this.zzafn.quit();
    }

    @Override // com.google.android.gms.internal.ads.zznc
    public final void zzb(zzic zzicVar, Object obj) {
        this.handler.obtainMessage(7, Pair.create(zzicVar, obj)).sendToTarget();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.gms.internal.ads.zzna
    public final void zza(zznb zznbVar) {
        this.handler.obtainMessage(8, zznbVar).sendToTarget();
    }

    @Override // com.google.android.gms.internal.ads.zzoj
    public final void zzep() {
        this.handler.sendEmptyMessage(10);
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0287 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x028e A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x028a A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:319:0x0718 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:378:0x07d1  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x059d A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:415:0x05b9 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, LOOP:9: B:415:0x05b9->B:419:0x05cb, LOOP_START, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x052c A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:498:0x054d  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x058b A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:503:0x0550 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:504:0x0533 A[Catch: IOException -> 0x089e, zzhd -> 0x08a3, RuntimeException -> 0x08a8, TryCatch #1 {RuntimeException -> 0x08a8, blocks: (B:3:0x0005, B:9:0x0019, B:11:0x0021, B:13:0x0028, B:16:0x002f, B:20:0x0036, B:23:0x0048, B:25:0x004e, B:28:0x0057, B:32:0x005f, B:37:0x0061, B:39:0x0065, B:40:0x006c, B:42:0x0076, B:44:0x007a, B:46:0x007e, B:47:0x0091, B:50:0x0097, B:56:0x0024, B:57:0x009b, B:67:0x00b9, B:76:0x00c7, B:79:0x00ca, B:83:0x00d4, B:88:0x00d8, B:89:0x00d9, B:91:0x00dd, B:93:0x00e2, B:95:0x00e8, B:97:0x00ee, B:101:0x00f3, B:105:0x00f8, B:108:0x0101, B:110:0x012b, B:111:0x0132, B:112:0x0139, B:114:0x013e, B:117:0x014b, B:119:0x0155, B:120:0x0157, B:122:0x015b, B:124:0x0161, B:127:0x0167, B:128:0x016e, B:129:0x0172, B:132:0x0179, B:134:0x017d, B:131:0x0182, B:140:0x0185, B:141:0x01c0, B:143:0x0194, B:145:0x019a, B:147:0x01a0, B:149:0x01aa, B:154:0x01cc, B:156:0x01d4, B:159:0x01db, B:161:0x01df, B:163:0x01e7, B:166:0x01ee, B:168:0x0201, B:169:0x020f, B:171:0x0213, B:173:0x0223, B:175:0x0227, B:177:0x0235, B:179:0x023a, B:180:0x0283, B:182:0x0287, B:184:0x028e, B:186:0x0298, B:188:0x02a2, B:189:0x02a7, B:190:0x02cf, B:192:0x02d3, B:196:0x02e0, B:200:0x02e3, B:201:0x02f0, B:204:0x02fe, B:206:0x0304, B:208:0x0317, B:210:0x031b, B:212:0x032b, B:214:0x033d, B:218:0x034b, B:223:0x0350, B:224:0x0364, B:228:0x036b, B:229:0x028a, B:230:0x0252, B:232:0x025a, B:234:0x0262, B:235:0x0267, B:237:0x036f, B:238:0x037a, B:247:0x0385, B:248:0x0386, B:250:0x038a, B:252:0x0392, B:253:0x039f, B:255:0x0399, B:256:0x03ab, B:258:0x03b3, B:260:0x03bc, B:262:0x03c2, B:263:0x03e0, B:266:0x03e9, B:273:0x040c, B:276:0x041a, B:283:0x0430, B:286:0x043e, B:291:0x0449, B:294:0x0458, B:295:0x0461, B:298:0x0462, B:300:0x046a, B:301:0x06c9, B:303:0x06cf, B:305:0x06d7, B:307:0x06f2, B:309:0x06fd, B:312:0x0706, B:314:0x070c, B:319:0x0718, B:324:0x0722, B:331:0x0729, B:332:0x072c, B:334:0x0730, B:336:0x073e, B:337:0x0751, B:341:0x076a, B:343:0x0772, B:345:0x0778, B:346:0x0802, B:348:0x0806, B:350:0x080b, B:352:0x0813, B:354:0x0817, B:356:0x0820, B:357:0x0836, B:358:0x081c, B:360:0x0826, B:362:0x082b, B:363:0x0831, B:364:0x0782, B:366:0x0787, B:369:0x078e, B:371:0x0796, B:374:0x07a9, B:380:0x07db, B:382:0x07e3, B:383:0x07b1, B:384:0x07bf, B:385:0x079b, B:387:0x07d5, B:388:0x07e7, B:390:0x07ec, B:394:0x07f8, B:395:0x07f2, B:396:0x0472, B:398:0x0476, B:399:0x04b9, B:401:0x04c1, B:403:0x0599, B:405:0x059d, B:408:0x05a6, B:410:0x05aa, B:412:0x05ae, B:413:0x05b5, B:415:0x05b9, B:417:0x05bf, B:419:0x05cb, B:421:0x05f6, B:424:0x05fd, B:426:0x0602, B:428:0x060e, B:430:0x0614, B:432:0x061a, B:434:0x061d, B:440:0x0621, B:442:0x0626, B:445:0x0638, B:450:0x0640, B:454:0x0643, B:456:0x0649, B:458:0x0651, B:462:0x0672, B:464:0x0677, B:467:0x0685, B:469:0x068b, B:471:0x069b, B:473:0x06a1, B:475:0x06aa, B:477:0x06b3, B:481:0x06c3, B:479:0x06c6, B:487:0x05b2, B:488:0x04c9, B:490:0x04cd, B:492:0x0528, B:494:0x052c, B:496:0x0549, B:499:0x0557, B:501:0x058b, B:502:0x058f, B:503:0x0550, B:504:0x0533, B:505:0x04d3, B:508:0x04e4, B:510:0x0517, B:511:0x047b, B:513:0x0485, B:515:0x048d, B:518:0x049c, B:520:0x04a0, B:522:0x04ad, B:523:0x083a, B:526:0x0842, B:528:0x0848, B:530:0x084f, B:532:0x0854, B:533:0x085d, B:535:0x0861, B:537:0x0867, B:540:0x0873, B:542:0x0882, B:543:0x088e), top: B:2:0x0005 }] */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean handleMessage(Message message) {
        int i;
        IOException iOException;
        int i2;
        zzhd zzhdVar;
        int zza;
        long j;
        int i3;
        int i4;
        boolean zzdr;
        long zzhr;
        boolean zzc;
        boolean z;
        zzhy zzb;
        int i5;
        zzho zzhoVar;
        try {
            try {
                long j2 = 0;
                int i6 = 0;
                try {
                    switch (message.what) {
                        case 0:
                            zznd zzndVar = (zznd) message.obj;
                            boolean z2 = message.arg1 != 0;
                            this.zzaeq.sendEmptyMessage(0);
                            zzi(true);
                            this.zzafl.zzfb();
                            if (z2) {
                                this.zzafg = new zzhn(0, -9223372036854775807L);
                            }
                            this.zzafr = zzndVar;
                            zzndVar.zza(this.zzafo, true, this);
                            setState(2);
                            this.handler.sendEmptyMessage(2);
                            return true;
                        case 1:
                            boolean z3 = message.arg1 != 0;
                            this.zzafu = false;
                            this.zzaew = z3;
                            if (!z3) {
                                zzer();
                                zzes();
                            } else if (this.state == 3) {
                                zzeq();
                                this.handler.sendEmptyMessage(2);
                            } else if (this.state == 2) {
                                this.handler.sendEmptyMessage(2);
                            }
                            return true;
                        case 2:
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            if (this.zzafb == null) {
                                this.zzafr.zzhz();
                                j = elapsedRealtime;
                            } else {
                                if (this.zzagb == null) {
                                    zza = this.zzafg.zzagf;
                                } else {
                                    int i7 = this.zzagb.zzagf;
                                    if (!this.zzagb.zzago && this.zzagb.zzex() && this.zzafb.zza(i7, this.zzaeu, false).zzaim != -9223372036854775807L && (this.zzagd == null || this.zzagb.index - this.zzagd.index != 100)) {
                                        zza = this.zzafb.zza(i7, this.zzaeu, this.zzaet, this.repeatMode);
                                    }
                                    j = elapsedRealtime;
                                    if (this.zzagb != null && !this.zzagb.zzex()) {
                                        if (this.zzagb != null && !this.zzafa) {
                                            zzev();
                                        }
                                        if (this.zzagd != null) {
                                            while (this.zzagd != this.zzagc && this.zzaga >= this.zzagd.zzagr.zzagn) {
                                                this.zzagd.release();
                                                zzb(this.zzagd.zzagr);
                                                this.zzafg = new zzhn(this.zzagd.zzagf, this.zzagd.zzagg);
                                                zzes();
                                                this.zzaeq.obtainMessage(5, this.zzafg).sendToTarget();
                                            }
                                            if (this.zzagc.zzago) {
                                                for (int i8 = 0; i8 < this.zzaen.length; i8++) {
                                                    zzhx zzhxVar = this.zzaen[i8];
                                                    zznm zznmVar = this.zzagc.zzagl[i8];
                                                    if (zznmVar != null && zzhxVar.zzeb() == zznmVar && zzhxVar.zzec()) {
                                                        zzhxVar.zzed();
                                                    }
                                                }
                                            } else {
                                                while (true) {
                                                    if (i3 < this.zzaen.length) {
                                                        zzhx zzhxVar2 = this.zzaen[i3];
                                                        zznm zznmVar2 = this.zzagc.zzagl[i3];
                                                        i3 = (zzhxVar2.zzeb() == zznmVar2 && (zznmVar2 == null || zzhxVar2.zzec())) ? i3 + 1 : 0;
                                                    } else if (this.zzagc.zzagr != null && this.zzagc.zzagr.zzagp) {
                                                        zzoi zzoiVar = this.zzagc.zzags;
                                                        zzho zzhoVar2 = this.zzagc.zzagr;
                                                        this.zzagc = zzhoVar2;
                                                        zzoi zzoiVar2 = zzhoVar2.zzags;
                                                        boolean z4 = this.zzagc.zzagj.zzhq() != -9223372036854775807L;
                                                        for (int i9 = 0; i9 < this.zzaen.length; i9++) {
                                                            zzhx zzhxVar3 = this.zzaen[i9];
                                                            if (zzoiVar.zzbhv.zzbe(i9) != null) {
                                                                if (!z4) {
                                                                    if (!zzhxVar3.zzee()) {
                                                                        zzof zzbe = zzoiVar2.zzbhv.zzbe(i9);
                                                                        zzhz zzhzVar = zzoiVar.zzbhx[i9];
                                                                        zzhz zzhzVar2 = zzoiVar2.zzbhx[i9];
                                                                        if (zzbe != null && zzhzVar2.equals(zzhzVar)) {
                                                                            int length = zzbe.length();
                                                                            zzhs[] zzhsVarArr = new zzhs[length];
                                                                            for (int i10 = 0; i10 < length; i10++) {
                                                                                zzhsVarArr[i10] = zzbe.zzbb(i10);
                                                                            }
                                                                            zzhxVar3.zza(zzhsVarArr, this.zzagc.zzagl[i9], this.zzagc.zzew());
                                                                        }
                                                                    }
                                                                }
                                                                zzhxVar3.zzed();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    zzh(false);
                                    if (this.zzagd != null) {
                                    }
                                }
                                if (zza >= this.zzafb.zzfg()) {
                                    this.zzafr.zzhz();
                                    j = elapsedRealtime;
                                    if (this.zzagb != null) {
                                        if (this.zzagb != null) {
                                            zzev();
                                        }
                                        if (this.zzagd != null) {
                                        }
                                    }
                                    zzh(false);
                                    if (this.zzagd != null) {
                                    }
                                } else {
                                    if (this.zzagb == null) {
                                        j2 = this.zzafg.zzagh;
                                    } else {
                                        this.zzafb.zza(zza, this.zzaeu, false);
                                        this.zzafb.zza(0, this.zzaet, false);
                                        if (zza == 0) {
                                            j = elapsedRealtime;
                                            Pair<Integer, Long> zza2 = zza(this.zzafb, 0, -9223372036854775807L, Math.max(0L, (this.zzagb.zzew() + this.zzafb.zza(this.zzagb.zzagf, this.zzaeu, false).zzaim) - this.zzaga));
                                            if (zza2 != null) {
                                                int intValue = ((Integer) zza2.first).intValue();
                                                j2 = ((Long) zza2.second).longValue();
                                                zza = intValue;
                                                long zzew = this.zzagb != null ? 60000000 + j2 : this.zzagb.zzew() + this.zzafb.zza(this.zzagb.zzagf, this.zzaeu, false).zzaim;
                                                int i11 = this.zzagb != null ? 0 : this.zzagb.index + 1;
                                                boolean zzu = zzu(zza);
                                                this.zzafb.zza(zza, this.zzaeu, true);
                                                zzho zzhoVar3 = new zzho(this.zzaen, this.zzafk, zzew, this.zzaeo, this.zzafl, this.zzafr, this.zzaeu.zzagk, i11, zza, zzu, j2);
                                                if (this.zzagb != null) {
                                                    this.zzagb.zzagr = zzhoVar3;
                                                }
                                                this.zzagb = zzhoVar3;
                                                zzhoVar3.zzagj.zza(this, j2);
                                                zzh(true);
                                            }
                                            if (this.zzagb != null) {
                                            }
                                            zzh(false);
                                            if (this.zzagd != null) {
                                            }
                                        }
                                    }
                                    j = elapsedRealtime;
                                    long zzew2 = this.zzagb != null ? 60000000 + j2 : this.zzagb.zzew() + this.zzafb.zza(this.zzagb.zzagf, this.zzaeu, false).zzaim;
                                    if (this.zzagb != null) {
                                    }
                                    boolean zzu2 = zzu(zza);
                                    this.zzafb.zza(zza, this.zzaeu, true);
                                    zzho zzhoVar32 = new zzho(this.zzaen, this.zzafk, zzew2, this.zzaeo, this.zzafl, this.zzafr, this.zzaeu.zzagk, i11, zza, zzu2, j2);
                                    if (this.zzagb != null) {
                                    }
                                    this.zzagb = zzhoVar32;
                                    zzhoVar32.zzagj.zza(this, j2);
                                    zzh(true);
                                    if (this.zzagb != null) {
                                    }
                                    zzh(false);
                                    if (this.zzagd != null) {
                                    }
                                }
                            }
                            if (this.zzagd == null) {
                                zzeu();
                                zza(j, 10L);
                            } else {
                                zzpt.beginSection("doSomeWork");
                                zzes();
                                this.zzagd.zzagj.zzef(this.zzafg.zzagh);
                                boolean z5 = true;
                                boolean z6 = true;
                                for (zzhx zzhxVar4 : this.zzafs) {
                                    zzhxVar4.zzb(this.zzaga, this.zzafx);
                                    z6 = z6 && zzhxVar4.zzfe();
                                    if (!zzhxVar4.isReady() && !zzhxVar4.zzfe()) {
                                        z = false;
                                        if (!z) {
                                            zzhxVar4.zzef();
                                        }
                                        z5 = !z5 && z;
                                    }
                                    z = true;
                                    if (!z) {
                                    }
                                    if (z5) {
                                    }
                                }
                                if (!z5) {
                                    zzeu();
                                }
                                if (this.zzafq != null) {
                                    zzhy zzfs = this.zzafq.zzfs();
                                    if (!zzfs.equals(this.zzaff)) {
                                        this.zzaff = zzfs;
                                        this.zzafm.zza(this.zzafq);
                                        this.zzaeq.obtainMessage(7, zzfs).sendToTarget();
                                    }
                                }
                                long j3 = this.zzafb.zza(this.zzagd.zzagf, this.zzaeu, false).zzaim;
                                if (z6 && ((j3 == -9223372036854775807L || j3 <= this.zzafg.zzagh) && this.zzagd.zzago)) {
                                    setState(4);
                                    zzer();
                                    i4 = 2;
                                } else {
                                    i4 = 2;
                                    if (this.state == 2) {
                                        if (this.zzafs.length > 0) {
                                            if (z5) {
                                                boolean z7 = this.zzafu;
                                                if (!this.zzagb.zzagp) {
                                                    zzhr = this.zzagb.zzagg;
                                                } else {
                                                    zzhr = this.zzagb.zzagj.zzhr();
                                                }
                                                if (zzhr == Long.MIN_VALUE) {
                                                    if (this.zzagb.zzago) {
                                                        zzc = true;
                                                        if (zzc) {
                                                            zzdr = true;
                                                        }
                                                    } else {
                                                        zzhr = this.zzafb.zza(this.zzagb.zzagf, this.zzaeu, false).zzaim;
                                                    }
                                                }
                                                zzc = this.zzafl.zzc(zzhr - (this.zzaga - this.zzagb.zzew()), z7);
                                                if (zzc) {
                                                }
                                            }
                                            zzdr = false;
                                        } else {
                                            zzdr = zzdr(j3);
                                        }
                                        if (zzdr) {
                                            setState(3);
                                            if (this.zzaew) {
                                                zzeq();
                                            }
                                        }
                                    } else if (this.state == 3) {
                                        if (this.zzafs.length <= 0) {
                                            z5 = zzdr(j3);
                                        }
                                        if (!z5) {
                                            this.zzafu = this.zzaew;
                                            setState(2);
                                            zzer();
                                        }
                                    }
                                }
                                if (this.state == i4) {
                                    zzhx[] zzhxVarArr = this.zzafs;
                                    int length2 = zzhxVarArr.length;
                                    while (i6 < length2) {
                                        zzhxVarArr[i6].zzef();
                                        i6++;
                                    }
                                }
                                if ((this.zzaew && this.state == 3) || this.state == i4) {
                                    zza(j, 10L);
                                } else if (this.zzafs.length != 0) {
                                    zza(j, 1000L);
                                } else {
                                    this.handler.removeMessages(i4);
                                }
                                zzpt.endSection();
                            }
                            return true;
                        case 3:
                            zzhq zzhqVar = (zzhq) message.obj;
                            if (this.zzafb == null) {
                                this.zzafy++;
                                this.zzafz = zzhqVar;
                            } else {
                                Pair<Integer, Long> zza3 = zza(zzhqVar);
                                if (zza3 == null) {
                                    zzhn zzhnVar = new zzhn(0, 0L);
                                    this.zzafg = zzhnVar;
                                    this.zzaeq.obtainMessage(4, 1, 0, zzhnVar).sendToTarget();
                                    this.zzafg = new zzhn(0, -9223372036854775807L);
                                    setState(4);
                                    zzi(false);
                                } else {
                                    boolean z8 = zzhqVar.zzagw == -9223372036854775807L;
                                    int intValue2 = ((Integer) zza3.first).intValue();
                                    long longValue = ((Long) zza3.second).longValue();
                                    try {
                                        if (intValue2 != this.zzafg.zzagf || longValue / 1000 != this.zzafg.zzagh / 1000) {
                                            long zzb2 = zzb(intValue2, longValue);
                                            boolean z9 = z8 | (longValue != zzb2);
                                            this.zzafg = new zzhn(intValue2, zzb2);
                                            this.zzaeq.obtainMessage(4, z9 ? 1 : 0, 0, this.zzafg).sendToTarget();
                                        }
                                    } finally {
                                        this.zzafg = new zzhn(intValue2, longValue);
                                        this.zzaeq.obtainMessage(4, z8 ? 1 : 0, 0, this.zzafg).sendToTarget();
                                    }
                                }
                            }
                            return true;
                        case 4:
                            zzhy zzhyVar = (zzhy) message.obj;
                            if (this.zzafq != null) {
                                zzb = this.zzafq.zzb(zzhyVar);
                            } else {
                                zzb = this.zzafm.zzb(zzhyVar);
                            }
                            this.zzaff = zzb;
                            this.zzaeq.obtainMessage(7, zzb).sendToTarget();
                            return true;
                        case 5:
                            zzet();
                            return true;
                        case 6:
                            zzi(true);
                            this.zzafl.zzfc();
                            setState(1);
                            synchronized (this) {
                                this.zzaft = true;
                                notifyAll();
                            }
                            return true;
                        case 7:
                            Pair pair = (Pair) message.obj;
                            zzic zzicVar = this.zzafb;
                            this.zzafb = (zzic) pair.first;
                            Object obj = pair.second;
                            if (zzicVar == null) {
                                if (this.zzafy > 0) {
                                    Pair<Integer, Long> zza4 = zza(this.zzafz);
                                    i5 = this.zzafy;
                                    this.zzafy = 0;
                                    this.zzafz = null;
                                    if (zza4 == null) {
                                        zza(obj, i5);
                                    } else {
                                        this.zzafg = new zzhn(((Integer) zza4.first).intValue(), ((Long) zza4.second).longValue());
                                        zzhoVar = this.zzagd == null ? this.zzagd : this.zzagb;
                                        if (zzhoVar != null) {
                                            int zzc2 = this.zzafb.zzc(zzhoVar.zzagk);
                                            if (zzc2 == -1) {
                                                int zza5 = zza(zzhoVar.zzagf, zzicVar, this.zzafb);
                                                if (zza5 == -1) {
                                                    zza(obj, i5);
                                                } else {
                                                    this.zzafb.zza(zza5, this.zzaeu, false);
                                                    Pair<Integer, Long> zzc3 = zzc(0, -9223372036854775807L);
                                                    int intValue3 = ((Integer) zzc3.first).intValue();
                                                    long longValue2 = ((Long) zzc3.second).longValue();
                                                    this.zzafb.zza(intValue3, this.zzaeu, true);
                                                    Object obj2 = this.zzaeu.zzagk;
                                                    zzhoVar.zzagf = -1;
                                                    while (zzhoVar.zzagr != null) {
                                                        zzhoVar = zzhoVar.zzagr;
                                                        zzhoVar.zzagf = zzhoVar.zzagk.equals(obj2) ? intValue3 : -1;
                                                    }
                                                    this.zzafg = new zzhn(intValue3, zzb(intValue3, longValue2));
                                                }
                                            } else {
                                                zzhoVar.zzc(zzc2, zzu(zzc2));
                                                boolean z10 = zzhoVar == this.zzagc;
                                                if (zzc2 != this.zzafg.zzagf) {
                                                    zzhn zzhnVar2 = this.zzafg;
                                                    zzhn zzhnVar3 = new zzhn(zzc2, zzhnVar2.zzagg);
                                                    zzhnVar3.zzagh = zzhnVar2.zzagh;
                                                    zzhnVar3.zzagi = zzhnVar2.zzagi;
                                                    this.zzafg = zzhnVar3;
                                                }
                                                while (zzhoVar.zzagr != null) {
                                                    zzho zzhoVar4 = zzhoVar.zzagr;
                                                    zzc2 = this.zzafb.zza(zzc2, this.zzaeu, this.zzaet, this.repeatMode);
                                                    if (zzc2 != -1 && zzhoVar4.zzagk.equals(this.zzafb.zza(zzc2, this.zzaeu, true).zzagk)) {
                                                        zzhoVar4.zzc(zzc2, zzu(zzc2));
                                                        z10 |= zzhoVar4 == this.zzagc;
                                                        zzhoVar = zzhoVar4;
                                                    } else if (!z10) {
                                                        int i12 = this.zzagd.zzagf;
                                                        this.zzafg = new zzhn(i12, zzb(i12, this.zzafg.zzagh));
                                                    } else {
                                                        this.zzagb = zzhoVar;
                                                        zzhoVar.zzagr = null;
                                                        zza(zzhoVar4);
                                                    }
                                                }
                                            }
                                        }
                                        zzb(obj, i5);
                                    }
                                } else if (this.zzafg.zzagg == -9223372036854775807L) {
                                    if (this.zzafb.isEmpty()) {
                                        zza(obj, 0);
                                    } else {
                                        Pair<Integer, Long> zzc4 = zzc(0, -9223372036854775807L);
                                        this.zzafg = new zzhn(((Integer) zzc4.first).intValue(), ((Long) zzc4.second).longValue());
                                    }
                                }
                                return true;
                            }
                            i5 = 0;
                            if (this.zzagd == null) {
                            }
                            if (zzhoVar != null) {
                            }
                            zzb(obj, i5);
                            return true;
                        case 8:
                            zznb zznbVar = (zznb) message.obj;
                            if (this.zzagb != null && this.zzagb.zzagj == zznbVar) {
                                zzho zzhoVar5 = this.zzagb;
                                zzhoVar5.zzagp = true;
                                zzhoVar5.zzey();
                                zzhoVar5.zzagg = zzhoVar5.zzb(zzhoVar5.zzagg, false);
                                if (this.zzagd == null) {
                                    zzho zzhoVar6 = this.zzagb;
                                    this.zzagc = zzhoVar6;
                                    zzdq(zzhoVar6.zzagg);
                                    zzb(this.zzagc);
                                }
                                zzev();
                            }
                            return true;
                        case 9:
                            zznb zznbVar2 = (zznb) message.obj;
                            if (this.zzagb != null && this.zzagb.zzagj == zznbVar2) {
                                zzev();
                            }
                            return true;
                        case 10:
                            if (this.zzagd != null) {
                                zzho zzhoVar7 = this.zzagd;
                                boolean z11 = true;
                                while (true) {
                                    if (zzhoVar7 != null && zzhoVar7.zzagp) {
                                        if (!zzhoVar7.zzey()) {
                                            if (zzhoVar7 == this.zzagc) {
                                                z11 = false;
                                            }
                                            zzhoVar7 = zzhoVar7.zzagr;
                                        } else {
                                            if (z11) {
                                                boolean z12 = this.zzagc != this.zzagd;
                                                zza(this.zzagd.zzagr);
                                                this.zzagd.zzagr = null;
                                                this.zzagb = this.zzagd;
                                                this.zzagc = this.zzagd;
                                                boolean[] zArr = new boolean[this.zzaen.length];
                                                long zza6 = this.zzagd.zza(this.zzafg.zzagh, z12, zArr);
                                                if (zza6 != this.zzafg.zzagh) {
                                                    this.zzafg.zzagh = zza6;
                                                    zzdq(zza6);
                                                }
                                                boolean[] zArr2 = new boolean[this.zzaen.length];
                                                int i13 = 0;
                                                for (int i14 = 0; i14 < this.zzaen.length; i14++) {
                                                    zzhx zzhxVar5 = this.zzaen[i14];
                                                    zArr2[i14] = zzhxVar5.getState() != 0;
                                                    zznm zznmVar3 = this.zzagd.zzagl[i14];
                                                    if (zznmVar3 != null) {
                                                        i13++;
                                                    }
                                                    if (zArr2[i14]) {
                                                        if (zznmVar3 != zzhxVar5.zzeb()) {
                                                            if (zzhxVar5 == this.zzafp) {
                                                                if (zznmVar3 == null) {
                                                                    this.zzafm.zza(this.zzafq);
                                                                }
                                                                this.zzafq = null;
                                                                this.zzafp = null;
                                                            }
                                                            zza(zzhxVar5);
                                                            zzhxVar5.disable();
                                                        } else if (zArr[i14]) {
                                                            zzhxVar5.zzdm(this.zzaga);
                                                        }
                                                    }
                                                }
                                                this.zzaeq.obtainMessage(3, zzhoVar7.zzags).sendToTarget();
                                                zza(zArr2, i13);
                                            } else {
                                                this.zzagb = zzhoVar7;
                                                for (zzho zzhoVar8 = zzhoVar7.zzagr; zzhoVar8 != null; zzhoVar8 = zzhoVar8.zzagr) {
                                                    zzhoVar8.release();
                                                }
                                                this.zzagb.zzagr = null;
                                                if (this.zzagb.zzagp) {
                                                    this.zzagb.zzb(Math.max(this.zzagb.zzagg, this.zzaga - this.zzagb.zzew()), false);
                                                }
                                            }
                                            zzev();
                                            zzes();
                                            this.handler.sendEmptyMessage(2);
                                        }
                                    }
                                }
                            }
                            return true;
                        case 11:
                            zzhh[] zzhhVarArr = (zzhh[]) message.obj;
                            try {
                                int length3 = zzhhVarArr.length;
                                while (i6 < length3) {
                                    zzhh zzhhVar = zzhhVarArr[i6];
                                    zzhhVar.zzaek.zza(zzhhVar.zzael, zzhhVar.zzaem);
                                    i6++;
                                }
                                if (this.zzafr != null) {
                                    this.handler.sendEmptyMessage(2);
                                }
                                synchronized (this) {
                                    this.zzafw++;
                                    notifyAll();
                                }
                                return true;
                            } catch (Throwable th) {
                                synchronized (this) {
                                    this.zzafw++;
                                    notifyAll();
                                    throw th;
                                }
                            }
                        case 12:
                            int i15 = message.arg1;
                            this.repeatMode = i15;
                            zzho zzhoVar9 = this.zzagd != null ? this.zzagd : this.zzagb;
                            if (zzhoVar9 != null) {
                                boolean z13 = zzhoVar9 == this.zzagc;
                                boolean z14 = zzhoVar9 == this.zzagb;
                                while (true) {
                                    int zza7 = this.zzafb.zza(zzhoVar9.zzagf, this.zzaeu, this.zzaet, i15);
                                    if (zzhoVar9.zzagr != null && zza7 != -1 && zzhoVar9.zzagr.zzagf == zza7) {
                                        zzhoVar9 = zzhoVar9.zzagr;
                                        z13 |= zzhoVar9 == this.zzagc;
                                        z14 |= zzhoVar9 == this.zzagb;
                                    }
                                }
                                if (zzhoVar9.zzagr != null) {
                                    zza(zzhoVar9.zzagr);
                                    zzhoVar9.zzagr = null;
                                }
                                zzhoVar9.zzago = zzu(zzhoVar9.zzagf);
                                if (!z14) {
                                    this.zzagb = zzhoVar9;
                                }
                                if (!z13 && this.zzagd != null) {
                                    int i16 = this.zzagd.zzagf;
                                    this.zzafg = new zzhn(i16, zzb(i16, this.zzafg.zzagh));
                                }
                                if (this.state == 4 && i15 != 0) {
                                    setState(2);
                                }
                            }
                            return true;
                        default:
                            return false;
                    }
                } catch (zzhd e) {
                    zzhdVar = e;
                    i2 = 8;
                    Log.e("ExoPlayerImplInternal", "Renderer error.", zzhdVar);
                    this.zzaeq.obtainMessage(i2, zzhdVar).sendToTarget();
                    zzet();
                    return true;
                } catch (IOException e2) {
                    iOException = e2;
                    i = 8;
                    Log.e("ExoPlayerImplInternal", "Source error.", iOException);
                    this.zzaeq.obtainMessage(i, zzhd.zza(iOException)).sendToTarget();
                    zzet();
                    return true;
                }
            } catch (zzhd e3) {
                i2 = 8;
                zzhdVar = e3;
            } catch (IOException e4) {
                i = 8;
                iOException = e4;
            }
        } catch (RuntimeException e5) {
            Log.e("ExoPlayerImplInternal", "Internal runtime error.", e5);
            this.zzaeq.obtainMessage(8, zzhd.zza(e5)).sendToTarget();
            zzet();
            return true;
        }
    }

    private final void setState(int i) {
        if (this.state != i) {
            this.state = i;
            this.zzaeq.obtainMessage(1, i, 0).sendToTarget();
        }
    }

    private final void zzh(boolean z) {
        if (this.zzafa != z) {
            this.zzafa = z;
            this.zzaeq.obtainMessage(2, z ? 1 : 0, 0).sendToTarget();
        }
    }

    private final void zzeq() throws zzhd {
        this.zzafu = false;
        this.zzafm.start();
        for (zzhx zzhxVar : this.zzafs) {
            zzhxVar.start();
        }
    }

    private final void zzer() throws zzhd {
        this.zzafm.stop();
        for (zzhx zzhxVar : this.zzafs) {
            zza(zzhxVar);
        }
    }

    private final void zzes() throws zzhd {
        zzho zzhoVar = this.zzagd;
        if (zzhoVar == null) {
            return;
        }
        long zzhq = zzhoVar.zzagj.zzhq();
        if (zzhq != -9223372036854775807L) {
            zzdq(zzhq);
        } else {
            zzhx zzhxVar = this.zzafp;
            if (zzhxVar != null && !zzhxVar.zzfe()) {
                long zzgc = this.zzafq.zzgc();
                this.zzaga = zzgc;
                this.zzafm.zzel(zzgc);
            } else {
                this.zzaga = this.zzafm.zzgc();
            }
            zzhq = this.zzaga - this.zzagd.zzew();
        }
        this.zzafg.zzagh = zzhq;
        this.zzafx = SystemClock.elapsedRealtime() * 1000;
        long zzhr = this.zzafs.length == 0 ? Long.MIN_VALUE : this.zzagd.zzagj.zzhr();
        zzhn zzhnVar = this.zzafg;
        if (zzhr == Long.MIN_VALUE) {
            zzhr = this.zzafb.zza(this.zzagd.zzagf, this.zzaeu, false).zzaim;
        }
        zzhnVar.zzagi = zzhr;
    }

    private final void zza(long j, long j2) {
        this.handler.removeMessages(2);
        long elapsedRealtime = (j + j2) - SystemClock.elapsedRealtime();
        if (elapsedRealtime <= 0) {
            this.handler.sendEmptyMessage(2);
        } else {
            this.handler.sendEmptyMessageDelayed(2, elapsedRealtime);
        }
    }

    private final long zzb(int i, long j) throws zzhd {
        zzho zzhoVar;
        zzer();
        this.zzafu = false;
        setState(2);
        zzho zzhoVar2 = this.zzagd;
        if (zzhoVar2 == null) {
            zzho zzhoVar3 = this.zzagb;
            if (zzhoVar3 != null) {
                zzhoVar3.release();
            }
            zzhoVar = null;
        } else {
            zzhoVar = null;
            while (zzhoVar2 != null) {
                if (zzhoVar2.zzagf == i && zzhoVar2.zzagp) {
                    zzhoVar = zzhoVar2;
                } else {
                    zzhoVar2.release();
                }
                zzhoVar2 = zzhoVar2.zzagr;
            }
        }
        zzho zzhoVar4 = this.zzagd;
        if (zzhoVar4 != zzhoVar || zzhoVar4 != this.zzagc) {
            for (zzhx zzhxVar : this.zzafs) {
                zzhxVar.disable();
            }
            this.zzafs = new zzhx[0];
            this.zzafq = null;
            this.zzafp = null;
            this.zzagd = null;
        }
        if (zzhoVar != null) {
            zzhoVar.zzagr = null;
            this.zzagb = zzhoVar;
            this.zzagc = zzhoVar;
            zzb(zzhoVar);
            if (this.zzagd.zzagq) {
                j = this.zzagd.zzagj.zzeg(j);
            }
            zzdq(j);
            zzev();
        } else {
            this.zzagb = null;
            this.zzagc = null;
            this.zzagd = null;
            zzdq(j);
        }
        this.handler.sendEmptyMessage(2);
        return j;
    }

    private final void zzdq(long j) throws zzhd {
        zzho zzhoVar = this.zzagd;
        long zzew = j + (zzhoVar == null ? 60000000L : zzhoVar.zzew());
        this.zzaga = zzew;
        this.zzafm.zzel(zzew);
        for (zzhx zzhxVar : this.zzafs) {
            zzhxVar.zzdm(this.zzaga);
        }
    }

    private final void zzet() {
        zzi(true);
        this.zzafl.onStopped();
        setState(1);
    }

    private final void zzi(boolean z) {
        this.handler.removeMessages(2);
        this.zzafu = false;
        this.zzafm.stop();
        this.zzafq = null;
        this.zzafp = null;
        this.zzaga = 60000000L;
        for (zzhx zzhxVar : this.zzafs) {
            try {
                zza(zzhxVar);
                zzhxVar.disable();
            } catch (zzhd | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.zzafs = new zzhx[0];
        zzho zzhoVar = this.zzagd;
        if (zzhoVar == null) {
            zzhoVar = this.zzagb;
        }
        zza(zzhoVar);
        this.zzagb = null;
        this.zzagc = null;
        this.zzagd = null;
        zzh(false);
        if (z) {
            zznd zzndVar = this.zzafr;
            if (zzndVar != null) {
                zzndVar.zzia();
                this.zzafr = null;
            }
            this.zzafb = null;
        }
    }

    private static void zza(zzhx zzhxVar) throws zzhd {
        if (zzhxVar.getState() == 2) {
            zzhxVar.stop();
        }
    }

    private final boolean zzdr(long j) {
        if (j == -9223372036854775807L || this.zzafg.zzagh < j) {
            return true;
        }
        return this.zzagd.zzagr != null && this.zzagd.zzagr.zzagp;
    }

    private final void zzeu() throws IOException {
        zzho zzhoVar = this.zzagb;
        if (zzhoVar == null || zzhoVar.zzagp) {
            return;
        }
        zzho zzhoVar2 = this.zzagc;
        if (zzhoVar2 == null || zzhoVar2.zzagr == this.zzagb) {
            for (zzhx zzhxVar : this.zzafs) {
                if (!zzhxVar.zzec()) {
                    return;
                }
            }
            this.zzagb.zzagj.zzho();
        }
    }

    private final void zza(Object obj, int i) {
        this.zzafg = new zzhn(0, 0L);
        zzb(obj, i);
        this.zzafg = new zzhn(0, -9223372036854775807L);
        setState(4);
        zzi(false);
    }

    private final void zzb(Object obj, int i) {
        this.zzaeq.obtainMessage(6, new zzhp(this.zzafb, obj, this.zzafg, i)).sendToTarget();
    }

    private final int zza(int i, zzic zzicVar, zzic zzicVar2) {
        int zzfg = zzicVar.zzfg();
        int i2 = -1;
        for (int i3 = 0; i3 < zzfg && i2 == -1; i3++) {
            i = zzicVar.zza(i, this.zzaeu, this.zzaet, this.repeatMode);
            i2 = zzicVar2.zzc(zzicVar.zza(i, this.zzaeu, true).zzagk);
        }
        return i2;
    }

    private final boolean zzu(int i) {
        this.zzafb.zza(i, this.zzaeu, false);
        this.zzafb.zza(0, this.zzaet, false);
        return this.zzafb.zza(i, this.zzaeu, this.zzaet, this.repeatMode) == -1;
    }

    private final Pair<Integer, Long> zza(zzhq zzhqVar) {
        zzic zzicVar = zzhqVar.zzafb;
        if (zzicVar.isEmpty()) {
            zzicVar = this.zzafb;
        }
        try {
            Pair<Integer, Long> zzb = zzb(zzicVar, zzhqVar.zzagv, zzhqVar.zzagw);
            zzic zzicVar2 = this.zzafb;
            if (zzicVar2 == zzicVar) {
                return zzb;
            }
            int zzc = zzicVar2.zzc(zzicVar.zza(((Integer) zzb.first).intValue(), this.zzaeu, true).zzagk);
            if (zzc != -1) {
                return Pair.create(Integer.valueOf(zzc), (Long) zzb.second);
            }
            int zza = zza(((Integer) zzb.first).intValue(), zzicVar, this.zzafb);
            if (zza == -1) {
                return null;
            }
            this.zzafb.zza(zza, this.zzaeu, false);
            return zzc(0, -9223372036854775807L);
        } catch (IndexOutOfBoundsException unused) {
            throw new zzht(this.zzafb, zzhqVar.zzagv, zzhqVar.zzagw);
        }
    }

    private final Pair<Integer, Long> zzc(int i, long j) {
        return zzb(this.zzafb, 0, -9223372036854775807L);
    }

    private final Pair<Integer, Long> zzb(zzic zzicVar, int i, long j) {
        return zza(zzicVar, i, j, 0L);
    }

    private final Pair<Integer, Long> zza(zzic zzicVar, int i, long j, long j2) {
        zzpf.zzc(i, 0, zzicVar.zzff());
        zzicVar.zza(i, this.zzaet, false, j2);
        if (j == -9223372036854775807L) {
            j = 0;
        }
        long j3 = j + 0;
        long j4 = zzicVar.zza(0, this.zzaeu, false).zzaim;
        if (j4 != -9223372036854775807L) {
            int i2 = (j3 > j4 ? 1 : (j3 == j4 ? 0 : -1));
        }
        return Pair.create(0, Long.valueOf(j3));
    }

    private final void zzev() {
        long zzhn = !this.zzagb.zzagp ? 0L : this.zzagb.zzagj.zzhn();
        if (zzhn == Long.MIN_VALUE) {
            zzh(false);
            return;
        }
        long zzew = this.zzaga - this.zzagb.zzew();
        boolean zzdt = this.zzafl.zzdt(zzhn - zzew);
        zzh(zzdt);
        if (zzdt) {
            this.zzagb.zzagj.zzee(zzew);
        }
    }

    private static void zza(zzho zzhoVar) {
        while (zzhoVar != null) {
            zzhoVar.release();
            zzhoVar = zzhoVar.zzagr;
        }
    }

    private final void zzb(zzho zzhoVar) throws zzhd {
        if (this.zzagd == zzhoVar) {
            return;
        }
        boolean[] zArr = new boolean[this.zzaen.length];
        int i = 0;
        int i2 = 0;
        while (true) {
            zzhx[] zzhxVarArr = this.zzaen;
            if (i < zzhxVarArr.length) {
                zzhx zzhxVar = zzhxVarArr[i];
                zArr[i] = zzhxVar.getState() != 0;
                zzof zzbe = zzhoVar.zzags.zzbhv.zzbe(i);
                if (zzbe != null) {
                    i2++;
                }
                if (zArr[i] && (zzbe == null || (zzhxVar.zzee() && zzhxVar.zzeb() == this.zzagd.zzagl[i]))) {
                    if (zzhxVar == this.zzafp) {
                        this.zzafm.zza(this.zzafq);
                        this.zzafq = null;
                        this.zzafp = null;
                    }
                    zza(zzhxVar);
                    zzhxVar.disable();
                }
                i++;
            } else {
                this.zzagd = zzhoVar;
                this.zzaeq.obtainMessage(3, zzhoVar.zzags).sendToTarget();
                zza(zArr, i2);
                return;
            }
        }
    }

    private final void zza(boolean[] zArr, int i) throws zzhd {
        this.zzafs = new zzhx[i];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            zzhx[] zzhxVarArr = this.zzaen;
            if (i2 >= zzhxVarArr.length) {
                return;
            }
            zzhx zzhxVar = zzhxVarArr[i2];
            zzof zzbe = this.zzagd.zzags.zzbhv.zzbe(i2);
            if (zzbe != null) {
                int i4 = i3 + 1;
                this.zzafs[i3] = zzhxVar;
                if (zzhxVar.getState() == 0) {
                    zzhz zzhzVar = this.zzagd.zzags.zzbhx[i2];
                    boolean z = this.zzaew && this.state == 3;
                    boolean z2 = !zArr[i2] && z;
                    int length = zzbe.length();
                    zzhs[] zzhsVarArr = new zzhs[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        zzhsVarArr[i5] = zzbe.zzbb(i5);
                    }
                    zzhxVar.zza(zzhzVar, zzhsVarArr, this.zzagd.zzagl[i2], this.zzaga, z2, this.zzagd.zzew());
                    zzpj zzea = zzhxVar.zzea();
                    if (zzea != null) {
                        if (this.zzafq != null) {
                            throw zzhd.zza(new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                        this.zzafq = zzea;
                        this.zzafp = zzhxVar;
                        zzea.zzb(this.zzaff);
                    }
                    if (z) {
                        zzhxVar.start();
                    }
                }
                i3 = i4;
            }
            i2++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzno
    public final /* synthetic */ void zza(zznb zznbVar) {
        this.handler.obtainMessage(9, zznbVar).sendToTarget();
    }
}
