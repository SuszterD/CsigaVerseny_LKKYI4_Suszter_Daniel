import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> ervenyesErtek = Arrays.asList("piros", "zöld", "kék");

        while (true) {
            String fogadottSzin;
            while (true) {
                System.out.println("Válasszon egy csigát amire fogadni szeretne: piros, zöld, kék");
                fogadottSzin = scanner.nextLine();
                if (ervenyesErtek.contains(fogadottSzin)) {
                    break;
                } else {
                    System.out.println("Érvénytelen érték, kérem válasszon a megadott lehetőségek közül!");
                }
            }
            Verseny verseny = new Verseny();
            verseny.startVerseny(fogadottSzin);
            verseny.mozgasTorles();
        }
    }
}