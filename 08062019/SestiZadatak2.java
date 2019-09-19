package domacizadatak;

import java.util.Scanner;

public class SestiZadatak2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Unesite pocetni broj niza");
		int t= sc.nextInt();
		int c= sc.nextInt();
		int arr1[] = new int[t]; 
        int arr2[] = new int[c]; 
        int m = arr1.length; 
        int n = arr2.length; 
	    
		ucitajArr1(arr1);
		ucitajArr2(arr2);
        printUnion(arr1, arr2, m, n); 
    } 
static void ucitajArr1(int []arr1) {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr1.length;i++) {
	System.out.println("Unesi element:");
	arr1[i]=sc.nextInt();
 
	}
}
static void ucitajArr2(int []arr2) {
	Scanner sc = new Scanner(System.in);
	for(int i=0;i<arr2.length;i++) {
	System.out.println("Unesi element:");
	arr2[i]=sc.nextInt();
 
	}
}
		/* Function prints union of arr1[] and arr2[] 
		 *
	    m is the number of elements in arr1[] 
	    n is the number of elements in arr2[] */
static int printUnion(int arr1[], int arr2[], int m, int n) 
{ 
  int i = 0, j = 0; 
  while (i < m && j < n) 
  { 
    if (arr1[i] < arr2[j]) 
      System.out.print(arr1[i++]+" "); 
    else if (arr2[j] < arr1[i]) 
      System.out.print(arr2[j++]+" "); 
    else
    { 
      System.out.print(arr2[j++]+" "); 
      i++; 
    } 
  } 
   
  /* Print remaining elements of  
     the larger array */
  while(i < m) 
   System.out.print(arr1[i++]+" "); 
  while(j < n) 
   System.out.print(arr2[j++]+" "); 
  return 0;    
} 
  

}
  





	   