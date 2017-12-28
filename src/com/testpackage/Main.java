package com.testpackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int [] sequence=fillArray();
        print(sequence);
    }

    public static int[] fillArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Заполните массив:");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            }
        return array;
    }

    public static void print(int[] array) {
        int[] newArray = removeTheSameNumbers(array);
        for (int i = 0; i < newArray.length; i++) {
            if(newArray[i] != 0) {
                System.out.print(newArray[i] + " ");
            }
        }
    }

    private static int[] removeTheSameNumbers(int[] array) {
        int index = 1;
        int[] newArray = new int[array.length];
        newArray[0]=array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
}
