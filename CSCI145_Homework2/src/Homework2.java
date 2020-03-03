
public class Homework2 {
    public static void main(String args[]) {
        SparseMatrix matrix = new SparseMatrix(4,4);
        matrix.insert(1,1,1);
        matrix.insert(2,1,2);
        matrix.insert(3,1,3);
        System.out.println(matrix.getColumn(1));


    }
    public void run() {

    }
}
