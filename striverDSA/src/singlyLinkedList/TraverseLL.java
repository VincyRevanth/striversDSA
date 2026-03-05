package singlyLinkedList;

public class TraverseLL {

	
	
	private static Node arrayToLL(int[] arr) {
		int n= arr.length;
		Node head = new Node(arr[0]);
		Node mover = head;
		for(int i=1;i<n;i++) {
			Node temp = new Node(arr[i]);
			mover.next=temp;
			mover = temp;
		}
		return head;
	}
	
	

	public static void main(String[] args) {
		int[] arr = {12,3,4,5,6,7};
		Node head =  arrayToLL(arr);
		Node temp = head;
		int count=0;
		while(temp!=null) {
			System.out.print(temp.data+",");
			count++;
			temp=temp.next;
		}
		System.out.println();
		System.out.println("length of LL is :"+count);
	}
}
