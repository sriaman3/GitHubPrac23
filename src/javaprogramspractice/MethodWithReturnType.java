package javaprogramspractice;

public class MethodWithReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodWithReturnType meth = new MethodWithReturnType();
		
		String finalValue = meth.printName("Prashant");
		
		System.out.println(finalValue);
		
		
	}
	
	
	String printName(String name) {  //return type
		
		return name + " " +  "is verified for election";
		
		
	}

}
