/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

/**
 *
 * @author Ravshanbek
 */
public class Insertion_Sort {

    public static void main(String[] args) {
        
        int[] input = {90, 8, 7, 56, 123, 235, 9, 1, 653};
        insertionSort(input);
    }
     
    private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
 
    public static void insertionSort(int data[]) {
        int n = data.length;
        for (int index = 1; index < n; index++) {
            int key = data[index];
            int position = index-1;
            
            // Shift larger values to the right
            
            while ( (position >= 0) && ( data [position] > key ) ) { //
                data [position+1] = data [position];
                position--;
            }
            data[position+1] = key;
            printNumbers(data);
        }
    }
}
