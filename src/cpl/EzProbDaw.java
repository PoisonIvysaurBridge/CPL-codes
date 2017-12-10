package cpl;
import java.util.Scanner;

public class EzProbDaw {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    int j =1;
    while (j<=T){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a+b>c && (a>0 && b > 0 && c > 0)){
            if (a==b && b==c)
                System.out.println("Case "+j+": Equilateral");
            else if (a==b || b==c || a==c)
                System.out.println("Case "+j+": Isosceles");
            else 
                System.out.println("Case "+j+": Scalene");
        }
        else
            System.out.println("Case "+j+": Invalid");
        j++;
    }
  }
}
      