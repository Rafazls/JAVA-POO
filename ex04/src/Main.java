
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Entities ent = new Entities();
        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        ent.setAccountNumber(accNumber);
        System.out.print("Enter account holder: ");
        sc.nextLine();
        ent.name = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?");
        char character = sc.next().charAt(0);
        double deposit;
        if ('y' == character) {
            System.out.print("Enter initial deposit value: ");
            deposit = sc.nextDouble();
            ent.setInitDeposit(deposit);
        } else if (character == 'n') {
            ent.setInitDeposit(0.0);
        }

        System.out.print("\n");
        System.out.print("Account data:\n");
        System.out.print("" + ent + "\n");
        System.out.print("Enter a deposit value: ");
        deposit = sc.nextDouble();
        ent.Deposit(deposit);
        System.out.print("Updated account data:\n");
        System.out.print("" + ent + "\n");
        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        ent.Withdraw(withdraw);
        System.out.print("Updated account data:\n");
        System.out.print(ent);
    }
}
