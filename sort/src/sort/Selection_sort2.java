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
public class Selection_sort2 {
    public static void sort( int arr[] ){
        int N = arr.length;
        int i, j, pos, temp;
        for (i = 0; i < N-1; i++)
        {
            pos = i;
            for (j = i+1; j < N; j++)
            {
                if (arr[j] < arr[pos])
                {
                    pos = j;
                }
            }
            // Swap the values
           temp = arr[i];
            arr[i] = arr[pos];
            arr[pos]= temp;            
        }
        printNumbers(arr);
    }

//display the content of sorted array
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
sort(input);
    }

   
}
