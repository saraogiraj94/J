//A thread based program to find res=sin(x)+cos(x)+tan(x)
import java.lang.Math;
class sin extends Thread{
	double deg;
	double deg2rad,res;
	
	sin(double d){
		deg=d;
	}
	
	public void run(){
		System.out.println("Run of sin");
		deg2rad=Math.toRadians(deg);
		res=Math.sin(deg2rad);
		System.out.println("Exit of sin"+res);
	}
}
class cos extends Thread{
	double deg;
	double deg2rad,res;
	
	cos(double d){
		deg=d;
	}
	
	public void run(){
		System.out.println("Run of cos");
		deg2rad=Math.toRadians(deg);
		res=Math.cos(deg2rad);
		System.out.println("Exit of cos"+res);
	}
}
class tan extends Thread{
	double deg;
	double deg2rad,res;
	
	tan(double d){
		deg=d;
	}
	
	public void run(){
		System.out.println("Run of sin");
		deg2rad=Math.toRadians(deg);
		res=Math.tan(deg2rad);
		System.out.println("Exit of sin"+res);
	}
}
public class MultiThread1 {
	public static void main(String[] args){
		sin s =new sin(45);
		cos c = new cos(60);
		tan t =new tan(30);
		s.start();
		c.start();
		t.start();
		try{
			s.join();
			c.join();
			t.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		double result= s.res+c.res+t.res;
		System.out.println("Result is"+result);
		
	}
}
