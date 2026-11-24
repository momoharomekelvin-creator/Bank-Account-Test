package bank;

public class BankAccount {

    private double Bal;
    int balance = 0;

    public BankAccount() {

    }

    public void Account(){

    }

    public int deposit(int amount) {
        if (amount > 0) {
            balance = balance + amount;
        }
        return balance;
    }

        double getBalance(){
            return balance;
        }


    public void widthdraw(int amount) {
        if(balance < amount){
            System.out.println("insufficient funds");
        }
        else{
            balance = balance - amount;
        }
    }

    public void withdraw(int amount) {
        if(amount > balance){
            System.out.println("Insufficient funds");
        }
    }






    private double balanced;
    private String pin;

    public BankAccount(double balance, String pin) {
        this.Bal = balance;
        this.pin = pin;
    }


    public double getBal() {
        return balance;
    }








    public boolean withdraw(double amount, String enteredPin) {


        if (enteredPin == null || !enteredPin.equals(pin)) {
            return false;
        }


        if (amount <= 0 || amount > balance) {
            return false;
        }


        balance = (int) (balance - amount);

        return true;
    }
}


















