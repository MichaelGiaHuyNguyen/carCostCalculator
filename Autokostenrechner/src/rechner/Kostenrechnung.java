package rechner;

import java.util.Scanner;

public class Kostenrechnung {

    public static void main(String[] args) {
    	
    	double antwort;
    
    	
    	double auto1kosten;
    	double auto1laufleistung;
    	double auto1verbrauch;
    	double auto1versicherung;
    	double auto1spritpreis = 0;
    	
    	double auto2kosten;
    	double auto2laufleistung;
    	double auto2verbrauch;
    	double auto2versicherung;
    	double auto2spritpreis = 0;
    	
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Bitte benenne das Auto 1:");
    String autoname1 = scanner.nextLine();
    
    System.out.println("Bitte benenne das Auto 2:");
    String autoname2 = scanner.nextLine();
    
    while (true) {
        System.out.println("Wie viel Kostet dein Auto 1?");
        if (scanner.hasNextDouble()) {
        	auto1kosten = scanner.nextDouble();
        	break; //win condition
        } else {
			System.out.println("Falscher Input");
			scanner.next();
		}
    }
    
    while (true) {
        System.out.println("Willste Benziner/Benziner (1), Benziner/Diesel (2), Diesel/Diesel (3) vergleichen?");
        antwort = scanner.nextDouble();
        double antwort2;
		if (antwort == 1) {
        	System.out.println("Was ist der Benzinpreis?");
        	antwort2 = scanner.nextDouble();
            auto1spritpreis = antwort2;
        	break;
        }
        
        else if (antwort == 2) {
        	System.out.println("Was ist der Benzinpreis?");
        	antwort2 = scanner.nextDouble();
        	System.out.println("Was ist der Dieselpreis?");
        	double antwort3 = scanner.nextDouble();
        	auto1spritpreis = antwort2;
        	auto2spritpreis = antwort3;
        	break;
        }
  
        else if (antwort == 3) {
        	System.out.println("Was ist der Dieselpreis?");
        	antwort2 = scanner.nextDouble();
        	auto1spritpreis = antwort2;
        	auto2spritpreis = antwort2;
        	break;
        }
        
    }
    
        while (true) {
        	System.out.println("Wie viel Laufleistung hat dein Auto 1 im Jahr?");
        	if (scanner.hasNextDouble()) {
        		auto1laufleistung =  scanner.nextDouble();
        		break;
        	} else {
        		System.out.println("Falscher Input");
        		scanner.next();
        	}
        }
        
    while (true) {
    	System.out.println("Wie viel Verbrauch hat dein Auto 1");
    	if (scanner.hasNextDouble()) {
    		auto1verbrauch = scanner.nextDouble();
    		break;
    	} else {
    		System.out.println("Falscher input");
    		scanner.next();
    	}
    }
    
    while (true) {
    	System.out.println("Wie viel zahlst du Versicherung im Monat für das Auto 1?");
    	if (scanner.hasNextDouble()) {
    		auto1versicherung = scanner.nextDouble();
    		break;
     	} else {
     		System.out.println("Falscher Input");
    		scanner.next();
     	}
    }
    
    
    while (true) {
        System.out.println("Wie viel Kostet dein Auto 2?");
        if (scanner.hasNextDouble()) {
        	auto2kosten = scanner.nextDouble();
        	break; //win condition
        } else {
			System.out.println("Falscher Input");
			scanner.next();
		}
    }
        while (true) {
        	System.out.println("Wie viel Laufleistung hat dein Auto 2 im Jahr?");
        	if (scanner.hasNextDouble()) {
        		auto2laufleistung =  scanner.nextDouble();
        		break;
        	} else {
        		System.out.println("Falscher Input");
        		scanner.next();
        	}
        }
        
    while (true) {
    	System.out.println("Wie viel Verbrauch hat dein Auto 2");
    	if (scanner.hasNextDouble()) {
    		auto2verbrauch = scanner.nextDouble();
    		break;
    	} else {
    		System.out.println("Falscher Input");
    		scanner.next();
    	}
    }
    
    while (true) {
    	System.out.println("Wie viel zahlst du Versicherung im Monat für das Auto 2?");
    	if (scanner.hasNextDouble()) {
    		auto2versicherung = scanner.nextDouble();
    		break;
     	} else {
     		System.out.println("Falscher Input");
    		scanner.next();
     	}
    }
    
    
    double gesamtkosten1 = auto1kosten + (((auto1verbrauch / 100) * auto1laufleistung) * auto1spritpreis) + (auto1versicherung * 12);
    
    double gesamtkosten2 = auto2kosten + (((auto2verbrauch / 100) * auto2laufleistung) * auto2spritpreis) + (auto2versicherung * 12);
    
    System.out.println("Dein " + autoname1 + "kostet" + gesamtkosten1 + " im Jahr");
   
    System.out.println("Dein " + autoname2 + "kostet" + gesamtkosten2 + " im Jahr");
    
    scanner.close();
    
    }
    
}