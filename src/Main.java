public class Main {
    public static void main(String[] args) {
        Car car = new Car("Fiat", "Palio", "red", 4, false);
        car.describeCar();

        System.out.println(car.getMake());
    }
}
