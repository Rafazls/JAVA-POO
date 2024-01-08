import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.print("Enter product data: Name - Price - Quantity\n");
        product.name = sc.nextLine();
        product.price = sc.nextDouble();
        product.quantity = sc.nextInt();
System.out.println(product);

System.out.print("Enter the number of products to be added in stock:\n");
int qnt = sc.nextInt();
product.AddProducts(qnt);
System.out.println(product);

System.out.print("Enter the number of products to be removed in stock\n");
        qnt = sc.nextInt();
        product.RemoveProducts(qnt);
        System.out.println(product);
    }
}