package org.nnn4eu.nfische.linking2;

public class TestAnimals2 {
    public static void main( String [] args ) {

        Animal2 a = new Animal2("animal2 a" );
        Animal2 b1 = new Horse("horse b1 as animal2" );
        Animal2 b2 = new Dog("dog b2 as animal2" );
        Horse c1 = new Horse("horse c1 as horse" );
        Dog c2 = new Dog("dog c2 as dog" );
        IAnimal2 d1 = new Horse("horse d1 as ianimal2" );
        IAnimal2 d2 = new Dog("dog d2 as ianimal2" );

        a.eat();
        System.out.println("================================================================");
        b1.eat();b2.eat();c1.eat();c2.eat();d1.eat();d2.eat();
        System.out.println("================================================================");
        b1.xyz();b2.xyz();c1.xyz();c2.xyz();//d1.xyz();d2.xyz();//Static method may be invoked on containing interface class only
        System.out.print("calling d.xyz(): Static method may be invoked on containing interface class only\n"); //d.xyz();
        System.out.println("================================================================");
        b1.drink();b2.drink();c1.drink();c2.drink();
        System.out.println("================================================================");
        c1.runRun();c2.bark();
    }


}