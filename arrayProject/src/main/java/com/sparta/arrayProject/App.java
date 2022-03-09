package com.sparta.arrayProject;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] myArray = new int[]{14, 56, 23, 18, 100, 91, 84};
        int[] array1 = {1, 15, 23, 9, 5, 18};
        int[] array2 = {77, 18, 2, 19, 5, 3};
        BubbleSort.bubbleSort(myArray);
        BubbleSort.bubbleSort(array1);
        BubbleSort.bubbleSort(array2);
        System.out.println(Arrays.toString(myArray));
        System.out.println(MergeSort.mergeSort(array1, array2));
        }
    }