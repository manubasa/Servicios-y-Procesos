package es.florida.ej1;

import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            System.out.println("Give me the first number of the interval ");
            int first = in.nextInt();
            System.out.println("Give me the first number of the interval ");
            int second = in.nextInt();
            int cont = 0;
            boolean isItPrime = true;
            for (int i = first; i <= second; i++) {
                if (isprime(i))
                {
                    System.out.println(i+" Is prime");
                }
                System.out.println(i+" not prime");
                }
            }
            public static boolean isprime(int i){
                int factors = 0;
                int j = 1;

                while(j <= i)
                {
                    if(i % j == 0)
                    {
                        factors++;
                    }
                    j++;
                }
                return (factors == 2);
            }

          }