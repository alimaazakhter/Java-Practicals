class Casting
{
	public static void main(String[] args)
	{
		int a = 5;
		// Incorrect
		
		// byte b = a;
		
		byte b = (byte)a;
		System.out.print("byte b = " +b);
	}
}