package cpl;
import java.util.Scanner;

public class OneTwoThree {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int words = sc.nextInt();
    while (words > 0){
        String word = sc.next();
        int len = word.length();
        if (len==3){
            if (word.charAt(0)=='o' && word.charAt(1)=='n' || word.charAt(1)=='n' && word.charAt(2)=='e' || word.charAt(0)=='o' && word.charAt(2)=='e')
                System.out.println(1);
            else
                System.out.println("2");
        }
        else
            System.out.println(3);
        words--;
    }
  }
}
      