package org.nnn4eu.nfische;

import java.util.Scanner;

public class JavaDummy {
    public static int[] input(int amount){
        boolean ok=false;
        int ab[]=new int[amount];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<ab.length && !ok;ok=(i==ab.length)){
            System.out.print("Enter a valid Integer value : ");
            if(scan.hasNextInt()){
                ab[i] = scan.nextInt();
                i++;
            }else{
                scan.nextLine();
                System.out.println("Enter a valid Integer value");
            }

        }
        return ab;
    }

    public static boolean greaterThanX(int a, int x){
        return a>x;
    }
    public static int summ(int a, int b){
        return a+b;
    }

    public static String printSumm(int a, int b){
        System.out.println("Summ: "+(a+b));
        return ""+(a+b);
    }

}
