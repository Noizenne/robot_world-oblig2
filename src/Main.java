public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(2, false);

        // Opprett to Robot-objekter
        Robot Dancatron4000 = new Robot("Dancatron4000", "B-Bot", 100, 50);
        Robot SparkE = new Robot("SparkE", "Toaster", 3, 1500);

        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene

        Dancatron4000.reportStatus();
        SparkE.reportStatus();

        // Sjekk om robotene kan gå til danseklubben
        Dancatron4000.canDanceAtClub(todaysWorld);
        SparkE.canDanceAtClub(todaysWorld);

        // Sjekk om robotene kan gå til parken
        Dancatron4000.canWalkToThePark(todaysWorld);
        SparkE.canWalkToThePark(todaysWorld);

    }
}
