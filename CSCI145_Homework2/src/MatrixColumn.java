public class MatrixColumn {
    private ValueNode first;
    private MatrixColumn next;


    public ValueNode getFirst() {
        return first;
    }

    public MatrixColumn getNext() {
        return next;
    }

    public void setNext(MatrixColumn next) {
        this.next = next;
    }

    public void insert(ValueNode value) {
        value.setNextColumn(first);
        this.first = value;
    }
    // Temporary until sorting is implemented

    public int get(int position) {
        return 0;
    }

}
