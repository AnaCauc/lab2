package exercitiul2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.PrintStream;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws FileNotFoundException {
        String fisier_out="D:\\lucru_java_intellij\\lab2\\src\\exercitiul2\\cantec_out.txt";
        File file=new File(fisier_out);
        PrintStream flux_out=new PrintStream(fisier_out);
        String fisier_in="D:\\lucru_java_intellij\\lab2\\src\\exercitiul2\\cantec_in.txt";
        Scanner scanner=new Scanner(new FileReader(fisier_in));
        Scanner grup=new Scanner(System.in);
        System.out.print("introduceti o grupare de litere: ");
        String g=grup.next();
        while(scanner.hasNext()){
            String sir=scanner.next();
            Vers v=new Vers(scanner.next());
            if(sir.contains(g)){
                flux_out.println(v+" "+v.NrCuvinte()+" "+v.NrVocale()+ " *");
            }
            else{
                flux_out.println(v+" "+v.NrCuvinte()+" "+v.NrVocale());
            }

        }
    }
}
