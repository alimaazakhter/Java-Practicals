class GenericClass_2 <T extends String> {

    public void display()
    {
        System.out.println("This is Bounded type Generic class");
    }
    
}
class Generic_main
{
    public static void main(String[] args) {
        
        GenericClass_2<String> obj = new GenericClass_2<>();
        obj.display();
    }
}

