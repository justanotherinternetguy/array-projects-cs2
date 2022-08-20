// Take a 2-D array and add up the value of the rows and the total value in the entire
// Matrix along with the average number

// You need to be able to perform this against integers and doubles
// 2-D array is 5 rows x 4 columns
/*
[] [] [] []
[] [] [] []
[] [] [] []
[] [] [] []
[] [] [] []
 */

import java.io.*;
import java.util.*;

// TODO: Overload + test for DOUBLES

public class SumArray {
    static void display(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }

    static double average_rows(int[][] matrix) {
        double avg = 0;
        int sum = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += j;
            }
        }
        avg = sum / 20;
        return avg;
    }
    

    static int[][] matrix = new int[5][4];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // user input, row by row
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
            System.out.println("--- NEW ROW ---");
        }
        display(matrix);
        System.out.println(average_rows(matrix));
    }
}
