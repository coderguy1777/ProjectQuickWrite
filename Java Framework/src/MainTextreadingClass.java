import java.util.*;
import java.io.*;

public class MainTextreadingClass {
    private static ArrayList<String> characterstoring = new ArrayList<>();
    private static ArrayList<String> puncuationstorage = new ArrayList<>();
    private static ArrayList<String> trainingdata = new ArrayList<>();
    private static int[][]data = new int[10000][10000];
    private static int[][]datamatrix = new int[10000][10000];
    private static String sorter;
    private static String datastring;

    public static void main(String[] args) {
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1")));
            while (datareader.hasNext()) {
                sorter = datareader.next();
                characterstoring.add(sorter);
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
                String parthensis = " ( ";
                for(int value = 0; value < sorter.length(); value = value + 1) {
                    if(sorter.charAt(value) == 'A' || sorter.charAt(value) == 'a') {
                           
                        data[value][avalue] = Avalue;
                    }
                    if(sorter.charAt(value) == 'B' || sorter.charAt(value) == 'b') {
                           
                        data[value][bvalue] = Bvalue;
                    }
                    if(sorter.charAt(value) == 'C' || sorter.charAt(value) == 'c') {
                           
                        data[value][cvalue] = Cvalue;
                    }
                    if(sorter.charAt(value) == 'D' || sorter.charAt(value) == 'd') {
                           
                        data[value][dvalue] = Dvalue;
                    }
                    if(sorter.charAt(value) == 'E' || sorter.charAt(value) == 'e') {
                           
                        data[value][evalue] = Evalue;
                    }
                    if(sorter.charAt(value) == 'F' || sorter.charAt(value) == 'f') {
                           
                        data[value][fvalue] = Fvalue;
                    }
                    if(sorter.charAt(value) == 'G' || sorter.charAt(value) == 'g') {
                           
                        data[value][gvalue] = Gvalue;
                    }
                    if(sorter.charAt(value) == 'H' || sorter.charAt(value) == 'h') {
                           
                        data[value][hvalue] = Hvalue;
                    }
                    if(sorter.charAt(value) == 'I' || sorter.charAt(value) == 'i') {
                           
                        data[value][ivalue] = Ivalue;
                    }
                    if(sorter.charAt(value) == 'J' || sorter.charAt(value) == 'j') {
                           
                        data[value][jvalue] = Jvalue;
                    }
                    if(sorter.charAt(value) == 'K' || sorter.charAt(value) == 'k') {
                           
                        data[value][kvalue] = Kvalue;
                    }
                    if(sorter.charAt(value) == 'L' || sorter.charAt(value) == 'l') {
                           
                        data[value][lvalue] = Lvalue;
                    }
                    if(sorter.charAt(value) == 'M' || sorter.charAt(value) == 'm') {
                           
                        data[value][mvalue] = Mvalue;
                    }
                    if(sorter.charAt(value) == 'N' || sorter.charAt(value) == 'n') {
                           
                        data[value][nvalue] = Nvalue;
                    }
                    if(sorter.charAt(value) == 'O' || sorter.charAt(value) == 'o') {
                           
                        data[value][ovalue] = Ovalue;
                    }
                    if(sorter.charAt(value) == 'P' || sorter.charAt(value) == 'p') {
                           
                        data[value][pvalue] = Pvalue;
                    }
                    if(sorter.charAt(value) == 'Q' || sorter.charAt(value) == 'q') {
                           
                        data[value][qvalue] = Qvalue;
                    }
                    if(sorter.charAt(value) == 'R' || sorter.charAt(value) == 'r') {
                           
                        data[value][rvalue] = Rvalue;
                    }
                    if(sorter.charAt(value) == 'S' || sorter.charAt(value) == 's') {
                           
                        data[value][svalue] = Svalue;
                    }
                    if(sorter.charAt(value) == 'T' || sorter.charAt(value) == 't') {
                           
                        data[value][tvalue] = Tvalue;
                    }
                    if(sorter.charAt(value) == 'U' || sorter.charAt(value) == 'u') {
                           
                        data[value][uvalue] = Uvalue;
                    }
                    if(sorter.charAt(value) == 'V' || sorter.charAt(value) == 'v') {
                           
                        data[value][vvalue] = Vvalue;
                    }
                    if(sorter.charAt(value) == 'W' || sorter.charAt(value) == 'w') {
                           
                        data[value][wvalue] = Wvalue;
                    }
                    if(sorter.charAt(value) == 'X' || sorter.charAt(value) == 'x') {
                           
                        data[value][xvalue] = Xvalue;
                    }
                    if(sorter.charAt(value) == 'Y' || sorter.charAt(value) == 'y') {
                           
                        data[value][yvalue] = Yvalue;
                    }
                    if(sorter.charAt(value) == 'Z' || sorter.charAt(value) == 'z') {
                           
                        data[value][zvalue] = Zvalue;
                    }
                    if(sorter.charAt(value) == '.') {
                        puncuationstorage.add(period);
                        data[value + 1][puncationvaluesperiod] = Puncationvaluesperiod;
                    }
                    if(sorter.charAt(value) == ',') {
                        puncuationstorage.add(comma);
                    }
                    if(sorter.charAt(value) == '/') {
                        puncuationstorage.add(slash);
                        data[value][Slashvalue] = slashvalue;
                    }
                    if(sorter.charAt(value) == '(') {
                        puncuationstorage.add(parthensis);
                        data[value][parthensisvalue] = Parthensisvalue;
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }
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

                for(int vectorvals = 0; vectorvals < datastring.length(); vectorvals = vectorvals + 1) {
                    if(datastring.charAt(vectorvals) == 'A' || datastring.charAt(vectorvals) == 'a') {
                        datamatrix[vectorvals][vectora] = vectorA;
                    }
                    if(datastring.charAt(vectorvals) == 'B' || datastring.charAt(vectorvals) == 'b') {
                        datamatrix[vectorvals][vectorb] = vectorB;
                    }
                    if(datastring.charAt(vectorvals) == 'C' || datastring.charAt(vectorvals) == 'c') {
                        datamatrix[vectorvals][vectorc] = vectorC;

                    }
                    if(datastring.charAt(vectorvals) == 'D' || datastring.charAt(vectorvals) == 'd') {
                        datamatrix[vectorvals][vectord] = vectorD;

                    }
                    if(datastring.charAt(vectorvals) == 'E' || datastring.charAt(vectorvals) == 'e') {
                        datamatrix[vectorvals][vectore] = vectorE;

                    }
                    if(datastring.charAt(vectorvals) == 'F' || datastring.charAt(vectorvals) == 'f') {
                        datamatrix[vectorvals][vectorf] = vectorF;

                    }
                    if(datastring.charAt(vectorvals) == 'G' || datastring.charAt(vectorvals) == 'g') {
                        datamatrix[vectorvals][vectorg] = vectorG;

                    }
                    if(datastring.charAt(vectorvals) == 'H' || datastring.charAt(vectorvals) == 'h') {
                        datamatrix[vectorvals][vectorh] = vectorH;

                    }
                    if(datastring.charAt(vectorvals) == 'I' || datastring.charAt(vectorvals) == 'i') {
                        datamatrix[vectorvals][vectori] = vectorI;

                    }
                    if(datastring.charAt(vectorvals) == 'J' || datastring.charAt(vectorvals) == 'j') {
                        datamatrix[vectorvals][vectorj] = vectorJ;

                    }
                    if(datastring.charAt(vectorvals) == 'K' || datastring.charAt(vectorvals) == 'k') {
                        datamatrix[vectorvals][vectork] = vectorK;

                    }
                    if(datastring.charAt(vectorvals) == 'L' || datastring.charAt(vectorvals) == 'l') {
                        datamatrix[vectorvals][vectorl] = vectorL;

                    }
                    if(datastring.charAt(vectorvals) == 'M' || datastring.charAt(vectorvals) == 'm') {
                        datamatrix[vectorvals][vectorm] = vectorM;

                    }
                    if(datastring.charAt(vectorvals) == 'N' || datastring.charAt(vectorvals) == 'n') {
                        datamatrix[vectorvals][vectorn] = vectorN;

                    }
                    if(datastring.charAt(vectorvals) == 'O' || datastring.charAt(vectorvals) == 'o') {
                        datamatrix[vectorvals][vectoro] = vectorO;

                    }
                    if(datastring.charAt(vectorvals) == 'P' || datastring.charAt(vectorvals) == 'p') {
                        datamatrix[vectorvals][vectorp] = vectorP;

                    }
                    if(datastring.charAt(vectorvals) == 'Q' || datastring.charAt(vectorvals) == 'q') {
                        datamatrix[vectorvals][vectorq] = vectorQ;

                    }
                    if(datastring.charAt(vectorvals) == 'R' || datastring.charAt(vectorvals) == 'r') {
                        datamatrix[vectorvals][vectorr] = vectorR;

                    }
                    if(datastring.charAt(vectorvals) == 'S' || datastring.charAt(vectorvals) == 's') {
                        datamatrix[vectorvals][vectors] = vectorS;

                    }
                    if(datastring.charAt(vectorvals) == 'T' || datastring.charAt(vectorvals) == 't') {
                        datamatrix[vectorvals][vectort] = vectorT;

                    }
                    if(datastring.charAt(vectorvals) == 'U' || datastring.charAt(vectorvals) == 'u') {
                        datamatrix[vectorvals][vectoru] = vectorU;

                    }
                    if(datastring.charAt(vectorvals) == 'V' || datastring.charAt(vectorvals) == 'v') {
                        datamatrix[vectorvals][vectorv] = vectorV;

                    }
                    if(datastring.charAt(vectorvals) == 'W' || datastring.charAt(vectorvals) == 'w') {
                        datamatrix[vectorvals][vectorw] = vectorW;

                    }
                    if(datastring.charAt(vectorvals) == 'X' || datastring.charAt(vectorvals) == 'x') {
                        datamatrix[vectorvals][vectorx] = vectorX;

                    }
                    if(datastring.charAt(vectorvals) == 'Y' || datastring.charAt(vectorvals) == 'y') {
                        datamatrix[vectorvals][vectory] = vectorY;

                    }
                    if(datastring.charAt(vectorvals) == 'Z' || datastring.charAt(vectorvals) == 'z') {
                        datamatrix[vectorvals][vectorz] = vectorZ;


                    }
                }
            }
            System.out.println(datamatrix[5][24]);

        } catch (IOException e) {
            System.out.print(e);
            System.exit(0);
        }
        datasetsorter();
    }


    private static void datasetsorter() {
        Collections.sort(characterstoring);
        Collections.sort(trainingdata);
        System.out.println(characterstoring);
        System.out.println(data[3][3]);
        datasetmatrixmaking();
    }

    private static void datasetmatrixmaking() {
        String[]matrice1 = new String[100];
        int[][][]matrice2 = new int[100][100][100];
        for(int i = 0; i < trainingdata.size(); i++) {
            String sumvalue = "";
            for(int ii = 1; ii < datamatrix.length;ii = i + 1 ) {
                matrice1[ii] = (trainingdata.get(ii));
                sumvalue = matrice1[ii];
           }
        }
    }
}