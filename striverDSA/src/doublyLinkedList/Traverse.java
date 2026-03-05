package doublyLinkedList;

public class Traverse {
	
	public static void traverse(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
	}
	
	private static Node arrayToLL(int[] arr) {
		int n=arr.length;
		Node head = new Node(arr[0]);
		Node mover = head;
		
		for(int i=1;i<n;i++) {
			Node temp = new Node(arr[i]);
			mover.next=temp;
			temp.prev = mover;
			mover = temp;
		}
		return head;
	}
	
	public static void main(String[] args) {
		int[] arr= {4,5,6,7,8,9};
		Node head = arrayToLL(arr);
		traverse(head);
		System.out.println();
		System.out.println(head.next.next.prev.data);
	}

}
