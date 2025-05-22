package graphs; 

import java.util.ArrayList;

public class GraphNode {
	int data;
	ArrayList<Pair> adjList;
	
	public GraphNode(int d) {
		data = d;
		adjList = new ArrayList<>();
	}
	
	public void addNeighbor(GraphNode d) {
		adjList.add(new Pair(d));
	}
	
	public void addNeighbor(GraphNode d, int weight) {
		//TODO
	}
	
	public void removeNeighbor(GraphNode n) {
		//TODO
	}
	
	public int getData() {
		return data;
	}
	
	public void setData(int d) {
		data = d;
	}
	
	/**
	 * Return the degree of the node
	 * @return
	 */
	public int degree() {
		return adjList.size();
	}	
	
	/**
	 * Return the neighbor arraylist
	 * @return
	 */
	public ArrayList<Pair> getNeighbors(){
		return adjList;
	}
}
