package com.Xworkz_Internal;

public class Student <T>{
    public T tata;
    public T tata1;
    public Student(T tata,T tata1){
        this.tata=tata;
        this.tata1=tata1;
    }

    public T getTata() {
        return tata;
    }

    public T getTata1() {
        return tata1;
    }
    public void setTata(T tata){
        this.tata = tata;
    }
    public void setTata1(T tata1){
        this.tata1=tata1;
    }

    @Override
    public String toString() {
        return "T data: "+tata+" T2 Data: "+tata1+"";
    }
}
