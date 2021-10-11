//Imports all Java Utilities
import java.util.*;

public class LinkedListDecker <E> 
{
		private Node head = null;
		private Node tail = null;
		private int size = 0;
		// Because LinkedList and Node use same element type <E>,
		// I don't need to use another generic <T> for internal Node Class (I used it in our class, but not now)
		public class Node 
		{
			E data;
			Node next;
			//Node constructor
			public Node(E element) 
			{ 
				data = element;
				next = null;
			}
			//Node toString method to print Node element
			public String toString() 
			{ 
				return String.valueOf(this.data);
			}
		}

		public LinkedListDecker ()
		{
			head = null;
			tail = null;
			size = 0;
		}

		public void add(int index, E element)
		{
		Node temp1 = head;
		while (--index != 0)
		temp1 = temp1.next;
		Node temp2 = temp1.next;
		Node newNode = new Node(element);
		temp1.next = newNode;
		newNode.next = temp2;

		if (newNode.next == null)
		tail = newNode;
		}
		
		public void addFirst(E element)
		{
		Node first = new Node(element);
		first.next = head;
		head = first;

		if (first.next == null)
		tail = first;
		}
		
		public void addLast(E element)
		{
		Node last = new Node(element);
		if (head == null)
		{
		head = last;
		tail = last;
		}
		else
		         {
		tail.next = last;
		}
		}
		
		public E getFirst()
		{
		Node current = head;
		if(current == null)
		return null;
		return (E) current;
		}
		

		public E getLast()
		{
		Node current = head;
		if (current == null)
		return null;
		while (current.next != null)
		{
		current = current.next;
		}
		return (E) current;
		}
		
		
		public void remove(int index)
		{            
		         if (head == null)
		         {
		            System.out.println("Remove failed - List is Empty.");
		         }
		         Node current = head;
		                  while (--index > 0)
		         {
		current = current.next;
		         }
		Node targetNode = current.next;
		         current.next = targetNode.next;
		       }

		public E removeFirst()
		{
		         Node targetNode = head;
		         if(head == null)
		         {
		            System.out.println("List is Empty");
		return null;
		         }
		         head = targetNode.next;
		return (E) head;    
		      }
					
		public E removeLast()
		{
         Node targetNode = head;
         if (head == null)
         {
            System.out.println("List is Empty");
            return null;
         }
         if(head != tail)
            targetNode = targetNode.next;
                             
         while (targetNode.next != tail)
         {
        	 targetNode = targetNode.next;
         }
         tail = targetNode;
         tail.next = null;
         return (E) tail;
		}

		//Class to find the size of the LInkedList via a counter counting using .next feature
		public int size()
		{
		Node current = head;
		if (current == null)
		{
		return 0;
		}

		else
		{
		current = current.next;
		size++;
		}
		return size;
		}
		
		public String toString() {
			Node temp = head;
			if(temp==null)
				return "[]";
			String str = "[";
			while(temp.next != null) {
				str = str + temp.data + ", ";
				temp = temp.next;
			}
			str = str + temp.data;
			
			return str + "]";
		}
		
}



