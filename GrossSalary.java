import java.util.Scanner;

public class GrossSalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double basic, hra, da, gross;

        System.out.print("Enter Basic Salary: ");
        basic = sc.nextDouble();

        if (basic <= 10000) {
            hra = 0.20 * basic;
            da = 0.80 * basic;
        } else if (basic <= 20000) {
            hra = 0.25 * basic;
            da = 0.90 * basic;
        } else {
            hra = 0.30 * basic;
            da = 0.95 * basic;
        }

        gross = basic + hra + da;

        System.out.println("Gross Salary = " + gross);
    }
}
