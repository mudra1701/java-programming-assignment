import java.util.*;

// Book class implementing Comparable
class Book implements Comparable<Book> {
    int id;
    String name;
    double price;

    // Constructor
    Book(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Comparable (sort by price)
    public int compareTo(Book b) {
        return Double.compare(this.price, b.price);
    }

    void display() {
        System.out.println(id + " " + name + " " + price);
    }
}

// Comparator for sorting by name
class NameComparator implements Comparator<Book> {
    public int compare(Book b1, Book b2) {
        return b1.name.compareTo(b2.name);
    }
}

// Main class
public class Program4 {
    public static void main(String[] args) {

        ArrayList<Book> list = new ArrayList<>();

        list.add(new Book(1, "Java", 500));
        list.add(new Book(2, "Python", 300));
        list.add(new Book(3, "C++", 400));

        // Sorting using Comparable (by price)
        Collections.sort(list);
        System.out.println("Sorted by Price:");
        for (Book b : list) {
            b.display();
        }

        // Sorting using Comparator (by name)
        Collections.sort(list, new NameComparator());
        System.out.println("\nSorted by Name:");
        for (Book b : list) {
            b.display();
        }
    }
}

