package chapter4.data;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Node {
	public int value;
	public boolean visited;
	public List<Node> neighbours;

	public Node(int value) {
		this.value = value;
		this.visited = false;
		this.neighbours = new ArrayList<>();
	}

	public List<Node> getUnvisitedNeighbours() {
		List<Node> result = new LinkedList<>();
		if (this.neighbours != null) {
			Node current;
			for (int i = 0; i < this.neighbours.size(); i++) {
				current = neighbours.get(i);
				if (!current.visited)
					result.add(current);
			}
		}
		return result;
	}

	public void addNeighbour(Node neighbour) {
		this.neighbours.add(neighbour);
	}

	public void setVisited() {
		this.visited = true;
	}
	
	public String toString(){
		return "(value: " + value + " - visited: " + visited + ")";
	}
}