package homework6;

/* Задача №1.
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы.
Реализовать в java.*/

public class Laptop {
    private String brand;
    private String model;
    private double price;
    private int ramSize;
    private int storageSize;
    private String processor;
    private String color;

    public Laptop(String brand, String model, double price, int ramSize, int storageSize, String processor,
                  String color) {
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.ramSize = ramSize;
        this.storageSize = storageSize;
        this.processor = processor;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getStorageSize() {
        return storageSize;
    }

    public void setStorageSize(int storageSize) {
        this.storageSize = storageSize;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Laptop {" +
                "brand = '" + brand + '\'' +
                ", model = '" + model + '\'' +
                ", price = " + price +
                ", ramSize = " + ramSize +
                ", storageSize = " + storageSize +
                ", processor = '" + processor + '\'' +
                ", color = '" + color + '\'' +
                '}';
    }
}