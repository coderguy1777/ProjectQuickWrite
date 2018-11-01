import java.util.*;
import java.io.*;

public class MainTextreadingClass {
    private static ArrayList<String> characterstoring = new ArrayList<>();
    private static ArrayList<String> puncuationstorage = new ArrayList<>();
    private static ArrayList<String> trainingdata = new ArrayList<>();
    private static int[][]data = new int[10000][10000];
    private static int[][]datamatrix = new int[2000][2000];
    private static String sorter;
    private static String datastring;

    public static void main(String[] args) {
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1")));
            while (datareader.hasNext()) {
                sorter = datareader.next();
                int Avalue = 20;
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
                int Qvalue = 16;
                int qvalue = 16;
                int Rvalue = 17;
                int rvalue = 17;
                int Svalue = 18;
                int svalue = 18;
                int Tvalue = 19;
                int tvalue = 19;
                int Uvalue = 20;
                int uvalue = 20;
                int Vvalue = 21;
                int vvalue = 21;
                int Wvalue = 22;
                int wvalue = 22;
                int Xvalue = 23;
                int xvalue = 23;
                int Yvalue = 24;
                int yvalue = 24;
                int Zvalue = 25;
                int zvalue = 25;
                int puncationvaluesperiod = Avalue + 2;
                int Puncationvaluesperiod = Avalue - 1;
                int commavalue = Avalue + 3;
                int Commavalue = Avalue - 2;
                int quotationvalue = Avalue + 4;
                int Quotationvalue = Avalue - 4;
                int parthensisvalue = Avalue + 5;
                int Parthensisvalue = Avalue - 4;
                int slashvalue = Avalue + 6;
                int Slashvalue = Avalue - 5;
                String slash = " / ";
                String period = " (.) ";
                String comma = " (,) ";


                for(int value = 0; value < sorter.length(); value = value + 1) {
                    if(sorter.charAt(value) == 'A' || sorter.charAt(value) == 'a') {
                        characterstoring.add(sorter);
                        data[value][avalue] = Avalue;
                    }
                    if(sorter.charAt(value) == 'B' || sorter.charAt(value) == 'b') {
                        characterstoring.add(sorter);
                        data[value][bvalue] = Bvalue;
                    }
                    if(sorter.charAt(value) == 'C' || sorter.charAt(value) == 'c') {
                        characterstoring.add(sorter);
                        data[value][cvalue] = Cvalue;
                    }
                    if(sorter.charAt(value) == 'D' || sorter.charAt(value) == 'd') {
                        characterstoring.add(sorter);
                        data[value][dvalue] = Dvalue;
                    }
                    if(sorter.charAt(value) == 'E' || sorter.charAt(value) == 'e') {
                        characterstoring.add(sorter);
                        data[value][evalue] = Evalue;
                    }
                    if(sorter.charAt(value) == 'F' || sorter.charAt(value) == 'f') {
                        characterstoring.add(sorter);
                        data[value][fvalue] = Fvalue;
                    }
                    if(sorter.charAt(value) == 'G' || sorter.charAt(value) == 'g') {
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
                    if(sorter.charAt(value) == 'Q') {
                        characterstoring.add(sorter);
                        data[value][qvalue] = Qvalue;
                    }
                    if(sorter.charAt(value) == 'R') {
                        characterstoring.add(sorter);
                        data[value][rvalue] = Rvalue;
                    }
                    if(sorter.charAt(value) == 'S') {
                        characterstoring.add(sorter);
                        data[value][svalue] = Svalue;
                    }
                    if(sorter.charAt(value) == 'T') {
                        characterstoring.add(sorter);
                        data[value][tvalue] = Tvalue;
                    }
                    if(sorter.charAt(value) == 'U') {
                        characterstoring.add(sorter);
                        data[value][uvalue] = Uvalue;
                    }
                    if(sorter.charAt(value) == 'V') {
                        characterstoring.add(sorter);
                        data[value][vvalue] = Vvalue;
                    }
                    if(sorter.charAt(value) == 'W') {
                        characterstoring.add(sorter);
                        data[value][wvalue] = Wvalue;
                    }
                    if(sorter.charAt(value) == 'X') {
                        characterstoring.add(sorter);
                        data[value][xvalue] = Xvalue;
                    }
                    if(sorter.charAt(value) == 'Y') {
                        characterstoring.add(sorter);
                        data[value][yvalue] = Yvalue;
                    }
                    if(sorter.charAt(value) == 'Z') {
                        characterstoring.add(sorter);
                        data[value][zvalue] = Zvalue;
                    }
                    if(sorter.charAt(value) == '.') {
                        puncuationstorage.add(period);
                        data[value + 1][Puncationvaluesperiod] = puncationvaluesperiod;
                    }
                    if(sorter.charAt(value) == ',') {
                        puncuationstorage.add(comma);
                        data[value + 2][Commavalue] = commavalue;
                    }
                    if(sorter.charAt(value) == '/') {
                        puncuationstorage.add(slash);
                        data[value + 3][Slashvalue] = slashvalue;
                    }
                }
            }
            datareading();
            datasetsorter();
            System.out.println(puncuationstorage);

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
                int vectorH = 7;
                int vectorh = 7;
                int vectorI = 8;
                int vectori = 8;
                int vectorJ = 9;
                int vectorj = 9;
                int vectorK = 10;
                int vectork = 10;
                int vectorL = 11;
                int vectorl = 11;
                int vectorM = 12;
                int vectorm = 12;
                int vectorN = 13;
                int vectorn = 13;
                int vectorO = 14;
                int vectoro = 14;
                int vectorP = 15;
                int vectorp = 15;
                int vectorQ = 16;
                int vectorq = 16;
                int vectorR = 17;
                int vectorr = 17;
                int vectorS = 18;
                int vectors = 18;
                int vectorT = 19;
                int vectort = 19;
                int vectorU = 20;
                int vectoru = 20;
                int vectorV = 21;
                int vectorv = 21;
                int vectorW = 22;
                int vectorw = 22;
                int vectorX = 23;
                int vectorx = 23;
                int vectorY = 24;
                int vectory = 24;
                int vectorZ = 25;
                int vectorz = 25;

                for(int vectorvals = 0; vectorvals < datastring.length(); vectorvals++) {
                    if(datastring.charAt(vectorvals) == 'A') {
                        datamatrix[vectorvals][vectora] = vectorA;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'B') {
                        datamatrix[vectorvals][vectorb] = vectorB;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'C') {
                        datamatrix[vectorvals][vectorc] = vectorC;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'D') {
                        datamatrix[vectorvals][vectord] = vectorD;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'E') {
                        datamatrix[vectorvals][vectore] = vectorE;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'F') {
                        datamatrix[vectorvals][vectorf] = vectorF;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'G') {
                        datamatrix[vectorvals][vectorg] = vectorG;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'H') {
                        datamatrix[vectorvals][vectorh] = vectorH;
                        trainingdata.add(datastring);
                    }
                    if(datastring.charAt(vectorvals) == 'I') {
                        datamatrix[vectorvals][vectori] = vectorI;
                        trainingdata.add(datastring);
                    }
                }

            }
        } catch (IOException e) {
            System.out.print(e);
            System.exit(0);
        }
        datasetsorter();
    }

    private static void datasetsorter() {
        Collections.sort(characterstoring);
        Collections.sort(trainingdata);
    }
}