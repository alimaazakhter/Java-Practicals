import java.util.*;

class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        list.add("Java");
        list.add("Programming");

        // Declare list1 before using it
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("bye");
        list1.add("Everyone");
        System.out.println(list1);

        System.out.println(list);

        // Using Iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        // Insert at index 2
        list.add(2, "Mango");
        System.out.println(list);

        // Replace element at index 2
        list.set(2, "Banana");
        System.out.println(list);

        // Get element at index 1
        System.out.println(list.get(1));

        // Remove element at index 3
        list.remove(3);
        System.out.println(list);

        // Sort the list
        Collections.sort(list);
        System.out.println(list);

        // Size of list
        System.out.println(list.size());

        // Check if list contains "Hello"
        System.out.println(list.contains("Hello"));

        // Add all elements from list1
        list.addAll(list1);
        System.out.println(list);
    }
}