package linkedlist;

public class LinkedList {
	
	Node head;
	
	public Node createNodeWith(String name) {
		Node node = new Node();
		node.name = name;
		node.next = null;
		
		return node;
	}
	
	public void insert(String name) {
		
		Node node = createNodeWith(name);
		
		if(head == null) {
			head = node;
		}else {
			
			Node n = head;
			while(n.next != null) {
				n = n.next;
			}
			n.next = node;
		}
		System.out.println("add hua hai");
	}
	
	public void show() {
		Node n = head;
		while(n != null) {
			System.out.println(n.name);
			n = n.next;
		}
	}

	public void insertAtStart(String name) {
		
		Node node = createNodeWith(name);
		
		if(head == null) {
			head = node;
		}else {
			node.next = head;
			head = node;
		}
		
	}

	public void insertAt(int position, String name) {
		
		Node node = createNodeWith(name);
		
		if(position == 1)
		{
			insertAtStart(name);
		}else {
			Node n = head;int count = 1;
			while(count < position) {
				n = n.next;
				count++;
			}
			
			node.next = n.next;
			n.next = node;
		}
		
		
		
	}

	public void deleteAt(int position) {
		Node n = head;
		
		if(position == 1) {
			head = head.next;
		}else {
			int count = 1;
			while(count < position-1) {
				n = n.next;
				count++;
			}
			
			n.next = n.next.next;
		}
	}
	
	
	

}
