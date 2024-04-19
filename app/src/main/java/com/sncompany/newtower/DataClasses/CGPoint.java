package com.sncompany.newtower.DataClasses;

/* loaded from: D:\decomp\classes.dex */
public class CGPoint {

    public static CGPoint _CGPoint = null;
    public float x;
    public float y;

    public static CGPoint CGPointMake(float x, float y) {
        if (_CGPoint == null) {
            _CGPoint = new CGPoint();
        }
        _CGPoint.x = x;
        _CGPoint.y = y;
        return _CGPoint;
    }

    public CGPoint() {
    }

    public CGPoint(float x, float y) {
        this.x = x;
        this.y = y;
    }
}
