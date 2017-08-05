package chapter1;

import java.util.Scanner;

/**
 * One Away: There are three types of edits that can be performed on strings:
 * insert a character, remove a character, or replace a character. Given two
 * strings, write a function to check if they are one edit (or zero edits) away.
 * EXAMPLE
 *      pale, ple -> true
 *      pales, pale -> true
 *      pale, bale -> true
 *      pale, bake -> false
 */

public class Question5 {

    public static boolean oneAway(String w1, String w2){
        int[] letters = new int[26];
        int pos;

        int w1Size = w1.length();
        int w2Size = w2.length();

        if(Math.abs(w1Size - w2Size) > 1){
            return false;
        }

        for(int i = 0; i < w1Size; i++){
            pos = w1.charAt(i) - 'a';
            letters[pos] += 1;
        }

        for(int i = 0; i < w2Size; i++){
            pos = w2.charAt(i) - 'a';
            letters[pos] -= 1;
        }

        boolean oneAway = true;
        pos = 0;
        int edits = 0;
        while(oneAway && pos < 26){
            if(edits > 2 && (letters[pos] >= 1 || letters[pos] <= -1)){
                oneAway = false;
            }else if(letters[pos] >= 1 || letters[pos] <= -1){
                edits++;
            }
            pos += 1;
        }

        return oneAway;
    }

	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String word1 = scan.next();
        String word2 = scan.next();
        System.out.print(oneAway(word1, word2));
    }

}
