package HomeWorkOne;

public class Task2 {
    public static void main(String[] args) {
        int x = 15;
        int y = 25;
        int z = 5;

            if (x < y && x < z) {
                if (y < z)
                    System.out.println("Последовательность: " + x + ", " + y + ", " + z);
                else
                    System.out.println("Последовательность: " + x + ", " + z + ", " + y);
            } else if (y < x && y < z) {
                if (x < z)
                    System.out.println("Последовательность: " + y + ", " + x + ", " + z);
                else
                    System.out.println("Последовательность: " + y + ", " + z + ", " + x);
            } else {
                if (x < y)
                    System.out.println("Последовательность: " + z + ", " + x + ", " + y);
                else
                    System.out.println("Последовательность: " + z + ", " + y + ", " + x);
            }
    }
}
