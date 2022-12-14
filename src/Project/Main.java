package Project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Zaevidovanie evidencia = new Zaevidovanie();
        String volba = ""; // Zaklad volby

        while (!volba.equals("4")) { //Cyklus na vyber volby
            evidencia.vypisUvod();
            System.out.println();
            System.out.println("Zvoľ si:");
            System.out.println("1 - Vytvoriť poistenie.");
            System.out.println("2 - Výpis poistených.");
            System.out.println("3 - Vyhľadanie poisteného.");
            System.out.println("4 - Skončiť.");
            volba = sc.nextLine();
            System.out.println();
            switch (volba) {
                case "1":
                    evidencia.pridajOsobu();
                    System.out.println("Poistenie úspešne vytvorené !");
                    break;
                case "2":
                    evidencia.vypisZoznam();
                    break;
                case "3":
                    evidencia.vyhladajOsobu();
                    break;
                case "4":
                    System.out.println("Koniec.");
                    break;
                default:
                    System.out.println("Pokračujte ľubovoľnou klávesou...");


            }
        }

    }
}
