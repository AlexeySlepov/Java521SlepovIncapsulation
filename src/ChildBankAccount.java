public class ChildBankAccount {

    private double balance;
    private double maxBalance;

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance > 0 ? maxBalance : 0;
    }

    public double getBalance() {
        return balance;
    }

    public boolean depositMoney(double value) {
        if (value < 0) {
            return false;
        }
        if (balance + value > maxBalance) {
            return false;
        }
        balance += value;
        return true;
    }

    public boolean debitMoney(double value) {
        if (value < 0) {
            return false;
        }
        if (balance - value < 0) {
            return false;
        }
        balance -= value;
        return true;
    }

}

