package cpl;
import java.util.Scanner;

public class SuperSoldier{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        while (n>0){
            String result = sc.next();
            result+=" ";
            String DNA = "";
            
            for (int i = 0; i<result.length(); i++){
                if (result.charAt(i)=='A')
                    DNA+="S";
                else if (result.charAt(i)=='T')
                    DNA+="A";
                else if (result.charAt(i)=='C')
                    DNA+="G";
                else if (result.charAt(i)=='G')
                    DNA+="C";
                else if (i!=result.length()-1)
                    DNA+=DNA.substring(i,i+1);
            }
            System.out.println(DNA);
            n--;
        }
        
}
}