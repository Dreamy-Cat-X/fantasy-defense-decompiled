package androidx.work;

import android.os.Build;
import androidx.appcompat.widget.ActivityChooserView;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* loaded from: D:\decomp\classes.dex */
public final class Configuration {
    public static final int MIN_SCHEDULER_LIMIT = 20;
    private final Executor mExecutor;
    private final int mLoggingLevel;
    private final int mMaxJobSchedulerId;
    private final int mMaxSchedulerLimit;
    private final int mMinJobSchedulerId;
    private final Executor mTaskExecutor;
    private final WorkerFactory mWorkerFactory;

    /* loaded from: D:\decomp\classes.dex */
    public interface Provider {
        Configuration getWorkManagerConfiguration();
    }

    Configuration(Builder builder) {
        if (builder.mExecutor == null) {
            this.mExecutor = createDefaultExecutor();
        } else {
            this.mExecutor = builder.mExecutor;
        }
        if (builder.mTaskExecutor == null) {
            this.mTaskExecutor = createDefaultExecutor();
        } else {
            this.mTaskExecutor = builder.mTaskExecutor;
        }
        if (builder.mWorkerFactory == null) {
            this.mWorkerFactory = WorkerFactory.getDefaultWorkerFactory();
        } else {
            this.mWorkerFactory = builder.mWorkerFactory;
        }
        this.mLoggingLevel = builder.mLoggingLevel;
        this.mMinJobSchedulerId = builder.mMinJobSchedulerId;
        this.mMaxJobSchedulerId = builder.mMaxJobSchedulerId;
        this.mMaxSchedulerLimit = builder.mMaxSchedulerLimit;
    }

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public Executor getTaskExecutor() {
        return this.mTaskExecutor;
    }

    public WorkerFactory getWorkerFactory() {
        return this.mWorkerFactory;
    }

    public int getMinimumLoggingLevel() {
        return this.mLoggingLevel;
    }

    public int getMinJobSchedulerId() {
        return this.mMinJobSchedulerId;
    }

    public int getMaxJobSchedulerId() {
        return this.mMaxJobSchedulerId;
    }

    public int getMaxSchedulerLimit() {
        if (Build.VERSION.SDK_INT == 23) {
            return this.mMaxSchedulerLimit / 2;
        }
        return this.mMaxSchedulerLimit;
    }

    private Executor createDefaultExecutor() {
        return Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)));
    }

    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder {
        Executor mExecutor;
        Executor mTaskExecutor;
        WorkerFactory mWorkerFactory;
        int mLoggingLevel = 4;
        int mMinJobSchedulerId = 0;
        int mMaxJobSchedulerId = ActivityChooserView.ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
        int mMaxSchedulerLimit = 20;

        public Builder setWorkerFactory(WorkerFactory workerFactory) {
            this.mWorkerFactory = workerFactory;
            return this;
        }

        public Builder setExecutor(Executor executor) {
            this.mExecutor = executor;
            return this;
        }

        public Builder setTaskExecutor(Executor executor) {
            this.mTaskExecutor = executor;
            return this;
        }

        public Builder setJobSchedulerJobIdRange(int i, int i2) {
            if (i2 - i < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.mMinJobSchedulerId = i;
            this.mMaxJobSchedulerId = i2;
            return this;
        }

        public Builder setMaxSchedulerLimit(int i) {
            if (i < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.mMaxSchedulerLimit = Math.min(i, 50);
            return this;
        }

        public Builder setMinimumLoggingLevel(int i) {
            this.mLoggingLevel = i;
            return this;
        }

        public Configuration build() {
            return new Configuration(this);
        }
    }
}
