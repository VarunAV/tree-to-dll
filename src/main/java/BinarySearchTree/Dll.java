/*
 * This class implements the doubly linked list structure.
 *  
 *  @author : Varun
 *  @date : 12 July 2015
 */


package BinarySearchTree;

public class Dll {
	
	Link first;
	  Link last;

	  public Dll() {
	    first = null;										// pointer for the head
	    last = null;										// piniter for the tail
	  }

	  public boolean isEmpty() {						
	    return first == null;
	  }

	  public void insertFirst(int dd) {						// Inserts data from the head
	    Link lnk = new Link(dd);
	    if (isEmpty()){
	      last = lnk;
	    }
	    else{
	      first.previous = lnk;
	    }
	    lnk.next = first;
	    first = lnk;
	  }

	  public void insertLast(int dd) {						// Inserts data from the tail 
	    Link lnk = new Link(dd);
	    if (isEmpty()){
	      first = lnk;
	    }
	    else {
	      last.next = lnk;
	      lnk.previous = last;
	    }
	    last = lnk;
	  }
	  
	  public String disp() {								// Displays the output
		    String str = "";
		    Link current = first;
		    while (current != null) {
		    	if(current.data==0)
		    		str += "NULL";
		    	else
		    		str += current.dis();
		      current = current.next;
		    }
		    return str;
		  }
	  
}
