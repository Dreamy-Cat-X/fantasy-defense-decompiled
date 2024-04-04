package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

/* compiled from: com.google.android.gms:play-services-ads@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
final class zzban implements SensorEventListener {
    private final SensorManager zzejd;
    private final Display zzejf;
    private float[] zzeji;
    private Handler zzejj;
    private zzbap zzejk;
    private final float[] zzejg = new float[9];
    private final float[] zzejh = new float[9];
    private final Object zzeje = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzban(Context context) {
        this.zzejd = (SensorManager) context.getSystemService("sensor");
        this.zzejf = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    @Override // android.hardware.SensorEventListener
    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void start() {
        if (this.zzejj != null) {
            return;
        }
        Sensor defaultSensor = this.zzejd.getDefaultSensor(11);
        if (defaultSensor == null) {
            com.google.android.gms.ads.internal.util.zzd.zzev("No Sensor of TYPE_ROTATION_VECTOR");
            return;
        }
        HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
        handlerThread.start();
        zzdva zzdvaVar = new zzdva(handlerThread.getLooper());
        this.zzejj = zzdvaVar;
        if (this.zzejd.registerListener(this, defaultSensor, 0, zzdvaVar)) {
            return;
        }
        com.google.android.gms.ads.internal.util.zzd.zzev("SensorManager.registerListener failed.");
        stop();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void stop() {
        if (this.zzejj == null) {
            return;
        }
        this.zzejd.unregisterListener(this);
        this.zzejj.post(new zzbam(this));
        this.zzejj = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zzbap zzbapVar) {
        this.zzejk = zzbapVar;
    }

    @Override // android.hardware.SensorEventListener
    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] == 0.0f && fArr[1] == 0.0f && fArr[2] == 0.0f) {
            return;
        }
        synchronized (this.zzeje) {
            if (this.zzeji == null) {
                this.zzeji = new float[9];
            }
        }
        SensorManager.getRotationMatrixFromVector(this.zzejg, fArr);
        int rotation = this.zzejf.getRotation();
        if (rotation == 1) {
            SensorManager.remapCoordinateSystem(this.zzejg, 2, 129, this.zzejh);
        } else if (rotation == 2) {
            SensorManager.remapCoordinateSystem(this.zzejg, 129, 130, this.zzejh);
        } else if (rotation == 3) {
            SensorManager.remapCoordinateSystem(this.zzejg, 130, 1, this.zzejh);
        } else {
            System.arraycopy(this.zzejg, 0, this.zzejh, 0, 9);
        }
        zzl(1, 3);
        zzl(2, 6);
        zzl(5, 7);
        synchronized (this.zzeje) {
            System.arraycopy(this.zzejh, 0, this.zzeji, 0, 9);
        }
        zzbap zzbapVar = this.zzejk;
        if (zzbapVar != null) {
            zzbapVar.zzvy();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean zza(float[] fArr) {
        synchronized (this.zzeje) {
            if (this.zzeji == null) {
                return false;
            }
            System.arraycopy(this.zzeji, 0, fArr, 0, this.zzeji.length);
            return true;
        }
    }

    private final void zzl(int i, int i2) {
        float[] fArr = this.zzejh;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }
}
