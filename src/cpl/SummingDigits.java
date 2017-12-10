package cpl;
import java.util.Scanner;

public class SummingDigits {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n>0){
        int copy = n;
        int sum = 0;
        boolean cont = true;
        while (cont){
            sum = 0;
            while (copy > 0){
                sum+=copy%10;
                copy/=10;
            }
            copy = sum;
            if (sum > 0 && sum < 10)
                cont = false;
        }
        System.out.println(sum);
        n = sc.nextInt();
    }
  }
}
      