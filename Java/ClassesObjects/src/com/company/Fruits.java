package com.company;

public class Fruits {
    private static int id;
    private String name;
    private String color;
    private boolean isPoisonous;

    public Fruits(String name, String color, boolean isPoisonous) {
        this.id += 1;
        this.name = name;
        this.color = color;
        this.isPoisonous = isPoisonous;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isPoisonous() {
        return isPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        isPoisonous = poisonous;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Color: " + this.color);
        System.out.println("Poisonous?: " + this.isPoisonous);
        System.out.println();
    }
}
