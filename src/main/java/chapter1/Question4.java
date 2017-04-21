package chapter1;

import java.util.HashMap;
import java.util.Map;

/**
 * Palindrome Permutation: Given a string, write a function to check if it is a
 * permutation of a palindrome. A palindrome is a word or phrase that is the
 * same forwards and backwards. A permutation is a rearrangement of letters. The
 * palindrome does not need to be limited to just dictionary words. EXAMPLE
 * Input: Tact Coa Output: True (permutations: "taco cat". "atco cta". etc.)
 * 
 */

public class Question4 {

	public static boolean palindromePermutation(String input) {
		Map<Character, Integer> map = new HashMap<>();
		char key;
		int value;
		for (int i = 0; i < input.length(); i++) {
			key = input.charAt(i);
			if (map.containsKey(key)) {
				value = map.get(key);
				map.put(key, value + 1);
			} else {
				map.put(key, 1);
			}
		}

		int odd = 0;
		boolean permutation = true;
		// Don't need to iterate over all mapping values if I got two odd
		// numbers
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() % 2 != 0) {
				odd++;
			}
			if (odd > 1)
				permutation = false;
		}

		return permutation;
	}

	public static void main(String[] args) {
		String input = "teet";
		System.out.println(palindromePermutation(input));
	}
}
