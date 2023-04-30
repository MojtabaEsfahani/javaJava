package Animals;


/**
 * Abstract Class Of Animals
 */

abstract class Animal {
    protected String Tierart = "Not Set";
    protected String bedroht = "yes";



    public Animal(String Tierart, String bedroht) {
        this.Tierart = Tierart;
        this.bedroht = bedroht;
    }





    public void setTierart(String newTierart) {
        Tierart = newTierart;
    }


    public void setbedroht(String newbedroht) {
        bedroht = newbedroht;
    }



    public void printTierart() {
        System.out.println(Tierart);
    }



    public void printbedroht() {
        System.out.println(bedroht);
    }

}