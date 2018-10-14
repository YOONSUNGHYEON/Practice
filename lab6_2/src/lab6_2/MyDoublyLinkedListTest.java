package lab6_2;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//***************************
		// 파일명: MyDoublyLinkedListTest.java
		// 작성자: 윤성현
		// 작성일: 2018.10.4
		// 설명:이중 연결리스트 구현을 준비한다.
		//***************************

		System.out.println("lab6_2:윤성현");

		MyDoublyLinkedList list  = new MyDoublyLinkedList();
		System.out.println(list.toString());
		list.addFirst(2);
		list.addFirst(-3);
		list.addFirst(0);
		System.out.println(list.toString());
		list.printList();

	}

}
