package com.Xworkz.Internal;

public class Fibinocciserics {
    public static void main(String[] args) {
        int i=0;
        int num = 10;
        int first =0;
        int second =1;
        for(i=1;i<=num;i++){
            int result = first+second;
            first = second;
            second = result;
            System.out.print(result+" ");
        }
    }
}
