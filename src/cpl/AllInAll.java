package cpl;
import java.util.Scanner;

public class AllInAll {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNextLine()){
        String s = sc.next();
        String t = sc.next();
        boolean isSubsequence = true;
        int j = 0;
        for (int i = 0; i< s.length(); ++i){
            char c = s.charAt(i);
            for (; j<t.length() && t.charAt(j)!= c; ++j){}
            if (j==t.length()){
                isSubsequence = false;
                break;
            }
            ++j;
        }
        if (isSubsequence)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    /*while (sc.hasNextLine()){
        String s = sc.next();
        String t = sc.next();
        String cur = t.substring(0, s.length()-1);
        boolean check = false;
        for (int i = 0; i<= t.length()-s.length(); i++){
            cur += t.charAt(i+s.length()-1);
            System.out.println(cur);
            if (cur.equals(s)){
                check = true;
                i = t.length();
            }
            cur = cur.substring(1);
        }
        if (check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }*/
  }
}
      