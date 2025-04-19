package com.Xworkz.External;

import com.Xworkz.Internal.Animal;

public class Dog extends Animal {
     public Dog(){
         super();
         System.out.println("No args as a Dog Constructor");
    }

    @Override
    public void name() {
        super.name();
        System.out.println("Animal Name Dog");
    }
}
