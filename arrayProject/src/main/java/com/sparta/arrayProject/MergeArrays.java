package com.sparta.arrayProject;

public class MergeArrays {
    public static int[] mergeArrays(int[] arrayIn1, int [] arrayIn2){
        int[] mergedArray = new int[arrayIn1.length + arrayIn2.length];

        int arrayIn1Count = 0;
        int arrayIn2Count = 0;
        int mergedArrayCount = 0;
        while (arrayIn1Count < arrayIn1.length && arrayIn2Count < arrayIn2.length){
            if (arrayIn1[arrayIn1Count] < arrayIn2[arrayIn2Count]){
                mergedArray[mergedArrayCount] = arrayIn1[arrayIn1Count];
                arrayIn1Count ++;
            } else{
                mergedArray[mergedArrayCount] = arrayIn2[arrayIn2Count];
                arrayIn2Count ++;
            }
        mergedArrayCount ++;}
        while (arrayIn1Count < arrayIn1.length){
            mergedArray[mergedArrayCount] = arrayIn1[arrayIn1Count];
        arrayIn1Count++;
        mergedArrayCount++;}
        while (arrayIn2Count < arrayIn2.length){
            mergedArray[mergedArrayCount] = arrayIn2[arrayIn2Count];
            arrayIn2Count++;
            mergedArrayCount++;
        }

    return mergedArray;}
}
