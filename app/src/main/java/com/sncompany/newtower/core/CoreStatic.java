package com.sncompany.newtower.core;

public class CoreStatic {

    public static ImageCreator creator = null;

    public static abstract class ImageCreator {

        public abstract GameImage create();
        public abstract GameImage create(int id);
    }

    /**
     * Gets a random number between 0 and i (exclusive)
     * @param i The upper limit for the number (exclusive).
     */
    public static int getRandom(int i) {
        return (int)(Math.random() * i);
    }
}
