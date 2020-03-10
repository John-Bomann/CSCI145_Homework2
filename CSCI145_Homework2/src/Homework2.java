public class Homework2 {
    public static void main(String args[]) {
        Homework2 homework2 = new Homework2();
        homework2.run();
//        SparseMatrix sparseMatrix = new SparseMatrix(4,6);
//        sparseMatrix.insert(1,1,8);
//        sparseMatrix.insert(1,6,60);
//        System.out.println(sparseMatrix.getValue(1,1));
//        System.out.println(sparseMatrix.getValue(1,6));
    }
    public void run() {
        MatrixReader matrixReader = new MatrixReader();
        SparseMatrix matrixA = matrixReader.read("C:\\Users\\John\\Documents\\GitHub\\CSCI145Homework2\\CSCI145_Homework2\\src\\matrixA.txt");
        SparseMatrix matrixB = matrixReader.read("C:\\Users\\John\\Documents\\GitHub\\CSCI145Homework2\\CSCI145_Homework2\\src\\matrixB.txt");
//        SparseMatrix matrix = matrixA.produce(matrixB);
        matrixB.print();
        matrixB.transpose().print();
    }
}
