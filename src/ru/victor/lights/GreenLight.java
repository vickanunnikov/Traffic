package ru.victor.lights;

import ru.victor.interfaces.Luminous;

public class GreenLight extends Light implements Luminous{

    public GreenLight(int lightingTime) {
        super(lightingTime);
    }

    @Override
    public String light() {
        return "Green light.";
    }
}
