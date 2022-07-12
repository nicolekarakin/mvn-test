package org.nnn4eu.nfische.linking2;

class Dog extends Animal2 implements IAnimal2 {
    public Dog(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName()+" - Hello from Dog.eat()");
    }
    public void bark() {
        System.out.println(this.getName()+" - Hello from Dog.bark()");
    }

}