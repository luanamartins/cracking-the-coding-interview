package chapter4;

import chapter4.data.TreeNode;

/**
 * Check Balanced: Implement a function to check if a binary tree is balanced.
 * For the purposes of this question, a balanced tree is defined to be a tree
 * such that the heights of the two subtrees of any node never differ by more
 * than one.
 */

public class Question4 {

	public static int height(TreeNode node) {
		if (node == null)
			return 0;
		else {
			return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
		}
	}

	public static boolean checkBalanced(TreeNode node) {
		if (node == null) {
			return true;
		}

		int leftHeight = height(node.getLeft());
		int rightHeight = height(node.getRight());
		int diff = Math.abs(leftHeight - rightHeight);
		if (diff > 1)
			return false;
		else
			return checkBalanced(node.getLeft()) && checkBalanced(node.getRight());
	}

	public static void main(String[] args) {
		TreeNode node1 = new TreeNode();
		node1.setValue(1);
		
		TreeNode node2 = new TreeNode();
		node2.setValue(2);
		
		TreeNode node3 = new TreeNode();
		node3.setValue(3);
		
		TreeNode node4 = new TreeNode();
		node4.setValue(4);
		
		TreeNode node5 = new TreeNode();
		node5.setValue(5);
		
		TreeNode node6 = new TreeNode();
		node6.setValue(6);
		
		node1.setLeft(node2);
		//node1.setRight(node3);
		
		node2.setLeft(node4);
		node2.setRight(node5);
		
		//node3.setLeft(node6);
		
		System.out.println(checkBalanced(node1));
	}

}