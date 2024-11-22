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
        Scanner input = new Scanner();
        String vowels = input.nextLine();
        int a = 0;
        int e = 0;
        int i = 0;
        int o = 0;
        int u = 0;

        for(int place = 0; place < vowels.length(); place++){
            char letter = vowels.substring(place, place);
            switch(letter) {
                case 'a':
                case 'A':
            }
        }
    }

    public static void palindromeChecker(String str) {

    }
}