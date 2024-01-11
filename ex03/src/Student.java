public class Student {
    public String name;
    public double nt1;
    public double nt2;
    public double nt3;
    public double rest;

    public double media (){
        return nt1+nt2+nt3;
    }
    public String Verification(){
        double media = media();
        String message  = media<60?"Falied":"Pass";
        return message;
    }

    public String toString(){
        return "Final Grade = "+media() + "\n"+Verification();
    }

}
