package OOPSConceptPart2;

public class TestBanks {

	public static void main(String[] args) {
		
		//run time poly 
		HSBCBanks hs = new HSBCBanks();
		hs.credit();
		hs.debit();
		hs.transfermoney();
		
		System.out.println(USBank.min_balance);
		
		//dynamic polymorphism
		//child class object can be refered by parent interface refer VARIBALE 
		USBank b=new HSBCBanks();
		b.credit();
		b.debit();
		b.transfermoney();
		//ONLY WE CAN ACCESS Overridden method not all methods defined by child class				
					 

	}

}
