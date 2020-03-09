public class MatrixRow {
    // Constructor
    private ValueNode first;
    private MatrixRow next;

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
        ValueNode current;
        ValueNode temp;
        if(first == null) {
            first = value;
        }
        // If head is empty, set head to value
        else if(value.getColumn() < first.getColumn()) {
            current = first;
            first = value;
            first.setNextColumn(current);
        }
        // If head not empty and value's column is less than the head's value, set head to value
        else if(value.getColumn() > first.getColumn()) {
            current = first;
            while(current.getNextColumn() != null) {
                if(value.getColumn() > current.getNextColumn().getColumn()) {
                    // If current ValueNode's column is greater than the next ValueNode's column
                    current = current.getNextColumn();
                }
                else if(value.getColumn() < current.getNextColumn().getColumn()) {
                    // If current ValueNode's column is less than the next ValueNode's column
                    temp = current.getNextColumn();
                    current.setNextColumn(value);
                    current.getNextColumn().setNextColumn(temp);
                    // Sets next ValueNode to be successor
                    return;
                }
            }
            current.setNextColumn(value);
        }
    }

    public void insert1(ValueNode value) {
        if (first == null) {
            first = value;
        }
        //
        ValueNode temp = getFirst();
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
        ValueNode tempNode = first;
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