public class CoffeeShop {
    public static void main(String[] args) {
        // Order a Latte with Milk and Sugar
        Coffee americano = new Americano();
        americano = new Milk(americano);
        americano = new Sugar(americano);

        // Order an Espresso with Milk
        Coffee cappuccino = new Cappuccino();
        cappuccino = new Milk(cappuccino);

        // Display descriptions and costs
        System.out.println("Coffee 1: " + americano.getDescription() + ", Cost: $" + americano.cost());
        System.out.println("Coffee 2: " + cappuccino.getDescription() + ", Cost: $" + cappuccino.cost());
    }
}