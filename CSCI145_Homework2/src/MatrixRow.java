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
        if (first == null) {
            first = value;
        }
        //
        ValueNode temp = first;
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
        ValueNode tempNode = getFirst();
        for (int i = 0; i < position - 1; i++) {
            tempNode = tempNode.getNextColumn();
        }
    return 0;
    }
}