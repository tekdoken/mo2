package bai5;

public class Product {
    String name;
    int code;
    double price;
    String category;
   String unit;

    public Product(String name, int code, double price, String category, String unit) {
        this.name = name;
        this.code = code;
        this.price = price;
        this.category = category;
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", code=" + code + ", price=" + price + ", category='" + category + '\'' +
                ", unit='" + unit + '\'' +
                '}';
    }
}