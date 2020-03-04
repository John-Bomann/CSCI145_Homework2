public class MatrixRow {
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
        value.setNextRow(first);
        this.first = value;
    }
    // Temporary until sorting implemented

    public int get(int position) {
        ValueNode tempFirst = getFirst();

    }

}
