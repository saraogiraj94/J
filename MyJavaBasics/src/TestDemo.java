//Whenever we create a object all its properties are complied first so when we create testdemo
//the sample property creates first then its constructor is called.

class Sample{
	Sample(int x){
		System.out.println(x);
	}
}

public class TestDemo {

	Sample s = new Sample(5);
	TestDemo(int x){
		s=new Sample(x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestDemo t = new TestDemo(10);
	}

}
