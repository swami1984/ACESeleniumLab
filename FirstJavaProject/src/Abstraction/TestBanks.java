package Abstraction;

public class TestBanks {

	public  void main(String[] args) {
	
		HDFCBank hb=new HDFCBank();
		hb.credit();
		hb.credit();
		hb.loan();
		hb.ins();
		hb.reg();
		System.out.println(hb.i);
		
		System.out.println(Bank.j);
		

	}

}
