public class Homework2 {
    public void run() {
        MatrixReader matrixReader = new MatrixReader();
        SparseMatrix matrixA = matrixReader.read("C:\\Users\\John\\Documents\\GitHub\\CSCI145Homework2\\CSCI145_Homework2\\src\\matrixA.txt");
        SparseMatrix matrixB = matrixReader.read("C:\\Users\\John\\Documents\\GitHub\\CSCI145Homework2\\CSCI145_Homework2\\src\\matrixB.txt");

        System.out.println("Matrix A:");
        matrixA.print();
        System.out.println("Matrix B:");
        matrixB.print();
        // Base matrices
        System.out.println("Transpose of Matrix A:");
        matrixA.transpose().print();
        System.out.println("Transpose of Matrix B:");
        matrixB.transpose().print();
        // Transposed matrices
        System.out.println("Product of Matrix A and Matrix B:");
        matrixA.produce(matrixB).print();
        // Product of matrices
    }
}
