package linkedlist;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		list.insert("A");
		list.insert("B");
		list.insert("C");
		list.show();
		System.out.println("-------------------------------");
		
		list.insertAtStart("zz");
		list.show();
		System.out.println("-------------------------------");
		
		list.insertAt(3,"teesraa");
		list.show();
		System.out.println("-------------------------------");
		
		list.insertAt(1,"pehlaa");
		list.show();
		System.out.println("-------------------------------");
		
		list.deleteAt(3);
		list.show();
		System.out.println("-------------------------------");
		
		list.deleteAt(1);
		list.show();
		System.out.println("-------------------------------");
	}
	

}
