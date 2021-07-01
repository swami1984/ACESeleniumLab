package practicejava;

public class ParentClass {

	public ParentClass() {
		System.out.println("default constr");
	}
	
	public ParentClass(int i) {
		System.out.println("Constr with one params : "+i);
	}
	
	public ParentClass(int i,int j) {
		System.out.println("constr with 2 parms i : "+i);
		System.out.println("constr with 2 parms j : "+j);
	}
	

}
