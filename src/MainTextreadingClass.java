import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MainTextreadingClass {

    private static char textstorevalue;
    private static String sentencestorage;
    private static double textpoint;
    private static double sentencelength;
    public static void main(String[]args) {
        NeuronClass neuralfunction;
        neuralfunction = new NeuronClass();
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1.txt")));
            while(datareader.hasNext()) {
                String[][]SentenceArray = new String[1000][1000];
                sentencelength = 100;
                sentencestorage = datareader.nextLine();
            }

        } catch(IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }

    }
}
