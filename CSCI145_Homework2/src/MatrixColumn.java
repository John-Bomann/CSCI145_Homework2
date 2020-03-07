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
        for (int i = 0; i < position - 1; i++) {
            try {
                tempNode = tempNode.getNextRow();
            } catch(java.lang.NullPointerException e) {return 0;}
            // Return 0 if there is no ValueNode at that position
        }
        return tempNode.getValue();
        // Otherwise return value of ValueNode
    }

}
