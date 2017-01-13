/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author ravshanbek
 */
public class selSort {

    /**
     * Sorts the specified array of integers using the selection sort algorithm.
     *     
     * @param <T>
* @param data the array to be sorted
     */
    public static <T extends Comparable<? super T>> void selectionSort(T[] data) {
        int min;
        T temp;
        for (int index = 0; index < data.length - 1; index++) {
            min = index;
            for (int scan = index + 1; scan < data.length; scan++) {
                if (data[scan].compareTo(data[min]) < 0) {
                    min = scan;
                }
            }
// Swap the values
            temp = data[min];
            data[min] = data[index];
            data[index] = temp;
        }
        printNumbers(data);
    }
        private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
        public static void main(String[] args){
//unsorted array
int[] input = {23, 2, 4, 56, 80};
//sorted array using selection sort
selectionSort(input);
    }
    }
