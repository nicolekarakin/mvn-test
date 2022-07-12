package org.nnn4eu.nfische.linking2;

public class Animal2 {
    private String name;
    public Animal2(String name) {
        this.name = name;
    }

    public String getName() {
        System.out.println(name+" - Hello from Animal2.getName()");
        return name;
    }

    public void eat() {
        System.out.println(name+" - Hello from Animal2.eat()");
    }
    public void drink() {
        System.out.println(name+" - Hello from Animal2.drink()");
    }

    static public void xyz() { System.out.println("Hello from static Animal2.xyz()");}


}
