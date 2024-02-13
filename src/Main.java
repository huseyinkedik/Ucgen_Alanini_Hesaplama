import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /* ilk kenar : a
        ikinci kenar : b
        üçüncü kenar : c
        üçgenin çevresi :u
        üçgenin alanı : alan */

        double a, b, c, u, alan;
        Scanner girdi = new Scanner(System.in);
        System.out.print("ilk kenarın uzunluğunu giriniz: ");
        a = girdi.nextInt();

        System.out.print("ikinci kenarın uzunluğunu giriniz: ");
        b = girdi.nextInt();

        System.out.print("üçüncü kenarın uzunluğunu giriniz: ");
        c = girdi.nextInt();

        // Heron formülü uygulandı //
        u = a + b + c;
        u = (u / 2);

        alan = Math.sqrt((u * (u - a) * (u - b) * (u- c)));
        System.out.print("Üçgenin alanı: " + alan);


    }
}