package homework2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       vowelCounter("The quick brown fox jumped over the lazy dog.");
        System.out.println();
        vowelCounter("aaeeeeiiiioouuuu");
        System.out.println();
        palindromeChecker("level");
        System.out.println();
        palindromeChecker("abcde");
        System.out.println();
        palindromeChecker("racecar");
        System.out.println();
        palindromeChecker("aBbA");
        System.out.println();
        //extra credit
        palindromeChecker("s*dfj*js");
        System.out.println();
        palindromeChecker("jf&fj");

    }
     
    public static void vowelCounter(String str) {
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for(int place = 0; place < str.length(); place++){
            char letter = str.charAt(place);
            switch(letter){
                case 'a':
                case 'A':
                    a += 1;
                    break;
                case 'e':
                case 'E':
                    e += 1;
                    break;
                case 'i':
                case 'I':
                    i += 1;
                    break;
                case 'o':
                case 'O':
                    o += 1;
                    break;
                case 'u':
                case 'U':
                    u += 1;
                    break;
            }
    }
    System.out.println("number of a's: " + a );
    System.out.println("number of e's: " + e );
    System.out.println("number of i's: " + i );
    System.out.println("number of o's: " + o );
    System.out.println("number of u's: " + u );
}
    public static void palindromeChecker(String str) {

        for(int place=0; place < str.length(); place++){
            /* I tried a couple different methods for this, I basically wanted to use a switch case, something similar to what i did for DataFun, and have the default
               be the palindrome checker. That's, like, totally impossible though, so I went and looked up what retun actually does !!
               So, this first for loop is just checking ascii values to make sure the rest of the code doesn't execute if there are non-alphanumeric characters in, and the second 
               for loop does the palindrome check :)
            */
            char ch = str.charAt(place);
            if((ch < 'A') || (ch > 'Z' && ch < 'a') || (ch > 'z')){
                System.out.println("ERROR: invalid character detected in" + str); 
                return;
            }
        }
        String reversed = "";
        for(int place=0; place < str.length(); place++){           
            String single = str.substring(place,place + 1);
            reversed = single + reversed;
        }
        if(str.equals(reversed)){
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }   
}