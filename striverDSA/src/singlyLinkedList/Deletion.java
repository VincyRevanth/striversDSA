package singlyLinkedList;

public class Deletion {

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

	private static int countLL(Node head) {
		Node temp = head;
		int count=0;

		while (temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	}

	private static Node deleteHead(Node head) {
		if (head == null)
			return head;
		head = head.next;
		return head;
	}

	private static Node deleteTail(Node head) {
		if (head == null || head.next == null)
			return head;
		Node temp = head;
		while (temp.next.next != null) {
			temp = temp.next;
		}
		temp.next = null;

		return head;
	}

	private static Node deleteAtPosition(Node head, int position) {
		if(head==null) return head;
		if(position==1) {
			head = head.next;
			return head;
		}
		int cnt =0;
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			cnt++;
			if(cnt==position) {
				prev.next = prev.next.next;
				break;
				
			}
			prev =temp;
			temp=temp.next;
		}
	return head;	
	}
	
	
	private static Node deleteAtValue(Node head,int value) {
		if(head ==null) return head;
		if(head.data==value) {
			head= head.next;
			return head;
		}
		Node temp = head;
		Node prev = null;
		while(temp!=null) {
			if(temp.data == value) {
				prev.next = prev.next.next;
				break;
			}
			prev = temp;
			temp = temp.next;
		}
		
		
		
		
		return head;
	}
	
	
	
	

	public static void main(String[] args) {
		int[] arr = { 1, 4, 7, 34, 21, 87, 2 };
		Node head = arrayToLL(arr);
		System.out.print("Before deleting head: ");
		printAll(head);
		System.out.println();
		System.out.println("No of elemenets in LL:"+countLL(head));

//		head = deleteHead(head);
//		System.out.println();
//		System.out.print("After deleting head: ");
//		printAll(head);
//		System.out.println();
//		

//		head = deleteTail(head);
//		System.out.print("After deleting tail: ");
//		printAll(head);

		//head = deleteAtPosition(head,10);
		//printAll(head);
		
		head = deleteAtValue(head,1);
		printAll(head);
	}

}
