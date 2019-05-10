import model.*;

public class Product {
    public static final Size SIZE_NOT_APPLICABLE = Size.INVALID;
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
        sb.append("{\"code\": \"" + getCode() + "\", \"color\": \"" + getColor() + "\", ");

        if (getSize() != SIZE_NOT_APPLICABLE) {
            sb.append("\"size\": \"" + getSize() + "\", ");
        }

        sb.append("\"price\": " + getPrice() + ", \"currency\": \"" + getCurrency() + "\"}, ");
    }

    enum Size {
        XS,
        S,
        M,
        L,
        XL,
        XXL,
        INVALID;
    }

    public String getCode() {
        return code;
    }

    public Color getColor() {
        return color;
    }

    public Size getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    public String getCurrency() {
        return currency;
    }
}