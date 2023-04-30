import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Animals.*;

/**
 * Reading Animals Data From CSV File And Log Information In Special Table
 */

public class Main {
    private static final List<String> blueWhaleList = new ArrayList<String>();
    private static final List<String> elephantList = new ArrayList<String>();
    private static final List<String> lionList = new ArrayList<String>();
    private static final List<String> tigerList = new ArrayList<String>();

    public BlueWhale blueWhale = new BlueWhale();



    public static void main(String[] args) {
        readAndAnalyzerFiles();
    }


    public static void readAndAnalyzerFiles() {
        List<String> Data = new ArrayList<String>();
        try {
            Scanner Scan = new Scanner(new File("src\\animals.csv"));
            Scan.useDelimiter(",");
            for (int i = 0; Scan.hasNextLine(); i++) {
                Data.add(Scan.nextLine());
                if (i == 0) {

                } else if ((Data.get(i)).contains("\"")) {

                    int theFirstCut = (Data.get(i)).indexOf("\"");
                    int theSecCut = (Data.get(i)).indexOf("\"", theFirstCut + 1);

                    String sub1 = (Data.get(i)).substring(0, theFirstCut - 1);
                    String keyOfTheLine = sub1.substring(0, sub1.indexOf(",") - 1);
                    String sub2 = (Data.get(i)).substring(theFirstCut + 1, theSecCut - 1);
                    String sub3 = (Data.get(i)).substring(theSecCut + 1);

                    List<String> Filler = new ArrayList<String>();
                    int indexOfFiller = 0;
                    for (String SPANNER : (sub1 + ", " + sub3).split(",")) {
                        if (indexOfFiller == 0) {
                            keyOfTheLine = SPANNER;
                            Filler.add(SPANNER);
                        } else if (indexOfFiller == 3) {
                            Filler.add(sub2);
                        } else if (!SPANNER.equals("")) {
                            Filler.add(SPANNER);
                        }
                        indexOfFiller++;
                    }

                    switch (keyOfTheLine) {
                        case ("Lion"):
                            setNewLion(Filler);
                            break;

                        case ("Tiger"):
                            setNewTiger(Filler);
                            break;

                        case ("Elephant"):
                            setNewElephant(Filler);
                            break;
                        case ("Blue Whale"):
                            setNewBlueWhale(Filler);
                            break;
                        default:
                            System.out.println("Something Went Wrong !!!");
                    }

                } else {
                    List<String> Filler = new ArrayList<String>();
                    for (String SPANNER : ((Data.get(i)).split(","))) {
                        if (SPANNER != "") {
                            Filler.add(SPANNER);
                        }
                    }
                    String keyOfTheLine2 = Data.get(i).substring(0, Data.get(i).indexOf(","));
                    switch (keyOfTheLine2) {
                        case ("Lion"):
                            setNewLion(Filler);
                            break;

                        case ("Tiger"):
                            setNewTiger(Filler);
                            break;

                        case ("Elephant"):
                            setNewElephant(Filler);
                            break;
                        case ("Blue Whale"):
                            setNewBlueWhale(Filler);
                            break;
                        default:
                            System.out.println("Something Went Wrong !!!");
                    }
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("Something Went Wrong !!!");
            e.printStackTrace();
        }
    }




    public static void setNewBlueWhale(List<String> Data) {

        BlueWhale blueWhale = new BlueWhale();
        blueWhale.setName(Data.get(1));
        blueWhale.setChipnummer(Data.get(2));
        blueWhale.setFressverhalten(Data.get(3));
        blueWhale.setLebensraum(Data.get(4));
        blueWhale.setFarbe(Data.get(6));
        String string = String.format("Name: %s, Chipnummer: %s, Fressverhalten: %s, Lebensraum: %s, Farbe: %s",
                Data.get(1), Data.get(2), Data.get(3), Data.get(4), Data.get(6));
        blueWhaleList.add(string);
        blueWhale.textMacker();
    }




    private static void setNewElephant(List<String> Data) {

        Elephant elephant = new Elephant();
        elephant.setName(Data.get(1));
        elephant.setChipnummer(Data.get(2));
        elephant.setFressverhalten(Data.get(3));
        elephant.setLebensraum(Data.get(4));
        elephant.setGröße(Data.get(6));
        String string = String.format("Name: %s, Chipnummer: %s, Fressverhalten: %s, Lebensraum: %s, Größe: %s",
                Data.get(1), Data.get(2), Data.get(3), Data.get(4), Data.get(6));
        elephantList.add(string);
        elephant.textMacker();
    }





    private static void setNewLion(List<String> Data) {

        Lion lion = new Lion();
        lion.setName(Data.get(1));
        lion.setChipnummer(Data.get(2));
        lion.setFressverhalten(Data.get(3));
        lion.setLebensraum(Data.get(4));
        lion.setHerkunft(Data.get(6));
        String string = String.format("Name: %s, Chipnummer: %s, Fressverhalten: %s, Lebensraum: %s, Herkunft: %s",
                Data.get(1), Data.get(2), Data.get(3), Data.get(4), Data.get(6));
        lionList.add(string);
        lion.textMacker();




    }



    private static void setNewTiger(List<String> Data) {

        Tiger tiger = new Tiger();
        tiger.setName(Data.get(1));
        tiger.setChipnummer(Data.get(2));
        tiger.setFressverhalten(Data.get(3));
        tiger.setLebensraum(Data.get(4));
        String string = String.format("Name: %s, Chipnummer: %s, Fressverhalten: %s, Lebensraum: %s", Data.get(1),
                Data.get(2), Data.get(3), Data.get(4));
        tigerList.add(string);
        tiger.textMacker();

    }

}
