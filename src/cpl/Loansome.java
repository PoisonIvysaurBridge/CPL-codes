package cpl;
import java.util.Scanner;

public class Loansome {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int loanDuration = sc.nextInt();
    while (loanDuration>0){
        double downPay = sc.nextDouble();
        double loanAmt = sc.nextDouble();
        int nDepRecord = sc.nextInt();
        
        // initialize the arrays
        int[] nMonths = new int[nDepRecord];
        double[] depRates = new double[nDepRecord];
        for (int i =0; i< nDepRecord; ++i){
            nMonths[i] = sc.nextInt();
            depRates[i] = sc.nextDouble();
        }
        double depAmt = loanAmt - (loanAmt*depRates[0]);    //13950 by this time
        
        int month = 1;
        int sub = nDepRecord-1;
        while (loanAmt > depAmt || month <= loanDuration){
            
            while (sub>=0 && month < nMonths[sub])
                --sub;
            double rate = depRates[sub];
            if (month >= nMonths[nDepRecord-1])
                rate = depRates[nDepRecord-1];
            //System.out.println(rate); HALLELUJAH
            loanAmt -= downPay;
            depAmt -= (depAmt*rate);
            month++;
        }
        if (month == 1)
            System.out.println(month-1+" month");
        else
            System.out.println(month-1+" months");
        
        loanDuration = sc.nextInt();
    }
  }
}
      