package Project;
import java.util.ArrayList;
import java.util.Scanner;

public class Zaevidovanie  {
    private Databaza databaza;
    private Scanner sc = new Scanner(System.in);

    public Zaevidovanie() {
        databaza = new Databaza();
    }


    public void vypisZoznam() {
        databaza.vypisOsoby();
    }
    public void vypisUvod() {
        System.out.println("*************************");
        System.out.println("Evidencia poistených");
        System.out.println("*************************");

    }

    public void pridajOsobu() {
        System.out.println("Zadajte meno poisteného: ");
        String meno = sc.nextLine();
        System.out.println("Zadajte priezvisko: ");
        String priezvisko = sc.nextLine();
        System.out.println("Zadajte vek: ");
        int vek = sc.nextInt();
        sc.nextLine();
        System.out.println("Zadajte telefónne číslo: ");
        String telCislo = sc.nextLine();

        databaza.pridaOsobu(meno,priezvisko,vek,telCislo);
    }

    public void vyhladajOsobu() {

        System.out.println("Zadajte meno: ");
        String meno = sc.nextLine();
        System.out.println("Zadajte priezvisko: ");
        String priezvisko = sc.nextLine();

        ArrayList<Osoby> osoby = databaza.najdiPoisteneho(meno,priezvisko);
        if (osoby.size() > 0) {
            for (Osoby o : osoby) {
                System.out.println(o);
            }
        } else {
            System.out.println("Nenašli sa žiadne osoby.");
        }
    }
}
