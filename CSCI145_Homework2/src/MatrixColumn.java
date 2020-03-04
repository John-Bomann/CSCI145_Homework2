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
		while(temp.getColumn()<column && temp.getNextColumn()!=null && temp.getNextColumn().getColumn()<column){
			temp=temp.getNextColumn();
		}
		if(temp.getColumn==column){
			temp.setValue(value.getValue());
			return;
		}
		ValueNode next = temp.getNextColumn();
		temp.setNextColumn(value);
		value.setNextColumn(next);
    }
    // Temporary until sorting is implemented

    public int get(int position) {
        return 0;
    }

}
