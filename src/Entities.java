public class Entities {
    private int AccountNumber;
    public String name;
    private double Saldo;

    public int setAccountNumber(int accNumber){
        return AccountNumber = accNumber;
    }

    public double setInitDeposit(double saldo){
        return Saldo = saldo;
    }

    public double Deposit (double deposit){
        return Saldo = Saldo + deposit;
    }
    public double Withdraw (double Saldo){
        return this.Saldo  = (this.Saldo - Saldo) -5;
    }

    public String toString (){
        return "Account "+ AccountNumber+", Holder: "+name+", Balance: $ "+Saldo;
    }

}

