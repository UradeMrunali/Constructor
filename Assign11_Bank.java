
class Bank {
 void getBalance(){
	 System.out.println("0");
 }
}
class BankA extends Bank{
	void getBalance(){
		super.getBalance();
		System.out.println("Your deposited amount in BankA is 1000 rs");
	}
}
class BankB extends Bank{
	void getBalance(){
		System.out.println("Your deposited amount in BankB is 1500 rs");
	}
}
class BankC extends Bank{
	void getBalance(){
		System.out.println("Your deposited amount in BankC is 2000 rs");
	}
}

class Assign11_Bank{
	public static void main(String[] args) {
		
		
		BankA A=new BankA();
		BankB B=new BankB();
		BankC C=new BankC();
		
		A.getBalance();
		B.getBalance();
		C.getBalance();
}
}

