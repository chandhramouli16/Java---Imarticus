package Assesment3;

import java.util.Scanner;

public class Ques5 {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		
		System.out.println("Enter number of elements : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n]; 
		
		System.out.println("Enter all elements : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		System.out.println("Enter the element that you want to count the occurences : ");
		int ele=scn.nextInt();
		
		int count=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]==ele) {
				count++;
			}
		}
		
		System.out.println("Number of Occurrence of the Element : "+count);
		
		scn.close();
	}

}
