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
		while(temp.getColumn()<column && temp.getNext()!=null && temp.getNext().getColumn()<column){
			temp=temp.getNext();
		}
		if(temp.getColumn==column){
			temp.setValue(value.getValue());
			return;
		}
		ValueNode next = temp.getNext();
		temp.setNext(value);
		value.setNext(next);
    }
    // Temporary until sorting is implemented

    public int get(int position) {
        return 0;
    }

}
