package com.Xworkz.Internal;

public class AmstrongNumber {
    public static boolean amstrongNumber(int num){
        int orignal=num;
        int result = 0;
        int digits = String.valueOf(num).length();
        while(num>0){
            int digit = num%10;
            result += Math.pow(digits,digit);
            num /=10;
        }
        return  num==orignal;
    }
}
