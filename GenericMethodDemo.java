class GenericMethodDemo {

    public static <T> void show(T data)
    {
        System.out.println("Data: " + data);
    }

    public static void main(String[] args) {
        show(100);
        show("HELLO");
        show(3.14);
        show(true);
    }
}
