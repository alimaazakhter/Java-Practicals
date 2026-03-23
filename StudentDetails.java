import java.util.Scanner;

public class StudentDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int enroll[] = new int[5];
        String name[] = new String[5];
        int sem[] = new int[5];
        float cpi[] = new float[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details of student " + (i + 1));
            enroll[i] = sc.nextInt();
            name[i] = sc.next();
            sem[i] = sc.nextInt();
            cpi[i] = sc.nextFloat();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(enroll[i] + " " + name[i] + " " + sem[i] + " " + cpi[i]);
        }
    }
}
