import java.io.*;
import java.util.*;


public class ReverseArray {
    static int[] reverseArr(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int j = n;
        for (int i = 0; i < n; i++) {
            temp[j-1] = arr[i];
            j--;
        }
        return temp;
    }
    static void display(int[] arr) {
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("how many numbers are you going to enter? ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("enter >> ");
            arr[i] = sc.nextInt();
        }

        display(reverseArr(arr));
    }
}
