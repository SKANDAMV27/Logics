package com.Xworkz.Internal;

public class AddressRunner {

    public static void main(String[] args) {


        Address<String> address=new Address<>("7/a");
       String no= address.getNo();
        System.out.println(no);

        Address<Integer> address1=new Address<>(3);
       Integer nos= address1.getNo();
        System.out.println(nos);

        Address address2=new Address(false);



    }
}
