
public class Homework2 {
    public static void main(String args[]) {
        SparseMatrix matrix = new SparseMatrix(4,4);
        matrix.insert(1,1,1);
        matrix.insert(3,1,3);
        matrix.insert(2,1,2);
        matrix.insert(2,4,7);
        matrix.insert(2,2,9);

        System.out.println(matrix.getValue(1,1));
        System.out.println(matrix.getValue(2,1));
        System.out.println(matrix.getValue(3,1));
        System.out.println(matrix.getValue(2,2));
        System.out.println(matrix.getValue(2,4));




    }
    public void run() {

    }
}
