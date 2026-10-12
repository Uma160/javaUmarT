import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int k = scanner.nextInt();
        int m = scanner.nextInt();
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println(0);
        } else if (n <= k) {
            System.out.println(2 * m);
        } else {
            int totalSides = n * 2;
            int time = (totalSides + k - 1) / k * m;
            System.out.println(time);
        }
    }
}

