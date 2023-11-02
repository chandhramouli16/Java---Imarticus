package OopsPractice;

class Account{
	
	float balanceAmount;
	int accId;
	String accName;
	
	void insert(int id, String name, float bal) {
		accId=id;
		accName=name;
		balanceAmount=bal;
	}
	void display() {
		System.out.println(accId+" "+accName+" "+balanceAmount);
	}
	void checkBalance() {
		System.out.println("Balance is: "+balanceAmount);
	}
	void deposit(float dep) {
		System.out.println(dep+" Deposited");
		balanceAmount=balanceAmount+dep;
	}
	void withdraw(float with) {
		System.out.println(with+" Withdrawn");
		balanceAmount=balanceAmount-with;
	}

}
public class BankAccount {

	public static void main(String[] args) {

		Account a1=new Account();
		a1.insert(832345,"Ankit",1000);
		a1.display();
		a1.checkBalance();
		a1.deposit(40000);
		a1.checkBalance();
		a1.withdraw(15000);
		a1.checkBalance();
		
	}

}
