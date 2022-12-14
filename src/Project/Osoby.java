package Project;


public class Osoby {
    private String meno;
    private String priezvisko;
    private int vek;
    private String telefonCislo;

    /**
     *
     * @param meno
     * @param priezvisko
     * @param vek
     * @param telCislo
     */
    public Osoby(String meno, String priezvisko, int vek, String telCislo) {
        this.meno = meno;
        this.priezvisko = priezvisko;
        this.vek = vek;
        this.telefonCislo = telCislo;
    }


    public String getMeno() {
        return meno;
    }

    public String getPriezvisko() {
        return priezvisko;
    }

    public int getVek() {
        return vek;
    }

    public String getTelCislo() {
        return telefonCislo;
    }

    public void setMeno(String meno) {
        this.meno = meno;
    }

    public void setPriezvisko(String priezvisko) {
        this.priezvisko = priezvisko;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setTelCislo(String telCislo) {
        this.telefonCislo = telCislo;
    }

    @Override
    public String toString() {
        return meno + " " + priezvisko + " " + vek + " " + telefonCislo;
    }

}
