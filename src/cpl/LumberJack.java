package cpl;
import java.util.Arrays;
import java.util.Scanner;

public class LumberJack {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println("Lumberjacks:");
    while (n>0){
        int[] jacks = new int [10];
        int[] ascend = new int [10];
        int[] descend = new int [10];
        for (int i = 0; i<10; i++){
            jacks[i] = sc.nextInt();
            ascend[i] = jacks[i];
            descend[i] = jacks[i];
        }
        Arrays.sort(ascend);
        for (int i =0; i<descend.length-1; i++){
            for(int j =0; j<descend.length-1; j++){
                if (descend[j] < descend[j+1]){
                    int temp = descend[j];
                    descend[j]= descend [j+1];
                    descend [j+1] = temp;
                }
            }
        }
        if (Arrays.equals(jacks, ascend))
            System.out.println("Ordered");
        else if (Arrays.equals(jacks, descend))
            System.out.println("Ordered");
        else
            System.out.println("Unordered");
        n--;
    }
  }
}
      