import java.util.*;

public class Exercise27_LambdaExpressions {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Banana", "Apple", "Mango", "Cherry");
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
        System.out.println("Sorted list: " + list);
    }
}
