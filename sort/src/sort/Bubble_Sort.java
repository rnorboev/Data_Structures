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
public class Bubble_Sort {
    public static void main(String[] args) {
        int[] input = { 90, 8, 7, 56, 123, 235, 9, 1, 653 };
        bubble_srt(input);
 
    }
private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
  
    // logic to sort the elements
    public static void bubble_srt(int data[]) {
        int n = data.length;
        int k;
        for (int position = n; position >= 0; position--) {
            for (int scan = 0; scan < n - 1; scan++) {
                k = scan + 1;
                if (data[scan] > data[k]) { // 
                    swapNumbers(scan, k, data);
                    
                }
            }
            printNumbers(data);
        }
    }
 
    private static void swapNumbers(int i, int j, int[] data) {
 
        int temp;
        temp = data[i];
        data[i] = data[j];
        data[j] = temp;
    }
}