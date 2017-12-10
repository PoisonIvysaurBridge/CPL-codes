package cpl;
import java.util.Scanner;

public class PrimaryArithmetic {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    while (n1!=0){
        int nCarry = 0;
        int curCarry = 0;
        while (n1>0 && n2>0){
            int sum = curCarry + n1%10 + n2%10;
            curCarry= sum/10;
            n1/=10;
            n2/=10;
            if (sum > 9)
                nCarry++;
        }
        if (nCarry==1)
            System.out.println("1 carry operation.");
        else if (nCarry > 0)
            System.out.println(nCarry+" carry operations.");
        else
            System.out.println("No carry operation.");
        n1 = sc.nextInt();
        n2 = sc.nextInt();
    }
  }
}
      