public class Employee {
    public String name;
    public double GrossSalary;
    public double Tax;

    public double NetSalary() {
        return GrossSalary - Tax;
    }

    public double IncreaseSalary(double percentage) {
        double a = NetSalary();
        double p = ((percentage / 100) * GrossSalary) ;
        return a + p;
    }

    public String toString() {
        return "Employee = " + name + ","+ NetSalary() ;
    }


}
