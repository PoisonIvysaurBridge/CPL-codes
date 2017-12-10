package cpl;


import java.util.Scanner;

public class TEXQuotes {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int j =1;
    while (sc.hasNextLine()){
        String str = sc.nextLine();
        String result = "";
        for (int i = 0; i< str.length(); i++){
            if (str.charAt(i)=='\"'){
                if (j%2==0){
                    result+="\'\'";
                    j++;
                }
                else {
                    result+="``";
                    j++;
                }
            }
            else
                result+=str.charAt(i);
        }
        System.out.println(result);
    }
  }
}
      