class LinkedList{
    private class Node {
        int val;
        Node next;
        Node(int val) { 
            this.val = val;
        }
    }

    private Node dummy;
    private Node tail;

    public LinkedList() {
        dummy = new Node(-1);
        tail = dummy;
    }

    public int get(int index) {
        if (index < 0) return -1;
        Node pointer = dummy.next;
        for (int i = 0; i < index && pointer != null; i++){
            pointer = pointer.next;
        }
        return pointer == null ? -1 : pointer.val;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = dummy.next;
        dummy.next = newNode;
        if (tail == dummy) {
            tail = newNode;
        }
    }

    public void insertTail(int val) {
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
    }

    public boolean remove(int index) {
        if (index < 0) return false;
        Node pointer = dummy;
        for(int i = 0; i < index && pointer != null; i++) {
            pointer = pointer.next;
        }

        if(pointer == null || pointer.next == null) {
            return false;
        }

        if(pointer.next == tail) {
            tail = pointer;
        }
        pointer.next = pointer.next.next;
        return true;
    }
    
    public ArrayList<Integer> getValues() {
        ArrayList<Integer> result = new ArrayList<>();
        Node pointer = dummy.next;

        while(pointer != null) {
            result.add(pointer.val);
            pointer = pointer.next;
        }

        return result;
    }
}