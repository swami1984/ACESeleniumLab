package OOPSConceptPart2;

public class Car extends Vehicle{
	
	//we can  achieve 100 %abstraction
	//all the method defined in parenrt as by default abstarcts - 
	//only method method proto type used here
	//we cannot create object of interface class 
	//in interface we can create only static and final variables 
	//there is no non-static variable allowed 
	
	//**** whenever we want achive 100 abstraction or hiding implementation - we can use interface
	//****** whenever we want to go with partial go with abstraction 
	
	public void start() {
		System.out.println("start car");
	}
	
	public void stop() {
		System.out.println("stop car");
		
	}

	public void refuel() {
		System.out.println("refuel car");
	}
	

}
