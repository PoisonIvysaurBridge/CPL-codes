package cpl;
import java.util.Scanner;

public class LoveCal {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char [] letters = {'*','a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
    while (sc.hasNextLine()){
        //sc.nextLine();
        String a = sc.nextLine();
        String b = sc.nextLine();
        a = a.toLowerCase();
        b = b.toLowerCase();
        int sumA = 0;
        int sumB=0;
        for (int i =0; i<a.length(); i++){
            for (int j =0; j< letters.length; j++){
                if (a.charAt(i)==letters[j])
                    sumA+=j;
            }
        }
        for (int i =0; i<b.length(); i++){
            for (int j =0; j< letters.length; j++){
                if (b.charAt(i)==letters[j])
                    sumB+=j;
            }
        }
        while (sumA>9){
            int temp = sumA;
            sumA=0;
            while (temp > 0){
                sumA+= temp%10;
                temp/=10;
            }
        }
        while (sumB>9){
            int temp = sumB;
            sumB=0;
            while (temp > 0){
                sumB+= temp%10;
                temp/=10;
            }
        }
        if (sumA>sumB){
            System.out.printf("%.2f",(sumB*1.0/sumA*100));
            System.out.println(" %");
        }
        else{
            System.out.printf("%.2f",(sumA*1.0/sumB*100));
            System.out.println(" %");
        }
    }
  }
}
      