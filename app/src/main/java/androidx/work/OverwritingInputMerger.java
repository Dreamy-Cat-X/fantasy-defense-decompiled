package androidx.work;

import androidx.work.Data;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: D:\decomp\classes.dex */
public final class OverwritingInputMerger extends InputMerger {
    @Override // androidx.work.InputMerger
    public Data merge(List<Data> list) {
        Data.Builder builder = new Data.Builder();
        HashMap hashMap = new HashMap();
        Iterator<Data> it = list.iterator();
        while (it.hasNext()) {
            hashMap.putAll(it.next().getKeyValueMap());
        }
        builder.putAll(hashMap);
        return builder.build();
    }
}
