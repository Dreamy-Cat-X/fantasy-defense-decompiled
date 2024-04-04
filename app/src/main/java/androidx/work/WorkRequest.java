package androidx.work;

import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import java.time.Duration;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* loaded from: D:\decomp\classes.dex */
public abstract class WorkRequest {
    public static final long DEFAULT_BACKOFF_DELAY_MILLIS = 30000;
    public static final long MAX_BACKOFF_MILLIS = 18000000;
    public static final long MIN_BACKOFF_MILLIS = 10000;
    private UUID mId;
    private Set<String> mTags;
    private WorkSpec mWorkSpec;

    /* JADX INFO: Access modifiers changed from: protected */
    public WorkRequest(UUID uuid, WorkSpec workSpec, Set<String> set) {
        this.mId = uuid;
        this.mWorkSpec = workSpec;
        this.mTags = set;
    }

    public UUID getId() {
        return this.mId;
    }

    public String getStringId() {
        return this.mId.toString();
    }

    public WorkSpec getWorkSpec() {
        return this.mWorkSpec;
    }

    public Set<String> getTags() {
        return this.mTags;
    }

    /* loaded from: D:\decomp\classes.dex */
    public static abstract class Builder<B extends Builder, W extends WorkRequest> {
        WorkSpec mWorkSpec;
        boolean mBackoffCriteriaSet = false;
        Set<String> mTags = new HashSet();
        UUID mId = UUID.randomUUID();

        abstract W buildInternal();

        abstract B getThis();

        /* JADX INFO: Access modifiers changed from: package-private */
        public Builder(Class<? extends ListenableWorker> cls) {
            this.mWorkSpec = new WorkSpec(this.mId.toString(), cls.getName());
            addTag(cls.getName());
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, long j, TimeUnit timeUnit) {
            this.mBackoffCriteriaSet = true;
            this.mWorkSpec.backoffPolicy = backoffPolicy;
            this.mWorkSpec.setBackoffDelayDuration(timeUnit.toMillis(j));
            return getThis();
        }

        public final B setBackoffCriteria(BackoffPolicy backoffPolicy, Duration duration) {
            this.mBackoffCriteriaSet = true;
            this.mWorkSpec.backoffPolicy = backoffPolicy;
            this.mWorkSpec.setBackoffDelayDuration(duration.toMillis());
            return getThis();
        }

        public final B setConstraints(Constraints constraints) {
            this.mWorkSpec.constraints = constraints;
            return getThis();
        }

        public final B setInputData(Data data) {
            this.mWorkSpec.input = data;
            return getThis();
        }

        public final B addTag(String str) {
            this.mTags.add(str);
            return getThis();
        }

        public final B keepResultsForAtLeast(long j, TimeUnit timeUnit) {
            this.mWorkSpec.minimumRetentionDuration = timeUnit.toMillis(j);
            return getThis();
        }

        public final B keepResultsForAtLeast(Duration duration) {
            this.mWorkSpec.minimumRetentionDuration = duration.toMillis();
            return getThis();
        }

        public B setInitialDelay(long j, TimeUnit timeUnit) {
            this.mWorkSpec.initialDelay = timeUnit.toMillis(j);
            return getThis();
        }

        public B setInitialDelay(Duration duration) {
            this.mWorkSpec.initialDelay = duration.toMillis();
            return getThis();
        }

        public final W build() {
            W buildInternal = buildInternal();
            this.mId = UUID.randomUUID();
            WorkSpec workSpec = new WorkSpec(this.mWorkSpec);
            this.mWorkSpec = workSpec;
            workSpec.id = this.mId.toString();
            return buildInternal;
        }

        public final B setInitialState(WorkInfo.State state) {
            this.mWorkSpec.state = state;
            return getThis();
        }

        public final B setInitialRunAttemptCount(int i) {
            this.mWorkSpec.runAttemptCount = i;
            return getThis();
        }

        public final B setPeriodStartTime(long j, TimeUnit timeUnit) {
            this.mWorkSpec.periodStartTime = timeUnit.toMillis(j);
            return getThis();
        }

        public final B setScheduleRequestedAt(long j, TimeUnit timeUnit) {
            this.mWorkSpec.scheduleRequestedAt = timeUnit.toMillis(j);
            return getThis();
        }
    }
}
