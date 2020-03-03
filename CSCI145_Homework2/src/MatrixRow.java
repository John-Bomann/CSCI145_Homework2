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
        if(first==null){
			first=value;
		}
		ValueNode temp = first;
		while(temp.getRow()<row && temp.getNext()!=null && temp.getNext().getRow()<row){
			temp=temp.getNext();
		}
		if(temp.getRow==row){
			temp.setValue(value.getValue());
			return;
		}
		ValueNode next = temp.getNext();
		temp.setNext(value);
		value.setNext(next);
    }
    // Temporary until sorting implemented

    public int get(int position) {
        ValueNode tempFirst = getFirst();

    }

}
