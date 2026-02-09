import java.util.*;
class UserString
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first string here: ");
		String s1 = sc.nextLine();
			
		System.out.print("Enter second string here: ");
		String s2 = sc.nextLine();		
		
		System.out.println("Length: " +s1.length());
		System.out.println("Length: " +s2.length());
	
	}
}