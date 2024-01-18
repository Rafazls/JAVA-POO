import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        double a;
        double b;
        System.out.println("Enter the data of employee:");
        employee.name = sc.nextLine();
        employee.GrossSalary = sc.nextDouble();
        employee.Tax = sc.nextDouble();

        System.out.print(employee+"\n");

        System.out.print("Which percentage to increase salary?\n");
        a= sc.nextDouble();
        b = employee.IncreaseSalary(a);
        System.out.print(employee+"\n"+b);

    }
}