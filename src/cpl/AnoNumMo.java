package cpl;


import java.util.Scanner;

public class AnoNumMo{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int nTest = sc.nextInt();
        while (nTest>0){
            
            int nReal = sc.nextInt();
            String digit = sc.next();
            String all=""; String copy = "";
            String cur = sc.nextLine();
                nReal--;
                all+=cur;
            
            copy=all+"   ";
            int digiLen = digit.length();
            int rCtr = 0, real = 0;
            int dCtr = 0, deci = 0;
            //int space = 0;
            boolean r = true, d=false;
            for (int i = 0; i< all.length(); i++){
                if (copy.substring(i,i+1).equals(" ")|| copy.substring(i,i+1).equals("-")){
                    //if (copy.substring(i,i+1).equals(" "))space++;
                    //++i;
                    r = true; d = false;
                    //System.out.println(copy.substring(i,i+1));
                }
                else if (copy.substring(i,i+1).equals(".")){
                    //++i;
                    r = false; d = true; 
                }
                else if (r==true){
                    if (copy.substring(i,i+digiLen).equals(digit)){
                    rCtr++;
                    }
                    real++;
                }
                else if (r == false){
                    if (copy.substring(i,i+digiLen).equals(digit)){
                    dCtr++;
                    }
                    deci++;
                }
            }
            System.out.println(rCtr+"/"+real+" "+dCtr+"/"+deci);
            nTest--;
        }
}
}
// 1 7 678.5123
// 4 8 2080.0 -80.2800 123.888 23051.1
// 2 22 -123.222 -322.12222