import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;
    private List<HourContract> contractList = new ArrayList<>();

    public Worker(){}

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Department getDepartament() {
        return department;
    }

    public void setDepartament(Department departament) {
        this.department = departament;
    }

    public List<HourContract> getContractList() {
        return contractList;
    }

    public void addContract(HourContract contract){
        contractList.add(contract);
    }
    public  void removeContract(HourContract contract){
        contractList.remove(contract);
    }
    public double income(int year, int month){
        double sum = baseSalary;
        //Instanciação da classe Calendar.
        Calendar cal = Calendar.getInstance();
        //O for each vai percorrer dentro do "contractList" da classe HourContract;
        for(HourContract c : contractList){
            // A classe Calendar vai pegar o valor do getDate da classe HourContract;
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            //A soma (+1) é necessária pois dentro do calendar o mês começa 00
            int c_month = 1+ cal.get(Calendar.MONTH);
            if(year == c_year && month == c_month){
                sum+=c.totalValue();
            }
        }
        return sum;
    }

}
