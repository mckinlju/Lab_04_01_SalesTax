public class Main
{
    public static void main(String[] args)
    {
        final double SALES_TAX = 0.05;
        double purchasePrice = 25.0; // This is the simulated input for purchase price
        double costOfTax = 0;
        double totalCost = 0;

        costOfTax = purchasePrice * SALES_TAX;
        System.out.println("The cost of the sales tax when the purchase price is $" + purchasePrice + " = $" + costOfTax );

        totalCost = purchasePrice + costOfTax;
        System.out.println("The total cost is $" + totalCost );

    }
}