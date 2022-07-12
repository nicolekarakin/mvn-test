package org.nnn4eu.nfische.linking;

public class TestAnimals {
    public static void main( String [] args ) {
        Animal a = new Animal( );
        Animal b = new Horse( );
        Horse  c = new Horse( );
        System.out.println("Animal a="+a);
        System.out.println("Animal b="+b);
        System.out.println("Horse  c="+c);
        System.out.println("Proof: overriden funcs at runtime | static funcs at compile time");
        System.out.println("non-static eat() comes from instance type (ref-object) at run-time and overrides");
        System.out.println("static xyz() comes from reference type (ref-class) and doesn't override");
        System.out.println("================================================================");
        System.out.print("calling a.eat(): "); a.eat();
        System.out.print("calling b.eat(): "); b.eat();
        System.out.print("calling c.eat(): "); c.eat();
        System.out.print("calling a.xyz(): "); a.xyz();
        System.out.print("calling b.xyz(): "); b.xyz();
        System.out.print("calling c.xyz(): "); c.xyz();
        a=c;
        System.out.println("\nNow a and c point to same instance: ");
        System.out.println("Animal a="+a);
        System.out.println("Horse  c="+c);
        System.out.print("calling a.eat(): "); a.eat();
        System.out.print("calling c.eat(): "); c.eat();
        System.out.print("calling a.xyz(): "); a.xyz();
        System.out.print("calling c.xyz(): "); c.xyz();

        System.out.println("\nProof overloaden funcs at compile time==========================");
        System.out.println("static whoiam(Animal animal) takes reference type (ref-class) of Argument compile time and overloads");
        System.out.println("static whoiam(Horse horse) takes reference type (ref-class) of Argument compile time and overloads");
        System.out.println("================================================================");

        System.out.print("calling whoiam(a): "); whoiam(a);
        System.out.print("calling whoiam(c): "); whoiam(c);

        System.out.println("\nGenerics==========================");
        System.out.print("calling whoiamY(a): "); whoiamY(a);
        System.out.print("calling whoiamY(c): "); whoiamY(c);

        System.out.println("\nOnly child method==========================");
        //Animal a2=new Horse(); a2.runrun();
        //System.out.print("calling a.runrun(): "); a.runrun();
        System.out.print("calling c.runrun(): "); c.runrun();
        System.out.print("calling new Horse().runrun(): "); new Horse().runrun();
    }

    public static void whoiam(Animal animal){
        System.out.println("static whoiam(Animal animal)");
        animal.eat();
        animal.xyz();
    }

    public static void whoiam(Horse horse){
        System.out.println("static whoiam(Horse horse)");
        horse.eat();
        horse.xyz();
    }

    public static <T extends Animal> void whoiamY(T animal){
        System.out.println("static <T extends Animal> void whoiam(T animal)");
        animal.eat();
        animal.xyz();
    }
}