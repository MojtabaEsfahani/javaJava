package Animals;


/**
 * Class Of Animals
 */

public class Tiger extends Animal {
    private String Name = "Not Set";
    private String Chipnummer = "Not Set";
    private String Fressverhalten = "Not Set";
    private String Lebensraum = "Not Set";


    public Tiger(String Tierart, String Name, String Chipnummer, String Fressverhalten, String Lebensraum, String bedroht) {
        super("Tiger", "yes");
        this.Name = Name;
        this.Chipnummer = Chipnummer;
        this.Fressverhalten = Fressverhalten;
        this.Lebensraum = Lebensraum;
    }


    public Tiger() {
        super("Tiger", "yes");

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



    public void textMacker() {
        String str1 = String.format("This sumatran tiger has the name: %s and the number: %s %s lives\n", Name, Chipnummer, Name);
        String str2 = String.format("in the %s and eats %s. The Sumatran tiger is not afraid of water\n", Lebensraum, Fressverhalten);
        String str3 = "and is a very good swimmer. That’s why he has webbed feet between\n";
        String str4 = String.format("his toes. Is the sumatran tiger threatened?: %s\n", bedroht);

        System.out.println(str1 + str2 + str3 + str4);
    }

}
