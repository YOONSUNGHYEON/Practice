package lab6_2;

public class MyDoublyLinkedList {
	private class Node{
		int data;
		Node rlink;
		Node llink;

		Node(int data){
			this.data = data;
		}
	}
	private Node head=null;

	public void addFirst(int data)
	{
		Node t = new Node(data);
		if(head==null)
		{
			head = new Node(data);
		}
		else
		{
			t.rlink = head;
			head.llink = t;
			this.head = t;
		}

	}
	// 양방향 링크가 제대로 구성되었는지를 확인하기 위해 리스트를 왕복하며 출력하는 메소드
	public void printList() {
		if(head == null) {
			System.out.println("( )( )");
		}
		else {
			System.out.print("( ");
			Node temp = head;
			while(temp.rlink!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.rlink;
			}
			System.out.print(temp.data+" ");
			System.out.print(")");
			System.out.print("( ");
			while(temp.llink!=null)
			{
				System.out.print(temp.data+" ");
				temp = temp.llink;
			}
			System.out.print(temp.data+" ");
			System.out.print(")");
		}
	}
	@Override
	public String toString() {
		String str = "list=";
		Node t = head;
		while(t!=null)
		{
			str = str.concat(Integer.toString(t.data)+" ");
			t=t.rlink;
		}
		return str;
	}

}
