package cpl;
import java.util.*;

public class PermArr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        while (t>0){
            // get t inputs all at once
            ArrayList <Integer> p = new ArrayList();    // the index array p
            ArrayList <String> inputs = new ArrayList();    // second list of inputs

            String line = sc.nextLine();
            for (String s : line.split(" ")) 
                p.add(Integer.parseInt(s));

            for (int i = 0; i<p.size(); i++)
                inputs.add(sc.next());
            
            System.out.println("");
            
            String sortedNumber[] = new String[p.size()];
            for (int i = 0; i < p.size(); i++)
                sortedNumber[p.get(i) - 1] = inputs.get(i);

            for (int i = 0; i < p.size(); i++)
                System.out.println(sortedNumber[i]);

            if (t>1)
                System.out.println("");
            t--;
            sc.nextLine();
        }
    } 
}
    /*while (t>0){
        System.out.println("");
        // initializing index array p
        List<Integer> p = new ArrayList<Integer>();
        String line = sc.nextLine();
        
        for (String s : line.split(" ")) {
            p.add(Integer.parseInt(s));
        }
        // getting the max of the index array
        int max = p.get(0);
        for (int i = 0; i< p.size(); i++){
            if (p.get(i)>max)
                max = p.get(i);
        }
        // getting max number of String inputs
        String [] inputs = new String[max];
        for (int i = 0; i<p.size(); i++)
            inputs[p.get(i)-1]= sc.next();
        // sorting permutation
        for (int i = 0; i<p.size() ; i++){
            System.out.println(inputs[i]);
        }
        t--;
        sc.nextLine();
    }*/
 

/*      using C++
#include<iostream>
#include<string>
#include<stdio.h>
#include<cstring>
#include<math.h>
#include<queue>
#include<stdlib.h>
#include<algorithm>
#include<map>
int main(){
  int T;
  cin>>T;
  string test1; 
  getline(cin,test1);
  while( T–!=0){
    string test2;
    getline(cin,test2);
	string s;
    getline(cin,s);

    int a[10000];
	int pos=1;
    for( int i=0; i!=s.size(); ){
      if( isdigit(s[i])){
        int j=i;
        while( j!=s.size() && isdigit(s[j])) 
          ++j;
		int num=0; 
        for( int k=i; k!=j; ++k)
        	num=(num+s[k]-‘0′)*10;
		num=num/10;
		a[pos++]=num; 
        i=j;
      }
      else ++i;
	}
    string S[10000]; 
    string temp;
    getline(cin,temp);

    int pos1=1;
    for( int i=0; i!=temp.size(); ){
      if( temp[i]!=’ ‘){
        int j=i;
        while( j!=temp.size() && temp[j]!=’ ‘) 
          ++j;
		S[a[pos1++]]=temp.substr(i,j-i); 
		i=j;
      }
      else i++;
    }
    for( int i=1; i!=pos1; ++i) 
    	cout<<S[i]<<endl;
    if( T!=0) 
      cout<<endl;
  }
  return 0;

}

*/