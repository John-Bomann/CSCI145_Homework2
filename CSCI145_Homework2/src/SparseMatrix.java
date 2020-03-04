
public class SparseMatrix {
    private int totalRows;
    private int totalColumns;
    private MatrixRow firstRow;
    private MatrixColumn firstColumn;

    public SparseMatrix(int rows, int columns) {
        this.totalRows = rows;
        this.firstRow = new MatrixRow();
        this.totalColumns = columns;
        this.firstColumn = new MatrixColumn();

        initRows();
        initColumns();
    }

    public void initRows() {
        MatrixRow temp = firstRow;
        for(int i = 0; i < totalRows; i++) {
            temp.setNext(new MatrixRow());
            temp = temp.getNext();
        }
    }

    public void initColumns() {
        MatrixColumn temp = firstColumn;
        for(int i = 0; i < totalRows; i++) {
            temp.setNext(new MatrixColumn());
            temp = temp.getNext();
        }
    }

    public void insert(int row, int column, int value) {
        ValueNode newNode = new ValueNode(row, column, value);
        MatrixRow destinationRow = getRow(row);
        destinationRow.insert(newNode);

        MatrixColumn destinationColumn = getColumn(column);
        destinationColumn.insert(newNode);

    }

    public MatrixRow getRow(int position) {
        MatrixRow current = firstRow;
        for(int i = 0; i < position-1; i++) {
            current = current.getNext();
        }
        return current;
    }

    public MatrixColumn getColumn(int position) {
        MatrixColumn current = firstColumn;
        for(int i = 0; i < position-1; i++) {
            current = current.getNext();
        }
        return current;
    }

    public int getValue(int row, int column) {
        MatrixRow current = firstRow;


        for (int i = 0; i < row-1; i++){
            current = current.getNext();
        }

        ValueNode tempNode = current.getFirst();
        while (column != tempNode.getColumn()) {
            tempNode = tempNode.getNextColumn();
    }

        return tempNode.getValue();
    }

    public void print() {

    }

    public SparseMatrix transpose() {
        return null;
    }

    public SparseMatrix produce(SparseMatrix other) {
        return null;
    }
}
