package cpl;
import java.util.Scanner;

public class CostCutting {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    int j = 1;
    while (j<=t){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int temp = 0;
        int highest = a, middle = b, lowest = c;

        highest = Math.max(a,b);
        middle = Math.min(b,a);

        lowest = Math.min(middle, c);
        middle = Math.max(middle, c);

        temp = Math.min(highest, middle);
        highest = Math.max(highest,middle);
        middle = temp;

        System.out.println("Case "+j+": " + middle);
        j++;
    }
  }
}
  