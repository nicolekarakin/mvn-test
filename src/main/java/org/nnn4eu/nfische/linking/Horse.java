package org.nnn4eu.nfische.linking;

class Horse extends Animal {
    public void eat() {
        System.out.println("Hello from Horse.eat() "+this.getClass().getName());
    }

    public void runrun(){
        System.out.println("Hello from Horse.runrun() "+this.getClass().getName());
    }

    static public void xyz() {
        Class currentClass = new Object() { }.getClass().getEnclosingClass();
        System.out.println("Hello from static Horse.xyz()  "+currentClass.getName());
    }
}