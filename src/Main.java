public class Main {
    public static void main(String[] args) {
        Car palio = new Car("Fiat", "Palio", "red", 4, false);
        palio.describeCar();

        Car corsa = new Car("Chevrolet", "Corsa", "black", 2, true);
        corsa.describeCar();
    }
}
