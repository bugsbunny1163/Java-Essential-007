package task3;

public class Price {
    String name;
    String shop;
    double price;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Price{");
        sb.append("name='").append(name).append('\'');
        sb.append(", shop='").append(shop).append('\'');
        sb.append(", price=").append(price);
        sb.append('}');
        return sb.toString();
    }
}
