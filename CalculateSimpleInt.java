import java.util.Scanner;

public class CalculateSimpleInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float p, r, n, si;

        System.out.print("Enter Principal amount: ");
        p = sc.nextFloat();

        System.out.print("Enter Rate of interest: ");
        r = sc.nextFloat();

        System.out.print("Enter Time (in years): ");
        n = sc.nextFloat();

        si = (p * r * n) / 100;

        System.out.println("Simple Interest = " + si);
    }
}
