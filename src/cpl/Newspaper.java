package cpl;
import java.util.Scanner;

public class Newspaper {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while (n>0){
        int k = sc.nextInt();   // the number of paid characters
        String [] cha = new String[k];
        int [] cents = new int[k];
        for (int i = 0; i< cha.length; i++){
            cha[i] = sc.next();
            cents[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        sc.nextLine();
        String article = "";
        for (int i = 1; i<=m; i++){
            article+=sc.nextLine();
        }
        article+=" ";
        double amount = 0;
        for (int i = 0; i<article.length()-1; i++){
            int index = searchCharacters(article.substring(i,i+1), cha);
            if (index!=-1)
                amount += cents[index]*1.0/100;
        }
        System.out.println(amount+"$");
        n--;
    }
  }
  static int searchCharacters(String ch, String[] array){
      int index = -1;
      for (int i = 0; i< array.length; i++){
          if (array[i].equals(ch))
              index = i;
      }
      return index;
  }
}
      