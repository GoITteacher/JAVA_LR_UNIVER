package org.example;
import java.util.Scanner;

public class Matrix {
    int[][] matrix;
    private int width = 0;
    private int height = 0;
    private static final int MAX_WIDTH = 20;
    private static final int MAX_HEIGHT = 20;

    public Matrix(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть ширину матриці: ");
        width = scanner.nextInt();

        System.out.print("Введіть висоту матриці: ");
        height = scanner.nextInt();

        if (width > MAX_WIDTH || height > MAX_HEIGHT) {
            System.out.println("Ширина і висота матриці не можуть бути більше 20");
            return;
        }

        System.out.println("Оберіть заповнення матриці: ");
        System.out.println("1) Ручне");
        System.out.println("2) Рандомне");
        System.out.print("--> ");
        if (scanner.next().equals("1")) {
            matrix = createMatrixManually(scanner, width, height);
        } else {
            matrix = createMatrixRandomly(width, height);
        }
    }

    private static int[][] createMatrixManually(Scanner scanner, int width, int height) {
        int[][] matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("Введіть елемент матриці на позиції (" + i + ", " + j + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    private static int[][] createMatrixRandomly(int width, int height) {
        int[][] matrix = new int[width][height];
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }

    public int findMin() {
        int min = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        return min;
    }

    public int findMax() {
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }

    public int getAverage() {
        int avg = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                    avg += matrix[i][j] / (width * height);
            }
        }
        return avg;
    }

    public int getGeometryAverage() {
        int avg = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                avg *= matrix[i][j];
            }
        }
        return avg / (width * height);
    }
}
