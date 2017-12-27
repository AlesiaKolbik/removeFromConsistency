package com.testpackage;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива:");
        int size = scanner.nextInt();
        int[] sequence = new int[size];
        System.out.println("Заполните массив:");
        for (int i = 0; i < sequence.length; i++) {
            sequence[i] = scanner.nextInt();
        }
        sequence = removeTheSameNumbers(sequence);
        print(sequence);
    }

    private static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static int[] removeTheSameNumbers(int[] array) {
        int index = 0;
        int[] newArray = new int[array.length];
        for (int i = 0; i < array.length-1; i++) {
            if (array[i] != array[i + 1]) {
                newArray[index] = array[i];
                index++;
                if (i+1== array.length - 1)
                    newArray[index] = array[i + 1];
            }
        }
        newArray=removeNullIndexes(newArray);
        return newArray;
    }

    private static int [] removeNullIndexes(int[] array) {
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                index = i;
                break;
            }
        }
        if (index != 0) {
            int[] newArray = new int[index];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = array[i];
            }
            array=newArray;
        }
        return array;
    }
}
