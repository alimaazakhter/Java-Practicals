interface Myinterface {
    
    void display();
}

class lamda_Demo
{
    public static void main(String[] args)
    {
        Myinterface obj = () -> System.out.println("Hello Guyss... Lambda use kar raha hu");
        obj.display();
    }
}
