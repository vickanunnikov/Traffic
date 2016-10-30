package ru.victor.lights;

import ru.victor.interfaces.Luminous;

/**
 * Created by Виктор on 30.10.2016.
 */
public class RedLight extends Light implements Luminous{
    public RedLight(int lightingTime) {
        super(lightingTime);
    }

    @Override
    public String light() {
        return "Red light.";
    }
}
