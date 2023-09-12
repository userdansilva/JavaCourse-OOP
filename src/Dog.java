public class Dog extends Animal {
    private String earShape;
    private String tailShape;

    public Dog(String earShape, String tailShape) {
        super("default type", "default size", 20.0);

        this.earShape = earShape;
        this.tailShape = tailShape;
    }

    @Override
    public void makeNoise() {
        System.out.println("bark");
    }
}
