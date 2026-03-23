class pair<T, U>
{
    T first;
    U second;

    pair(T first, U second)
    {
        this.first = first;
        this.second = second;
    }

    void display(){

        System.out.println("First: " + first);
        System.out.println("Second: " + second);
    }
}

public class GenetricDemo {

     public static void main(String[] args) {
        pair<Integer, String> p1 = new pair(10, "Java");
        pair<Double, String> p2 = new pair(3.14, true);

        p1.display();
        p2.display();

     }
}