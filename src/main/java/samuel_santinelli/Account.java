package samuel_santinelli;

public class Account implements IAccount{
    private int agency;
    private int number;
    private double balance;

    public int getAgency() {
        return agency;
    }

    public int getNumber() {
        return number;
    }

    public double getBalance() {
        return balance;
    }


    @Override
    public void withdraw(double value) {

    }

    @Override
    public void deposit(double value) {

    }

    @Override
    public void transfer(double value, Account targetAccount) {

    }
}
