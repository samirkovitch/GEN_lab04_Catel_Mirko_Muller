import model.*;

public class Product {
    private static final Size SIZE_NOT_APPLICABLE = Size.INVALID;
    private String code;
    private Color color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, Color color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
    }

    public void getContents(StringBuffer sb) {
        sb.append("{\"code\": \"").append(code).append("\", \"color\": \"").append(color).append("\", ");

        if (size != SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"").append(size).append("\", ");
        }

        sb.append("\"price\": ").append(price).append(", \"currency\": \"").append(currency).append("\"}, ");
    }

    public enum Size {
        XS,
        S,
        M,
        L,
        XL,
        XXL,
        INVALID
    }
}