
import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> orders = new ArrayList<Order>();

    public void AddOrder(Order order) {
        orders.add(order);
    }

    public int getOrdersCount() {
        return orders.size();
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < getOrdersCount(); i++) {
            Order order = orders.get(i);
            sb.append("{\"id\": " + order.getOrderId() + ", \"products\": [");

            for (int j = 0; j < order.getProductsCount(); j++) {
                Product product = order.getProduct(j);

                sb.append("{\"code\": \"" + product.getCode() + "\", \"color\": \"" + product.getColor() + "\", ");

                if (product.getSize() != Product.SIZE_NOT_APPLICABLE) {
                    sb.append("\"size\": \"" + product.getSize() + "\", ");
                }

                sb.append("\"price\": " + product.getPrice() + ", \"currency\": \"" + product.getCurrency() + "\"}, ");
            }

            if (order.getProductsCount() > 0) {
                sb.delete(sb.length() - 2, sb.length());
            }

            sb.append("]}, ");
        }

        if (getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }
}
