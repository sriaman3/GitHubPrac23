package javaprogramspractice;

public class ConstructorConcept {

	public static void main(String[] args) {
		
		ConstructorConcept cc = new ConstructorConcept(10);
		
		
	}
	
	public ConstructorConcept(int b, int c){ //default 
		
		// we never write business logic
		
	}
	
	public ConstructorConcept(int a){ //parameterized
		
		// we never write business logic
		
		System.out.println(a);
		
	}
	
	
	void menth() {
		
	}

}
