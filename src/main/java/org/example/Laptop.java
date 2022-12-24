package org.example;

public class Laptop {
    public float price;
    private String productManufacturer;
    private String operatingSystem;
    private String screenDiagonal;
    private String displayResolution;
    private String processor;
    private String ram;
    private String ssd;


    public Laptop(float price, String productManufacturer, String operatingSystem, String screenDiagonal, String displayResolution, String processor, String ram, String ssd) {
        this.price = price;
        this.productManufacturer = productManufacturer;
        this.operatingSystem = operatingSystem;
        this.screenDiagonal = screenDiagonal;
        this.displayResolution = displayResolution;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "price=" + price +
                ", productManufacturer='" + productManufacturer + '\'' +
                ", operatingSystem='" + operatingSystem + '\'' +
                ", screenDiagonal='" + screenDiagonal + '\'' +
                ", displayResolution='" + displayResolution + '\'' +
                ", processor='" + processor + '\'' +
                ", ram='" + ram + '\'' +
                ", ssd='" + ssd + '\'' +
                '}';
    }
}
