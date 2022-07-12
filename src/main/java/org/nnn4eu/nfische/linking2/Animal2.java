package org.nnn4eu.nfische.linking2;

public class Animal2 {
    private String name;

    public String getName() {
        System.out.println("Hello from Animal2.getName()  "+name);
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal2(String name) {
        this.name = name;
    }

    public void eat() {
        System.out.println("Hello from Animal2.eat()  "+this.getClass().getName());
    }

    static public void xyz() {
        Class currentClass = new Object() { }.getClass().getEnclosingClass();
        System.out.println("Hello from static Animal2.xyz()  "+currentClass.getName());
    }
}
