package ArrayPractice;

import java.util.Arrays;
import java.util.Scanner;

public class CheckLeader {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number of elements : ");
		int n=scn.nextInt();
		
		int[] arr=new int[n];
		
		System.out.println("Enter array elements one by one : ");
		for(int i=0;i<n;i++) 
			arr[i]=scn.nextInt();
		
		int leader,num=n,flag=0,k=0;;
		int[] lead=new int[num];
		
		for(int i=0;i<n;i++) {
			
			leader=arr[i];
			
			for(int j=i+1;j<n;j++) {
				if(leader<arr[j]) {
					flag=1;
				}
			}
			
			if(flag==0) {
				lead[k]=leader;
				k++;
			}
				
			else {
				flag=0;
				num--;
			}
			
		}
		
		Arrays.sort(lead);
		
		System.out.println("Leaders are : ");
		for(int i:lead)
			System.out.print(i+" ");
		
		scn.close();
	}

}
