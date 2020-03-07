public class MatrixRow {
    // Constructor
    private ValueNode first;
    private MatrixRow next;


    public void setFirst(ValueNode valueNode) {
        this.first = valueNode;
    }

    public ValueNode getFirst() {
        return first;
    }

    public MatrixRow getNext() {
        return next;
    }

    public void setNext(MatrixRow next) {
        this.next = next;
    }

    public void insert(ValueNode value) {
        if (this.getFirst() == null) {
            this.setFirst(value);
        }
        //
        ValueNode temp = this.getFirst();
        while (temp.getColumn() < value.getColumn() && temp.getNextColumn() != null && temp.getNextColumn().getColumn() < value.getColumn()) {
            temp = temp.getNextColumn();
        }
        if (temp.getColumn() == value.getColumn()) {
            temp.setValue(value.getValue());
            return;
        }
        ValueNode next = temp.getNextColumn();
        temp.setNextColumn(value);
        value.setNextColumn(next);
    }

    public int get(int position) {
        ValueNode tempNode = this.getFirst();
        for (int i = 0; i < position - 1; i++) {
            try {
                tempNode = tempNode.getNextColumn();
            } catch(java.lang.NullPointerException e) {return 0;}
            // Return 0 if there is no ValueNode at that position
        }
        return tempNode.getValue();
        // Otherwise return value of ValueNode
    }
}