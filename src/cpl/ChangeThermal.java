package cpl;
import java.util.Scanner;

public class ChangeThermal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int j = 1;
    while (j<=t){
    	int C = sc.nextInt();
        int d = sc.nextInt();
        double fah = 9.0/5*C +32;
        double convertBack2C = ((fah+d)-32)*5/9;
        System.out.print("Case "+j+": ");
        System.out.printf("%.2f",convertBack2C);
        System.out.println("");
        j++;
    }
  }
}
      