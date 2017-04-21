package chapter1;

/**
 * 
 * Is Unique: Implement an algorithm to determine if a string has all unique
 * characters. What if you cannot use additional data structures?
 * 
 */

public class Question1 {

	public static boolean isUnique(String input){
		boolean hasUniqueCharacters = true;
		for(int i = 0; i < input.length() && hasUniqueCharacters; i++){
			for (int j = i + 1; j < input.length(); j++) {
				if(input.charAt(i) == input.charAt(j)){
					hasUniqueCharacters = false;
				}
			}
		}
		return hasUniqueCharacters;
	}
	
	public static void main(String[] args) {
		String input = "ab";
		System.out.println(isUnique(input));
		
	}
}
