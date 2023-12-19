package javaprogramspractice;

public class MethodClass {
	
	static MethodClass mth;

	public static void main(String[] args) {
		
		mth = new MethodClass();
		
		MethodClass.doPrintMyName("Aman");
		
		MethodWithReturnType met = new MethodWithReturnType();
		String var = met.printName("Prashant");
		
		mth.meth2(var, "Srighbk");
		System.out.println(var);
	}
	
	
	
	//Method - simple method
	
	void additionOfTwoNumbers() {  //inside non static method, we can call static method
		
		System.out.println(20+30); //inside static method, we can not call non staitc method, to call it, we have to create an object of the class
		doPrintMyName("Aman");
	}
	
	static void doPrintMyName(String name) {  //Parameterized method
		
		System.out.println(name);
		mth.meth2("Aman", "Srivastava");
	}
	//void means no return type
	
	void meth2(String name, String surName) {  //Parameterized method
		
		System.out.println(name+surName);
		
	}
	

}
