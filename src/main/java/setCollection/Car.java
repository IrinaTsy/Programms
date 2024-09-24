package setCollection;

public class Car {

    private String model;
    private int year;
    private double engine;
    private int regNumber;

    //конструктор
    public Car(String model, int year,
               double engine, int regNumber) {
        super();
        this.model = model;
        this.year = year;
        this.engine = engine;
        this.regNumber = regNumber;
    }

    //сеттеры, геттеры
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public double getEngine() {
        return engine;
    }
    public void setEngine(double engine) {
        this.engine = engine;
    }
    public int getRegNumber() {
        return regNumber;
    }
    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    @Override
    public String toString() {
        return "model: " + model
                + ", year: " + year
                + ", engine: " + engine
                + ", regNumber: " + regNumber;
    }


}
