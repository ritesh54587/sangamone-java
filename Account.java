package bank;


import java.util.Date;

import bank.Account.Transaction;

public abstract class Account implements Comparable<Account> {

    private long accountNumber;
    private String name;
//    long balance;
    private long balance;

    private Transaction [ ] passbook = new Transaction [ 100 ] ;
    private int nextIndexInPassbook = 0;
    public class Transaction {
    
    	private Date dateOfTransaction = new Date () ;
    	private String naration;
        private long amount;
        private boolean credit;
        public Transaction(String n, boolean c , long amt) throws NegativeAmountException {
        	if(amt < 0) {
        		throw new NegativeAmountException( "Negative " +(c ? " credit " : " debit " ) ,amt , Account.this) ;

            }
            this.naration = n;
           
            this.credit = c;
            this.amount = amt;
            Account.this.balance += getNetAmount();
            Account.this.passbook [ nextIndexInPassbook++] = this;

        }

        public Date getDate() {
            return this.dateOfTransaction;
        }
        public boolean credit () {
        return this.credit() ;
        }
        public String getNaration() {
            return this.naration;
        }

        public long getAmount() {
            return this.amount;
        }

        public long getNetAmount() {
        return this.credit() ? this . amount : this.amount ;

        }
        public Date getDateOfTransaction() {
        	 return this.dateOfTransaction ;
        }
        public String toString() {
        
			return dateOfTransaction + " , "+naration+" , "+(credit? ( " 0 , "+
        			amount) : (amount+" ,0 " )) ;

        }
        public void printPassbook() {
            long runningBalance = 0;
            Transaction t = null;
            System.out.println("Passbook of "+name+" Account # "+accountNumber);
            for (int transactionIndex = 0; transactionIndex < nextIndexInPassbook; transactionIndex++) {
                t = passbook[transactionIndex];
                runningBalance += t.getNetAmount();
                System.out.println(t+","+runningBalance);
            }
            System.out.println("End of Passbook");
        }
    
    }

    public Account(long acno, String n, long openBal) throws NegativeAmountException{        
    	this.accountNumber = acno;
        this.name = n;

        new Transaction("Opening Balance", true , openBal);
    }

    public long getAccountNumber() {
        return this.accountNumber;
    }

    public String getName() {
        return this.name;
    }

    public long getBalance() {
        return this.balance;
    
    }

    public void deposit(long amt) throws NegativeAmountException {
        new Transaction("Deposit", true , amt);
    }

    public boolean withdraw(long amt) throws NegativeAmountException {

        if (this.balance < amt) {
            return false;
        }

        new Transaction("Withdrawal", false , amt);
        return true;
    }

    public void display() {
        System.out.println(this);
    }

    private static long lastAccountNumber = 1000;

    public Account(String n, long openBal) throws NegativeAmountException {
        this(++lastAccountNumber, n, openBal);
    }

    @Override
    public String toString() {
        return this.getClass().getName()+":"+this.getAccountNumber()+","+this.getName()+","+this.getBalance();
    }
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return this.getAccountNumber() == ((Account)obj).getAccountNumber();
    }
    @Override
    public int hashCode() {
        return (int)this.getAccountNumber();
    }
    @Override
    public int compareTo(Account ac) {
        return ((Long)(this.getAccountNumber())).compareTo(ac.getAccountNumber());
    
    }
    }

	
	


