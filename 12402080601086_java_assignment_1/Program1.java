import java.util.*;
class Program1 {
    int[] arr;
    int n;
    // Constructor
    Program1(int size) {
        n = size;
        arr = new int[n];
    }
    // Input method
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    // Reverse array
    void reverse() {
        System.out.print("Reversed Array: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    // Sort array (Ascending)
    void sort() {
        Arrays.sort(arr);
        System.out.print("Sorted Array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
 void search(int key) {
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at position " + (i + 1));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Element not found");
        }
    }
    void average() {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / n;
        System.out.println("Average = " + avg);
    }
    void maximum() {
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Maximum = " + max);
    }
    void reverseString(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        System.out.println("Reversed String: " + rev);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
 System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        Program1 obj = new Program1(size);

        obj.input();
        obj.reverse();
        obj.sort();

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();
        obj.search(key);

        obj.average();
        obj.maximum();

        sc.nextLine(); // clear buffer
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        obj.reverseString(str);
    }
}
