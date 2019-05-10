
public class OrdersWriter {
    private Orders orders;

    public OrdersWriter(Orders orders) {
        this.orders = orders;
    }

    public String getContents() {
        StringBuffer sb = new StringBuffer("{\"orders\": [");

        for (int i = 0; i < orders.getOrdersCount(); i++) {
            Order order = orders.getOrder(i);
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

        if (orders.getOrdersCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        return sb.append("]}").toString();
    }

}