public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog() {
        super("Dog", "Medium", 20.0);
    }

    public Dog(double weight, String earShape, String tailShape) {
        super("Dog", weight < 15 ? "small" : (weight < 35 ? "medium" : "large"), weight);
        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    public void bark() {
        System.out.println(type + " makes woof");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "earShape='" + earShape + '\'' +
                ", tailShape='" + tailShape + '\'' +
                "} " + super.toString();
    }
}
