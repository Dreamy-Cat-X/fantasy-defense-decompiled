package com.google.android.gms.ads;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzaqs;
import com.google.android.gms.internal.ads.zzaym;
import com.google.android.gms.internal.ads.zzwo;

/* compiled from: com.google.android.gms:play-services-ads-lite@@19.6.0 */
/* loaded from: D:\decomp\classes.dex */
public final class AdActivity extends Activity {
    public static final String CLASS_NAME = "com.google.android.gms.ads.AdActivity";
    public static final String SIMPLE_CLASS_NAME = "AdActivity";
    private zzaqs zzacn;

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        zzaqs zzb = zzwo.zzqn().zzb(this);
        this.zzacn = zzb;
        if (zzb == null) {
            zzaym.zze("#007 Could not call remote method.", null);
            finish();
            return;
        }
        try {
            zzb.onCreate(bundle);
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onRestart() {
        super.onRestart();
        try {
            if (this.zzacn != null) {
                this.zzacn.onRestart();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onStart() {
        super.onStart();
        try {
            if (this.zzacn != null) {
                this.zzacn.onStart();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onUserLeaveHint() {
        super.onUserLeaveHint();
        try {
            this.zzacn.onUserLeaveHint();
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        try {
            if (this.zzacn != null) {
                this.zzacn.onResume();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            finish();
        }
    }

    @Override // android.app.Activity
    protected final void onPause() {
        try {
            if (this.zzacn != null) {
                this.zzacn.onPause();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onPause();
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        try {
            if (this.zzacn != null) {
                this.zzacn.onSaveInstanceState(bundle);
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    protected final void onStop() {
        try {
            if (this.zzacn != null) {
                this.zzacn.onStop();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
            finish();
        }
        super.onStop();
    }

    @Override // android.app.Activity
    protected final void onDestroy() {
        try {
            if (this.zzacn != null) {
                this.zzacn.onDestroy();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        super.onDestroy();
    }

    private final void zzdr() {
        zzaqs zzaqsVar = this.zzacn;
        if (zzaqsVar != null) {
            try {
                zzaqsVar.zzdr();
            } catch (RemoteException e) {
                zzaym.zze("#007 Could not call remote method.", e);
            }
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        super.setContentView(i);
        zzdr();
    }

    @Override // android.app.Activity
    public final void setContentView(View view) {
        super.setContentView(view);
        zzdr();
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(view, layoutParams);
        zzdr();
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        boolean z = true;
        try {
            if (this.zzacn != null) {
                z = this.zzacn.zzvu();
            }
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        if (z) {
            super.onBackPressed();
            try {
                this.zzacn.onBackPressed();
            } catch (RemoteException e2) {
                zzaym.zze("#007 Could not call remote method.", e2);
            }
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i, int i2, Intent intent) {
        try {
            this.zzacn.onActivityResult(i, i2, intent);
        } catch (Exception e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        try {
            this.zzacn.zzad(ObjectWrapper.wrap(configuration));
        } catch (RemoteException e) {
            zzaym.zze("#007 Could not call remote method.", e);
        }
    }
}
