package cpl;
import java.util.Scanner;

public class HorrorDash {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int i = 1; i<=t; i++){
        int n = sc.nextInt();
        int high = sc.nextInt();
        for (; n>1; n--){
            int c = sc.nextInt();
            if (c > high)
                high = c;
        }
        System.out.println("Case "+i+": "+high);
    }
  }
}
      