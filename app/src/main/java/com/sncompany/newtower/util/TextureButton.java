package com.sncompany.newtower.util;

import androidx.core.util.Consumer;

import com.sncompany.newtower.DataClasses.CGPoint;
import com.sncompany.newtower.Texture2D;

public class TextureButton { //TODO - Draw Alpha

    private final Texture2D btn = new Texture2D();
    private final Consumer<Integer> onPressed;
    private final float x, y, w, h;

    public TextureButton(int textureName, Consumer<Integer> func, float px, float py) {
        this(textureName, func, px, py, 0f, 0f);
    }

    public TextureButton(int textureName, Consumer<Integer> func, float px, float py, float width, float height) {
        btn.initWithImageName(textureName);
        onPressed = func;
        x = px;
        y = py;
        w = width > 0 ? width : btn._width;
        h = height > 0 ? height : btn._height;
    }

    public boolean press(CGPoint p) {
        if (p.x >= x && p.y >= y && p.x <= x + w && p.y <= y + h) {
            onPressed.accept(0);
            return true;
        }
        return false;
    }

    public void draw(int i, float alpha) {
        btn.drawAtPointOption(x, y, i);
    }

    public void unload() {
        btn.dealloc();
    }
}
