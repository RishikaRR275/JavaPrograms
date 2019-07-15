package javaIncAssg6;

public class SListIterator<T> {
    Node insertNodeAtEnd(Node head, Node tail, T data){
        Node newNode = new Node(data);
        if(head == null) {
            head = newNode;
            return head;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        return tail;
    }

    Node deleteNode(Node head, T numToBeDeleted){
        if(head== null)
            return null;

        if(head != null && head.data == numToBeDeleted){
            if(head.next == null)
                return null;
            else
                return head.next;
        }

        Node following = head.next;
        Node prev = null;
        for(Node temp = head; following!=null ; temp = temp.next){
            if(temp.data == numToBeDeleted){
                break;
            }
            prev = temp;
            following=following.next;
        }
        prev.next =following;
        return head;
    }

}
