package cpl;
import java.util.Scanner;

public class PeterSmokes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextInt()) {
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0;
        while (n > 0){
            sum+=n;
            n/=k;
        }
        System.out.println(sum);
    }
  }
}
      