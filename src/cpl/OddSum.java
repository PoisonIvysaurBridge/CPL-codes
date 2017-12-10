package cpl;
import java.util.Scanner;

public class OddSum {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int j =1;
    
    while (j<=t){
        int sum = 0;
        int a = sc.nextInt();
        int b = sc.nextInt();
        while (a<=b){
            if (a%2!=0)
                sum+=a;
            
        }
        System.out.println("Case "+j+": "+sum);
        j++;
    }
  }
}
      