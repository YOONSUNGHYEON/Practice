package hw6_1;

public class MyLinkedList {
	private class Node{
		int data;
		Node link;

		Node(int data){
			this.data = data;
		}
	}
	private Node head=null;



	public void addFirst(int data) {
		// TODO Auto-generated method stub

		Node t = new Node(data);
		t.link = head;
		this.head = t;


	}

	public void addLast(int data) {
		// TODO Auto-generated method stub
		Node t = new Node(data);
		Node d = head;
		if(head==null) {
			head = t;
		}
		else {
			while(d.link!=null)
			{
				d=d.link;
			}
			d.link = t;
		}

	}

	public int removeFirst() {
		// TODO Auto-generated method stub
		int data = head.data;
		head = head.link;
		return data;
	}

	public int removeLast() {
		// TODO Auto-generated method stub
		Node t = head;
		int data=t.data;
		if(t.link == null)
			head=null;
		else {
			while(t.link.link!=null)
				t = t.link;
			data = t.link.data;
			t.link = null;
		}
		return data;
	}

	public int size() {
		// TODO Auto-generated method stub
		Node t = head;
		int size = 0;
		while(t!=null)
		{
			size++;
			t=t.link;
		}
		return size;
	}

	@Override
	public String toString() {
		String str = "list=";
		Node t = head;
		while(t!=null)
		{
			str = str.concat(Integer.toString(t.data)+" ");
			t=t.link;
		}
		return str;
	}

}
