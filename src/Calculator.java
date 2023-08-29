public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        double area = floor.getArea();
        double costPerSquare = carpet.getCost();

        return area * costPerSquare;
    }
}
