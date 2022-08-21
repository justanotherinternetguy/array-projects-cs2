package grades;
// TODO: ADD READ FROM FILE, TIMING THE SORTS
import java.util.*;
public class Main {
    static void display(double[] arr) {
        for (double x : arr) {
            System.out.println(x);
        }
    }

    static void BBsort(double[] arr) {
        for (int i = 0; i < arr.length-1; i++) {
            boolean swapped = false;
            for (int j = 0; j < (arr.length-i-1); j++) {
                if (arr[j] > arr[j+1]) {
                    // swap
                    double temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        int numStudents = s1.getNumStudents();
        System.out.println(numStudents);

        int[][] grades = {{10, 10, 6, 6, 6}, {6, 6, 6, 6, 6}, {60, 1, 20, 1, 50}, {19, 30, 10, 50, 3}};
        double[] studentAvgs_bb = s1.getAvgGrades(grades, numStudents);
        System.out.println("--- BBSORT ---");
        System.out.println("before");
        display(studentAvgs_bb);

        // BBsort
        System.out.println("after");
        BBsort(studentAvgs_bb);
        display(studentAvgs_bb);


        Student s2 = new Student();
        double[] studentAvgs_ArraysSort = s2.getAvgGrades(grades, numStudents);
        System.out.println("--- ARRAYS.SORT ---");
        System.out.println("before");
        display(studentAvgs_ArraysSort);
        Arrays.sort(studentAvgs_ArraysSort);
        System.out.println("after");
        display(studentAvgs_ArraysSort);
    }
}
