/* Converting Array into DoublyLinkList */

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



public static Node convertingArrayToDLL(int arr[]) {
	
	
	if(arr.length == 0) {
		return null;
	}
	Node newnode = new Node(arr[0]);
	Node prev = newnode;
	for(int i=1; i<arr.length; i++) {
		Node temp = new Node(arr[i],null,prev);
		prev.next = temp;
		prev = temp;
	}
	
	return newnode;
	
}

public static void main(String args[]) {	
	DoublyLinkList dl = new DoublyLinkList();

	
	int arr[] = {22,3,11,2,3,4,5,9};
	Node arrNode = convertingArrayToDLL(arr);
	
	dl.traveseFront(arrNode);
	
	}
}