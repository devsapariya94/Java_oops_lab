class Account{
	
	private int accNo;
	private double balance;

	public Account(int an, double am){
		accNo = an;
		balance = am;
	}
	
	public void deposit(double amount){
		balance = balance + amount;
	}
	
	public void transfer(Account ac1, Account ac2){
	}	
	
	public double getBalance(){
		return balance;
	}
}

class JavaPassByValue{

	public static void testPassByValue(Account ac, int amount){
		
		amount = amount + 1000; // 3000

		ac.deposit(7000); // 13000
		
		System.out.println("Balance in method :" + ac.getBalance()); // 13000
		
		ac = new Account(102, 5000);

		ac.deposit(2000);// 7000

		System.out.println("New Acc Balance in method :" + ac.getBalance());// 7000
		
		System.out.println("Amount Value in function : " + amount); // 5000
	}

	public static void main(String[] args){

	int amount = 2000;
	Account ac = new Account(101, amount);

	ac.deposit(4000); // 6000		
	testPassByValue(ac, amount);

	System.out.println("Account ac balance in main : " + ac.getBalance()); // 6000/13000/7000

	System.out.println("Value in main : " + amount);//  2000/5000	
	}
}

public class PassByValue {
    
}
