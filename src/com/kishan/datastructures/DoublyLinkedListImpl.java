/**
 * 
 */
package com.kishan.datastructures;

/**
 * @author Kishankumar
 * Feb 24, 2020 
 */
public class DoublyLinkedListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoublyLinkedList list = new DoublyLinkedList();
		list = list.insertEnd(list, 1);
		list = list.insertEnd(list, 2);
		list = list.insertFirst(list, 5);
		list = list.insertEnd(list, 4);
		list = list.insertEnd(list, 6);
		list = list.insertEnd(list, 7);
		list.printList(list);
		System.out.println("Inserting 8 in posiition 3");
		list.insertAtPosition(list, 8, 3);
		list.printList(list);
		System.out.println("Inserting 8 in posiition 15 - size exceeded");
		list.insertAtPosition(list, 3, 15);
		list.printList(list);
		System.out.println("Inserting 14 in posiition 6");
		list.insertAtPosition(list, 14, 6);
		list.printList(list);
		System.out.println("Inserting End");
		list.insertEnd(list, 100);
		list.printList(list);
		System.out.println("Deleting first:: 5");
		list = list.deleteByKey(list,5);
		list.printList(list);
		System.out.println("Deleting:: 6");
		list = list.deleteByKey(list,6);
		list.printList(list);
		System.out.println("Deleting end:: 7");
		list = list.deleteByKey(list,7);
		list.printList(list);
		list = list.deleteByKey(list,7);
		list.printList(list);
	}

}

class Node {
	int data;
	Node prev;
	Node next;
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Node [data=" + data + ", prev=" + prev + ", next=" + next + "]";
	}
}

class DoublyLinkedList {
	Node head;
	
	DoublyLinkedList insertEnd(DoublyLinkedList list,int data) {
		Node new_node = new Node();
		new_node.data = data;
		Node current = list.head;
		if(current == null) {
			list.head = new_node;
			return list;
		}
		while(current.next != null) {
			current = current.next;
		}
		current.next = new_node;
		new_node.prev = current;
		return list;
	}
	
	DoublyLinkedList insertFirst(DoublyLinkedList list,int data) {
		Node new_node = new Node();
		new_node.data = data;
		Node current = list.head;
		if(current == null) {
			list.head = new_node;
			return list;
		} else{
			new_node.next =current;
			current.prev = new_node;
			list.head = new_node;
		}
		return list;		
	}
	
	DoublyLinkedList insertAtPosition(DoublyLinkedList list,int data, int position) {
		int count = 0;
		Node new_node = new Node();
		new_node.data = data;
		if(list.head == null) {
			System.out.println("No data to delete");
		} else {
			Node current = list.head;
			while(current != null && count != position) {
				count++;
				current = current.next;
			}
			if(current == null) {
				System.out.println("Position not found");
			} else {
				Node prevNode = current.prev;
				prevNode.next = new_node;
				new_node.next = current;
				current.prev = new_node;
			}
			
		}
		return list;
	}
	
	DoublyLinkedList deleteByKey(DoublyLinkedList list,int data) {
		Node current = list.head;
		if(current == null) {
			System.out.println("List is empty");
		} else {
			while(current!=null && current.data != data) {
				current = current.next;
			}
			if(current == null) {
				System.out.println("No data found to delete in the list::"+data);
			} else {
				if(current.prev == null) {
					Node new_head = current.next;
					new_head.prev = null;
					list.head = new_head;
				} else 	if(current.next == null) {
					Node prevN = current.prev;
					prevN.next = null;
				} else {
					Node prevN = current.prev;
					prevN.next = current.next;
					Node nextN = current.next;
					nextN.prev = prevN;
				}
			}
		}
		return list;		
	}
	
	void printList(DoublyLinkedList list) {
		if(list.head == null) {
			System.out.println("No data present");
		} else {
			Node current = list.head;
			while(current!=null) {
				System.out.println(current.data);
				current = current.next;
			}
		}
	}
	
}

