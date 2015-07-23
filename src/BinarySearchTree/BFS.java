/*
 * The tree is built with the user values. The constructed tree is then traversed along the breadth (Breadth First Search) such that
 * the order of each node in the linked list will be the traversal of the given tree.
 *  
 *  @author : Varun
 *  @date : 12 July 2015
 */

package BinarySearchTree;

import java.util.*;

public class BFS{
	
	static Deque<Node> q = new LinkedList<Node>();				// Double ended queue
	static Dll l = new Dll();
	static int count=0;
	
	public static void bst2Dll(Node root){

		q.push(root);											// Root of the tree is pushed into the queue
		Node node = null;
		if(count==0)
			if(!q.isEmpty())
				l.insertLast(q.element().data);
		count++;
		while(!q.isEmpty()){						
			node = q.peek();									// node takes the value of the top element in the queue
			q.pop();											// removes the top element in the queue
			if(node.left != null){
				q.addLast(node.left);							// adds the node from the bottom of the queue
			}
			if(node.right != null){
				q.addLast(node.right);							// adds the node from the bottom of the queue
			}	
			if(!q.isEmpty())
				l.insertLast(q.element().data);
			else
				l.insertLast(0);
		}
	}
    public static void disp(){
    	System.out.println(l.disp());
    }
    public static void treeInsert(Node root, int data) {
        if (data<=root.data) {									// the left children of the node are initialised
            if (root.left!=null) 
            	treeInsert(root.left, data);
            else
            	root.left = new Node(data);
        }
        else {													// the right children of the node are initialised
            if (root.right!=null)
            	treeInsert(root.right, data);
            else
            	root.right = new Node(data);
        }
    }
}