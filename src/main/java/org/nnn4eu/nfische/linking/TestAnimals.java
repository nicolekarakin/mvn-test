package org.nnn4eu.nfische.linking;

public class TestAnimals {
    public static void main( String [] args ) {
        Animal a = new Animal( );
        Animal b = new Horse( );
        Horse  c = new Horse( );
        System.out.println("Animal a="+a);
        System.out.println("Animal b="+b);
        System.out.println("Horse  c="+c);
        System.out.println("Proof ==========================================================");
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

    }
}