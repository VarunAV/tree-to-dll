/*
 * Input is taken from the user and
 *  
 *  @author : Varun
 *  @date : 12 July 2015
 */

package BinarySearchTree;

public class Main {
    public static void main(String[] args){
        Node root = new Node(10);								// the root of the tree is given
        BFS.treeInsert(root, 5);								// the nodes of the tree are defined
        BFS.treeInsert(root, 15);
        BFS.treeInsert(root, 3);
        BFS.treeInsert(root, 6);
        BFS.treeInsert(root, 20);
    	BFS.bst2Dll(root);										// bst2dll function is called
    	BFS.disp();
    }
}
