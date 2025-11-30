package rechner;

import java.util.Scanner;

public class Kostenrechnung {

    public static void main(String[] args) {

        double spritpreis1 = 0;
        double verbrauch1 = 0;
        double kilometer1 = 0;

        double spritpreis2 = 0;
        double verbrauch2 = 0;
        double kilometer2 = 0;

        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Bitte gib den Namen des ersten Autos ein:");
        String auto1 = scanner.nextLine();

        System.out.println("Bitte gib die Anschaffungskosten ein:");
        double anschaffungskosten1 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Bitte gib deinen Kfz-Monatsbeitrag ein:");
        double kfzmonatsbeitrag1 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Bitte gib deine Kraftstoffart ein (Benzin/Diesel):");
        String kraftstoffart1 = scanner.nextLine();

        if (kraftstoffart1.equalsIgnoreCase("Benzin") || kraftstoffart1.equalsIgnoreCase("Diesel")) {

            System.out.println("Bitte gib den Preis pro Liter an:");
            spritpreis1 = scanner.nextDouble();

            System.out.println("Bitte gib den Verbrauch (L/100km) an:");
            verbrauch1 = scanner.nextDouble();

            System.out.println("Bitte gib deine Jahreskilometer an:");
            kilometer1 = scanner.nextDouble();
            scanner.nextLine(); 
        }

        
        System.out.println("Bitte gib den Namen des zweiten Autos ein:");
        String auto2 = scanner.nextLine();

        System.out.println("Bitte gib die Anschaffungskosten ein:");
        double anschaffungskosten2 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Bitte gib deinen Kfz-Monatsbeitrag ein:");
        double kfzmonatsbeitrag2 = scanner.nextDouble();
        scanner.nextLine(); 

        System.out.println("Bitte gib deine Kraftstoffart ein (Benzin/Diesel):");
        String kraftstoffart2 = scanner.nextLine();

        if (kraftstoffart2.equalsIgnoreCase("Benzin") || kraftstoffart2.equalsIgnoreCase("Diesel")) {

            System.out.println("Bitte gib den Preis pro Liter an:");
            spritpreis2 = scanner.nextDouble();

            System.out.println("Bitte gib den Verbrauch (L/100km) an:");
            verbrauch2 = scanner.nextDouble();

            System.out.println("Bitte gib deine Jahreskilometer an:");
            kilometer2 = scanner.nextDouble();
            scanner.nextLine(); 
        }

        // --- Berechnung ---
        System.out.println("Wie viele Jahre willst du verrechnen?");
        double jahre = scanner.nextDouble();

        double monate = jahre * 12;

        // Spritkosten pro Jahr
        double spritkosten1 = (verbrauch1 / 100.0) * kilometer1 * spritpreis1;
        double spritkosten2 = (verbrauch2 / 100.0) * kilometer2 * spritpreis2;

        // Gesamtkosten für den gesamten Zeitraum
        double gesamtkosten1_total = anschaffungskosten1 + (kfzmonatsbeitrag1 * monate) + spritkosten1 * jahre;
        double gesamtkosten2_total = anschaffungskosten2 + (kfzmonatsbeitrag2 * monate) + spritkosten2 * jahre;

        // Durchschnitt pro Jahr
        double gesamtkosten1_proJahr = gesamtkosten1_total / jahre;
        double gesamtkosten2_proJahr = gesamtkosten2_total / jahre;

        System.out.println("--------------------------------------------------");
        System.out.println("Kostenvergleich:");
        System.out.println(auto1 + " kostet dich durchschnittlich: " + gesamtkosten1_proJahr + " € pro Jahr.");
        System.out.println(auto2 + " kostet dich durchschnittlich: " + gesamtkosten2_proJahr + " € pro Jahr.");
        System.out.println("--------------------------------------------------");
        scanner.close();
    }
    
}
