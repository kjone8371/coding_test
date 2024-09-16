package Example_자료구조;

class Node {
    int data;
    Node next;
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
//연결리스트
//연결리스트는 요소들이 노드로 구성되며, 각 노드는 데이터와 다음 노드의 주소를 가집니다.
// 크기가 가변적이라는 장점이 있습니다.
public class LinkedListExample {
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);

        Node current = head;
        while(current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }
}
