public class Car {
    private String make;
    private String model;
    private String color;
    private int doors;
    private boolean convertible;

    public void describeCar() {
        System.out.println("The car " + model +
                " made by " + make +
                " with the color " + color +
                " has " + doors +
                " doors and it is " + (convertible ? "convertible" : "not convertible"));
    }

    public Car(String make, String model, String color, int doors, boolean convertible) {
        this.setMake(make);
        this.setModel(model);
        this.setColor(color);
        this.setDoors(doors);
        this.setConvertible(convertible);
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setMake(String make) {
        if (make == null) make = "unknown";

        String lowerCaseMake = make.toLowerCase();

        switch (lowerCaseMake) {
            case "fiat", "chevrolet" -> this.make = make;
            default -> this.make = "unsupported";

        }
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }
}
