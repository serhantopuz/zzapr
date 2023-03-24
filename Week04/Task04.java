package Week04;


public class Task04 {
    private int[][] elements;

    public Task04(int numberOfRows, int numberOfColumns) {
        if (0 < numberOfRows && 0 < numberOfColumns){
            this.elements = new int[numberOfRows][numberOfColumns];
        }
    }

    public void generateRandomMatrix(int from, int to){
        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[0].length; j++) {
                elements[i][j] = (int) (from + (to - from) * Math.random());
            }
        }
    }

    @Override
    public String toString() {
        String text = "";

        for (int[] element : elements) {
            for (int j = 0; j < elements[0].length; j++) {
                text += String.format("%6d", element[j]);
            }
            text += "\n";
        }

        return text;
    }

    public boolean dimensionAreTheSame(Task04 anotherMatrix){

        return elements.length == anotherMatrix.elements.length && elements[0].length == anotherMatrix.elements[0].length;
    }
    public Task04 sumMatrix(Task04 anotherMatrix){
        Task04 result = null;

        if (dimensionAreTheSame(anotherMatrix)){
            result = new Task04(3,3);
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[0].length; j++) {
                    result.elements[i][j] = elements[i][j] + anotherMatrix.elements[i][j];
                }

            }
        }

        return result;
    }

    public Task04 multiMatrix(Task04 anotherMatrix){
        Task04 result = null;

        int rowsA = elements.length;
        int colsA = elements[0].length;
        int rowsB = anotherMatrix.elements.length;
        int colsB = anotherMatrix.elements[0].length;

        if (colsA != rowsB) {
            System.out.println("Cannot multiply matrices with incompatible dimensions");
        }
        else{
            result = new Task04(3,3);
            for (int i = 0; i < rowsA; i++) {
                for (int j = 0; j < colsB; j++) {
                    for (int k = 0; k < colsA; k++) {
                        result.elements[i][j] += elements[i][k] * anotherMatrix.elements[k][j];
                    }
                }
            }
        }

        return result;
    }

}


