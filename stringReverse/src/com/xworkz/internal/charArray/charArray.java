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

        //Another Method String Buffer Method
        System.out.println("");
        String str2 = "Bettamakki";
        char[] chars1 = str2.toCharArray();
        StringBuffer sb = new StringBuffer(str2);
        System.out.println(sb.length());
        System.out.println(sb.reverse());

        //Another Method String Builder
        System.out.println("");
        String str3 = "MeenuGoadu";
        char[] chars2 = str3.toCharArray();
        StringBuilder builder = new StringBuilder(str3);
        System.out.println(str3.length());
        System.out.println(builder.reverse());

    }
}
