import java.util.*;

interface Square {
    
    int find(int num);
}

class lamda_Square
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number : ");
        int n = sc.nextInt();

        Square s1 = (num) -> num*num;
        System.out.println("Square = "+ n + ":" + s1.find(6));
    }
}
