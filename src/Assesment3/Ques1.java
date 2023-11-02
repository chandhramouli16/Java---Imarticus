package Assesment3;

import java.util.Scanner;

public class Ques1 {

	public static void main(String[] args) {

			Scanner scn=new Scanner(System.in);
			
			System.out.println("Enter number of elements : ");
			int n=scn.nextInt();
			
			int[] arr=new int[n]; 
			
			System.out.println("Enter all the elements : ");
			for(int i=0;i<n;i++) {
				arr[i]=scn.nextInt();
			}
			
			System.out.println();
			
			System.out.println("Enter the element you want to search : ");
			int el=scn.nextInt();
		
			int flag=0;
			
			for(int i=0;i<n;i++) {
				if(arr[i]==el) {
					System.out.print("Element found at position "+(i+1));
					flag=1;
				}
			}
			if(flag==0) {
				System.out.println("Element not found");
			}
			
			scn.close();
		
	}

}
