package com.Xworkz.Internal;

public class BubbleSort {
    public static void main(String[] args) {
        int[] a = {45, 78, 1, 36, 74, 95};

        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    // Correctly swap adjacent elements
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for (int num : a) {
            System.out.print(num + " ");
        }
        System.out.println("\nCompleted");
    }
}
