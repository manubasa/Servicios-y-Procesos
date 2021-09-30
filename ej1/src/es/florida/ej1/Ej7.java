package es.florida.ej1;

import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Give me your year ");
        int year=in.nextInt();;
            switch (year){
                case 0:System.out.println("Desarrollador Junior L1 – 15000-18000");
                    break;
                case 1,2:System.out.println("Desarrollador Junior L2 – 18000-22000");
                    break;

                case 3,4:System.out.println("Desarrollador Senior L1 – 22000-28000");
                    break;

                case 5,6,7,8:
                    System.out.println("Desarrollador Senior L2 – 28000-36000");
                    break;

                default:
                    System.out.println("Analista / Arquitecto. Salaio a convenir en base a rol");

            }
    }
}