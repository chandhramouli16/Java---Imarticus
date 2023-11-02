package OopsPractice;

import java.util.Scanner;

class Rectangle1{
	
	int length;
	int width;
	
	void insert(int l,int w) {
		length=l;
		width=w;
	}
	void calculateArea() {
		System.out.println(length*width);
	}
}

public class TestRectangle2 {

	public static void main(String[] args) {

		int a[]=new int[5];
		int b[]=new int[5];
		
		Scanner scn=new Scanner(System.in);
		Rectangle1 r=new Rectangle1();
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter the length and width : ");
			a[i]=scn.nextInt();
			b[i]=scn.nextInt();
		}
		for(int i=0;i<5;i++) {
			r.insert(a[i],b[i]);
			System.out.println("Area of rectangle "+(i+1)+": ");
			r.calculateArea();
		}
		
	}

}
