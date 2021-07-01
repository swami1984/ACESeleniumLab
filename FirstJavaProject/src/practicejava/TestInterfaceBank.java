package practicejava;

public class TestInterfaceBank {

	public static void main(String[] args) {
		
		HDFCBank hf=new HDFCBank();
		hf.debit();
		hf.credit();
		hf.Loan();
		hf.eduloan();
		hf.Autoloan();
		hf.min_bal();
		hf.personalLoan();
		System.out.println(hf.i);
		
		

	}

}
