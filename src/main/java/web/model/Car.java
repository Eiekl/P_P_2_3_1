package web.model;

public class Car {
    private String brand;
    private String model;
    private String colour;

    public Car() {
    }

    public Car(String brand, String model, String colour) {
        this.brand = brand;
        this.model = model;
        this.colour = colour;
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

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
