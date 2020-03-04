
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

    }

    public MatrixRow getRow(int position) {
        return null;
    }

    public MatrixColumn getColumn(int position) {
        return null;
    }

    public int getValue(int row, int column) {
        return 0;
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
