package com.company;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//Différents algorithmes de tri :
// tri à bulle
// QuickSort
// MergeSort

//Implémentation du QuickSort algorithm pour trier un tableau d'entiers
public class QuickSort {

    /* This function takes last element as pivot,
          places the pivot element at its correct
          position in sorted array, and places all
          smaller (smaller than pivot) to left of
          pivot and all greater elements to right
          of pivot */
    static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);//index of smaller element
        for (int j = low; j < high; j++) {
            // if current element is smaller than
            // or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                //swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    /* The main function that implements QuickSort()
      arr[] --> Array to be sorted,
      low  --> Starting index,
      high  --> Ending index */
    static void sort(int arr[], int low, int high) {
        if (low < high) {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    private static int retourneMin(List<Integer> listeEntier) {
        int[] arr = new int[listeEntier.size()];
        for (int i = 0; i < listeEntier.size(); i++) arr[i] = listeEntier.get(i);
        sort(arr, 0, arr.length - 1);
        return arr[0];
    }

    //driver program
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(1);
        list.add(5);

        int arr[] = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        QuickSort ob = new QuickSort();
        ob.sort(arr, 0, n - 1);

        System.out.println("sorted array");
        //printArray(arr);

        int minimum = retourneMin(list);
        System.out.println(minimum+ " est la valeur minimale de ");
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}