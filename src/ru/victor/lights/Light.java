package ru.victor.lights;


public abstract class Light {
    private int lightingTime;

    public Light(int lightingTime) {
        this.lightingTime = lightingTime;
    }

    public int getLightingTime() {
        return lightingTime;
    }
}
