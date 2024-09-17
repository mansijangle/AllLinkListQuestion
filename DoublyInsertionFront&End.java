/*
DoublyLink List InsertAtBeginning and InsertAtEnd

*/
class Node{
	int data;
	Node next;
	Node back;
	
	Node(int data){
		this.data = data;
		this.next = null;
		this.back = null;
	}
	Node(int data,Node next1,Node next2 ){
		this.data = data;
		this.next = next1;
		this.back = next2;
		
	}
	
}	
public class DoublyLinkList {
static Node head = null;
static Node tail = null;

public void insertAtBeginning(int data) {
	Node newnode = new Node(data);
	if(head==null) {
		head = newnode;
		tail = null;
	}else {
		  newnode.next = head;
		  head.back = newnode;
		  
		  head = newnode;	  
	}
}

public void insertAtEnd(int data) {
	Node newnode = new Node(data);
	if(tail==null) {
	   head = newnode;
        tail = newnode;		
	}else {
		tail.next = newnode;
		newnode.back = tail;
		tail = newnode;
	}
}

public void traverseBack() {
	Node temp = head;
	while(temp!=null) {
		System.out.println(temp.data);
		temp = temp.back;
	}
}	

public void traveseFront(Node head) { 
	Node temp = head;
	while(temp!=null)
	{
		System.out.println(temp.data);
		temp = temp.next;
	}
	
	System.out.println("null ");
}

public static void main(String args[]) {	
	DoublyLinkList dl = new DoublyLinkList();
	dl.insertAtEnd(9);
	dl.insertAtEnd(100);
	dl.insertAtEnd(70);
	dl.insertAtEnd(8);
	dl.insertAtEnd(10);
	dl.insertAtEnd(22);
	
	dl.traveseFront();


}
 }