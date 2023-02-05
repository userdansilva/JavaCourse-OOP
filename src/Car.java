public class Car {
    private String make;
    private String model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public Car(String model) {
        this.model = model;

        switch (model) {
            case "Palio", "Argo" -> this.make = "Fiat";
            case "Celta" -> this.make = "Chevrolet";
            default -> this.make = "Unknown";
        }
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
