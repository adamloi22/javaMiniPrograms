public class Main {
    public static double calculateTotalCostOfMeal(double listedMealPrice,
                                                double tipRate,
                                                double taxRate) {
        double tip = tipRate * listedMealPrice;
        double tax = taxRate * listedMealPrice;
        return tip + tax + listedMealPrice;
    }
    public static void main(String[] args) {
        //Let's say we want to split the cost between 3 persons
        double groupTotalMealCost = calculateTotalCostOfMeal(15, .2, .08);

        double individualTotalMealCost = groupTotalMealCost/3;
        System.out.println(individualTotalMealCost);
    }
}