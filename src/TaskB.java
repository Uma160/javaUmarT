import java.util.Scanner;

public class TaskB {

    public static void main(String[] args) {
        Scanner umar = new Scanner(System.in);
        int a = umar.nextInt();
        int b = umar.nextInt();
        int x = umar.nextInt();
        int y = umar.nextInt();
        if (a==x || b==y) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

}

