package cpl;
import java.util.Scanner;

public class AutoAns {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t > 0){
    	int n = sc.nextInt();
    	int result = ((n*567)/9 + 7492)*235 / 47 - 498;
        if (result < 0)
            result*=-1;
    	System.out.println(result%100/10);
    	t--;
    }
  }
}
     