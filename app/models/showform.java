package models;

/**
 * Created by Ae_Acer on 7/25/2018.
 */
public class showform {
    private Double price,amount;
    private String id,name,brand,type,detail;

    public showform() {

    }

    public showform(double price, double amount, String id, String name, String brand, String type, String detail) {
        this.price = price;
        this.amount = amount;
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.type = type;
        this.detail = detail;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }
}
