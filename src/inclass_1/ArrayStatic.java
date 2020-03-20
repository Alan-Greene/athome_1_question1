package inclass_1;

import java.util.Scanner;

public class ArrayStatic {

    public static void main(String[] args) {

        int[] numbers_one = new int[10];
        int[] numbers_two = new int[5];

        int total;
        double average;
        int max;

        populate_array(numbers_one);
        print(numbers_one);
        total = calc_total(numbers_one);
        average = calc_average(numbers_one);

        System.out.printf("The total for array_one is: %d%n", total);
        System.out.printf("The average for array_one is: %.2f%n", average);

        System.out.println("_________________________________________________");

        populate_array(numbers_two);
        print(numbers_two);
        total = calc_total(numbers_two);
        average = calc_average(numbers_two);

        System.out.printf("The total for array_two is: %d%n", total);
        System.out.printf("The average for array_two is: %.2f%n", average);
    }

    public static void populate_array(int[] array_in) {
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < array_in.length; i++) {
            System.out.printf("Please enter number %d:%n", i + 1);
            array_in[i] = in.nextInt();
        }
    }

    public static void print(int[] array_in) {
        for (int i = 0; i < array_in.length; i++) {
            System.out.printf("Number %d is %d%n", i + 1, array_in[i]);
        }
    }

    public static int calc_total(int[] array_in) {
        int sum = 0;

        for (int value : array_in) {
            sum += value;
        }
        return sum;
    }

    public static double calc_average(int[] array_in){
        return calc_total(array_in) / (double) array_in.length;
    }

}