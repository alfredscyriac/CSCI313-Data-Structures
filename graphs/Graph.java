package graphs; 

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Graph {
	HashSet<GraphNode> graph;
	
	public Graph() {
		graph = new HashSet<>();
	}
	
	public void connect(GraphNode a, GraphNode b) {
		graph.add(a);
		graph.add(b);
		a.addNeighbor(b);
		b.addNeighbor(a);
	}
	
	public void connect(GraphNode a, GraphNode b, int w) {
		graph.add(a);
		graph.add(b);
		a.addNeighbor(b, w);
		b.addNeighbor(a, w);
	}
	
	public void delete(GraphNode n) {
		//TODO
	}
	
	public void bfs(GraphNode initNode) {
		if(initNode == null) return; 
		HashSet<GraphNode> visited = new HashSet<>(); 
		Queue<GraphNode> queue = new LinkedList<>(); 
		queue.add(initNode); 
		visited.add(initNode); 
		while(!queue.isEmpty()) {
			GraphNode curr = queue.poll(); 
			System.out.println(curr);
			for(Pair pair: curr.getNeighbors()) {
				GraphNode neighbor = pair.destination;
				if(!visited.contains(neighbor)) {
					queue.add(neighbor);
					visited.add(neighbor); 
				} 
			}
		}
	}

	public void bfsRecursive(GraphNode initNode) {
		if (initNode == null) return;
		HashSet<GraphNode> visited = new HashSet<>();
		Queue<GraphNode> queue = new LinkedList<>();
		visited.add(initNode);
		queue.add(initNode);
		bfsRecursiveHelper(queue, visited);
	}

	public void bfsRecursiveHelper(Queue<GraphNode> queue, HashSet<GraphNode> visited) {
		if(queue.isEmpty()) {
			return; 
		}
		GraphNode curr = queue.poll();
		System.out.println(curr);
		for (Pair pair : curr.getNeighbors()) {
			GraphNode neighbor = pair.destination;
			if (!visited.contains(neighbor)) {
				visited.add(neighbor);
				queue.add(neighbor);
			}
		}
		bfsRecursiveHelper(queue, visited);
	}
 	
	public void dfs(GraphNode initNode) {
		if(initNode == null) return; 
		HashSet<GraphNode> visited = new HashSet<>(); 
		Stack<GraphNode> stack = new Stack<>(); 
		stack.push(initNode); 
		visited.add(initNode); 
		while(!stack.isEmpty()) {
			GraphNode curr = stack.pop(); 
			System.out.println(curr);
			for(Pair pair: curr.getNeighbors()) {
				GraphNode neighbor = pair.destination;
				if(!visited.contains(neighbor)) {
					stack.push(neighbor);
					visited.add(neighbor); 
				} 
			}
		}
	}

	public void dfsRecursive(GraphNode initNode) {
		if (initNode == null) return;
		HashSet<GraphNode> visited = new HashSet<>();
		Stack<GraphNode> stack = new Stack<>();
		visited.add(initNode);
		stack.push(initNode);
		dfsRecursiveHelper(stack, visited);
	}

	public void dfsRecursiveHelper(Stack<GraphNode> stack, HashSet<GraphNode> visited) {
		if(stack.isEmpty()) {
			return; 
		}
		GraphNode curr = stack.pop();
		System.out.println(curr);
		for (Pair pair : curr.getNeighbors()) {
			GraphNode neighbor = pair.destination;
			if (!visited.contains(neighbor)) {
				visited.add(neighbor);
				stack.push(neighbor);
			}
		}
		dfsRecursiveHelper(stack, visited);
	}
	
	/**
	 * Given two nodes, a and b, find the shortest
	 * path if it exits. Shortest path is defined
	 * in terms of edge weights (aka smallest weight sum).
	 * @param a
	 * @param b
	 */
	public void shortestPath(GraphNode a, GraphNode b) {
		//TODO
	}
	
	/**
	 * Can we color the graph in such a way that
	 * each neighbor is of alternating red/blue color?
	 * @return
	 */
	public boolean isBipartite() {
		//TODO
		return false;
	}
	
	/**
	 * Are all the nodes connected to each other?
	 * @return
	 */
	public boolean isConnected() {
		//TODO
		return false;
	}
}
