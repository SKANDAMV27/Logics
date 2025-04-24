package com.Xworkz.Internal;

public class Largest {
    public static void main(String[] args) {
        int a[] = {140,20,63,87,63,24,96,78,45};
        System.out.println("Array List: ");
        for (int max:a){
            System.out.print(max+" ");
        }
        int max = a[0];
        for(int i=1;i>a.length;i++){
            if(a[i]>max){
                max=a[i];

            }
        }
        System.out.println("\nlargest Number: "+max);
    }
}
