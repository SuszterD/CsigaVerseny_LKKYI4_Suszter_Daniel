public class Csiga {
    private String szin;
    private int tav;

    public Csiga(String szin) {
        this.szin = szin;
        this.tav = 0;
    }

    public String getSzin() {
        return szin;
    }

    public int getTav() {
        return tav;
    }

    public void mozgas(int egyseg) {
        this.tav += egyseg;
    }
}
