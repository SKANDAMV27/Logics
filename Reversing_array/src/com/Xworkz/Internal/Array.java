package com.Xworkz.Internal;

public class Array {
    public static void main(String[] args) {
    int a[] = {40,58,36,74,63,23,16};
        System.out.println("Orginal array: ");{
            for(int num:a){
                System.out.print(+num+" ");
            }
            for(int i=0;i<= a.length/2;i++){
                int temp = a[i];
                a[i] = a[a.length-1-i];
                a[a.length-1-i] = temp;
            }
        }
        System.out.println("\nReverse array:");
        for(int num:a){
            System.out.print(+num+" ");
        }
    }
}
