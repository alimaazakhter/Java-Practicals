class StringMethod
{
	public static void main(String[] args)
	{
		String s1 = "Java";
		String s2 = "Programming";
		System.out.println("Length: " +s1.length());
		System.out.println("Length: " +s2.length());
		System.out.println("Concat: " +s1.concat("s2"));
		System.out.println("Concat: " +s1.concat(" ").concat(s2));
		System.out.println("Concat: " +(s1+" "+s2));
		System.out.println("Upper: " +s1.toUpperCase());
		System.out.println("Lower: " +s1.toLowerCase());
		System.out.println("CharAt: " +s1.charAt(1));
		System.out.println("Equals: " +s1.equals(s2));
		System.out.println("Compare: " +s1.compareTo(s2));
		System.out.println("Contains: " +s2.contains("ing"));
		System.out.println("Substring: " +s2.substring(3,8));
		System.out.println("Substring: " +s1.substring(1,4));
		System.out.println("Replace: " +s2.replace('m', 'j'));
		System.out.println("trim: "+"Hello".trim());
		String str = "Java,PHP,CPP,PYTHON";
		String ch[] = str.split(":");
		for(String val : ch)
		{
			System.out.println(val);
		}
		System.out.println("startwith" +s1.startwith("Max"));
	
	}
}