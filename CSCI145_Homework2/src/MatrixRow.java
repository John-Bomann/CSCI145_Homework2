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
        while(tempNode.getColumn() != position) {
            if(tempNode.getColumn() > position) {
                return 0;
            }
            // Returns 0 if the position is skipped over
            tempNode = tempNode.getNextColumn();
            if(tempNode == null) {
                return 0;
            }
            // Once tempNode is updated, checks if it is null, test against a get for a position greater than the last ValueNode
        }
        return tempNode.getValue();
    }
}