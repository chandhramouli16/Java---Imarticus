package Recursion;

public class CallByValue {
	
	int data=50;
	
	void change(int data) {
		this.data=data+100;
	}

	public static void main(String[] args) {

		CallByValue cbv=new CallByValue();
		
		System.out.println("Before change : "+cbv.data);
		cbv.change(500);
		System.out.println("After change : "+cbv.data);
	}

}
