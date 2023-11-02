package OopsPractice;

class GrandMother{
	void show1() {
		System.out.println("GrandMother class");
	}
}

class Mother extends GrandMother{
	void show2() {
		System.out.println("Mother class");
	}
}

class Daughter extends Mother{
	void show3() {
		System.out.println("Daughter class");
	}
}

class GrandDaughter extends Daughter{
	void show4() {
		System.out.println("GrandDaughter class");
	}
}

public class Multilevel1 {

	public static void main(String[] args) {
		
		GrandDaughter gd=new GrandDaughter();
		gd.show1();
		gd.show2();
		gd.show3();
		gd.show4();
		
	}

}
