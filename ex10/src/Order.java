import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> products = new ArrayList<>();


    public Order(){}

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void addItem(OrderItem item){
        products.add(item);
    }
    public void removeItem(OrderItem item){
        products.remove(item);
    }
    public double total(){
        double sum = 0;
        for (OrderItem c : products) {
           sum +=  c.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Order moment: "+moment+"\n");
        sb.append("Order status:"+ status+"\n");
        sb.append("Client: "+client.getClient()+" ("+client.getBirthDate()+") - "+client.getEmail()+"\n");
        sb.append("Order items:\n");
        for (OrderItem c : products) {
            sb.append(c.getProduct().getName()+", $"+c.getProduct().getPrice()+", Quantity: "+c.getQuantity()+", Subtotal: "+c.subTotal()+"\n");
        }
        sb.append("Total price: $"+total());
        return sb.toString();
    }
}

