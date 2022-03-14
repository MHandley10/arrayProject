package com.sparta.arrayProject;

public class SplitMergeSort {
    public static int[] splitMergeSort(int[] arrayIn){
        int midPoint = (arrayIn.length / 2) - 1;
        int[] splitArray1 = new int[midPoint];
        int[] splitArray2 = new int[midPoint];
        if (arrayIn.length == 1){
            return arrayIn;
        } else if (arrayIn.length > 1){
            for (int i = 0; i < midPoint - 1; i++){
                splitArray1[i] = arrayIn[i];
            }
            for (int j = midPoint; j < arrayIn.length - 1; j++){
                splitArray2[arrayIn.length - j] = arrayIn[j];
            }
        }
    return splitMergeSort(splitArray1);}
}
