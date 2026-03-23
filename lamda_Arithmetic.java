import java.util.*;

interface Arithmetic {
    
    int operation(int num1, int num2);
    // int sub(int num1, int num2);
    // int mul(int num1, int num2);
    // int div(int num1, int num2);
}

class lamda_Arithmetic
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number 1 : ");
        int n1 = sc.nextInt();

        System.out.println("Enter any number 2 : ");
        int n2 = sc.nextInt();


        Arithmetic a1 = (num1, num2) -> num1+num2;
        System.out.println("Addition of "+n1+" + "+n2+" : "+a1.operation(n1,n2));

        Arithmetic a2 = (num1, num2) -> num1-num2;
        System.out.println("Substraction of "+n1+" - "+n2+" : "+a2.operation(n1,n2));
    }
}
