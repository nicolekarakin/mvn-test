package org.nnn4eu.nfische.linking2;

public class TestAnimals2 {
    public static void main( String [] args ) {

        Animal2 a = new Animal2("animal2 a" );
        Animal2 b = new Horse2("horse2 b as animal2" );
        Horse2 c = new Horse2("horse2 c as horse2" );
        IAnimal2 d = new Horse2("horse2 d as ianimal2" );
        System.out.println("Animal a="+a);
        System.out.println("Animal b="+b);
        System.out.println("Horse  c="+c);
        System.out.println("IAnimal  d="+d);
        System.out.println("Proof: overriden funcs at runtime | static funcs at compile time");
        System.out.println("non-static eat() comes from instance type (ref-object) at run-time and overrides");
        System.out.println("static xyz() comes from reference type (ref-class) and doesn't override");
        System.out.println("================================================================");
        System.out.print("calling a.eat(): "); a.eat();
        System.out.print("calling b.eat(): "); b.eat();
        System.out.print("calling c.eat(): "); c.eat();
        System.out.print("calling d.eat(): "); d.eat();
        System.out.print("calling a.xyz(): "); a.xyz();
        System.out.print("calling b.xyz(): "); b.xyz();
        System.out.print("calling c.xyz(): "); c.xyz();
        System.out.print("calling d.xyz(): Static method may be invoked on containing interface class only\n"); //d.xyz();

        System.out.print("calling a.getName(): "); a.getName();
        System.out.print("calling b.getName(): "); b.getName();
        System.out.print("calling c.getName(): "); c.getName();
        System.out.print("calling d.getName(): "); d.getName();
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
        IAnimal2 a2=new Horse2("horse2 a2 as ianimal2");

        System.out.print("calling a2.getName(): "); a2.getName();
        System.out.print("calling a.getName(): "); a.getName();
        System.out.print("calling c.runrun(): "); c.runrun();
        System.out.print("calling new Horse2().runrun(): "); new Horse2("horse2 anonym as animal2").runrun();
    }

    public static void whoiam(Animal2 animal2){
        System.out.println("static whoiam(Animal2 animal)");
        animal2.eat();
        animal2.xyz();
    }

    public static void whoiam(Horse2 horse2){
        System.out.println("static whoiam(Horse2 horse)");
        horse2.eat();
        horse2.xyz();
    }

    public static <T extends Animal2> void whoiamY(T animal){
        System.out.println("static <T extends Animal2> void whoiam(T animal)");
        animal.eat();
        animal.xyz();
    }
}