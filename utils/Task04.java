package utils;


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

        for (int i = 0; i < elements.length; i++) {
            for (int j = 0; j < elements[0].length; j++) {
                text += String.format("%6d", elements[i][j]);
            }
            text+= "\n";
        }

        return text;
    }

    public boolean dimensionAreTheSame(Task04 anotherMatrix){
        boolean result = false;

        if (elements.length == anotherMatrix.elements.length && elements[0].length == anotherMatrix.elements[0].length){
            result = true;
        }

        return result;
    }
    public Task04 sumMatrix(Task04 anotherMatrix){
        Task04 result = null;

        if (dimensionAreTheSame(anotherMatrix)){
            result = new Task04(4,3);
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

        if (dimensionAreTheSame(anotherMatrix)){
            result = new Task04(4,3);
            for (int i = 0; i < elements.length; i++) {
                for (int j = 0; j < elements[0].length; j++) {
                    result.elements[i][j] = elements[i][j] * anotherMatrix.elements[i][j];
                }

            }
        }

        return result;
    }

}


