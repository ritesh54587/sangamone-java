package bank;

public class SavingAccount extends Account {

	public SavingAccount(long acno, String n, long d) throws NegativeAmountException {
		super(acno, n, d);
		
	}
	public SavingAccount( String n , long openBal ) throws NegativeAmountException {
		 super(n , openBal ) ;
		 }
	}
