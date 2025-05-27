package com.xworkz.internal.charArray;

public class charArray {
    public static void main(String[] args) {
        String str = "Thirthahalli";
        char[] charArray = str.toCharArray();
        for(int i= charArray.length-1;i>=0;i--){
            System.out.print(charArray[i]);//for single line
            System.out.println("");
            System.out.println("Original: "+str);
            System.out.println("Reverse: "+charArray[i]);
            System.out.println("End");
            System.out.println("");
        }
        // Another Method

        String str1 = "Samkani";
        char[] chars = str.toCharArray();
        for(int i=str1.length()-1;i>=0;i--){
           // System.out.print("Orginal String: "+str1);
            System.out.print(str1.charAt(i));
        }

    }
}
