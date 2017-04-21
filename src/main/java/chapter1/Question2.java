package chapter1;

/**
 * Check Permutation: Given two strings, write a method to decide if one is a permutation of the other.
 * */

public class Question2 {

	public static boolean checkPermutation(String word, String permutation){
		if(word == null || permutation == null) return false;
		String concatPermutationTwice = permutation + permutation;
		return concatPermutationTwice.contains(word);
	}

	public static void main(String[] args) {
		System.out.println(checkPermutation("text", "ttex"));
		System.out.println(checkPermutation("text", "tted"));
	}
}
