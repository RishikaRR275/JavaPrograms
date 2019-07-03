package javaIncAssg6;

public class SList<T> {
    Node head;
    Node tail;
    SList(){
         //SList
         tail = head;
    }

    @Override
    public String toString(){
        String list = "";
        for(Node temp= head; temp!=null;temp = temp.next)
            list += temp.data+" ";
        return list;

    }

    void iterator(T data,String operation){
        SListIterator sListIterator = new SListIterator();
        if(operation.toLowerCase().equals("insert")) {
            if (head == null) {
                head = sListIterator.insertNodeAtEnd(head, tail, data);
                tail = head;
            } else
                tail = sListIterator.insertNodeAtEnd(head, tail, data);
        }

        if(operation.toLowerCase().equals("delete")){
            head = sListIterator.deleteNode(head,data);
        }


    }

}
