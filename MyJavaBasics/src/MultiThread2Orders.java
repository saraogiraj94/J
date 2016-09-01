class T1 implements Runnable{
	public void run(){
		System.out.println("Started Thread T1");
		for(int i=0;i<4;i++)
			System.out.println("For T1 i is "+ i);
	}
}
class T2 implements Runnable{
	public void run(){
		System.out.println("Started Thread T2");
		for(int i=0;i<4;i++)
			System.out.println("For T2 i is "+ i);
	}
}
class T3 implements Runnable{
	public void run(){
		System.out.println("Started Thread T3");
		for(int i=0;i<4;i++)
			System.out.println("For T3 i is "+ i);
	}
}

public class MultiThread2Orders {
	public static void main(String[] ar){
		T1 a= new T1();
		T2 b = new T2();
		T3 c =new T3();
		
		Thread t1= new Thread(a);
		Thread t2 =new Thread(b);
		Thread t3 = new Thread(c);
		
		t3.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.NORM_PRIORITY);
		t1.setPriority(Thread.MIN_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
		
	}
}
