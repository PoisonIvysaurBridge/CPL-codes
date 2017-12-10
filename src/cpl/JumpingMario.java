package cpl;
import java.util.Scanner;

public class JumpingMario {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    for (int j = 1; j<=t; j++){
        int n = sc.nextInt();
        int prev=0, high = 0, low = 0;
        for (int i = 0; i<n; i++){
            int cur = sc.nextInt();
            if (cur > prev && i!=0)
                high++;
            else if (cur < prev)
                low++;
            prev = cur;
        }
        System.out.println("Case "+j+": "+high+" "+low);
    }
  }
}
      