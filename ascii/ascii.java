
// How To Generate Ascii Table With Java

public class Main {
    public static void main(String[] args){

    for(int decimalNumber=33;decimalNumber<256;decimalNumber++){
        char asciiChar = (char) decimalNumber;
        System.out.println(decimalNumber+"   is   "+asciiChar);
    }
    }
}