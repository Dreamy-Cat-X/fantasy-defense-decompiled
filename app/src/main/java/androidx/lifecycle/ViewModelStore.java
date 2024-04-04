package androidx.lifecycle;

import java.util.HashMap;
import java.util.Iterator;

/* loaded from: D:\decomp\classes.dex */
public class ViewModelStore {
    private final HashMap<String, ViewModel> mMap = new HashMap<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void put(String str, ViewModel viewModel) {
        ViewModel put = this.mMap.put(str, viewModel);
        if (put != null) {
            put.onCleared();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ViewModel get(String str) {
        return this.mMap.get(str);
    }

    public final void clear() {
        Iterator<ViewModel> it = this.mMap.values().iterator();
        while (it.hasNext()) {
            it.next().onCleared();
        }
        this.mMap.clear();
    }
}
