public class Exercise07_TypeCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;

        int originalInt = 7;
        double convertedDouble = originalInt;

        System.out.println("Double to int: " + myInt);
        System.out.println("Int to double: " + convertedDouble);
    }
}