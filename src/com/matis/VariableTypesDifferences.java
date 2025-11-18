package com.matis;

import java.awt.*;

public class VariableTypesDifferences {
    public static void primitiveVariables() {
        byte var1 = 1;
        byte var2 = var1;

        var1 = 2;

        System.out.println("var1: " + var1);
        System.out.println("var2: " + var2);
    }

    public static void referenceVariables() {
        Point p1 = new Point(1, 2);
        Point p2 = p1;

        p1.x = 3;

        pointerDisplayFormating("p1", p1);
        pointerDisplayFormating("p2", p2);
    }

    private static void pointerDisplayFormating(String name, Point point){
        System.out.println(name + ": (" + point.x + ", " + point.y + ")");
    }

    public static void stringVariable() {
        String string1 = "string";
        String string2 = string1;

        string1 = "test";

        System.out.println("string1: " + string1);
        System.out.println("string2: " + string2);

        System.out.println("*String is immutable");
    }
}
