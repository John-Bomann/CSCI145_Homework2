public class MatrixRow {
    private ValueNode first;
    private MatrixRow next;

    public class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
        }
    }

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

    }

    public int get(int position) {
        return 0;
    }

}
