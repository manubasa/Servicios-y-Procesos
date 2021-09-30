package es.florida.ej1;

import java.math.BigInteger;

public class Ej4 {
    public static void main(String args[]){
        int number=15;
        BigInteger factorial = BigInteger.ONE;
        for(int i=1;i<=number;i++){
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Factorial of "+number+" is: "+factorial);
    }
}
