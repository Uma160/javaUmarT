//import java.util.Scanner;
//public class main2{
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int a = vari.nextInt();
//        if (a%2 == 0){
//            System.out.println(a+2);
//        }
//        else {
//            System.out.println(a+1);
//        }
//
//    }
//}


//import java.util.Scanner;
//public class main2{
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int a = vari.nextInt();
//        int hours = a/3600;
//        int strh = hours%24;
//        int men = (a - hours*3600)/60;
//        String strm = String.format("%02d", men%60);
//        int sec = a- hours*3600 - men*60 ;
//        String strs = String.format("%02d", sec);
//            System.out.println(strh + ":" + strm + ":" + strs );
//        }
//
//    }


//import java.util.Scanner;
//
//public class main2{
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int n = vari.nextInt();
//
//        int totalBreaks = n - 1;
//        int bigBreaks = totalBreaks / 2;
//        int smallBreaks = totalBreaks - bigBreaks;
//
//        int totalMinutes = (9 * 60) + (n * 45) + (bigBreaks * 15) + (smallBreaks * 5);
//
//        int hours = totalMinutes / 60;
//        int minutes = totalMinutes % 60;
//
//        System.out.printf("%d %02d\n", hours, minutes);
//    }
//}


//import javax.sound.midi.SoundbankResource;
//import java.util.Scanner;

//public class main2 {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int rub = vari.nextInt();
//        int kop = vari.nextInt();
//        int n = vari.nextInt();
//        String nkop = String.valueOf(n);
//        double kope=  100* nkop.length();
//        double kopeyki = kop/kope;
//        double s = rub + kopeyki;
//        System.out.println((int)(s*n));
//    }
//}


//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int a = vari.nextInt();
//        int b = vari.nextInt();
//        int n = vari.nextInt();
//
//        int totalKopecks = ((a * 100) + b) * n;
//
//        int totalRubles = totalKopecks / 100;
//        int remainingKopecks = totalKopecks % 100;
//
//        System.out.println(totalRubles + " " + remainingKopecks);
//    }
//}


//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int v = vari.nextInt();
//        int t = vari.nextInt();
//
//        int position = ((v * t) % 109 + 109) % 109;
//
//        System.out.println(position);
//    }
//}

//import java.util.Scanner;
//
//public class main2 {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int n = vari.nextInt();
//
//        int nextEven = n + 2 - (n % 2);
//
//        System.out.println(nextEven);
//    }
//}

//
//import java.util.FormatFlagsConversionMismatchException;
//import java.util.Scanner;

//public class Main {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int a = vari.nextInt();
//        int b = vari.nextInt();
//        int n = vari.nextInt();
//
//        int totalKopecks = ((a * 100) + b) * n;
//
//        int totalRubles = totalKopecks / 100;
//        int remainingKopecks = totalKopecks % 100;
//
//        System.out.println(totalRubles + " " + remainingKopecks);
//    }
//}

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

//import java.util.Scanner;
//public class Main {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//
//        int a = vari.nextInt();
//        if (a%2 == 0){
//            System.out.println(a+2);
//        }
//        else {
//            System.out.println(a+1);
//        }
//
//    }
//}


//import java.util.Scanner;
//public class main2 {
//    public static void main(String[] args) {
//        Scanner vari = new Scanner(System.in);
//        double a = vari.nextDouble();
//        double b = vari.nextDouble();
//        double entire = b/a;
//        double rest = Math.ceil(b%a / b);
//
//        System.out.println((int)Math.ceil(rest) + (int)entire);
//    }
//}

