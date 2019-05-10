
public class OrdersWriter {
    Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents(){
        return orders.getContents();
    }

}