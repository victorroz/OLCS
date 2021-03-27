package com.company;

public class Phone {
    private static int id;
    private String manufacturer;
    private String model;


    public Phone(String manufacturer, String model) {
        this.id += ++this.id;
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void showInfo() {
        System.out.println("|-----MOBILE INFO-----|");
        System.out.println("Manufacturer: " + this.getManufacturer());
        System.out.println("Model: " + this.getModel());
        System.out.println();
    }
}
