import utils.Task04;
import java.util.Scanner;

public class task04Main {
    public static void main(String[] args) {
        Task04 matrixA = new Task04(4,3);
        Task04 matrixB = new Task04(4,3);

        matrixA.generateRandomMatrix(-20, 20);
        matrixB.generateRandomMatrix(-20, 20);

        System.out.println("\nMatrix A:");
        System.out.println(matrixA);

        System.out.println("Matrix B:");
        System.out.println(matrixB);

        System.out.println("Summed Matrix:");
        System.out.println(matrixA.sumMatrix(matrixB));

        System.out.println("Multiplicated Matrix:");
        System.out.println(matrixA.multiMatrix(matrixB));
    }

}
