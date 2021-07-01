package OOPSConceptPart2;

public class TestCar {

	public static void main(String[] args) {
		
		
		//static polymorphism complile time polymorphism
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.theftsaftey();
		b.engine();
		
		
		System.out.println("******************");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
	//very imp to know that parent cannot access all child methods or properties 
	//child can access parent properties and methods 	
		
	//Dynamic polymorphism- Run time polymorphism
	//Top casting	
	Car c1 = new BMW();// Child class can be referred by parent class reference variable- 
	c1.start();
	c1.stop();
	c1.refuel();
	//you can refer my object in case any similar method using parent child relationship 
	
	//down casting 
	
	BMW b1 =(BMW)new Car();// while running java throw an exception ClassCastException
	
		

	}

}
