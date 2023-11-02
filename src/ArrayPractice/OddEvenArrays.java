package ArrayPractice;

import java.util.Scanner;

public class OddEvenArrays {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size of the array : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter elements of the array : ");
		for(int i=0;i<n;i++) {
			arr[i]=scn.nextInt();
		}
		
		int[] even=new int[n];
		int[] odd=new int[n];
		
		int index=0;
		int index1=0;
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				even[index]=arr[i];
				index++;
			}
			else {
				odd[index1]=arr[i];
				index1++;
			}
		}
		System.out.println("Even array : ");
		for(int i:even) {
			if(i!=0)
				System.out.print(i+" ");
			else
				break;
		}
		System.out.println();
		System.out.println("Odd array : ");
		for(int i:odd) {
			if(i!=0)
				System.out.print(i+" ");
			else
				break;
		}
		
		scn.close();
	}

}
