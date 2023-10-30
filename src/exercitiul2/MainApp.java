package exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;
public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "D:\\PJ\\lab2\\src\\exercitiul2\\cantec_in.txt";
        String outputFile = "D:\\PJ\\lab2\\src\\exercitiul2\\cantec_out.txt";

        File file_input = new File(inputFile);
        Scanner scanner = new Scanner(file_input);
        PrintStream printStream = new PrintStream(outputFile);
        Random random = new Random();

        Scanner grup=new Scanner(System.in);
        System.out.print("introduceti o grupare de litere: ");
        String g=grup.next();


        while (scanner.hasNextLine()) {
            String versLine = scanner.nextLine();
            Vers vers = new Vers(versLine);
            double randomValue = random.nextDouble();

            if (randomValue < 0.1) {
                versLine = versLine.toUpperCase();
            }

            if (versLine.contains(g)) {
                printStream.println(vers.getVers() + " " + vers.NrCuvinte() + " " + vers.NrVocale() + " *");
            } else {
                printStream.println(vers.getVers() + " " + vers.NrCuvinte() + " " + vers.NrVocale());
            }
        }

        scanner.close();
        printStream.close();
    }

}
