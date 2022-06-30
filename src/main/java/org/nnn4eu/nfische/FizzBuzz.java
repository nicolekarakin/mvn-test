package org.nnn4eu.nfische;

public class FizzBuzz {
    public static String transform(int num){
        String result = num+"";
        result=(num%2 == 0 || num%3 == 0)?"Fizz":result;
        result=(num%3 == 0)? result+="Buzz": result;
        return result;
    }
}
