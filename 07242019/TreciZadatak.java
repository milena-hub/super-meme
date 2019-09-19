package domacizadatak;

import java.util.Scanner;

public class TreciZadatak {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int a = 5,b=3,r=10;
		  String S;
		  System.out.println("Unesite predmet");
		  S = sc.nextLine();
		  
		  switch(S) {
		        case "Kvadrat":
		        	
		         System.out.println("Povrsina figure je" + a*a + ", a obim je" + 4*a);
		         break;
		        case "Pravougaonik":
		        	
		        	
		         System.out.println("Povrsina figure je" + a*b + ", a obim je" + (2*a+2*b));
		         break;
		        case "Krug":
		        	
		         System.out.println("Povrsina figure je" + r*r*Math.PI + ", a obim je" + 2*r*Math.PI);
		         break;
		         default:System.out.println("Los unos");
		         
		        }
		 }
		}


		  