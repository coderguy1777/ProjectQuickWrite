import java.lang.ref.SoftReference;
import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class MainTextreadingClass {
    private static ArrayList<String>characterstoring = new ArrayList<>();
    public static void main(String[] args) {
        NeuronClass neuralfunction;
        neuralfunction = new NeuronClass();
        try {
            Scanner datareader = new Scanner(new BufferedReader(new FileReader("Essay1")));
            while (datareader.hasNext()) {
                String sorter = datareader.next();
                characterstoring.add(sorter);
                System.out.println(characterstoring);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.print(e);
        }
    }

    private static void valueassignment() {
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
    }
}