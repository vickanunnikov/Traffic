package ru.victor.lights;

import ru.victor.interfaces.Luminous;

public class YellowLight extends Light implements Luminous {

    public YellowLight(int lightingTime) {
        super(lightingTime);
    }

    @Override
    public String light() {
        return "Yellow light.";
    }
}
