package androidx.work;

import android.os.Build;
import androidx.work.WorkRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public final class OneTimeWorkRequest extends WorkRequest {
    public static OneTimeWorkRequest from(Class<? extends ListenableWorker> cls) {
        return new Builder(cls).build();
    }

    public static List<OneTimeWorkRequest> from(List<Class<? extends ListenableWorker>> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<Class<? extends ListenableWorker>> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new Builder(it.next()).build());
        }
        return arrayList;
    }

    OneTimeWorkRequest(Builder builder) {
        super(builder.mId, builder.mWorkSpec, builder.mTags);
    }

    /* loaded from: D:\decomp\classes.dex */
    public static final class Builder extends WorkRequest.Builder<Builder, OneTimeWorkRequest> {
        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public Builder getThis() {
            return this;
        }

        public Builder(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.mWorkSpec.inputMergerClassName = OverwritingInputMerger.class.getName();
        }

        public Builder setInputMerger(Class<? extends InputMerger> cls) {
            this.mWorkSpec.inputMergerClassName = cls.getName();
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.work.WorkRequest.Builder
        public OneTimeWorkRequest buildInternal() {
            if (this.mBackoffCriteriaSet && Build.VERSION.SDK_INT >= 23 && this.mWorkSpec.constraints.requiresDeviceIdle()) {
                throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
            }
            return new OneTimeWorkRequest(this);
        }
    }
}
