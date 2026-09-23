//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        String a = vari.nextLine();
//        int s = 0;
//        for (int i = 0; i < a.length(); i++) {
//            char c = a.charAt(i);
//            s+= Character.getNumericValue(c);
//        }
//        System.out.println(s);
//    }
//}
//import java.util.Scanner;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner vari = new Scanner(System.in);

        int a = vari.nextInt();
        if (a%2 == 0){
            System.out.println(a+2);
        }
        else {
            System.out.println(a+1);
        }

    }
}