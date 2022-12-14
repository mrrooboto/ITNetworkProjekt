package Project;
import java.util.ArrayList;
public class Databaza {
    private ArrayList<Osoby> osoby;

    public Databaza() {
        osoby = new ArrayList<>();
    }


    public void pridaOsobu(String meno, String priezvisko, int vek, String telCislo) {
        osoby.add(new Osoby(meno, priezvisko, vek, telCislo));
    } // metoda na pridanie osoby do zoznamu

    /**
     *
     * @param meno
     * @param priezvisko
     * @return vrati najdeneho poisteneho.
     */
    public ArrayList<Osoby> najdiPoisteneho(String meno, String priezvisko) {

        ArrayList<Osoby> najdene = new ArrayList<>();
        for (Osoby o : osoby) {
            if ((o.getMeno().equals(meno)) && (o.getPriezvisko().equals(priezvisko))) {
                najdene.add(o);
            }
        }
        return najdene;
    }

    public void vypisOsoby() {
        for (int i = 0; i < osoby.size(); i++) {
            System.out.println(osoby.get(i));
        }
    }
}
