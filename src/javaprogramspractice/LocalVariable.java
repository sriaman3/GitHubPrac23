package javaprogramspractice;

public class LocalVariable {
	
	//local, instance, static(global)

	public static void main(String[] args) {
		
		int a=20;
		
		LocalVariable loc = new LocalVariable();
		loc.meth(50, 10);
		
	}
	
	
	void meth(int b, int c) {
		
		System.out.println(b+c);
		
		int a=10;   //local variable
	}

}
