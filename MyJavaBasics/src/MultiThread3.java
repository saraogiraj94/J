//Program to use sleep method and print a pattern and also use join and priority
class Th1 implements Runnable{
	public void run(){
		for(int i=65;i<76;i++)
		{	
			char b = (char)i;
			System.out.println(b);
		}
	}
}

class Th2 implements Runnable{
	public void run(){
		for(int i=1;i<11;i++)
			System.out.println(i);
	}
}

public class MultiThread3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Thread t1 = new Thread(new Th1());
		Thread t2= new Thread(new Th2());
		
		t2.setPriority(10);
		t1.setPriority(7);
		
		t2.start();
		try{
			t2.sleep(1500);	
		}catch(Exception e){
			
		}
		try{
			t1.sleep(1500);	
		}catch(InterruptedException e){
			
		}
		
		t1.start();
		//t1.sleep(3000);
		
		
		
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			
		}
		
		for(int i=76;i<92;i++)
		{	
			char b = (char)i;
			System.out.println(b);
		}
		
		
	}

}
