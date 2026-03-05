package singlyLinkedList;

public class ArraytoLinkedList {
	
	private static Node arrayToLL(int[] arr) {
		int n= arr.length;
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=0;i<n;i++) {
			Node temp = new Node(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		
		
		
		return head;
		
		
		
		
	}
	
	
	

	
	public static void main(String[] args) {
		int[] arr = {12,3,4,5,6,7};
		Node head = arrayToLL(arr);
		System.out.println(head.data);
	}
}
