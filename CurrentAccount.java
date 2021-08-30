package bank;

import bank.Account.TransType;
import bank.Account.Transaction;

public class CurrentAccount extends Account {

	 private static final long minimumBalance = 5000;
	    private static final long penalty = 100;
	    
	CurrentAccount(long acno, String n, double d) throws NegativeAmountException {
		super(acno, n, d);
		
	}
	public CurrentAccount( String n , long openBal ) throws NegativeAmountException {
		 super(n , openBal );
	}
	public boolean withdraw(long amt) {
		if (!super.withdraw(amt)) {
            return false;
        }
       if (this.getBalance() < minimumBalance) {
           new Transaction("Penalty", TransType.DEBIT, penalty);
            
        }
        return true;
    }	
	}


