package androidx.core.widget;

import android.os.Build;
import android.view.View;
import android.widget.PopupMenu;

/* loaded from: D:\decomp\classes.dex */
public final class PopupMenuCompat {
    private PopupMenuCompat() {
    }

    public static View.OnTouchListener getDragToOpenListener(Object obj) {
        if (Build.VERSION.SDK_INT >= 19) {
            return ((PopupMenu) obj).getDragToOpenListener();
        }
        return null;
    }
}
