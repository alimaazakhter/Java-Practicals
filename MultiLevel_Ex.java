import java.util.Scanner;

class Person {
    String gender;
    int age;

    void get(Scanner sc) {
        System.out.print("Enter gender: ");
        gender = sc.next();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    void put() {
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    int rollNo;

    void get(Scanner sc) {
        super.get(sc);
        System.out.print("Enter roll number: ");
        rollNo = sc.nextInt();
    }

    void put() {
        super.put();
        System.out.println("Roll Number: " + rollNo);
    }
}

class Marksheet extends Student {
    int marks1, marks2, marks3;
    int total;
    double percentage;

    void get(Scanner sc) {
        super.get(sc);
        System.out.print("Enter marks for subject 1: ");
        marks1 = sc.nextInt();
        System.out.print("Enter marks for subject 2: ");
        marks2 = sc.nextInt();
        System.out.print("Enter marks for subject 3: ");
        marks3 = sc.nextInt();
    }

    void calculate() {
        total = marks1 + marks2 + marks3;
        percentage = total / 3.0;
    }

    void put() {
        super.put();
        System.out.println("Marks1: " + marks1);
        System.out.println("Marks2: " + marks2);
        System.out.println("Marks3: " + marks3);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);
    }
}

public class MultiLevel_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Marksheet m1 = new Marksheet();
        m1.get(sc);
        m1.calculate();
        m1.put();
        sc.close();
    }
}