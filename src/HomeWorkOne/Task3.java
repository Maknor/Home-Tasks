package HomeWorkOne;

public class Task3 {
    public static void main(String[] args) {
        double a=-3.5;
        double b=27.45;
        int x=10;
        double a1=Math.abs(x-a);
        double b1=Math.abs(x-b);

        if (a1 == b1) {
            System.out.println("Числа "+a +" и "+b + " равноудалены от "+x);
        }
        else if (a1 > b1) {
            System.out.println("Число "+b+" ближе к "+x);
        }
        else if (a1 < b1) {
            System.out.println("Число "+a+" ближе к "+x);
        }
    }
}
