public class Main {
    public static void main(String[] args) {
        // Oppretter en Verden-objekt (omgivelsene)
        World todaysWorld = new World(122, false);

        // Opprett to Robot-objekter
        Robot Dancatron4000 = new Robot("Dancatron4000", "B-Bot", 100, 1000);
        Robot SparkE = new Robot("SparkE", "Toaster", 40, 1500);
        // med navn, f.eks. Dancatron 4000 og Spark-E
        // med botType "B-Bot" og "Toaster"
        // med forskjellig batterinivå
        // med forskjellig avstand til parken
        // print ut statusen til begge robottene
        Dancatron4000.reportStatus();
        SparkE.reportStatus();

        // Sjekk om robotene kan gå til danseklubben
        // Sjekk om robotene kan gå til parken
    }
}
