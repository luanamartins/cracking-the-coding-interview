package chapter8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Power Set: Write a method to return all subsets of a set.
 */

public class Question4 {

	public static List<Set<Integer>> getAllSubsets(Set<Integer> set) {

		List<Set<Integer>> partition = new ArrayList<>();
		HashSet<Integer> emptySet = new HashSet<>();
		partition.add(emptySet);

		List<Set<Integer>> copy;

		for (Integer item : set) {
			copy = cloneSet(partition);
			copy.addAll(partition);
			for (Set<Integer> setOnCopy : copy) {
				setOnCopy.add(item);
			}
			partition.addAll(copy);
		}

		return partition;
	}

	public static List<Set<Integer>> cloneSet(List<Set<Integer>> source) {
		List<Set<Integer>> copy = new ArrayList<>();
		Set<Integer> copySet;
		for (Set<Integer> item : source) {
			copySet = new HashSet<>(item);
			copy.add(copySet);
		}
		return copy;
	}

	public static void main(String[] args) {

		HashSet<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);

		List<Set<Integer>> partition = getAllSubsets(set);
		for (Set<Integer> setOnPartition : partition) {
			for (Integer i : setOnPartition) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}
