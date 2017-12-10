package cpl;
import java.util.Scanner;

public class HappyBirthday {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String [] song = {"Happy","birthday","to", "you", "Happy", "birthday", "to","you", "Happy", "birthday", "to", "Rujia", 
        "Happy", "birthday", "to","you"};
    int n = sc.nextInt();
    String [] names = new String[n];
    for (int i =0; i< names.length; i++)
        names[i]=sc.next();
    int j =0;
    if (n<=16){
        for (int i = 0; i<song.length; i++){
            System.out.println(names[j]+": "+song[i]);
            j++;
            if (j%n==0)
                j=0;
        }
    }
    else if (n>16){
        for (int i = 0; i <names.length; i++){
            System.out.println(names[i]+": "+song[j]);
            j++;
            if (j % 16==0 && i!=names.length-1)
                j=0;
            
        }
        int k;
        if (j< 16){
            k = 0;
            for (; j<song.length; j++){
                System.out.println(names[k]+": "+song[j]);
                k++;
            }
        }
    }
  }
}
      