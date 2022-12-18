package Modul6;

import java.io.FileWriter;
import java.io.IOException;

class Factoring {
    private String inString;
    private int inNumber;

    public String getInString() {
        return inString;
    }

    public void setInString(String inString) {
        this.inString = inString;
    }

    public int getInNumber() {
        return inNumber;
    }

    public void setInNumber(int inNumber) {
        this.inNumber = inNumber;
    }

    static void AddNum(int a) throws IOException {
        FileWriter Write= new FileWriter("InputNumbers.txt", true);
        Write.write(String.format("%s,\n", a));
        Write.flush();
        Write.close();
    }

    static void AddString(String a) throws IOException {
        FileWriter Write= new FileWriter("InputString.txt", true);
        Write.write(String.format("%s,\n", a));
        Write.flush();
        Write.close();
    }

    static boolean CheckNum(String text) {
        char[] chars = text.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

}
