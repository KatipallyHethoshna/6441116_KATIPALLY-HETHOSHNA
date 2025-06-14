import java.util.HashMap;
import java.util.Scanner;

public class Exercise25_HashMapExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<Integer, String> studentMap = new HashMap<>();

        System.out.println("Enter student ID and name (type -1 to stop):");
        while (true) {
            System.out.print("ID: ");
            int id = scanner.nextInt();
            if (id == -1)
                break;
            scanner.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = scanner.nextLine();
            studentMap.put(id, name);
        }

        System.out.print("Enter ID to search: ");
        int searchId = scanner.nextInt();
        String result = studentMap.get(searchId);
        if (result != null) {
            System.out.println("Student Name: " + result);
        } else {
            System.out.println("ID not found.");
        }
    }
}