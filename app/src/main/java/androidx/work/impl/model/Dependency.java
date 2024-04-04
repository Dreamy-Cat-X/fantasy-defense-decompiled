package androidx.work.impl.model;

/* loaded from: D:\decomp\classes.dex */
public class Dependency {
    public final String prerequisiteId;
    public final String workSpecId;

    public Dependency(String str, String str2) {
        this.workSpecId = str;
        this.prerequisiteId = str2;
    }
}
