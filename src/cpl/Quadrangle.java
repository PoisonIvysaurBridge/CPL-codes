package cpl;
import java.util.*;

public class Quadrangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    while (t>0){
        int [] sides = new int [4];
        for (int i = 0; i< sides.length; i++)
            sides[i] = sc.nextInt();
        Arrays.sort(sides);
        if (sides[0]==sides[3])
            System.out.println("square");
        else if (sides[0]==sides[1] && sides[2]==sides[3])
            System.out.println("rectangle");
        else if (sides[0]+sides[1]+sides[2]>= sides[3])
            System.out.println("quadrangle");
        else
            System.out.println("banana");
        t--;
    }
  }
}
      