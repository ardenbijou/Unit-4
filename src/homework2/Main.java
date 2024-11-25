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

        for(int place = 0; place < vowels.length(); place++){
            String letter = str.substring(place, place);
            if(letter.equals("a")){
                a += 1;
            } else if(letter.equals("A")){
                a += 1;
            } else if(letter.equals("e")){
                e += 1;
            } else if()
        System.out.println(a);
    }

    public static void palindromeChecker(String str) {

    }
}