import java.lang.ref.SoftReference;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MainTextreadingClass {
    private static ArrayList<String> sentences = new ArrayList<String>();
    private static ArrayList<Float> Wordvectors = new ArrayList<Float>();
    private static ArrayList<ArrayList<Double>>characterstoring = new ArrayList<>();
    private static double[][] matricies = new double[10000][10000];
    private static double[][] wordvectorarray = new double[2000][2000];
    private static char textstorevalue;
    public static String sentencestorage;
    private static double textpoint;
    public static double sentencelength;


    public static void main(String[] args) {
        NeuronClass neuralfunction;
        neuralfunction = new NeuronClass();
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1")));
            while (datareader.hasNext()) {
                sentencelength = 100;
                sentencestorage = datareader.next();
                sentences.add(sentencestorage);
                int Avalue = 0;
                int Bvalue = 1;
                int Cvalue = 2;
                int Dvalue = 3;
                int Evalue = 4;
                int Fvalue = 5;
                int Gvalue = 6;
                int Hvalue = 7;
                int Ivalue = 8;
                int Jvalue = 9;
                int Kvalue = 10;
                int Lvalue = 11;
                int Mvalue = 12;
                int Nvalue = 13;
                int Ovalue = 14;
                int Pvalue = 15;
                int Qvalue = 16;
                int Rvalue = 17;
                int Svalue = 18;
                int Tvalue = 19;
                int Uvalue = 20;
                int Vvalue = 21;
                int Wvalue = 22;
                int Xvalue = 23;
                int Yvalue = 24;
                int Zvalue = 25;

                String Sorter = datareader.next();
                for(int value = 0; value < Sorter.length(); value++) {
                    if(Sorter.charAt(value) == 'A') {
                        characterstoring.get(Avalue).add(Double.valueOf(Sorter));
                    }
                    if(Sorter.charAt(value) == 'B') {
                        characterstoring.get(Bvalue).add(Double.valueOf(Sorter));
                    }
                    if(Sorter.charAt(value) == 'C') {
                        characterstoring.get(Cvalue).add(Double.valueOf(Sorter));
                    }
                    if(Sorter.charAt(value) == 'D') {
                        characterstoring.get(Dvalue).add(Double.valueOf(Sorter));
                    }
                    if(Sorter.charAt(value) == 'E') {
                        characterstoring.get(Evalue).add(Double.valueOf(Sorter));
                    }
                    if(Sorter.charAt(value) == 'F') {
                        characterstoring.get(Fvalue).add(Double.valueOf(Sorter));
                    }
                }
                System.out.println(characterstoring);

            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }
    }
}