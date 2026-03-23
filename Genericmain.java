public class Genericmain {
   public static <T> void printdata(T Data1, T Data2)
   {
    System.out.println("First :" + Data1);
    System.out.println("Second :" + Data2);
   }

   public static void main(String[] args) {
    
    //Integer vlaues
    printdata(10,20);

    //String values
    printdata("Yoooo", "kya haal");

    //Double values
    printdata(44.34, 67.43);
   }
}
