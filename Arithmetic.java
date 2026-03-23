import java.util.Scanner;

public class Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter any element : ");
        int a = sc.nextInt();

        System.out.print("Enter any element : ");
        int b = sc.nextInt();

        System.out.println("Addition of both elements are:  " + (a+b));
        System.out.println("Substration of both elements are:  " + (a-b));
        System.out.println("Mulitplication of both elements are:  " + (a*b));
        System.out.println("Division of both elements are:  " + (a/b));
		System.out.println("Modules of both elements are: " + (a%b));

        sc.close(); 

    } 
}