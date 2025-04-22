package com.Xworkz.Internal;

public class Runner {
    public static void main(String[] args) {
        Conector conector = new ConnectorImp();
        ConnectorUser connectorUser = new ConnectorUser(conector);
        connectorUser.execuit();
    }
}
