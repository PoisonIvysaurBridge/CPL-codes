package cpl;
import java.util.Scanner;

public class HSPhy6 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()){
        int v = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(v*t*2);
    }
  }
}
      