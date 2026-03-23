import java.util.Scanner;

class Person {
    String name;
    int age;
    String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    int rno;
    String dept;
    int sem;

    public Student(String name, int age, String gender, int rno, String dept, int sem){
        super(name, age, gender);  
        this.rno = rno;
        this.dept = dept;
        this.sem = sem;
    }

    void show() {
        super.show();
        System.out.println("Roll No: " + rno);
        System.out.println("Department: " + dept);
        System.out.println("Semester: " + sem);
    }
}

public class Single {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter gender: ");
        String gender = sc.nextLine();

        System.out.print("Enter roll no: ");
        int rno = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter department: ");
        String dept = sc.nextLine();

        System.out.print("Enter semester: ");
        int sem = sc.nextInt();

        Student s1 = new Student(name, age, gender, rno, dept, sem);
        s1.show();

        sc.close();
    }
}
