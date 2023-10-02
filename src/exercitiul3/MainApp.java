package exercitiul3;

import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("introduceti un sir: ");
        String sir=scanner.next();
        StringBuilder sb=new StringBuilder(sir);
        Scanner scn1=new Scanner(System.in);
        System.out.print("introduceti pozitia: ");
        int pozitie=scn1.nextInt();
        System.out.print("introduceti numarul de caractere: ");
        int lungime=scn1.nextInt();
        int end=pozitie+lungime;
        sb.delete(pozitie,end);
        System.out.println("sirul modificat: "+sb);


    }
}
