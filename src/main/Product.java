
public class Product {
    public static final Size SIZE_NOT_APPLICABLE = Size.INVALID;
    private String code;
    private int color;
    private Size size;
    private double price;
    private String currency;

    public Product(String code, int color, Size size, double price, String currency) {
        this.code = code;
        this.color = color;
        this.size = size;
        this.price = price;
        this.currency = currency;
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

    public int getColor() {
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

    public String getColorFor() {
        switch (getColor()) {
            case 1:
                return "blue";
            case 2:
                return "red";
            case 3:
                return "yellow";
            default:
                return "no color";
        }
    }
}