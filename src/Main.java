public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(2, false);

        // Opprett to Robot-objekter
        Robot dancatron4000 = new Robot("dancatron4000", "B-Bot", 100, 50);
        Robot sparkE = new Robot("sparkE", "Toaster", 3, 1500);

        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene
        String initialisingSE = sparkE.reportStatus();
        String initialisingD4 = dancatron4000.reportStatus();
        
        System.out.println(initialisingD4);
        System.out.println(initialisingSE);

        // Sjekk om robotene kan gå til danseklubben
        dancatron4000.canDanceAtClub(todaysWorld);
        sparkE.canDanceAtClub(todaysWorld);

        // Sjekk om robotene kan gå til parken
        dancatron4000.canWalkToThePark(todaysWorld);
        sparkE.canWalkToThePark(todaysWorld);

    }
}
