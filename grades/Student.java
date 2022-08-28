package grades;

import java.io.*;
import java.nio.file.*;
import java.util.*;

/*
Read in the students and their grades (an array of classes OR 2 parallel arrays)

Calculate the average grade for each student and create an array that holds the AVERAGE grade for each student (again,
your implementation is different for a class implementation VS using static functions)

Once all students averages have been completed, sort the averages from lowest to highest
 */

public class Student {
  public static String fname = "C:/Users/vroom/OneDrive/Documents/GitHub/array-projects-cs2/grades/grades.txt";

  public static int getNumStudents() {
    Path path = Paths.get(fname);
    int numStudents = 0; // (aka # of lines)
    try {
      numStudents = (int) Files.lines(path).count();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return numStudents;
  }

  public static double[] getAvgGrades(int[][] grades, int numStudents) {
    double[] studentAvgs = new double[numStudents];
    double temp = 0;
    for (int i = 0; i < grades.length; i++) {
      for (int j = 0; j < grades[i].length; j++) {
        temp += grades[i][j];
      }
      temp /= 5;
      studentAvgs[i] = temp;
      temp = 0;
    }

    return studentAvgs;
  }
}
