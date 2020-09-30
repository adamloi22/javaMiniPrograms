public class Main {
    public static double salaryCalculator(double hoursPerWeek,
                                          double payPerHour,
                                          int vacationDays) {
        if (hoursPerWeek < 0 ||
                payPerHour < 0 ||
                vacationDays < 0) {
            System.out.println("Invalid input");
            return -1;
        }
        double vacationHours = vacationDays*8;
        double hoursPerYear = hoursPerWeek*365/7;
        double totalHours = hoursPerYear - vacationHours;
        return totalHours * payPerHour;
    }
    public static void main(String[] args) {
        double salary = salaryCalculator(40, 15, 8);
        System.out.println(salary);
    }
}
