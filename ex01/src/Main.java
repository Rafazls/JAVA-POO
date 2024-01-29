import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Relembrar o método scanner
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();
        System.out.println("Enter rectangle width and height:");
        rectangle.width = sc.nextDouble();
        rectangle.height = sc.nextDouble();

        System.out.println(rectangle);
    }
}