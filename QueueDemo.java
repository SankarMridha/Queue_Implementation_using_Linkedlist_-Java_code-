import java.util.Scanner;
class Node
{
	int info;
	Node next;
}
public class QueueDemo {
	static Node rear = null;
	static Node front = null;
	public static Node insert (Node r, Node f)
	{
		rear = r;
		front = f;
		Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the number of new node: ");
		int data = sc.nextInt();
		Node node = new Node();
		node.info = data;
		node.next = null;
		if(rear == null)
		{
			front = node;
			rear = node;
		}
		else
		{
			rear.next = node;
			rear = node;
		}
		return front;
	}
	public static Node delete (Node r, Node f)
	{
		rear = r;
		front = f;
		if(front == null)
			System.out.println("Queue underflow, Delete not possible");
		else
		{
			Node q = front;
			front = front.next;
			System.out.println("Deleted node info-- data value: "+q.info);
			if(front == null)
				rear = null;
		}
		return front;
	}
	public static void display (Node r, Node f)
	{
		rear = r;
		front = f;
		if(front == null)
			System.out.println("Queue underflow");
		else
		{
			Node q = front;
			System.out.println("Node details: \t value");
    		while(q!=null)
    		{
    			System.out.println(" \t\t "+q.info);
    			q = q.next;
    		}
		}
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Program for creating single linkedlist");
		while(true)
		{
			System.out.println("Manu for different operation");
			System.out.println("Press 0: Exit");
			System.out.println("Press 1: insert");
			System.out.println("Press 2: delete");
			System.out.println("Press 3: display");
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch(choice)
			{
				case 0: System.exit(0);
				case 1: front = insert(rear,front);
			        	break;
				case 2: front = delete(rear,front);
			        	break;
				case 3: display(rear,front);
	        			break;
				default: System.out.println("Wrong choice, try again");
			}
		}
	}
}
