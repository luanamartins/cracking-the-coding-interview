package chapter8;

import java.util.HashSet;
import java.util.Set;

/**
 * Parens: Implement an algorithm to print all valid (e.g., properly opened and
 * closed) combinations of n pairs of parentheses. 
 * EXAMPLE 
 * Input: 3 
 * Output: ((())), (()()), (())(), ()(()), ()()()
 */

public class Question9 {

	public static Set<String> parens(int input) {
		Set<String> result = new HashSet<>();
		if (input < 1)
			return result;
		else {
			result.add("()");
			return buildParens(input, 1, result);
		}
	}

	public static Set<String> buildParens(int input, int counter, Set<String> result) {
		if (counter >= input)
			return result;
		else {
			Set<String> tmp = new HashSet<>();
			for (String res : result) {
				tmp.add("(" + res + ")");
				tmp.add("()" + res);
				tmp.add(res + "()");
			}
			
			result = tmp;
			return buildParens(input, counter + 1, result);
		}
	}
	
	public static void main(String[] args) {
		Set<String> parens = parens(3);
		for (String paren : parens) {
			System.out.print(paren + " ");
		}
	}

}
