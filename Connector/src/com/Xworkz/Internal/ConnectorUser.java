package com.Xworkz.Internal;

public class ConnectorUser{
    Conector conector;
    public ConnectorUser(Conector conector){
        this.conector=conector;
    }
    public void execuit(){
        if(this.conector!=null){
            this.conector.work();
        }
        else {
            System.out.println("Not an Null Value in the Connector");
        }
    }

}
