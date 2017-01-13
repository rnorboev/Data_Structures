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
public class Selection_Sort {
    
    public static void main(String[] args){
//unsorted array
int[] input = {1, 23, 2, 4, 56, 80};
//sorted array using selection sort
sort(input);
    }
//display the content of sorted array
private static void printNumbers(int[] input) {
         
        for (int i = 0; i < input.length; i++) {
            System.out.print(input[i] + ", ");
        }
        System.out.println("\n");
    }
   public static void sort( int list[] ){
        int min; 
          int      temp;
        for (int i = 0; i < list.length-1; i++)
        {
            min = i;
            for (int j = i+1; j < list.length; j++)
            {
                if (list[j] > list[min]) // 
                {
                    min = j;
                }
            }
           // Swap the values
           temp = list[i];
            list[i] = list[min];
            list[min]= temp;            
        }
        printNumbers(list);
    }
   
}