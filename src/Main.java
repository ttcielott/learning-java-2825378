public class Main {

    public static double calculateEmployeeSalary(double hoursPerWeek,
                                                 double payPerHour,
                                                 boolean contractor,
                                                 double holidayTaken) {
        double grossYearlySalary = payPerHour * hoursPerWeek * 52;
        if (hoursPerWeek < 0) {
            return -1;
        }
        if (payPerHour < 0) {
            return -1;
        }
        if(contractor) {
            double unpaidVacation = 8 * payPerHour * holidayTaken;
            grossYearlySalary = grossYearlySalary - unpaidVacation;
        }

        return grossYearlySalary;
    }

    public static void main(String[] args) {
        double JamesSalary = calculateEmployeeSalary(40, 20, false, 20);
        System.out.println(JamesSalary);
    }

}
