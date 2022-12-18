package Modul6;

/*
@author Ahmad Rizky Has (202110370311161)
@Source Code : https://github.com/Yumeennnn/Java-Advanced_Modul6
*/

import java.io.FileWriter;
import java.io.IOException;

class Factoring {
    /*
     @Variable inNumber Write to database "InputNumbers.txt"
    */
    static void AddNum(int a) throws IOException {
        FileWriter Write= new FileWriter("InputNumbers.txt", true);
        Write.write(String.format("%s,\n", a));
        Write.flush();
        Write.close();
    }

    /*
     @Variable inString Write to database "InputString.txt"
    */
    static void AddString(String a) throws IOException {
        FileWriter Write= new FileWriter("InputString.txt", true);
        Write.write(String.format("%s,\n", a));
        Write.flush();
        Write.close();
    }
    /*
     @Checking Number input From User
    */
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
