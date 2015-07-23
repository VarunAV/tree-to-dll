/*
 *  Node creates a node object along with its data and its children. The left and right objects of a particular node are the 
 *  children of that node. This allows us to traverse the tree efficiently.
 *  
 *  @author : Varun
 *  @date : 12 July 2015
 */


package BinarySearchTree;

public class Node {
    int data;					// Node value
    Node left;					// left children of a parent node
    Node right;					// right children of a parent node
    
    public Node(int data) {
    	if(data!=0)				// if the data is not null then
        this.data = data;		// initialise the data of particular node
    }
}

class Link {					// Link class contains the data about the links between two data i.e., next and previous node
	int data;					// Linked value
	Link next;					// Next node
	Link previous;				// Previous node

	public Link(int d) {
		data = d;
	}

	public String dis() {
		return data+"<=>";
	}
}