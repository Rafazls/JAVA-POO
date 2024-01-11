import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc  = new Scanner(System.in);
        Student student = new Student();

        System.out.print("Input the data:");
        student.name = sc.nextLine();
        student.nt1 = sc.nextDouble();
        student.nt2 = sc.nextDouble();
        student.nt3 = sc.nextDouble();

        double rest;
        double media = student.media();
        if(media<60){
            rest = 60 - media;
            System.out.print(student+"\n");
            System.out.println("Missing"+rest);
        }else{
            System.out.print(student+"\n");
        }

    }
}