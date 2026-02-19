package org.example;

class Main {
    public static int difference(int[] array) {
        int min = array[0];
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max - min;
    }

    public static void main(String[] args) {
        // Check for first task
        int[] test = {1, 2, 5, 3, 8};
        int result = difference(test);
        System.out.println("Difference of max and min numbers is: " + result);

        // Check for second task
        findSmallest(test);

        // Check for third task
        double x = 8.0;
        double y = 19.0;
        double calculation = calculateExpression(x, y);
        System.out.println("The result of expression is: " + calculation);
    }

    // Second task
    public static void findSmallest(int[] array2) {
        int min = array2[0];
        int secondSmallest = array2[1];

        for (int i = 0; i < array2.length; i++) {
            if (array2[i] < min) {
                secondSmallest = min;
                min = array2[i];
            } else if (array2[i] < secondSmallest && array2[i] != min) {
                secondSmallest = array2[i];
            }
        }

        System.out.println("The smallest of array is: " + min);
        System.out.println("The second smallest of array is: " + secondSmallest);
    }

    // Third task
    public static double calculateExpression(double x, double y) {
        double firstPart = Math.pow(x, 2);
        double secondPart = Math.pow((4 * y) / 5 - x, 2);
        return firstPart + secondPart;
    }
}