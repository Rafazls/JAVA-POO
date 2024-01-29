import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String clientName = sc.nextLine();

        System.out.print("Email: ");
        String clientEmail = sc.nextLine();

        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate  = sdf.parse(sc.next());
        Client client = new Client(clientName, clientEmail,birthDate );

        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        sc.nextLine();
        String status = sc.nextLine();
        Date moment = new Date();
        Order order = new Order(moment,OrderStatus.valueOf(status), client);

        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.print("Enter #" + (i+1) + " item data: \n");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price :");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity:");
            int quantity = sc.nextInt();
            OrderItem item = new OrderItem(quantity,new Product(productName, productPrice));
            order.addItem(item);
        }
        System.out.println("ORDER SUMMARY: ");
        System.out.print(order);
    }
}