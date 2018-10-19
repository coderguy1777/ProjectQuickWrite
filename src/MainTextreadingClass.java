import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MainTextreadingClass {
    private static ArrayList<String> sentences = new ArrayList<String>();
    private static ArrayList<Float> Wordvectors = new ArrayList<Float>();

    private static double[][]matricies = new double[10000][10000];
    private static double[][]wordvectorarray = new double[2000][2000];
    private static char textstorevalue;
    public static String sentencestorage;
    private static double textpoint;
    private static double sentencelength;


    public static Scanner fileclass() {
        NeuronClass neuralfunction;
        neuralfunction = new NeuronClass();
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1.txt")));
            while(datareader.hasNext()) {
                sentencelength = 100;
                sentencestorage = datareader.next();
                sentences.add(sentencestorage);
            }

        } catch(IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }
        return null;
    }

    public static void wordvectormaker(ArrayList<Float>Wordvectors) {

    }

    public static ArrayList<ArrayList<Double>>wordvectorsorter() {
        return null;
    }

    private static ArrayList<Double> vectormatricies(ArrayList<Double>Wordvector) {
        return Wordvector;
    }

}