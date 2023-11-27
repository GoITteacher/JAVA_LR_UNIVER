package org.example;

public class Main {



    public static void main(String[] args) {
        Matrix matrix = new Matrix();
        
        int min = matrix.findMin();
        int max = matrix.findMax();
        int average = matrix.getAverage();
        int geometricAverage = matrix.getGeometryAverage();

        System.out.println("Мінімальний елемент: " + min);
        System.out.println("Максимальний елемент: " + max);
        System.out.println("Середнє арифметичне: " + average);
        System.out.println("Середнє геометричне: " + geometricAverage);
    }
}
