package com.Xworkz.Internal;

public class Fibinocciseries {
    public static void main(String[] args) {
        String name="madam";
        String revers ="";
        for(int i=name.length()-1;i>=0;i--){
            revers +=name.charAt(i);
            if(name.equals(revers)){
                System.out.println(revers+":Fibinocci Series");
            }
            else {
                System.out.println(revers+": This Result is not a Fibinocci Series");
            }
        }
    }
}
