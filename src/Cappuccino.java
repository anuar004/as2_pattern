public class Cappuccino extends Coffee {
    public Cappuccino() {
        description = "Cappuccino";
    }

    @Override
    public double cost() {
        return 2.0;
    }
}