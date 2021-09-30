package es.florida.ej1;
import java.util.Scanner;
import java.util.*;
import java.util.ArrayList;


public class Ej6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> num=new ArrayList<>();
        int suma=0;
        int i=0;
        while(i<=5) {

            System.out.println("Please enter your first number:");
            int value = in.nextInt();
            num.add(value);
            suma=suma+value;
            i++;

        }

        Collections.reverse(num);
        System.out.println(num);
        System.out.println(suma);

    }
}


