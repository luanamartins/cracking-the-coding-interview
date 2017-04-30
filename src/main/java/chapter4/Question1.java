package chapter4;

import java.util.LinkedList;
import java.util.List;

import chapter4.data.Node;

/**
 * Route Between Nodes: Given a directed graph, design an algorithm to find out
 * whether there is a route between two nodes.
 */

public class Question1 {

	public static boolean existsRouteBetween(Node source, Node target) {
		if (source == null || target == null)
			return false;

		List<Node> queue = new LinkedList<>();
		queue.add(source);

		List<Node> unvisitedNeighbours;
		Node current;
		boolean foundRoute = false;
		while (!queue.isEmpty() && !foundRoute) {
			current = queue.remove(0);
			if (current.value == target.value) {
				foundRoute = true;
			} else {
				current.setVisited();
				unvisitedNeighbours = current.getUnvisitedNeighbours();
				queue.addAll(unvisitedNeighbours);
			}
		}

		return foundRoute;
	}

	public static void main(String[] args) {
		Node node1 = new Node(1);
		Node node2 = new Node(2);
		Node node7 = new Node(7);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);

		node1.addNeighbour(node2);
		node1.addNeighbour(node3);

		node2.addNeighbour(node1);
		node2.addNeighbour(node7);
		node2.addNeighbour(node5);

		node3.addNeighbour(node1);
		node3.addNeighbour(node7);

		node4.addNeighbour(node7);

		node5.addNeighbour(node2);

		node7.addNeighbour(node2);
		node7.addNeighbour(node3);
		node7.addNeighbour(node4);

		System.out.println(existsRouteBetween(node1, node4));
		System.out.println(existsRouteBetween(node1, node6));

	}
}
