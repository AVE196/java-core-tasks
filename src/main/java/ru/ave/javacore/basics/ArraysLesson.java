package ru.ave.javacore.basics;

import java.util.Arrays;

public class ArraysLesson {

    public static void main(String[] args) {
        int[] testNumbers = {4, 0, -3, 5, 8, -2};
        sortingArray(testNumbers);
        System.out.println(Arrays.toString(testNumbers));
    }

    static void sortingArray(int[] numbers) {
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
