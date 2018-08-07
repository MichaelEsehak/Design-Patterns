package com.design.pattern.factory;

public class ServerPC extends Computer{

    private String RAM;
    private String HDD;
    private String CPU;

    public ServerPC(String RAM, String HDD, String CPU) {
        this.RAM = RAM;
        this.HDD = HDD;
        this.CPU = CPU;
    }

    public String getRAM() {
        return RAM;
    }

    public String getHDD() {
        return HDD;
    }

    public String getCPU() {
        return CPU;
    }
}
