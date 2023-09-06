//Есть 2 целочисленных переменных a и b, в которых хранятся определенные значения.
// Нужно написать на Javaметод, меняющий местами значения переменных a и b, не используя 3й переменной.

public class zadanue2 {

    public static void swap(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        swap(a, b);
    }
}