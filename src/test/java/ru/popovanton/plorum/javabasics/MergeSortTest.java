package ru.popovanton.plorum.javabasics;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortTest {

    int[] array;

    @Before
    public void setUp() throws Exception {
        array = new int[] {10, 3, 2, 7, 1, 9, 4, 8, 5};
    }

    @Test
    public void mergeSort() {
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array);
        System.out.println(Arrays.toString(array));
    }
}