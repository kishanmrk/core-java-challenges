/**
 * 
 */
package com.kishan.datastructures;

/**
 * @author Kishankumar
 * Feb 23, 2020 
 */
public class LinkedListImpl {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Start with the empty list. */
        LinkedList list = new LinkedList(); 
  
        // 
        // ******INSERTION****** 
        // 
  
        // Insert the values 
        list = list.insert(list, 1); 
        list = list.insert(list, 1); 
        list = list.insert(list, 3); 
        list = list.insert(list, 4); 
        list = list.insert(list, 5); 
        list = list.insert(list, 6); 
        list = list.insert(list, 7); 
        list = list.insert(list, 8); 
  
        // Print the LinkedList 
        list.printList(list); 
  
        // 
        // ******DELETION BY KEY****** 
        // 
  
        // deleteByKey node with value 1 
        // In this case the key is ***at head*** 
        System.out.println("Deleting data::" + 1);
        list.deleteByKey(list, 1); 
  
        // Print the LinkedList 
        list.printList(list); 
  
        // deleteByKey node with value 4 
        // In this case the key is present ***in the middle*** 
        System.out.println("Deleting data::" + 4);
        list.deleteByKey(list, 4); 
  
        // Print the LinkedList 
        list.printList(list); 
  
        // deleteByKey node with value 10 
        // In this case the key is ***not present*** 
        System.out.println("Deleting data::" + 10);
        list.deleteByKey(list, 10); 
  
        // Print the LinkedList 
        list.printList(list); 
	}

}

class LinkedList {
	
	Node head;
	
	private class Node {
		int data;
		Node next;
		
		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Node [data=" + data + ", next=" + next + "]";
		}
		
	}
	
	LinkedList insert(LinkedList list, int data) {
		Node new_node = new Node();
		new_node.data = data;
		new_node.next = null;
		
		if(list.head == null) {
			list.head = new_node;
		} else {
			Node last = list.head;
			while(last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	void printList(LinkedList list) {
		Node temp = list.head;
		if(temp == null) {
			return;
		}
		while(temp != null) {
			System.out.println(temp.data + " ");	
			temp = temp.next;
		}		
	}
	
	LinkedList deleteByKey(LinkedList list, int data) {
		Node currentNode = list.head, prev = null;
		if(currentNode==null) {
			return list;
		} else {
			if(currentNode.data == data) {
				list.head = currentNode.next;
				System.out.println("Found and deleted");
				return list;
			}
			while(currentNode != null && currentNode.data != data) {
				prev = currentNode;
				currentNode = currentNode.next;
			}
			
			if(currentNode != null) {
				prev.next = currentNode.next;
				System.out.println("Found and deleted");
			}
			if(currentNode == null) {
				System.out.println("Key not found");
			}
			return list;			
		}
	}
	
}
