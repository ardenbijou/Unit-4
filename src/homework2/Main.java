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

    }
}