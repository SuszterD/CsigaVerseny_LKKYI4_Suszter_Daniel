import java.util.Random;

public class Verseny {
    private Csiga[] csigak;
    private int korok;
    private Random random;

    public Verseny() {
        this.csigak = new Csiga[]{
                new Csiga("piros"),
                new Csiga("zöld"),
                new Csiga("kék")
        };
        this.korok = 5;
        this.random = new Random();
    }

    public void startVerseny(String fogadottSzin) {
        System.out.println("A fogadott szín: " + fogadottSzin);

        for (int kor = 1; kor <= korok; kor++) {
            System.out.println("\n" + kor + ". kör:");
            int gyorsito = random.nextInt(100) < 20 ? random.nextInt(csigak.length) : -1;

            for (int i = 0; i < csigak.length; i++) {
                int megtettTav = random.nextInt(4);
                if (i == gyorsito) {
                    System.out.println("A " + csigak[i].getSzin() + " csiga gyorsítót kapott!");
                    megtettTav *= 2;
                }
                csigak[i].mozgas(megtettTav);
                System.out.println("A " + csigak[i].getSzin() + " csiga megtett távolsága: " + csigak[i].getTav() + " egység");
            }
        }
        Csiga nyertes = nyertesCsiga();
        System.out.println("\nA nyertes a " + nyertes.getSzin() + " csiga! Megtett távolsága: " + nyertes.getTav() + " egység!");
        if (nyertes.getSzin().equalsIgnoreCase(fogadottSzin)) {
            System.out.println("Nyert a fogadott csiga!");
        } else {
            System.out.println("A fogadott csiga nem nyert!");
        }
    }

    private Csiga nyertesCsiga() {
        Csiga nyertes = csigak[0];
        for (Csiga csiga : csigak) {
            if (csiga.getTav() > nyertes.getTav()) {
                nyertes = csiga;
            }
        }
        return nyertes;
    }

    public void mozgasTorles() {
        for (Csiga csiga : csigak) {
            csiga.mozgas(-csiga.getTav());
        }
    }
}
