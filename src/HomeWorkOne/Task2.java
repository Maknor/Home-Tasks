package HomeWorkOne;

public class Task2 {
    public static void main(String[] args) {
        int a = 15;
        int b = 25;
        int c = 5;

        if (a < b && a < c) {
            if (b < c)
                System.out.println("Последовательность: " + a + ", " + b + ", " + c);
            else
                System.out.println("Последовательность: " + a + ", " + c + ", " + b);
        } else if (b < a && b < c) {
            if (a < c)
                System.out.println("Последовательность: " + b + ", " + a + ", " + c);
            else
                System.out.println("Последовательность: " + b + ", " + c + ", " + a);
        } else {
            if (a < b)
                System.out.println("Последовательность: " + c + ", " + a + ", " + b);
            else
                System.out.println("Последовательность: " + c + ", " + b + ", " + a);
        }
    }
}
