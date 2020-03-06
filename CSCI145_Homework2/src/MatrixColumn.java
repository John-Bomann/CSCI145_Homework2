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
    // Temporary until sorting is implemented

    public int get(int position) {
        return 0;
    }

}
