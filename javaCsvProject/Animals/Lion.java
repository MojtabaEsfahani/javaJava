package Animals;


/**
 * Class Of Animals
 */

public class Lion extends Animal {
    private String Name = "Not Set";
    private String Chipnummer = "Not Set";
    private String Fressverhalten = "Not Set";
    private String Lebensraum = "Not Set";
    private String Herkunft;

    public Lion(String Tierart, String Name, String Chipnummer, String Fressverhalten, String Lebensraum, String bedroht, String Herkunft) {
        super("Lion", "yes");
        this.Name = Name;
        this.Chipnummer = Chipnummer;
        this.Fressverhalten = Fressverhalten;
        this.Lebensraum = Lebensraum;
        this.Herkunft = Herkunft;
    }


    public Lion() {
        super("Lion", "yes");

    }


    public void setHerkunft(String newHerkunft) {
        Herkunft = newHerkunft;
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


    public void printHerkunft() {
        System.out.println(Herkunft);
    }


    public void textMacker() {
        String str1 = String.format("This lion has the name: %s and the number: %s %s lives\n", Name, Chipnummer, Name);
        String str2 = String.format("in the %s and eats %s. The lion is considered the king of\n", Lebensraum, Fressverhalten);
        String str3 = String.format("beasts and in this case %s is a specimen from %s. Is the lion threatened?:%s\n", Name, Herkunft, bedroht);
        System.out.println(str1 + str2 + str3);

    }

}
