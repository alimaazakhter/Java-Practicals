interface Calculator
{
    int fact(int no);
}

public class fac_lambda
{
    static int temp=1;
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter number: ");
       int n1 = sc.nextInt();
       
       Calculator c1 = (no) ->
       {
        for(int i = 1; i<=no; i++)
        {
            temp = temp*i;
        }
        return temp;
       };
       System.out.println("Factorial of "+n1+" : "+c1.fac(n1));

    }
}