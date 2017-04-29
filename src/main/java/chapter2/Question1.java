package chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * Remove Dups: Write code to remove duplicates from an unsorted linked list.
 * FOLLOW UP How would you solve this problem if a temporary buffer is not
 * allowed?
 * 
 */

public class Question1 {

	public static List<Integer> removeDups(List<Integer> list) {
		List<Integer> elements = new ArrayList<Integer>();
		for (Integer element : list) {
			if (!elements.contains(element)) {
				elements.add(element);
			}
		}
		return elements;
	}

	public static List<Integer> removeDups2(List<Integer> list) {
		int listSize = list.size();
		boolean hasElement = false;
		Integer element;
		for (int i = 0; i < listSize; i++) {
			element = list.get(i);
			hasElement = searchElementAt(list, element, i);
			if (hasElement){
				list.remove(i);
				i--;
				listSize--;
			}
		}
		
		return list;
	}

	private static boolean searchElementAt(List<Integer> list, Integer element, int last) {
		boolean found = false;
		for(int i = 0; i < last && !found; i++){
			if(list.get(i) == element){
				found = true;
			}
		}
		return found;
	}
	
	public static void main(String[] args){
		List<Integer> list = new ArrayList<>();
		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1);
		list.add(5);
		list.add(2);
		
		list = removeDups2(list);
		
		for (Integer i : list) {
			System.out.print(i + " ");
		}
	}

}
