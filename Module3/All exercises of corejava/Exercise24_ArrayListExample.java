import java.util.ArrayList;
import java.util.Scanner;

public class Exercise24_ArrayListExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter names (type 'exit' to stop):");

        while (true) {
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit"))
                break;
            names.add(name);
        }

        System.out.println("Names entered:");
        for (String n : names) {
            System.out.println(n);
        }
    }
}