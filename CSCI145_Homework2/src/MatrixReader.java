import java.io.File;
import java.util.Scanner;

public class MatrixReader {

    public SparseMatrix read(String file) {
        try {
            File matrix = new File(file);
            Scanner scan = new Scanner(matrix);
            String numRowStr = scan.nextLine();
            int numRow = Integer.parseInt(numRowStr);
            String numColStr = scan.nextLine();
            int numCol = Integer.parseInt(numColStr);
            // Creates scanner, reads first 2 lines
            SparseMatrix sparseMatrix = new SparseMatrix(numRow, numCol);


            int rowCount = 1;
            while (scan.hasNext()) {
                String nextRow = scan.nextLine();
                String[] rowElements = nextRow.split(" ");
                // Splits line into pairs of column positions and values
                for (String val : rowElements) {
                    String[] element = val.split(",");
                    // Splits pairs into column positions and values
                    int colPosition = Integer.parseInt(element[0]);
                    int value = Integer.parseInt(element[1]);
                    sparseMatrix.insert(rowCount, colPosition, value);
                }
                rowCount += 1;
            }
            return sparseMatrix;
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
}
