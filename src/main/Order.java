import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public int getOrderId() {
        return id;
    }

    public int getProductsCount() {
        return products.size();
    }

    public Product getProduct(int j) {
        return products.get(j);
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public void getContents(StringBuffer sb) {
        sb.append("{\"id\": " + getOrderId() + ", \"products\": [");

        for (int j = 0; j < getProductsCount(); j++) {
            Product product = getProduct(j);

            sb.append("{\"code\": \"" + product.getCode() + "\", \"color\": \"" + product.getColor() + "\", ");

            if (product.getSize() != Product.SIZE_NOT_APPLICABLE) {
                sb.append("\"size\": \"" + product.getSize() + "\", ");
            }

            sb.append("\"price\": " + product.getPrice() + ", \"currency\": \"" + product.getCurrency() + "\"}, ");
        }

        if (getProductsCount() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]}, ");
    }
}
