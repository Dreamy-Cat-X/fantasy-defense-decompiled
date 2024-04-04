package androidx.work.impl.constraints;

import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public interface WorkConstraintsCallback {
    void onAllConstraintsMet(List<String> list);

    void onAllConstraintsNotMet(List<String> list);
}
