import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Product> products = new ArrayList<Product>();
    private int id;

    public Order(int id) {
        this.id = id;
    }

    public void AddProduct(Product product) {
        products.add(product);
    }

    public void getContents(StringBuffer sb) {
        sb.append("{\"id\": " + id + ", \"products\": [");

        for (int j = 0; j < products.size(); j++) {
            products.get(j).getContents(sb);
        }

        if (products.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }

        sb.append("]}, ");
    }
}
