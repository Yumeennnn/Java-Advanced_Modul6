package Modul6;

/**
@author Ahmad Rizky Has (202110370311161)
@Source Code : https://github.com/Yumeennnn/Java-Advanced_Modul6
**/
import java.io.*;
import java.nio.file.FileStore;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Drivers extends Factoring{

    static Scanner in = new Scanner(System.in);

    static String FirstInput;
    static String [] inString = {};
    static int [] inNumber = {} ;
    static int indexNumbers = 0 , indexString = 0;
    static int set;
    static boolean UserInput = true;
    static String Lanjut;

    public static void main(String[] args) throws Exception {
        Input();
        Read("string");
        Read("numbers");
    }

    /**
    Check Input From User
    @If User Input String will Store at variable inString
    @If User Input Number will Store at variable inNumber
    **/
    public static void Input() throws Exception{
        try {
            while (UserInput) {
                Scanner xd = new Scanner(System.in);
                System.out.print("Input Data: ");
                FirstInput = xd.nextLine();

                if(CheckNum(FirstInput)){
                    inNumber = Arrays.copyOf(inNumber, inNumber.length + 1);
                    inNumber[indexNumbers] = Integer.parseInt(String.valueOf(FirstInput));
                    AddNum(inNumber[indexNumbers]);
                    indexNumbers++;
                }else {
                    inString = Arrays.copyOf(inString, inString.length + 1);
                    inString[indexString] = FirstInput;
                    AddString(inString[indexNumbers]);
                    indexString++;
                }

                System.out.print("Apakah Ingin Input Lagi? ");
                Lanjut = in.next();
                UserInput = Lanjut.equalsIgnoreCase("y");
            }

        } catch (InputMismatchException as){
            System.err.println(as);
            System.out.println();
        }
    }

/**
Read Data
@If User Input String , Data will show at case "string" at line 72
@If User Input Number, Data will show at case "number" at line 90
@Or User Input both , it will show all at same time
**/
    public static void Read(String reads) throws Exception {
        switch (reads){
            case "string" -> {
                try {
                    FileReader ReadString = new FileReader("InputString.txt");
                    BufferedReader BuffString = new BufferedReader(ReadString);
                    String input = BuffString.readLine();
                    System.out.printf("Data in String: \n");
                    while (input != null) {
                        StringTokenizer xy = new StringTokenizer(input, ",");
                        System.out.println(xy.nextToken() + " ");
                        input = BuffString.readLine();
                    }
                    BuffString.close(); ReadString.close();
                } catch (FileNotFoundException a){
                    System.err.println(a);
                }
            }

            case "numbers" -> {
                try {
                    FileReader ReadNumber = new FileReader("InputNumbers.txt");
                    BufferedReader BuffNumber = new BufferedReader(ReadNumber);
                    String input = BuffNumber.readLine();

                    System.out.printf("\nData in Numbers: \n");
                    while (input != null) {
                        StringTokenizer xy = new StringTokenizer(input, ",");
                        System.out.println(xy.nextToken() + " ");
                        input = BuffNumber.readLine();
                    }
                    System.out.printf("\n");
                    BuffNumber.close(); ReadNumber.close();
                } catch (FileNotFoundException a){
                    System.err.println(a);
                }
            }

        }

    }
}