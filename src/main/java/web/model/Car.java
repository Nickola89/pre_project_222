package web.model;

public class Car {
    private String model;
    private int series;
    private String vin;

    public Car(String model, int series, String vin) {
        this.model = model;
        this.series = series;
        this.vin = vin;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", vin='" + vin + '\'' +
                '}';
    }
}
