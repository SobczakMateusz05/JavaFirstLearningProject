package com.matis;

import java.util.Arrays;

public class ArraysFundaments {
    public static void basicOperation() {
        int[] numbers = { 3, 2, 4, 5, 1};
        int [] numbers2 = new int[5]; // Older syntax
        int[] numbers3 = { 3, 2, 4, 5, 1};

        Arrays.sort(numbers);
        Arrays.fill(numbers2, 3);

        System.out.println("Numbers without toString: " + numbers);
        System.out.println("Numbers with toString: " + Arrays.toString(numbers));
        System.out.println("Numbers2:  "  + Arrays.toString(numbers2));
        System.out.println("Numbers length: " + numbers.length);
        System.out.println("Compare of numbers and numbers: " + Arrays.compare(numbers, numbers));
        System.out.println("Compare of numbers and numbers2: " + Arrays.compare(numbers, numbers2));
        System.out.println("Compare of numbers and numbers3: " + Arrays.compare(numbers, numbers3));
        System.out.println("Equals of numbers and numbers: " + Arrays.equals(numbers, numbers));
        System.out.println("Equals of numbers and numbers2: " + Arrays.equals(numbers, numbers2));
        System.out.println("Equals of numbers and numbers3: " + Arrays.equals(numbers, numbers3));
    }

    public static void multiDimensionalArray() {
        int[][] numbers = { {0, 1, 2}, {3, 4, 5}};
        int[][] numbers2 = new int[2][3]; // older syntax

        numbers2[0][0] = 0;
        numbers2[1][0] = 1;

        System.out.println("Numbers without toString: " + numbers);
        System.out.println("Numbers with toString: " + Arrays.toString(numbers));
        System.out.println("Numbers with deepToString: " + Arrays.deepToString(numbers));
        System.out.println("Numbers length: " + numbers.length);

    }
}
