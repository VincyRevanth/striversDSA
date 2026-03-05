package singlyLinkedList;

public class Insertion {
	private static Node arrayToLL(int[] arr) {
		int n = arr.length;
		Node head = new Node(arr[0]);
		Node mover = head;
		for (int i = 1; i < n; i++) {
			Node temp = new Node(arr[i]);
			mover.next = temp;
			mover = temp;
		}
		return head;
	}
	
	
	private static void printAll(Node head) {
		Node temp = head;

		while (temp != null) {
			System.out.print(temp.data + ",");
			temp = temp.next;
		}
	}
	
	
	private static Node insertAtHead(Node head, int value) {
		//Node newNode = new Node(value,head);
		

		return new Node(value,head);  // staraigh away we can write this 
		
	}
	
	
	private static Node insertAtTail(Node head,int val) {
		Node newNode = new Node(val);
		Node temp = head;
		
		if(head == null) {
			return new Node(val);
		}
		
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
		newNode.next=null;
		
		return head;
	}
	
	
	
	private static Node insertAtPosition(Node head,int position, int val) {
		if(head == null) {
			if(position==1) {
			return new Node(val);}
		}
		else if(position == 1) {
			return new Node(val,head);
		}
		Node temp = head;
		int cnt=1;
		
		while(temp!=null && cnt<position-1) {
			
			temp=temp.next;
			cnt++;
		}
		
		Node newNode = new Node(val);
		newNode.next= temp.next;
		temp.next=newNode;
		
		return head;
	}
	
	
	
	
	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 34, 21, 87, 2 };
		Node head = arrayToLL(arr);
		System.out.print("Before deleting head: ");
		printAll(head);
		System.out.println();
		System.out.print("After opeations: ");
		
		
//		head = insertAtHead(head, 14);
//		printAll(head);
//		

		
//		head = insertAtTail(head,40);
//		printAll(head);
		
		
		head = insertAtPosition(head, 2, 10);
		head = insertAtPosition(head, 2, 11);
		printAll(head);

	}
}
