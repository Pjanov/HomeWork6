package org.example;

public class Laptop {
    public float price;
    private String productManufacturer;
    private String operatingSystem;
    private String screenDiagonal;
    private String color;
    private String displayResolution;
    private String processor;
    private String ram;
    private String ssd;


    public Laptop(float price, String productManufacturer, String operatingSystem,
                  String screenDiagonal, String color, String displayResolution,
                  String processor, String ram, String ssd) {
        this.price = price;
        this.productManufacturer = productManufacturer;
        this.operatingSystem = operatingSystem;
        this.screenDiagonal = screenDiagonal;
        this.color = color;
        this.displayResolution = displayResolution;
        this.processor = processor;
        this.ram = ram;
        this.ssd = ssd;
    }


    @Override
    public String toString() {
        return "\nLaptop{" +
                "price=" + price + " руб" +
                ", productManufacturer=" + productManufacturer +
                ", operatingSystem=" + operatingSystem + ",\n" +
                "\t\tscreenDiagonal=" + screenDiagonal +
                ", color=" + color +
                ", displayResolution=" + displayResolution + ",\n" +
                "\t\tprocessor=" + processor +
                ", ram=" + ram +
                ", ssd=" + ssd +
                "}";
    }


    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacturer) {
        this.productManufacturer = productManufacturer;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getScreenDiagonal() {
        return screenDiagonal;
    }

    public void setScreenDiagonal(String screenDiagonal) {
        this.screenDiagonal = screenDiagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDisplayResolution() {
        return displayResolution;
    }

    public void setDisplayResolution(String displayResolution) {
        this.displayResolution = displayResolution;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getSsd() {
        return ssd;
    }

    public void setSsd(String ssd) {
        this.ssd = ssd;
    }


}
