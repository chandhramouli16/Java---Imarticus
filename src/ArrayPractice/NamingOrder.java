package ArrayPractice;

import java.util.Scanner;

public class NamingOrder {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		String[] names=new String[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			names[i]=scn.next();
		}
		
		String temp;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(names[i].charAt(0)>names[j].charAt(0)) {
					temp=names[i];
					names[i]=names[j];
					names[j]=temp;
				}
			}
		}
		
		System.out.println("Array in alphabetical order : ");
		for(int i=0;i<n;i++) {
			System.out.println(names[i]+" ");
		}
		
		scn.close();
		
	}

}
