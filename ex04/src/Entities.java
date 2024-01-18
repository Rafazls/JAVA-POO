//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Entities {
    private int AccountNumber;
    public String name;
    private double Saldo;

    public Entities() {
    }

    public int setAccountNumber(int accNumber) {
        return this.AccountNumber = accNumber;
    }

    public double setInitDeposit(double saldo) {
        return this.Saldo = saldo;
    }

    public double Deposit(double deposit) {
        return this.Saldo += deposit;
    }

    public double Withdraw(double Saldo) {
        return this.Saldo = this.Saldo - Saldo - 5.0;
    }

    public String toString() {
        return "Account " + this.AccountNumber + ", Holder: " + this.name + ", Balance: $ " + this.Saldo;
    }
}
