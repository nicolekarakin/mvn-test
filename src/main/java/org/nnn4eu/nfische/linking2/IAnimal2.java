package org.nnn4eu.nfische.linking2;

public interface IAnimal2 {
    void eat();

    default String getName(){
        Class currentClass = new Object() { }.getClass().getEnclosingClass();
        System.out.println("Hello from default IAnimal.getName()  "+currentClass.getName());
        return "no-name";
    }
    static void xyz() {
        Class currentClass = new Object() { }.getClass().getEnclosingClass();
        System.out.println("Hello from static IAnimal.xyz()  "+currentClass.getName());
    }
}
