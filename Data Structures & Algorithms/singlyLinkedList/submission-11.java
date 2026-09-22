class LinkedList {
    int val;
    LinkedList next;

    public LinkedList() {
        this.val = -1;
        this.next = null;    
    }

    public int get(int index) {
        LinkedList pointer = this;
        for(int i = 0; i < index; i++) {
            pointer = pointer.next;
            if (pointer == null) {
                return -1;

            }
        }
        return pointer.val;
    }


    public void insertHead(int val) {
        if (this.val == - 1 && this.next == null) {
            this.val = val;
            return; 
        }
        LinkedList newNode = new LinkedList();
        newNode.val = this.val;
        newNode.next = this.next;
        this.next = newNode;
        this.val = val;
    }

    public void insertTail(int val) {
        if (this.val == -1 && this.next == null) {
            this.val = val;
            return;
        }
        LinkedList pointer = this;
        while (pointer.next != null ){
            pointer = pointer.next;
        }
        LinkedList newNode2 = new LinkedList();
        newNode2.val = val;
        pointer.next = newNode2;
    }

    public boolean remove(int index) {
        if (this.val == -1 && this.next == null) {
            return false;
        }
        LinkedList pointer = this;
        if (index < 0) {
            return false; 
        } 
        
        if (index == 0) {
            if (this.next != null) {
                this.val = this.next.val;
                this.next = this.next.next;
                return true;
            } else {
                this.val = -1;
                this.next = null;
                return true;
            }
        } 
        //LinkedList pointer = this;
        for (int i = 0;i < index - 1; i++) {
            if (pointer == null) {
                return false;
            }
            pointer = pointer.next;
        }
        if (pointer == null || pointer.next == null) {
            return false;
        }

        pointer.next = pointer.next.next;
        return true;
    }
    
    public ArrayList<Integer> getValues() {
        if (this.val == -1 && this.next == null) {
            this.val = val;
            return new ArrayList<>();
        }
        ArrayList<Integer> result = new ArrayList<>();
        LinkedList pointer = this;
        while (pointer != null) {
            result.add(pointer.val);
            pointer = pointer.next;
        }
        return result;
    }
}