package androidx.work.impl.constraints.controllers;

import androidx.work.impl.constraints.ConstraintListener;
import androidx.work.impl.constraints.trackers.ConstraintTracker;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public abstract class ConstraintController<T> implements ConstraintListener<T> {
    private OnConstraintUpdatedCallback mCallback;
    private T mCurrentValue;
    private final List<String> mMatchingWorkSpecIds = new ArrayList();
    private ConstraintTracker<T> mTracker;

    /* loaded from: D:\decomp\classes.dex */
    public interface OnConstraintUpdatedCallback {
        void onConstraintMet(List<String> list);

        void onConstraintNotMet(List<String> list);
    }

    abstract boolean hasConstraint(WorkSpec workSpec);

    abstract boolean isConstrained(T t);

    /* JADX INFO: Access modifiers changed from: package-private */
    public ConstraintController(ConstraintTracker<T> constraintTracker) {
        this.mTracker = constraintTracker;
    }

    public void setCallback(OnConstraintUpdatedCallback onConstraintUpdatedCallback) {
        if (this.mCallback != onConstraintUpdatedCallback) {
            this.mCallback = onConstraintUpdatedCallback;
            updateCallback();
        }
    }

    public void replace(List<WorkSpec> list) {
        this.mMatchingWorkSpecIds.clear();
        for (WorkSpec workSpec : list) {
            if (hasConstraint(workSpec)) {
                this.mMatchingWorkSpecIds.add(workSpec.id);
            }
        }
        if (this.mMatchingWorkSpecIds.isEmpty()) {
            this.mTracker.removeListener(this);
        } else {
            this.mTracker.addListener(this);
        }
        updateCallback();
    }

    public void reset() {
        if (this.mMatchingWorkSpecIds.isEmpty()) {
            return;
        }
        this.mMatchingWorkSpecIds.clear();
        this.mTracker.removeListener(this);
    }

    public boolean isWorkSpecConstrained(String str) {
        T t = this.mCurrentValue;
        return t != null && isConstrained(t) && this.mMatchingWorkSpecIds.contains(str);
    }

    private void updateCallback() {
        if (this.mMatchingWorkSpecIds.isEmpty() || this.mCallback == null) {
            return;
        }
        T t = this.mCurrentValue;
        if (t == null || isConstrained(t)) {
            this.mCallback.onConstraintNotMet(this.mMatchingWorkSpecIds);
        } else {
            this.mCallback.onConstraintMet(this.mMatchingWorkSpecIds);
        }
    }

    @Override // androidx.work.impl.constraints.ConstraintListener
    public void onConstraintChanged(T t) {
        this.mCurrentValue = t;
        updateCallback();
    }
}
