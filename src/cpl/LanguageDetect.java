package cpl;
import java.util.Scanner;

public class LanguageDetect {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int j = 1;
    boolean cont = true;
    while (cont){
        String lang = sc.nextLine();
        if (lang.equals("#"))
            cont=false;
        else {
            switch (lang){
                case "HELLO": System.out.println("Case "+j+": ENGLISH"); break;
                case "HOLA": System.out.println("Case "+j+": SPANISH");break;
                case "HALLO":System.out.println("Case "+j+": GERMAN");break;
                case "BONJOUR": System.out.println("Case "+j+": FRENCH"); break;
                case "CIAO": System.out.println("Case "+j+": ITALIAN");break;
                case "ZDRAVSTVUJTE":System.out.println("Case "+j+": RUSSIAN"); break;
                default: System.out.println("Case "+j+": UNKNOWN");
            }
        j++;
        }
        
    }
  }
}
      