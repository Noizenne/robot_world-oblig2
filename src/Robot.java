public class Robot {
    // gi robotten 4 attributter: name, batteryLevel, distancetoPark og botType
    private String name;
    private String botType;
    private int batteryLevel;
    private int distanceToPark;

    public Robot(String name, String botType, int batteryLevel, int distanceToPark){
        this.name=name;
        this.botType=botType;
        this.batteryLevel=batteryLevel;
        this.distanceToPark=distanceToPark;
    }


    public String reportStatus() {
        // Metode for å rapportere statusen til robotten
        String initialising;
        initialising = "declaring status:\n";
        initialising += "type of bot: " + botType + "\n";
        initialising += "name: "+ name + "\n";
        initialising += "battery level: " + batteryLevel + "%\n";
        initialising += "distance to park: " + distanceToPark + "\n";
        System.out.println(initialising); 
        
        // Endre metoden slik at den retunerer en tekst streng som forklarer statusen til roboten
        // eksempel: Dette er bot Dancatron 4000 av type B-Bot.
        // Denne enheten har 80.0 batterikapasitet igjen og bor 1500 meter fra parken.
        return "";}

    public boolean canWalkToThePark(World world) {
        String reason;
        // Metode for å sjekke om roboten kan gå til parken basert på omgivelsene

        System.out.println(name + " sjekker om det er mulig å gå til parken...");

        // Sjekk om det regner
        if (world.getIsRaining()) {
            
            reason = "it's raining, the bot can't go to the park\n";
            System.out.println(reason);
            // skriv ut hvorfor boten ikke kan gå i parken med System.out.println
            return false;
        }

        // Sjekk om det er søndag. Kan bare gå i parken på søndager.
        if (world.day % 7 == 0) {
            reason = "the bot is not allowed in the park on sundays\n";
            System.out.println(reason);
            return false;
        }
        

        // Sjekk batterinivå. En bot trenger 1% batterinivå per 100 meter for å gå til parken.
        if (distanceToPark>batteryLevel*100){
            reason = "the bot doesn't have sufficent battery level\n";
            System.out.println(reason);
            return false;
        }

        return true;
    }


    // lag en metode som heter canDanceAtClub, som sjekker om boten kan være med på danseklubben
       // bottypen må være av type B-Bot (hint .equals)
       // En bot trenger minimum 50% batterikapasitet for å være med
       // Det kan ikke være mandag. Da er danseklubben stengt.
}
