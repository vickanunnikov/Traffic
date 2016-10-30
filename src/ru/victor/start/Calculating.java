package ru.victor.start;

import ru.victor.lights.GreenLight;
import ru.victor.lights.RedLight;
import ru.victor.lights.YellowLight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Calculating {

    RedLight redLight;
    GreenLight greenLight;
    YellowLight yellowLight;

    public Calculating() {
        redLight = new RedLight(3);
        greenLight = new GreenLight(4);
        yellowLight = new YellowLight(5);
        calculate();
    }

    public void calculate() {
        int minAmount = 0;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter minutes amount or -1 for exit: ");
            minAmount = Integer.parseInt(reader.readLine());
            if (minAmount == -1) return;
            if (minAmount < 0) {
                System.out.println("Enter positive variable.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Enter correct minutes amount");
        }
        minAmount %= (redLight.getLightingTime() + greenLight.getLightingTime() + yellowLight.getLightingTime());
        if (minAmount <= redLight.getLightingTime()) {
            System.out.println(redLight.light());
        } else if (minAmount > redLight.getLightingTime()
                && minAmount <= (redLight.getLightingTime() + greenLight.getLightingTime())) {
            System.out.println(greenLight.light());
        } else {
            System.out.println(yellowLight.light());
        }
    }
}
