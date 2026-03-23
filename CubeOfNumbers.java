import java.util.Scanner;

public class CubeOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        System.out.print("Enter a number: ");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Cube of " + i + " = " + (i * i * i));
        }
    }
}
