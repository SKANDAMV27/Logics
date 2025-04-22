package com.Xworkz.Internal;

public class Address<DT,ST,V> {


    private DT no;
    private ST state;

    public Address(DT no)
    {
        this.no=no;
    }

    public DT getNo() {
        return no;
    }

    public V getValue(V v)
    {
        return  v;
    }


}
