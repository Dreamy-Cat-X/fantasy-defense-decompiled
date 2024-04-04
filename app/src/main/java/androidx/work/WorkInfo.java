package androidx.work;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* loaded from: D:\decomp\classes.dex */
public final class WorkInfo {
    private UUID mId;
    private Data mOutputData;
    private int mRunAttemptCount;
    private State mState;
    private Set<String> mTags;

    public WorkInfo(UUID uuid, State state, Data data, List<String> list, int i) {
        this.mId = uuid;
        this.mState = state;
        this.mOutputData = data;
        this.mTags = new HashSet(list);
        this.mRunAttemptCount = i;
    }

    public UUID getId() {
        return this.mId;
    }

    public State getState() {
        return this.mState;
    }

    public Data getOutputData() {
        return this.mOutputData;
    }

    public Set<String> getTags() {
        return this.mTags;
    }

    public int getRunAttemptCount() {
        return this.mRunAttemptCount;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkInfo workInfo = (WorkInfo) obj;
        if (this.mRunAttemptCount == workInfo.mRunAttemptCount && this.mId.equals(workInfo.mId) && this.mState == workInfo.mState && this.mOutputData.equals(workInfo.mOutputData)) {
            return this.mTags.equals(workInfo.mTags);
        }
        return false;
    }

    public int hashCode() {
        return (((((((this.mId.hashCode() * 31) + this.mState.hashCode()) * 31) + this.mOutputData.hashCode()) * 31) + this.mTags.hashCode()) * 31) + this.mRunAttemptCount;
    }

    public String toString() {
        return "WorkInfo{mId='" + this.mId + "', mState=" + this.mState + ", mOutputData=" + this.mOutputData + ", mTags=" + this.mTags + '}';
    }

    /* loaded from: D:\decomp\classes.dex */
    public enum State {
        ENQUEUED,
        RUNNING,
        SUCCEEDED,
        FAILED,
        BLOCKED,
        CANCELLED;

        public boolean isFinished() {
            return this == SUCCEEDED || this == FAILED || this == CANCELLED;
        }
    }
}
