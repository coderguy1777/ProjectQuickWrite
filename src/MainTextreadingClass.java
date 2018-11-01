import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MainTextreadingClass {
    private static ArrayList<String> characterstoring = new ArrayList<>(200000000);
    private static ArrayList<String> trainingdata = new ArrayList<>();
    private static int[][]data = new int[10000][10000];
    private static int[][]datamatrix = new int[20000][20000];
    private static String sorter;
    private static String datastring;

    public static void main(String[] args) {
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1")));
            while (datareader.hasNext()) {
                sorter = datareader.next();
                int Avalue = 0;
                int avalue = 0;
                int Bvalue = 1;
                int bvalue = 1;
                int Cvalue = 2;
                int cvalue = 2;
                int Dvalue = 3;
                int dvalue = 3;
                int Evalue = 4;
                int evalue = 4;
                int Fvalue = 5;
                int fvalue = 5;
                int Gvalue = 6;
                int gvalue = 6;
                int Hvalue = 7;
                int hvalue = 7;
                int Ivalue = 8;
                int ivalue = 8;
                int Jvalue = 9;
                int jvalue = 9;
                int Kvalue = 10;
                int kvalue = 10;
                int Lvalue = 11;
                int lvalue = 11;
                int Mvalue = 12;
                int mvalue = 12;
                int Nvalue = 13;
                int nvalue = 13;
                int Ovalue = 14;
                int ovalue = 14;
                int Pvalue = 15;
                int pvalue = 15;

                for(int value = 0; value < sorter.length(); value++) {
                    if(sorter.charAt(value) == 'A') {
                        characterstoring.add(sorter);
                        data[value][avalue] = Avalue;
                    }
                    else if(sorter.charAt(value) == 'B') {
                        characterstoring.add(sorter);
                        data[value][bvalue] = Bvalue;
                    }
                    if(sorter.charAt(value) == 'C') {
                        characterstoring.add(sorter);
                        data[value][cvalue] = Cvalue;
                    }
                    if(sorter.charAt(value) == 'D') {
                        characterstoring.add(sorter);
                        data[value][dvalue] = Dvalue;
                    }
                    if(sorter.charAt(value) == 'E') {
                        characterstoring.add(sorter);
                        data[value][evalue] = Evalue;
                    }
                    if(sorter.charAt(value) == 'F') {
                        characterstoring.add(sorter);
                        data[value][fvalue] = Fvalue;
                    }
                    if(sorter.charAt(value) == 'G') {
                        characterstoring.add(sorter);
                        data[value][gvalue] = Gvalue;
                    }
                    if(sorter.charAt(value) == 'H') {
                        characterstoring.add(sorter);
                        data[value][hvalue] = Hvalue;
                    }
                    if(sorter.charAt(value) == 'I') {
                        characterstoring.add(sorter);
                        data[value][ivalue] = Ivalue;
                    }
                    if(sorter.charAt(value) == 'J') {
                        characterstoring.add(sorter);
                        data[value][jvalue] = Jvalue;
                    }
                    if(sorter.charAt(value) == 'K') {
                        characterstoring.add(sorter);
                        data[value][kvalue] = Kvalue;
                    }
                    if(sorter.charAt(value) == 'L') {
                        characterstoring.add(sorter);
                        data[value][lvalue] = Lvalue;
                    }
                    if(sorter.charAt(value) == 'M') {
                        characterstoring.add(sorter);
                        data[value][mvalue] = Mvalue;
                    }
                    if(sorter.charAt(value) == 'N') {
                        characterstoring.add(sorter);
                        data[value][nvalue] = Nvalue;
                    }
                    if(sorter.charAt(value) == 'O') {
                        characterstoring.add(sorter);
                        data[value][ovalue] = Ovalue;
                    }
                    if(sorter.charAt(value) == 'P') {
                        characterstoring.add(sorter);
                        data[value][pvalue] = Pvalue;
                    }

                }
            }
            datareading();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }
    }
    private static void datareading() {
        int vectorvalues = 0;
        String vectorscanner = "";
        try {
            Scanner scan;
            scan = new Scanner(new BufferedReader(new FileReader("DSWordData")));
            while(scan.hasNext()) {
                datastring = scan.nextLine();
                trainingdata.add(datastring);
                int vectorA = 0;
                int vectora = 0;
                int vectorB = 1;
                int vectorb = 1;
                int vectorC = 2;
                int vectorc = 2;
                int vectorD = 3;
                int vectord = 3;
                int vectorE = 4;
                int vectore = 4;
                int vectorF = 5;
                int vectorf = 5;
                int vectorG = 6;
                int vectorg = 6;

                for(int vectorvals = 0; vectorvals < datastring.length(); vectorvals++) {
                    int holder = 0;
                    int holder2 = 1;
                }
            }
        } catch (IOException e) {
            System.out.print(e);
            System.exit(0);
        }
    }
}