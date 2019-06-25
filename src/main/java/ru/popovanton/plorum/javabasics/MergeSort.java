package ru.popovanton.plorum.javabasics;

public class MergeSort {

    public void mergeSort(int[] array) {
        division(array, array.length);
    }

    private void division(int[] array, int arrayLength) {
        if (arrayLength < 2) {
            return;
        }
        int middle = arrayLength/2;
        int[] leftArray = new int[middle];
        int[] rightArray = new int[arrayLength-middle];
        int i = 0;
        while (i < leftArray.length) {
            leftArray[i] = array[i];
            i++;
        }
        int j = 0;
        while (j < rightArray.length) {
            rightArray[j] = array[i];
            i++;
            j++;
        }

        division(leftArray, middle);
        division(rightArray, arrayLength-middle);
        merge(array, leftArray, rightArray);

    }

    private void merge(int[] targetArray, int[] leftArray, int[] rightArray) {
        int i = 0;
        int j = 0;
        int m = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                targetArray[m++] = leftArray[i++];
            } else {
                targetArray[m++] = rightArray[j++];
            }
        }

        while (i < leftArray.length) {
            targetArray[m++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            targetArray[m++] = rightArray[j++];
        }
    }
}
