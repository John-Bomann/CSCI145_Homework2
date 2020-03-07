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
        if(first==null){
			first=value;
		}
		ValueNode temp = first;
		while(temp.getRow()<value.getRow() && temp.getNextRow()!=null && temp.getNextRow().getRow()<value.getRow()){
			temp=temp.getNextRow();
		}
		if(temp.getRow()==value.getRow()) {
			temp.setValue(value.getValue());
			return;
		}
		ValueNode next = temp.getNextRow();
		temp.setNextRow(value);
		value.setNextRow(next);
    }

    public int get(int position) {
        ValueNode tempNode = this.getFirst();
        while(tempNode.getRow() != position) {
            if(tempNode.getRow() > position) {
                return 0;
            }
            // Returns 0 if the position is skipped over
            tempNode = tempNode.getNextRow();
            if(tempNode == null) {
                return 0;
            }
            // Once tempNode is updated, checks if it is null, test against a get for a position greater than the last ValueNode
        }
        return tempNode.getValue();
    }

}
