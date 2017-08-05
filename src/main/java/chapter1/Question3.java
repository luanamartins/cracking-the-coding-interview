package chapter1;

import java.util.Arrays;

/**
 * URLify: Write a method to replace all spaces in a string with '%20: You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith ", 13
 * Output: "Mr%20John%20Smith"
 * */

public class Question3 {

	public static char[] urlify(char[] word, int size){
		int aux = size - 1;
		for (int i = word.length - 1; i > 0; i--) {
			if(word[aux] != ' '){
				word[i] = word[aux];
			}else{
				word[i] = '0';
				word[i - 1] = '2';
				word[i - 2] = '%';
				i -= 2;
			}
			aux--;
		}
		return word;
	}
	
	public static void main(String[] args) {
		String input = "luana martins";
		char[] inputCharArray = new char[input.length() + 2];
		for (int i = 0; i < input.toCharArray().length; i++) {
			inputCharArray[i] = input.charAt(i);
		}
		System.out.println(Arrays.toString(urlify(inputCharArray, input.length())));
		
	}
	
}
