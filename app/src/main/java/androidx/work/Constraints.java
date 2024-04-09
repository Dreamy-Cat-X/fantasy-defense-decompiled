package androidx.work;

import android.net.Uri;
import android.os.Build;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

/* loaded from: D:\decomp\classes.dex */
public final class Constraints {
    public static final Constraints NONE = new Builder().build();
    private ContentUriTriggers mContentUriTriggers;
    private NetworkType mRequiredNetworkType;
    private boolean mRequiresBatteryNotLow;
    private boolean mRequiresCharging;
    private boolean mRequiresDeviceIdle;
    private boolean mRequiresStorageNotLow;
    private long mTriggerContentUpdateDelay;
    private long mTriggerMaxContentDelay;

    public Constraints() {
        this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new ContentUriTriggers();
    }

    Constraints(Builder builder) {
        this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new ContentUriTriggers();
        this.mRequiresCharging = builder.mRequiresCharging;
        this.mRequiresDeviceIdle = Build.VERSION.SDK_INT >= 23 && builder.mRequiresDeviceIdle;
        this.mRequiredNetworkType = builder.mRequiredNetworkType;
        this.mRequiresBatteryNotLow = builder.mRequiresBatteryNotLow;
        this.mRequiresStorageNotLow = builder.mRequiresStorageNotLow;
        if (Build.VERSION.SDK_INT >= 24) {
            this.mContentUriTriggers = builder.mContentUriTriggers;
            this.mTriggerContentUpdateDelay = builder.mTriggerContentUpdateDelay;
            this.mTriggerMaxContentDelay = builder.mTriggerContentMaxDelay;
        }
    }

    public Constraints(Constraints constraints) {
        this.mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        this.mTriggerContentUpdateDelay = -1L;
        this.mTriggerMaxContentDelay = -1L;
        this.mContentUriTriggers = new ContentUriTriggers();
        this.mRequiresCharging = constraints.mRequiresCharging;
        this.mRequiresDeviceIdle = constraints.mRequiresDeviceIdle;
        this.mRequiredNetworkType = constraints.mRequiredNetworkType;
        this.mRequiresBatteryNotLow = constraints.mRequiresBatteryNotLow;
        this.mRequiresStorageNotLow = constraints.mRequiresStorageNotLow;
        this.mContentUriTriggers = constraints.mContentUriTriggers;
    }

    public NetworkType getRequiredNetworkType() {
        return this.mRequiredNetworkType;
    }

    public void setRequiredNetworkType(NetworkType networkType) {
        this.mRequiredNetworkType = networkType;
    }

    public boolean requiresCharging() {
        return this.mRequiresCharging;
    }

    public void setRequiresCharging(boolean z) {
        this.mRequiresCharging = z;
    }

    public boolean requiresDeviceIdle() {
        return this.mRequiresDeviceIdle;
    }

    public void setRequiresDeviceIdle(boolean z) {
        this.mRequiresDeviceIdle = z;
    }

    public boolean requiresBatteryNotLow() {
        return this.mRequiresBatteryNotLow;
    }

    public void setRequiresBatteryNotLow(boolean z) {
        this.mRequiresBatteryNotLow = z;
    }

    public boolean requiresStorageNotLow() {
        return this.mRequiresStorageNotLow;
    }

    public void setRequiresStorageNotLow(boolean z) {
        this.mRequiresStorageNotLow = z;
    }

    public long getTriggerContentUpdateDelay() {
        return this.mTriggerContentUpdateDelay;
    }

    public void setTriggerContentUpdateDelay(long j) {
        this.mTriggerContentUpdateDelay = j;
    }

    public long getTriggerMaxContentDelay() {
        return this.mTriggerMaxContentDelay;
    }

    public void setTriggerMaxContentDelay(long j) {
        this.mTriggerMaxContentDelay = j;
    }

    public void setContentUriTriggers(ContentUriTriggers contentUriTriggers) {
        this.mContentUriTriggers = contentUriTriggers;
    }

    public ContentUriTriggers getContentUriTriggers() {
        return this.mContentUriTriggers;
    }

    public boolean hasContentUriTriggers() {
        return this.mContentUriTriggers.size() > 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Constraints constraints = (Constraints) obj;
        if (this.mRequiresCharging == constraints.mRequiresCharging && this.mRequiresDeviceIdle == constraints.mRequiresDeviceIdle && this.mRequiresBatteryNotLow == constraints.mRequiresBatteryNotLow && this.mRequiresStorageNotLow == constraints.mRequiresStorageNotLow && this.mTriggerContentUpdateDelay == constraints.mTriggerContentUpdateDelay && this.mTriggerMaxContentDelay == constraints.mTriggerMaxContentDelay && this.mRequiredNetworkType == constraints.mRequiredNetworkType) {
            return this.mContentUriTriggers.equals(constraints.mContentUriTriggers);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = ((((((((this.mRequiredNetworkType.hashCode() * 31) + (this.mRequiresCharging ? 1 : 0)) * 31) + (this.mRequiresDeviceIdle ? 1 : 0)) * 31) + (this.mRequiresBatteryNotLow ? 1 : 0)) * 31) + (this.mRequiresStorageNotLow ? 1 : 0)) * 31;
        long j = this.mTriggerContentUpdateDelay;
        int i = (hashCode + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.mTriggerMaxContentDelay;
        return ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.mContentUriTriggers.hashCode();
    }

    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        boolean mRequiresCharging = false;
        boolean mRequiresDeviceIdle = false;
        NetworkType mRequiredNetworkType = NetworkType.NOT_REQUIRED;
        boolean mRequiresBatteryNotLow = false;
        boolean mRequiresStorageNotLow = false;
        long mTriggerContentUpdateDelay = -1;
        long mTriggerContentMaxDelay = -1;
        ContentUriTriggers mContentUriTriggers = new ContentUriTriggers();

        public Builder setRequiresCharging(boolean z) {
            this.mRequiresCharging = z;
            return this;
        }

        public Builder setRequiresDeviceIdle(boolean z) {
            this.mRequiresDeviceIdle = z;
            return this;
        }

        public Builder setRequiredNetworkType(NetworkType networkType) {
            this.mRequiredNetworkType = networkType;
            return this;
        }

        public Builder setRequiresBatteryNotLow(boolean z) {
            this.mRequiresBatteryNotLow = z;
            return this;
        }

        public Builder setRequiresStorageNotLow(boolean z) {
            this.mRequiresStorageNotLow = z;
            return this;
        }

        public Builder addContentUriTrigger(Uri uri, boolean z) {
            this.mContentUriTriggers.add(uri, z);
            return this;
        }

        public Builder setTriggerContentUpdateDelay(long j, TimeUnit timeUnit) {
            this.mTriggerContentUpdateDelay = timeUnit.toMillis(j);
            return this;
        }

        public Builder setTriggerContentUpdateDelay(Duration duration) {
            this.mTriggerContentUpdateDelay = duration.toMillis();
            return this;
        }

        public Builder setTriggerContentMaxDelay(long j, TimeUnit timeUnit) {
            this.mTriggerContentMaxDelay = timeUnit.toMillis(j);
            return this;
        }

        public Builder setTriggerContentMaxDelay(Duration duration) {
            this.mTriggerContentMaxDelay = duration.toMillis();
            return this;
        }

        public Constraints build() {
            return new Constraints(this);
        }
    }
}