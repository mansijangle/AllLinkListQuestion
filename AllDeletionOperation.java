import java.util.*;

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



public static Node convertingArrtoDLL(int arr[]) {
	
	if(arr.length==0) {
		return null;
	}
	Node newnode = new Node(arr[0]);
	
	Node prev = newnode;
	for(int i=1; i<arr.length; i++) {
		Node temp = new Node(arr[i],null,prev);
		prev.next = temp;
		prev  = temp;
	}
	return newnode;
}

public static Node todeleteTheHead(Node head) {
	
	if(head==null || head.next == null) {
		return null;
	}	
	Node prev = head;
	head = head.next;
	head.back = null;
	prev.next = null;
	
	return head;

}
public static Node DeleteTheSpecifedIndex(Node head ,int k) {
	if(head==null) {
		return null;
	}
	int cnt = 0;
	Node temp = head;
	while(temp!=null) {
		cnt++;
		if(cnt==k) {
			break;
		}
		temp = temp.next;
	}
	
	Node prev  = temp.back;
	Node front = temp.next;
	if(prev==null && front==null) {
		return null;
	}
	else if(prev==null) {
		return todeleteTheHead(temp);
	}else if(front==null) {
		todeleteAtEnd(temp);
	}
		prev.next = front;
		front.back = prev;
		temp.next = null;
		temp.back = null;

		return head;
	
}
public static Node todeleteAtEnd(Node temp) {
	Node head = temp;
	if(head==null || head.next==null) {
		return null;
	}
	while(head.next.next!=null) {
		head = head.next;
	}
	
	head.next = null;
	
	return temp;
}
public static void main(String args[]) {	
	DoublyLinkList dl = new DoublyLinkList();
//	dl.insertAtEnd(9);
//	dl.insertAtEnd(100);
//	dl.insertAtEnd(70);
//	dl.insertAtEnd(8);
//	dl.insertAtEnd(10);
//	dl.insertAtEnd(22);
//	
//	dl.traveseFront();
	
	int arr[] = {22,3,11,2,3,4,5,9};
	Node arrNode = convertingArrtoDLL(arr);
	dl.traveseFront(arrNode);  
	System.out.println("Deleting the first element in the list : ");
//    Node deleteNode = todeleteTheHead(head);
//    dl.traveseFront(deleteNode);
//    System.out.println("Deleting the last element in the linklist");
//    Node deleteFirst = todeleteAtEnd(arrNode);
//    dl.traveseFront(deleteFirst);
	
	  Node deleteKth = DeleteTheSpecifedIndex(arrNode,1);
	  dl.traveseFront(deleteKth);
	  

	

	}
}
