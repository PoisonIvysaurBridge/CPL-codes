package cpl;
import java.util.*;

public class HangmanJudge {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean cont = true;
    while (cont){
        int round = sc.nextInt();
        if (round==-1)
            break;
        sc.nextLine();
        String soln = sc.nextLine();
        soln+=" ";
        String guess = sc.nextLine();
        guess+=" ";
        List letters = new ArrayList();
        int error = 0;
        //letters.add(soln.charAt(0));
        // gets each unique letter in the soln
        for (int i = 0; i<soln.length()-1; i++){
            String ch = soln.substring(i,i+1);
            if (!checkList(ch, letters))
                letters.add(ch);
        }
        // checks whether guess matches soln
        boolean match = true;
        List perGuessChk = new ArrayList();
        for (int i =0; i< guess.length()-1; i++){
            String j = guess.substring(i, i+1);
            
            //System.out.println(perGuessChk);
            if (!checkList(j, letters)){
                match = false;
                error++;
            }
            else if (checkList(j, letters) && !checkList(j, perGuessChk))
                perGuessChk.add(j);
            //System.out.println(perGuessChk);
            if (equalLists(perGuessChk, letters)&& error<7){
                i = guess.length();
                match = true;
            }
        }
        // output
        System.out.println("Round "+round);
        if (match)
            System.out.println("You win.");
        else if (match==false && error<7)
            System.out.println("You chickened out.");
        else if (match==false && error>=7)
            System.out.println("You lose.");
    }
  }
  static boolean checkList(String ch, List letters){
      boolean check = false;
      for (int i =0; i<letters.size();i++){
          if (ch.equals(letters.get(i)))
              check = true;
      }
      return check;
  }
  static  boolean equalLists(List one, List two){     
    if (one == null && two == null){
        return true;
    }

    if((one == null && two != null) 
      || one != null && two == null
      || one.size() != two.size()){
        return false;
    }

    //to avoid messing the order of the lists use a copy
    one = new ArrayList<String>(one); 
    two = new ArrayList<String>(two);   

    Collections.sort(one);
    Collections.sort(two);      
    return one.equals(two);
    }
}
      