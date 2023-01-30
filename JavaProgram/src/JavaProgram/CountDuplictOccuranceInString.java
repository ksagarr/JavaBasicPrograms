package JavaProgram;

import java.util.Scanner;

public class CountDuplictOccuranceInString {

	public static void main(String[] args) {

		Scanner s= new Scanner(System.in);
		Scanner s2= new Scanner(System.in);
		System.out.println("Enetr the size of array");
		int size =s2.nextInt();
		String[] arr= new String[size];
		int[] fq=new int[arr.length];
		System.out.println("Enetr the element in array");
		for (int i = 0; i < arr.length; i++) {
			arr[i]=s.nextLine();
			fq[i]=1;
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i].equals(arr[j]))
				{
                   fq[i]++;
                   arr[j]="0";
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			      if(arr[i]!="0" & arr[i]!=" ") {
			    	  System.out.println(arr[i]+" "+fq[i]);
			      }
		}
	}

}
