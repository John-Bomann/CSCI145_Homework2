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
		while(temp.getRow()<row && temp.getNextRow()!=null && temp.getNextRow().getRow()<row){
			temp=temp.getNextRow();
		}
		if(temp.getRow==row){
			temp.setValue(value.getValue());
			return;
		}
		ValueNode next = temp.getNextRow();
		temp.setNextRow(value);
		value.setNextRow(next);
    }
    // Temporary until sorting implemented

    public int get(int position) {
        ValueNode tempFirst = getFirst();

    }

}
