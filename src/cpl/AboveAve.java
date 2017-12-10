package cpl;
import java.util.Scanner;

public class AboveAve {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int C = sc.nextInt();
    while (C > 0){
        int n = sc.nextInt();
        int [] grades = new int[n];
        double total = 0;
        for (int i = 0; i< grades.length; i++)  // input of grades
            grades[i]= sc.nextInt();
        for (int i = 0; i<grades.length; i++)   // getting the sum of all grades
            total+=grades[i];
        double ave = total/ n;                  // getting the average of all the grades
        int above = 0;
        for (int i = 0; i< grades.length; i++)  // getting the no. of grades above ave
            if (grades[i]> ave)
                above++;
        double percent = above*1.0/n*100.0;
        System.out.format("%.3f", percent); 
        System.out.println("%");
        C--;
    }
  }
}
      