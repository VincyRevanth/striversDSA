package doublyLinkedList;

import doublyLinkedList.*;


public class Deletion {
	

	private static Node arrayToDLL(int[] arr) {
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<arr.length;i++) {
			Node temp = new Node(arr[i]);
			mover.next=temp;
			temp.prev = mover;
			mover = temp;
		}
		return head;
		
	}
	
	private static void printALL(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+",");
			
			temp=temp.next;
		}
	}
	
	private static Node deleteHeadofDLL(Node head) {
		if(head == null)return null;
		head = head.next;
		if(head!=null) {
			head.prev=null;
		}
		
		return head;
	}
	
	private static Node deleteTail(Node head) {
		if(head==null || head.next == null) return head;
		
		Node temp = head;
		while(temp.next.next!=null) {
			temp=temp.next;
		}
		temp.next.prev=null;
		temp.next=null;
		return head;
	}
	
	
	private static Node deleteAtPosition(Node head,int position) {
		if(head==null)	return null;
		int cnt =1 ;
		Node temp = head;
		Node pr = null;
		while(temp!=null) {
			if(cnt == position) {
				pr.next.next.prev =pr;
				pr.next= pr.next.next;
				
				
				
			}
		}
		
		
		
		
		
		
		return head;
	}
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		int[] arr = {12,3,4,5,6,7};
		Node head =  arrayToDLL(arr);
	//	head = deleteHeadofDLL(head);
		
		printALL(head);
		System.out.println();
		
		
		head= deleteTail(head);
		printALL(head);
		
	}

}
