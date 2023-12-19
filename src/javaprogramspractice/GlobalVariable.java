package javaprogramspractice;

public class GlobalVariable {
	
	static int i=10; //static variable
	
	int b=20; //instance variable

	public static void main(String[] args) {
		
		GlobalVariable gc = new GlobalVariable();
		GlobalVariable.meth();
		
		System.out.println(GlobalVariable.i);
		
		System.out.println(gc.b);

	}
	
	
	
	static void meth() {
		System.out.println(GlobalVariable.i);
	}

}
