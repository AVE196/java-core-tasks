package ru.ave.javacore.basics;

import java.util.Arrays;

public class ArraysLesson {

    public static void main(String[] args) {
        int[] testNumbers = {4, 0, -3, 5, 8, -2};
        sortingArray(testNumbers);
        System.out.println(Arrays.toString(testNumbers));

        testNumbers = new int[] {4, 0, -3, 5, 8, -2};
        sortingArrayTwo(testNumbers);
        System.out.println(Arrays.toString(testNumbers));

    }

    static void sortingArray(int[] numbers) {
        if (numbers.length > 1) {
            for (int i = 0; i < numbers.length - 1 ; i++) {
                for (int j = 0; j < numbers.length - 1 - i; j++) {
                    if (numbers[j] > numbers[j+1]) {
                        int temp = numbers[j + 1];
                        numbers[j + 1] = numbers[j];
                        numbers[j] = temp;
                    }
                }
            }
        }
    }

    static void sortingArrayTwo(int[] numbers) {
        if (numbers.length > 1) {
            for (int i = numbers.length -1; i > 0; i--) {
                for (int j = i - 1; j >= 0; j--) {
                    if (numbers[i] < numbers[j]) {
                        int temp = numbers[j];
                        numbers[j] = numbers[i];
                        numbers[i] = temp;
                    }
                }
            }
        }
    }

}
