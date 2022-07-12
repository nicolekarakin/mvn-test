package org.nnn4eu.nfische.linking2;

public interface IAnimal2 {
    void eat();

    default String getName(){
        System.out.println("Hello from default IAnimal.getName()");
        return "no-name";
    }
    static void xyz() {
        System.out.println("Hello from static IAnimal.xyz()");
    }
}
