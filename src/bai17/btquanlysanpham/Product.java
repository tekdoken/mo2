package bai17.btquanlysanpham;

import java.io.Serializable;

public class Product implements Serializable {
    private String name;
    private int id;
    private String manufacturer;
    private double price;
    private String desc;

    public Product(String name, int id, String manufacturer, double price, String desc) {
        this.name = name;
        this.id = id;
        this.manufacturer = manufacturer;
        this.price = price;
        this.desc = desc;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", desc='" + desc + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
