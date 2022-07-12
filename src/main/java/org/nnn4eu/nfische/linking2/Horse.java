package org.nnn4eu.nfische.linking2;

class Horse extends Animal2 implements IAnimal2 {
    public Horse(String name) {
        super(name);
    }

    public void eat() {
        System.out.println(this.getName()+" - Hello from Horse.eat()");
    }

    public void runRun(){
        System.out.println(this.getName()+" - Hello from Horse.runRun()");
    }

}