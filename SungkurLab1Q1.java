/* Date       : 15/09/2016
 * Name       : S.Sungkur
 * Student ID : 151233
 * Cohort	  : BSE15BFT
 * Purpose    : This Java Program is usedadd in front and delete from the end of the list.[lab 1]
*/
class Node{
	int data; // data part
	Node next; // pointer to next newNode
	public Node(int data){
		this.data = data;
	}
	public void printElement(){
		System.out.println(this.data);
	}
}


class LinkedList{
	private Node LList;
	public LinkedList(){
		LList = null;
	}
	
	public void insertInFront(int data){
		//Inserting new Node
		Node newNode = new Node(data);
		// Check if list is empty
		if (LList == null){
			newNode.next = null;
			LList = newNode;
		}
		else{
			newNode.next = LList; // update next pointer newNode to point to Llist
			LList = newNode;     //update head pointer to point to the newNode Thus it become LList of the linkedList
		}
	}
	public void EndDelete(){
		
		Node Last = LList; //ceating a temporary Node variable name Last pointed to Llist
		Node previous = null; // create a temporary Node previous assigning value null to it
		
		// Check if list is empty
		if (LList == null){
			previous.next = null;
			previous = null;
		}
		
		// creating while loop with a condition that it should execute till Last node = null
		while (Last.next != null){
			previous = Last;// make previous (in this case the first node) points towards Last node
			Last = Last.next; // Last point the next node.
		}
		previous.next = null;  /*update	pointer of previous node to null
								(disconnecting last node to LinkList and return back to last node */
	} 
	public void printList(){
		Node temp = LList;
		while (temp != null){
			temp.printElement();
			temp = temp.next;
		}
	}
}

class SungkurLab1Q1{
	public static void main(String arg[]){
		LinkedList L = new LinkedList();
		L.insertInFront(10);
		L.insertInFront(20);
		L.insertInFront(30);
		L.insertInFront(40);
		L.printList();
		L.EndDelete();
		System.out.println();
		L.printList();
	}
}