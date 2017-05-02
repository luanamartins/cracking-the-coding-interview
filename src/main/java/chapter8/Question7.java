package chapter8;

import java.util.HashSet;
import java.util.Set;

/**
 * Permutations without Dups: Write a method to compute all permutations of a
 * string of unique characters.
 */

public class Question7 {
	public static Set<String> permutations(String word) {
		if (word == null)
			return null;
		Set<String> result = new HashSet<>();
		if (word.length() == 1) {
			result.add(word);
			return result;
		} else {
			char first = word.charAt(0);
			Set<String> perms = permutations(word.substring(1));
			
			for(String perm : perms){
				result.addAll(buildPerms(first, perm));
			}
			return result;
		}
	}
	
	public static Set<String> buildPerms(char letter, String perm){
		Set<String> result = new HashSet<>();
		String prefix, suffix;
		for(int i = 0; i <= perm.length(); i++){
			prefix = perm.substring(0, i);
			suffix = perm.substring(i);
			result.add(prefix + String.valueOf(letter) + suffix);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Set<String> perms = permutations("abcde");
		System.out.println("Total: " + perms.size());
		for (String perm : perms) {
			System.out.println(perm);
		}
	}
	
}
