package cpl;
import java.util.Scanner;


public class MatchingDNA {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        sc.nextLine();
        while (n>0){
            String DNA = sc.nextLine();
            String RNA = sc.nextLine();
            String result="";
            DNA+=" ";
            for (int i = 0; i<DNA.length(); i++){
                if (DNA.charAt(i)=='A')
                    result+="U";
                else if (DNA.charAt(i)=='T')
                    result+="A";
                else if (DNA.charAt(i)=='C')
                    result+="G";
                else if (DNA.charAt(i)=='G')
                    result+="C";
                else if (i!=DNA.length()-1)
                    result+=DNA.substring(i,i+1);
            }
            if (result.equalsIgnoreCase(RNA))
                System.out.println("copy");
            else
                System.out.println("nocopy");
            n--;
        }
    }
}
