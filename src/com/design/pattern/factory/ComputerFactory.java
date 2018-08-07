package com.design.pattern.factory;

public class ComputerFactory {

    public static Computer getComputer(String type,String RAM,String HDD, String CPU){
        switch (type){
            case "pc":
                return new PersonalPC(RAM,HDD,HDD);
            case "server":
                return new ServerPC(RAM,HDD,HDD);
                default:
                    throw new IllegalArgumentException("Type not supported");
        }
    }

}
