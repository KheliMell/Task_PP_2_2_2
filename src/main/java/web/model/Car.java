package web.model;

public class Car {
    private int series;
    private String model;
    private String owner;

    public Car() {
    }

    public Car(int series, String model, String owner) {
        this.series = series;
        this.model = model;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{series=" + series + ", model=" + model + ", owner=" + owner + '}';
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
