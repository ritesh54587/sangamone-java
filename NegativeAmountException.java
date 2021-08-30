package bank;

public class NegativeAmountException extends Exception {
    private double amount;
    private Account account;
    NegativeAmountException(String msg, double d, Account account) {
        super(msg);
        this.amount = d;
        this.account = account;
    }

  public double getAmount() {
        return amount;
    }

    public Account getAccount() {
        return account;
    }

    public String toString() {
        return super.toString()+":"+amount+":"+account;
    }
}

