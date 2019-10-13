package pojo;

public class Car {
    String brand;
    String color;
    float displacement;

    public Car() {
    }

    public Car(String brand, String color, float displacement) {
        this.brand = brand;
        this.color = color;
        this.displacement = displacement;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getDisplacement() {
        return displacement;
    }

    public void setDisplacement(float displacement) {
        this.displacement = displacement;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", displacement=" + displacement +
                '}';
    }
}
