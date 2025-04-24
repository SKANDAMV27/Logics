package com.Xworkz.Internal;

public class Array {
    public static void main(String[] args) {
        int a[] = {41, 25, 85, 47, 36, 79};
        System.out.println("Before Sortig: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        for (int i = 0; i <= a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] =a[j];
                    a[j]= temp;
                }
                System.out.println("\nDesideing order: ");
                for (int num : a) {
                    System.out.print(num + " ");
                }
                System.out.println("End");
            }
        }
    }
}
