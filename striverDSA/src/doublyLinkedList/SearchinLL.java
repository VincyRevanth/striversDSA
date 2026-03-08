package doublyLinkedList;

public class SearchinLL {
	
	private static Node arrToLL(int[] arr) {
		int n=arr.length;
		if(arr.length == 0) return null;
		Node head= new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<n;i++) {
			Node temp = new Node(arr[i]);
			mover.next=temp;
			temp.prev = mover;
			mover=temp;
			
		}
		return head;
	}
	
	private static void printAll(Node head) {
		Node temp = head;
		while(temp!=null) {
			System.out.print(temp.data+",");
			temp=temp.next;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
	private static boolean searchAnElement(Node head, int position) {
		Node temp = head;
		while(temp!=null) {
			if(temp.data == position) {
				return true;
			}
			temp=temp.next;
		}
		return false;
	}


	public static void main(String[] args) {
		int[] arr = {4,3,1,5,6,7};
		Node head = arrToLL(arr);
		printAll(head);
		System.out.println(searchAnElement(head,3));
		
		
	}
}
