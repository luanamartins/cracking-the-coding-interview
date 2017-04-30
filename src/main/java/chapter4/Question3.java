package chapter4;

import java.util.LinkedList;

import chapter4.data.TreeNode;

/**
 * List of Depths: Given a binary tree, design an algorithm which creates a
 * linked list of all the nodes at each depth (e.g., if you have a tree with
 * depth 0, you'll have 0 linked lists).
 */

public class Question3 {

	public static LinkedList<LinkedList<TreeNode>> listOfDepths(TreeNode tree) {
		LinkedList<LinkedList<TreeNode>> result = new LinkedList<>();
		if (tree != null) {
			LinkedList<TreeNode> current = new LinkedList<>();
			LinkedList<TreeNode> next = new LinkedList<>();
			
			current.add(tree);
			result.add(current);
			
			while (!current.isEmpty()) {
				for (TreeNode node : current) {
					if (node.getLeft() != null)
						next.add(node.getLeft());
					if (node.getRight() != null)
						next.add(node.getRight());
				}
				if(!next.isEmpty()) result.add(next);
				current = new LinkedList<>(next);
				next = new LinkedList<>();
			}
		}
		return result;
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
		node1.setRight(node3);
		
		node2.setLeft(node4);
		node2.setRight(node5);
		
		node3.setLeft(node6);
		//node3.setLeft(node7);
		
		listOfDepths(node1);
		System.out.println();
	}
}
