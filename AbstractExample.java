import java.util.Scanner;

abstract class Shape {
    abstract void area();
    void show() {
        System.out.println("This is an abstract class example");
    }
}

class Square extends Shape {
    int length;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the square:");
        length = sc.nextInt();
    }

    void area() {
        int a = length * length;
        System.out.println("Area of the square is: " + a);
    }
}

class Rectangle extends Shape {
    int length, breadth;
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the rectangle:");
        length = sc.nextInt();
        System.out.println("Enter the breadth of the rectangle:");
        breadth = sc.nextInt();
    }

    void area() {
        int a = length * breadth;
        System.out.println("Area of the rectangle is: " + a);
    }
}

class AbstractExample {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();

        s.input();
        s.area();
        s.show();

        r.input();
        r.area();
        r.show();
    }
}