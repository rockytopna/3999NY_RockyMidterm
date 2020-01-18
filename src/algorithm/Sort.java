package algorithm;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Sort {

    long executionTime = 0;
    /*
     * Please implement all the sorting algorithm. Feel free to add helper methods.
     * Store all the sorted data into one of the databases.
     */


    public int[] selectionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;

        for (int j = 0; j < array.length - 1; j++) {
            int min = j;
            for (int i = j + 1; i < array.length; i++) {
                if (array[i] < array[min])
                    min = i;
            }

            int temp = array[min];
            array[min] = array[j];
            array[j] = temp;
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }

    public int[] insertionSort(int[] array) {
        final long startTime = System.currentTimeMillis();
        int[] list = array;
        //implement here
        int n = list.length;
        for (int i = 1; i < n; ++i) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j = j - 1;
            }
            list[j + 1] = key;
        }
        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] bubbleSort(int[] array) {
        int[] list = array;
        final long startTime = System.currentTimeMillis();
        //implement here
        int n = list.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (list[j] > list[j + 1]) {
                    int temp = list[j];
                    list[j] = list[j + 1];
                    list[j + 1] = temp;
                }
            }
        }

        final long endTime = System.currentTimeMillis();
        final long executionTime = endTime - startTime;
        this.executionTime = executionTime;
        return list;
    }


    public int[] mergeSort(int[] array, int i, int i1) {
        int[] list = array;
        //implement here


        return list;
    }


    public int[] quickSort(int[] array, int i, int i1) {
        // int [] list = array;
        //implement here
        int partition = partition(array, i, i1); // called on helper method

        if (partition - 1 > i) {
            quickSort(array, i, partition - 1);
        }
        if (partition + 1 < i1) {
            quickSort(array, partition + 1, i1);
        }
        return array;

    }

    //__________________Helper method used in quickSort method
    public static int partition(int[] array, int start, int end) {
        int pivot = array[end];

        for (int i = start; i < end; i++) {
            if (array[i] < pivot) {
                int temp = array[start];
                array[start] = array[i];
                array[i] = temp;
                start++;
            }
        }

        int temp = array[start];
        array[start] = pivot;
        array[end] = temp;

        return start;
    }

    public int[] heapSort(int[] array) {
        int[] list = array;
        //implement here
        for (int i = array.length / 2 - 1; i >= 0; i--)
            heapify(array, array.length, i);

        // One by one extraction from heap
        for (int i = array.length - 1; i >= 0; i--) {
            // Move current root to end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            // call max heapify on the reduced heap
            heapify(array, i, 0);
        }
        return array;
    }

    void heapify(int arr[], int n, int i) {
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;


        if (l < n && arr[l] > arr[largest])
            largest = l;


        if (r < n && arr[r] > arr[largest])
            largest = r;


        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;

            heapify(arr, n, largest);
        }
    }


    public int[] bucketSort(int[] array, int noOfBuckets) {
        // int [] list = array;
        //implement here
        List[] buckets = new List[noOfBuckets];

        for (int i = 0; i < noOfBuckets; i++) {
            buckets[i] = new LinkedList<>();
        }

        for (int num : array) {

            buckets[hash(num)].add(num);
        }
        // sort buckets
        for (List bucket : buckets) {
            Collections.sort(bucket);
        }
        int i = 0;
        // Merge buckets to get sorted array
        for (List<Integer> bucket : buckets) {
            for (int num : bucket) {
                array[i++] = num;
            }
        }
        return array;
    }


    public static int hash(int num) {
        return num / 10;
    }


    public int[] shellSort(int[] array) {
        //implement here
        for (int gap = array.length / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < array.length; i++) {
                int key = array[i];
                int j = i;
                while (j >= gap && array[j - gap] > key) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = key;
            }
        }
        return array;
    }

    public static void printSortedArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}