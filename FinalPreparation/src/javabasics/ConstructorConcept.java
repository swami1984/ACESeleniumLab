package javabasics;

public class ConstructorConcept {
	 String name;
	 int age;
	
	public ConstructorConcept(String name,int age) {
		this.name=name;
		this.age=age;
		
		
		System.out.println(name);
		System.out.println(age);
			
	}
	



	public static void main(String[] args) {
		ConstructorConcept cc = new ConstructorConcept("tom",25);

	}

}
