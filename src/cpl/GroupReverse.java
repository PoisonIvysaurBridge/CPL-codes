package cpl;
import java.util.Scanner;
public class GroupReverse{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    GroupReverse m = new GroupReverse();
    boolean cont = true;
    while (cont){
        int g = sc.nextInt();
        if (g==0)
            cont = false;
        if (cont){
        String str = sc.next();
            
        int perGrp = str.length()/g;
        String result = "";
        String curStr = "";
        int j =0;
        for (int i = 0; i<str.length(); i++){
            curStr+= str.charAt(i);
            j++;
            if (j==perGrp){
                result+= m.reverse(curStr);
                j=0;
                curStr = "";
            }
        }
        System.out.println(result);
    }
    }
  }
  public String reverse(String str){
      String result = "";
      for (int i =str.length()-1; i>=0;i--){
          result+=str.charAt(i);
      }
      return result;
  }
}