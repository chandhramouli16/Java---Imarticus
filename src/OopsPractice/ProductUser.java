package OopsPractice;

import java.util.Scanner;

class User {

	String userName;
	char size;
	int price;
	
	void getUserDet(String name, char s, int p) {
		userName=name;
		size=s;
		price=p;
	}
	void viewUserDet() {
		System.out.println("Customer Name : "+userName);
		System.out.println("Customer Size : "+size);
		System.out.println("Price : "+price);
		
	}
}

public class ProductUser {

	public static void main(String[] args) {

		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of Customers : ");
		int n=scn.nextInt();
		
		String[] name=new String[n];
		char[] size=new char[n];
		int[] price=new int[n];
		
		int num=1;
		for(int i=0;i<n;i++) {
			System.out.println("Enter details of Customer "+num);
			num++;
			System.out.println("Enter name : ");
			name[i]=scn.next();
			System.out.println("Enter size : ");
			size[i]=scn.next().charAt(0);
			System.out.println("Enter price : ");
			price[i]=scn.nextInt();
			System.out.println();
		}

		User u=new User();
		
		System.out.println("Enter name of the customer to view details : ");
		String cus=scn.next();
		for(int i=0;i<n;i++) {
			if(cus.equals(name[i])) {
				
				System.out.println("Details of the customer :  ");
				System.out.println();
				u.getUserDet(name[i],size[i],price[i]);
				u.viewUserDet();
				System.out.println();
			
			}
		}
		
	}

}
