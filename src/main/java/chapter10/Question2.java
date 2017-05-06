package chapter10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Group Anagrams: Write a method to sort an array of strings so that all the
 * anagrams are next to each other.
 */

public class Question2 {

	public static void groupAnagrams(String[] input) {
		if (input == null)
			return;
		HashMap<String, List<String>> map = new HashMap<>();

		for (int i = 0; i < input.length; i++) {
			process(input[i], map);
		}

		int counter = 0;
		for (Map.Entry<String, List<String>> entry : map.entrySet()) {
			for (String word : entry.getValue()) {
				input[counter] = word;
				counter++;
			}
		}
	}

	public static void process(String word, HashMap<String, List<String>> map) {

		String sorted = sortString(word);
		
		List<String> list = new ArrayList<>();
		if (map.containsKey(sorted)) {
			list = map.get(sorted);
		}
		list.add(word);
		map.put(sorted, list);
	}

	public static String sortString(String word) {
		char[] wordBytes = word.toCharArray();
		Arrays.sort(wordBytes);
		return new String(wordBytes);
	}

	public static void main(String[] args) {
		String[] input = { "text", "acb", "bca", "ttex" };
		groupAnagrams(input);

		for (int i = 0; i < input.length; i++) {
			System.out.println(input[i]);
		}
	}

}
