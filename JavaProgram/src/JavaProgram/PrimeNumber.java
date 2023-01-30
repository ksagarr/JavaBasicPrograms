package JavaProgram;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner r= new Scanner(System.in);
		System.out.println("Enter the number");
		int num=r.nextInt();
		boolean ans=PrimeNumber.fun(num);
		if(ans==true) {
			System.out.println("It is Prime Number");
		}
		else
			System.out.println("It is not Prime Number");

	}
   
	 
	static boolean fun(int x) {
		
		if(x==1) {
			return false;
		}
		for(int i=2 ;i<x;i++) {
			if(x%i==0) {
				
				return false;
			}
			
		}
		return true;
	}
}
