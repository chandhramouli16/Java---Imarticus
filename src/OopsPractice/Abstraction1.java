package OopsPractice;

abstract class Difference{
	
	public abstract int diffOfTwo(int n1,int n2);
	public abstract int diffOfThree(int n1,int n2,int n3);
	public void disp() {
		System.out.println("Class Difference");
	}
	
}
class Abstraction1 extends Difference{
	
	public static void main(String[] args) {
		Difference obj=new Abstraction1();
		System.out.println(obj.diffOfTwo(3,7));
		System.out.println(obj.diffOfThree(4, 3, 23));
		obj.disp();
		

	}
	public int diffOfTwo(int num1,int num2) {
		return num1-num2;
		
	}
	public int diffOfThree(int num1,int num2,int num3) {
		return num1-num2-num3;
	}
	
}



	


