package exercitiul1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) throws IOException {
        String fisier="D:\\lucru_java_intellij\\lab2\\src\\exercitiul1\\judete_in.txt";
        String[] judet=new String[7];
        int i=0;
        Scanner scanner=new Scanner(new FileReader(fisier));
        while(scanner.hasNext()){
            judet[i]=scanner.next();
            i++;
        }
        Arrays.sort(judet);
        for(int j=0;j< judet.length;j++){
            System.out.println(judet[j]);
        }

        Scanner scnr=new Scanner(System.in);
        System.out.print("Introduceti judetul: ");
        String judet_cautat=scnr.next();
        int position= Arrays.binarySearch(judet,judet_cautat)+1;
        System.out.println("Pozitia judetului cautat este: "+position);
    }
}
