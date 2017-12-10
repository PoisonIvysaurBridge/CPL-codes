package cpl;
import java.util.Scanner;

public class BioCount{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String DNA = "";
        for (int i = 1; i<=4; i++)
        DNA+=sc.nextLine();
        DNA = DNA.toLowerCase();
        int A = 0, C = 0, G=0, T=0;
        for (int i = 0; i< DNA.length(); i++){
            if (DNA.substring(i,i+1).equals("a"))
                A++;
            else if (DNA.substring(i,i+1).equals("c"))
                C++;
            else if (DNA.substring(i,i+1).equals("g"))
                G++;
            else if (DNA.substring(i,i+1).equals("t"))
                T++;
        }
        System.out.println("DNA Length: "+(A+C+G+T));
        System.out.println("A's: "+A);
        System.out.println("C's: "+C);
        System.out.println("G's: "+G);
        System.out.println("T's: "+T);
}
}