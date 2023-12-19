package javaprogramspractice;

public class SecondProgram {
	
	static int i=10; //variable

	
	//method
	void meth() {
		System.out.println("Aman");
	}
	
	void meth1() {
		System.out.println("Aman");
	}
	
	void meth2() {
		System.out.println("Anita");
	}
	
	void meth3() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		
		SecondProgram sc = new SecondProgram(); //object creation
		
		sc.meth(); //calling of a method
		
		sc.meth3();
		
		System.out.println(SecondProgram.i);
		
	}
	

}
