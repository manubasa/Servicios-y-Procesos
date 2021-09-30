package es.florida.ej1;



	import java.util.Scanner;

	public class Ej3 {
	    
		public static void main(String[] args) {
	        var in = new Scanner(System.in);
	        System.out.println("Please enter your first number:");
	        int value= in.nextInt();;
			int par;
	        int suma=0;

	            for (int e=0;e<=value;e++){
	                if (e % 2==0){

	                    System.out.println(e);
	                    suma=e+suma;

	                }
	            }
	        System.out.println("La suma es "+suma);

	    }
	}

