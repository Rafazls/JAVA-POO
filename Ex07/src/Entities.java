public class Entities {
    private String name;
    private Double salary;
    private Integer id;
    public Entities(int id, String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getEmail(){
        return salary;
    }
    public void setEmail(double salary){
        this.salary = salary;
    }
    public double getId(){
        return id;
    }

    public double IncrementPercentage(double percentage){
      salary = salary*(percentage/100);
        return salary;
    }
    public void setId(int Id){
        this.id = Id;
    }
    public String toString(){
        return id+ ", " +name+ ", "+salary +"\n";
    }
}