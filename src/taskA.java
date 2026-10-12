import java.util.Scanner;
public class taskA {
    static void main(String[] args) {
        Scanner umar = new Scanner(System.in);
        int a = umar.nextInt();
        if ((a % 400 == 0) || (a % 4 == 0 && a % 100 != 0)) {
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }

}