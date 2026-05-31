package ru.ave.javacore.basics;

public class Variables {
    public static void main(String[] args) {
        int[] numbers = {1,5,8,7};
        sorting(numbers);
        for(int i : numbers) {
            System.out.println(i);
        }
    }

    static void sorting(int[] num) {
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length; j++) {
                if (num[i] <= num[j]) {
                    int temp = num[j];
                    num[j] = num[i];
                    num[i] = temp;
                }
            }
        }
    }
}
