package com.sncompany.newtower.Pages;

import java.util.function.Consumer;

import javax.microedition.khronos.opengles.GL10;

public class FileSelectPage extends TPage {

    public FileSelectPage(TPage par) {
        super(par);
    }

    @Override
    public void load(Consumer<Float> prog) {
        loaded = true;
    }

    @Override
    public void update() {
    }

    @Override
    public void paint(GL10 gra, boolean init) {
    }

    @Override
    public void touchCheck() {

    }

    @Override
    public void unload() {
        loaded = false;
    }
}
