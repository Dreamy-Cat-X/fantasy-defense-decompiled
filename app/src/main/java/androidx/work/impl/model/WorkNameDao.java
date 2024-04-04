package androidx.work.impl.model;

import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public interface WorkNameDao {
    List<String> getWorkSpecIdsWithName(String str);

    void insert(WorkName workName);
}
