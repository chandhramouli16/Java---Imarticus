package ArrayPractice;

import java.util.Scanner;

public class AscendingOrder {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int temp;
		
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		System.out.println("Array in ascending order : ");
		for(int i=0;i<n;i++) {
			System.out.println(arr[i]+" ");
		}
		
		scn.close();
		
	}

}
