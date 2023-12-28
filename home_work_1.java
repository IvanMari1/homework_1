import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter x value: ");
        double x = scanner.nextDouble();
        System.out.println("Please enter y value: ");
        double y = scanner.nextDouble();
        if ((y == 4 * x + 6)
                || (((x * x + 4 * x) + (y * y - 6 * y) + 9) == 0)
                || (x == -3 && y >= 0 && y <= 8)
                || (y == 8 && x >= -3 && x <= 7)
                || (x == 7 && y >= 0 && y <= 8)
                || (y == 0 && x >= -3 && x<= 7)) {
            System.out.println("Dark Blue");
        } else if ((y > 4 * x + 6) || (x < -3 && (y > 8 || y < 0))) {
            System.out.println("White");
        }
    }
}
