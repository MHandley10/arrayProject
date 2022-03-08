package com.sparta.arrayProject;
import java.util.Arrays;

public class App {

    public static void main(String[] args) {
        int[] myArray = new int[]{14, 56, 23, 18, 100, 91, 84};
        BubbleSort.bubbleSort(myArray);
        System.out.println(Arrays.toString(myArray));
        }
    }