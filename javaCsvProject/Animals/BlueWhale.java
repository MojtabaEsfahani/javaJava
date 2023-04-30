package Animals;


/**
 * Class Of Animals
 */

public class BlueWhale extends Animal {
    private String Name = "Not Set";
    private String Chipnummer = "Not Set";
    private String Fressverhalten = "Not Set";
    private String Lebensraum = "Not Set";
    private String Farbe = "Not Set";

    public BlueWhale(String Tierart, String Name, String Chipnummer, String Fressverhalten, String Lebensraum, String bedroht, String Farbe) {
        super("Blue Whale", "yes");
        this.Name = Name;
        this.Chipnummer = Chipnummer;
        this.Fressverhalten = Fressverhalten;
        this.Lebensraum = Lebensraum;
        this.Farbe = Farbe;

    }


    public BlueWhale() {
        super("Blue Whale", "yes");
    }


    public void setName(String newName) {
        Name = newName;
    }


    public void setChipnummer(String newChipnummer) {
        Chipnummer = newChipnummer;
    }


    public void setFressverhalten(String newFressverhalten) {
        Fressverhalten = newFressverhalten;
    }


    public void setLebensraum(String newLebensraum) {
        Lebensraum = newLebensraum;
    }



    public void setFarbe(String newFarbe) {
        Farbe = newFarbe;
    }


    public void printName() {
        System.out.println(Name);
    }



    public void printChipnummer() {
        System.out.println(Chipnummer);
    }


    public void printFressverhalten() {
        System.out.println(Fressverhalten);
    }



    public void printLebensraum() {
        System.out.println(Lebensraum);
    }



    public void printFarbe() {
        System.out.println(Farbe);
    }



    public void textMacker() {
        String str1 = String.format("This blue whale has the name: %s and the number: %s %s lives in\n", Name, Chipnummer, Name);
        String str2 = String.format("the %s and eats %s. The blue whale is the largest sea creature.\n", Lebensraum, Fressverhalten);
        String str3 = String.format("Willy has the color as a distinguishing feature: %s.\n", Farbe);
        String str4 = String.format("Is the blue whale threatened?:%s\n", bedroht);
        System.out.println(str1 + str2 + str3 + str4);

    }

}

