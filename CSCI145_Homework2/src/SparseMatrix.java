
public class SparseMatrix {
    // This is the constructor.
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
    // Initializes empty MatrixRows for SparseMatrix
    public void initColumns() {
        MatrixColumn temp = firstColumn;
        for(int i = 0; i < totalColumns; i++) {
            temp.setNext(new MatrixColumn());
            temp = temp.getNext();
        }
    }
    // Initializes empty MatrixColumns for SparseMatrix

    public void insert(int row, int column, int value) {
        ValueNode newNode = new ValueNode(row, column, value);
        MatrixRow destinationRow = getRow(row);
        destinationRow.insert(newNode);

        MatrixColumn destinationColumn = getColumn(column);
        destinationColumn.insert(newNode);
    }
    // Creates a new ValueNode, inserts it into appropriate row and column

    public MatrixRow getRow(int position) {
        MatrixRow current = firstRow;
        for(int i = 0; i < position-1; i++) {
            try {
                current = current.getNext();
            } catch(NullPointerException e) {
                System.out.println("getRow was called with a row number greater than the total rows");
                return null;
            }
            // Catches iterating outside of total rows
        }
        return current;
    }
    // Getter for specified MatrixRow

    public MatrixColumn getColumn(int position) {
        MatrixColumn current = firstColumn;
        for(int i = 0; i < position - 1; i++) {
            try {
                current = current.getNext();
            } catch(NullPointerException e) {
                System.out.println("getColumn was called with a column number greater than the total columns");
                return null;
            }
            // Catches iterating outside of total columns
        }
        return current;
    }
    // Getter for specified MatrixRow

    public int getValue(int row, int column) {
        return getRow(row).get(column);
    }
    // Getter for a specified value in the matrix

    public void print() {
        for(int i = 1; i <= totalRows; i++) {
            for(int j = 1; j <= totalColumns; j++) {
                int tempValue = getValue(i,j);
                System.out.print(getValue(i,j) + " ");
                while(tempValue <= 1000) {
                    System.out.print(" ");
                    tempValue = (tempValue + 1) * 10;
                }
                // While loop keeps matrix organized while numbers are less than 10000
            }
            System.out.println("");
        }
        System.out.println("--------------------------------------");
    }
    // Prints out matrix

    public SparseMatrix transpose() {
        SparseMatrix transMatrix = new SparseMatrix(totalColumns, totalRows);
        for(int i = 1; i <= this.totalRows; i++) {
            for(int j = 1; j <= this.totalColumns; j++) {
                transMatrix.insert(j, i, this.getValue(i,j));
                // Inserts into transMatrix with row and column switched
            }
        }
        return transMatrix;
    }

    public SparseMatrix produce(SparseMatrix other) {
        SparseMatrix newMat = new SparseMatrix(totalRows, other.totalColumns);
		for(int row = 1; row <= totalRows; row++){
			for(int column = 1; column <= other.totalColumns; column++){
				int value = 0;
				for(int i = 1; i <= totalColumns; i++){
					value += getValue(row, i)*other.getValue(i, column);
				}
				newMat.insert(row, column, value);
			}
		}
		return newMat;
    }
}
