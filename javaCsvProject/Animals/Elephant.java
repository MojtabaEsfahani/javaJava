package Animals;


/**
 * Class Of Animals
 */

public class Elephant extends Animal {
    private String Name = "Not Set";
    private String Chipnummer = "Not Set";
    private String Fressverhalten = "Not Set";
    private String Lebensraum = "Not Set";
    private String Größe;


    public Elephant(String Tierart, String Name, String Chipnummer, String Fressverhalten, String Lebensraum, String bedroht, String Größe) {
        super("Elephant", "yes");
        this.Name = Name;
        this.Chipnummer = Chipnummer;
        this.Fressverhalten = Fressverhalten;
        this.Lebensraum = Lebensraum;
        this.Größe = Größe;
    }



    public Elephant() {
        super("Elephant", "yes");

    }


    public void setGröße(String newGröße) {
        Größe = newGröße;
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


    public void printGröße() {
        System.out.println(Größe);
    }


    public void textMacker() {
        String str1 = String.format("This elephant has the name: %s and the number: %s %s lives in\n", Name, Chipnummer, Name);
        String str2 = String.format("the %s and eats %s. The elephant is the largest land creature\n", Lebensraum, Fressverhalten);
        String str3 = String.format("and %s measures %s m. Is the elephant threatened?: %s\n", Name, Größe, bedroht);
        System.out.println(str1 + str2 + str3);

    }

}
