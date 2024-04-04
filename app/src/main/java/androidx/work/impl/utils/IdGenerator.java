package androidx.work.impl.utils;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: D:\decomp\classes.dex */
public class IdGenerator {
    public static final int INITIAL_ID = 0;
    static final String NEXT_ALARM_MANAGER_ID_KEY = "next_alarm_manager_id";
    static final String NEXT_JOB_SCHEDULER_ID_KEY = "next_job_scheduler_id";
    static final String PREFERENCE_FILE_KEY = "androidx.work.util.id";
    private final Context mContext;
    private boolean mLoadedPreferences;
    private SharedPreferences mSharedPrefs;

    public IdGenerator(Context context) {
        this.mContext = context;
    }

    public int nextJobSchedulerIdWithRange(int i, int i2) {
        synchronized (IdGenerator.class) {
            loadPreferencesIfNecessary();
            int nextId = nextId(NEXT_JOB_SCHEDULER_ID_KEY);
            if (nextId >= i && nextId <= i2) {
                i = nextId;
            }
            update(NEXT_JOB_SCHEDULER_ID_KEY, i + 1);
        }
        return i;
    }

    public int nextAlarmManagerId() {
        int nextId;
        synchronized (IdGenerator.class) {
            loadPreferencesIfNecessary();
            nextId = nextId(NEXT_ALARM_MANAGER_ID_KEY);
        }
        return nextId;
    }

    private int nextId(String str) {
        int i = this.mSharedPrefs.getInt(str, 0);
        update(str, i != Integer.MAX_VALUE ? i + 1 : 0);
        return i;
    }

    private void update(String str, int i) {
        this.mSharedPrefs.edit().putInt(str, i).apply();
    }

    private void loadPreferencesIfNecessary() {
        if (this.mLoadedPreferences) {
            return;
        }
        this.mSharedPrefs = this.mContext.getSharedPreferences(PREFERENCE_FILE_KEY, 0);
        this.mLoadedPreferences = true;
    }
}
