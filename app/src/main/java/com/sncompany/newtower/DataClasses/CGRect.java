package com.sncompany.newtower.DataClasses;

/* loaded from: D:\decomp\classes.dex */
public class CGRect {

    public static CGRect _CGRect = null;

    public float originX;
    public float originY;
    public float sizeHeight;
    public float sizeWidth;

    public static CGRect CGRectMake(float x, float y, float w, float h) {
        if (_CGRect == null)
            _CGRect = new CGRect();

        _CGRect.originX = x;
        _CGRect.originY = y;
        _CGRect.sizeWidth = w;
        _CGRect.sizeHeight = h;
        return _CGRect;
    }
}
