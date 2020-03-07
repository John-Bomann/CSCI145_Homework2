public class Homework2 {
    public static void main(String args[]) {
        MatrixRow test = new MatrixRow();
        test.insert(new ValueNode(1,1,8));
        test.insert(new ValueNode(1,2,5));
        test.insert(new ValueNode(1,6,60));
        System.out.println(test.get(1));
        System.out.println(test.get(2));
        System.out.println(test.get(6));
        System.out.println(test.get(3));
        System.out.println(test.get(7));


    }
    public void run() {
        MatrixReader matrixReader = new MatrixReader();
        SparseMatrix matrixA = matrixReader.read("CSCI145_Homework2/src/matrixA.txt");
        SparseMatrix matrixB = matrixReader.read("CSCI145_Homework2/src/matrixB.txt");


    }
}
