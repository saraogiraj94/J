//Program to perform Reader And Writer problem
class Account{

	double total;
	
	Account(double balance){
		total=balance;
	}
	//Syncronize deposit method

	public synchronized void deposit(double amt){
		if(amt<0)
			throw new IllegalArgumentException("Cant deposit");
		else{
			total+=amt;
			System.out.println("New Balance is after withdraw"+total);
		}
	}
	public synchronized void withdraw(double amt){
		if(amt<0||amt>total)
			throw new IllegalArgumentException("Cant deposit");
		else{
			total-=amt;
			System.out.println("New Balance after deposit "+total);		
		}
	}
}
class Deposit implements Runnable{
	
	double amt;
	Account acc;
	
	Deposit(double am,Account ac){
		amt=am;
		acc=ac;
	}
	
	
	public void run(){
		acc.deposit(amt);
	}
	
	
}

class Withdraw implements Runnable{
	double amt;
	Account acc;
	
	Withdraw(int am,Account ac){
		amt=am;
		acc=ac;
	}
	public void run(){
		acc.withdraw(amt);
	}
}

public class MultiThreadReadWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Account account = new Account(100);
		new Thread(new Deposit(30,account)).start();
		new Thread(new Deposit(20,account)).start();
		new Thread(new Deposit(10,account)).start();
		new Thread(new Withdraw(200,account)).start();
	}

}
