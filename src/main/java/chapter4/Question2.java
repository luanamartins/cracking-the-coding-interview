package chapter4;

import chapter4.data.TreeNode;

/**
 * Minimal Tree: Given a sorted (increasing order) array with unique integer
 * elements, write an algorithm to create a binary search tree with minimal
 * height.
 * 
 */

public class Question2 {

	public static TreeNode minimalTree(int[] sortedArray, int low, int high) {
		if (low > high) {
			return null;
		}
		int middle = (low + high) / 2;

		TreeNode node = new TreeNode();
		node.setValue(sortedArray[middle]);

		TreeNode left = minimalTree(sortedArray, low, middle - 1);
		node.setLeft(left);

		TreeNode right = minimalTree(sortedArray, middle + 1, high);
		node.setRight(right);

		return node;

	}

	public static void main(String[] agrs) {
		int[] array = new int[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = i + 1;
		}

		TreeNode tree = minimalTree(array, 0, array.length - 1);
		System.out.println(tree);
	}
}
