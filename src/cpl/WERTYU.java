package cpl;
import java.util.Scanner;

public class WERTYU {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] WERTYU = {'1','2','3','4','5','6','7','8','9','0','-','=','Q','W','E','R','T','Y','U','I','O','P','[',']','\\','A','S','D','F','G','H','J','K','L',';','\'','Z','X','C','V','B','N','M',',','.','/',' '};
    char [] QWERTY= {'`','1','2','3','4','5','6','7','8','9','0','-','=','Q','W','E','R','T','Y','U','I','O','P','[',']','\\','A','S','D','F','G','H','J','K','L',';','\'','Z','X','C','V','B','N','M',',','.',' '};
    while (sc.hasNextLine()){
        String result = "";
        String input = sc.nextLine();
        for (int i =0; i<input.length(); i++){
            char ch = input.charAt(i);
            for (int j =0; j<WERTYU.length; j++){
                if (ch==WERTYU[j])
                    result += QWERTY[j];
                
            }
        }
        System.out.println(result);
    }
  }
}
      