package org.nnn4eu.nfische.linking;

public class Animal {
    public void eat() {
        System.out.println("Hello from Animal.eat()  "+this.getClass().getName());
    }

    static public void xyz() {
        Class currentClass = new Object() { }.getClass().getEnclosingClass();
        System.out.println("Hello from static Animal.xyz()  "+currentClass.getName());
    }
}
