package chapter1;

/**
 * String Compression: Implement a method to perform basic string compression
 * using the counts of repeated characters. For example, the string aabcccccaaa
 * would become a2b1c5a3. If the "compressed" string would not become smaller
 * than the original string, your method should return the original string. You
 * can assume the string has only uppercase and lowercase letters (a - z).
 * 
 */

public class Question6 {

	public static String stringCompression(String word) {
		if (word == null || word.equals(""))
			return word;

		String copyOfWord = new String(word);
		StringBuffer buffer = new StringBuffer();
		int counter = 1;
		char aux = copyOfWord.charAt(0);
		char current;
		buffer.append(aux);

		for (int i = 1; i < copyOfWord.length(); i++) {
			current = copyOfWord.charAt(i);
			if (current == aux) {
				counter++;
			} else {
				buffer.append(counter);
				buffer.append(current);
				aux = current;
				counter = 1;
			}
		}

		buffer.append(counter);

		String compressed = buffer.toString();

		if (compressed.length() < copyOfWord.length())
			return copyOfWord;
		else
			return compressed;
	}

	public static void main(String[] args) {
		String input = "aaa";
		System.out.println(stringCompression(input));
	}
}
