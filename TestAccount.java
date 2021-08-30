package bank;

public class TestAccount {
	  public static void main( String[] args ) throws NegativeAmountException
	   {
	  Account acc1 , acc2;   
	acc1 = new SavingAccount(123, "John", 1_00_000.0);
	acc2 = new CurrentAccount(789, "Mary", 2_00_000.0);
	  acc2.display();

	  acc1.deposit(20_000);
	  acc1.display();

	  acc1.deposit(20_000);
	  acc2.display();

	  System.out.println(acc1.withdraw(1_25_00));
	  acc1.withdraw(25_000);
	  acc1.display();
	  acc2.withdraw(10_000);
	  acc2.display();
	  acc2.withdraw(1_00_000);
	  acc2.display();
	   }
	}



