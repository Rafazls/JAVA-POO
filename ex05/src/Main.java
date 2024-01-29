import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Criação de vetores  e passando os valores dos vetores para os parametros que a classe importada pede

        Scanner sc = new Scanner(System.in);
        Entities[] vect = new Entities[10];

        System.out.print("How many  room will be rented? \n");
        int n = sc.nextInt();

        for(int i = 0; i<n ; i++){
            System.out.print("Rent #"+(i+1)+":\n");
            System.out.print("Name: ");
            sc.nextLine();
           String name = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Room: ");
            int a  = sc.nextInt();
            vect[a] = new Entities(name,email) ;
        }
        System.out.println();
        System.out.print("Busy rooms: ");
        for(int i = 1; i<10 ; i++){
            if(vect[i]!= null){
                System.out.print(i+": "+vect[i]+"\n");
            }
        }

    }
}