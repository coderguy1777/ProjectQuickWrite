import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MainTextreadingClass {

    private static ArrayList<String> characterstoring = new ArrayList<>();
    private static ArrayList<String> charactervalues = new ArrayList<String>();
    private static ArrayList<Integer> combinedcharactervalues = new ArrayList<Integer>();
    private static String sorter;
    public static void main(String[] args) {
        NeuronClass neuralfunction;
        neuralfunction = new NeuronClass();
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1")));
            while (datareader.hasNext()) {
                sorter = datareader.next();
                characterstoring.add(sorter);
            }
            for(int charvalue = 0; charvalue < characterstoring.size();charvalue++) {
                String values = "";
                String test ="";
                for(int i=65;i<91;i++) {
                    test = (char)(i) + " = " + (i - 64);
                    values = test + characterstoring.get(charvalue);
                    charactervalues.add(values);
                    System.out.println(charactervalues);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }
    }
}