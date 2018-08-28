package java8;

import java.util.Arrays;

public class ParallelArraySorting2 {
    public static void main(String[] args) {
        int a[] = {5, 8, 1, 0, 6, 9, 50, -3};

        for (int i :
                a) {
            System.out.print(i + " ");
        }

        Arrays.parallelSort(a, 0, 4);
        System.out.println("\nArray elements after sorting");

        for (int i :
                a) {
            System.out.print(i + " ");
        }
    }
}
