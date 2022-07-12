package org.nnn4eu.nfische.linking2;

class Horse2 extends Animal2 implements IAnimal2 {
    public Horse2(String name) {
        super(name);
    }

    public void eat() {
        System.out.println("Hello from Horse2.eat() "+this.getClass().getName());
    }

    public void runrun(){
        System.out.println("Hello from Horse2.runrun() "+this.getClass().getName());
    }

}