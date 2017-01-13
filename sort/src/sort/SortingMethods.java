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
import java.util.Scanner;       // Needed for Scanner class
public class SortingMethods

{

    public static void main(String[] args)
    {
        int i;
        int choice = 0;
        int choose = 0;
        String repeat;
        int array[] = new int [10];
        Scanner input = new Scanner(System.in);
 
        do
        {
            System.out.println("Please press <1> for Insertion Sort");
            System.out.println("Please press <2> for Selection Sort");
            System.out.println("Please press <3> for Bubble Sort");
            System.out.println("Please press <99> to EXIT");
 
            choice = input.nextInt();
 
            switch (choice)
            {
 
                case 1:
                    System.out.println("This is Insertion Sorting");
                    System.out.println("<1> for Ascending sorting..");
                    System.out.println("<2> for Descending sorting..");
 
                    choose = input.nextInt();

                do
                {
                    if(choose == 1)
                    {
                        int unsortedValue;    // The first unsorted value
                        int scan = 0;          // Used to scan the array
                        int index;
 

                       System.out.println("Please key in the 10 integers...");
 
                        for(i = 0; i < array.length; i++)

                        {
                            array[i] = input.nextInt();
                        }
 
                        // The outer loop steps the index variable through
                        // each subscript in the array, starting at 1. This
                        // is because element 0 is considered already sorted.
                        for (index = 0; index < array.length; index++)
                        {
                            // The first element outside the sorted subset is
                            // array[index]. Store the value of this element
                            // in unsortedValue.
                            unsortedValue = array[index];
 
                            // Start scan at the subscript of the first element
                            // outside the sorted subset.
                            scan = index;
 
                            // Move the first element outside the sorted subset

                            // into its proper position within the sorted subset.
                            while (scan > 0 && array[scan-1] > unsortedValue)
                            {
                                array[scan] = array[scan - 1];
                                scan--;
                            }
 
                            // Insert the unsorted value in its proper position
                            // within the sorted subset.
                            array[scan] = unsortedValue;
                        }
 
                        for(index=0; index<array.length; index++)
                        {
                            System.out.print(array[index] + " ");
                        }
                    }

 
                    if(choose == 2)
                    {
                        int unsortedValue;    // The first unsorted value
                        int scan = 0;          // Used to scan the array
                        int index;
 

                        System.out.println("Please key in the 10 integers...");
 
                        for(i = 0; i < array.length; i++)
                        {
                            array[i] = input.nextInt();
                        }
 
                        // The outer loop steps the index variable through
                        // each subscript in the array, starting at 1. This
                        // is because element 0 is considered already sorted.
                        for (index = 0; index < array.length; index++)
                        {
 
                            // The first element outside the sorted subset is
                            // array[index]. Store the value of this element
                            // in unsortedValue.
                            unsortedValue = array[index];
 
                            // Start scan at the subscript of the first element
                            // outside the sorted subset.
                            scan = index;
 
                            // Move the first element outside the sorted subset
                            // into its proper position within the sorted subset.
                            while (scan > 0 && array[scan-1] < unsortedValue)
                            {
                                array[scan] = array[scan - 1];
                                scan--;
                              }
 
                            // Insert the unsorted value in its proper position
                              // within the sorted subset.
                            array[scan] = unsortedValue;
 
                        }
 
                        for(index = 0; index<array.length; index++)

                     {

                         System.out.print(array[index] + " ");

                     }

                    }

 
                    else
                  {
                       System.out.println("Invalid input!!");
                       System.out.println("Please choose again..");
                        System.out.println("This is Insertion Sorting");

                        System.out.println("<1> for Ascending sorting..");
                        System.out.println("<2> for Descending sorting..");
 
                        choose = input.nextInt();
                    }
                }while(choose != 1 || choose != 2);
 
 
            break;
 
            case 2:
                System.out.println("This is Selection Sorting");
                System.out.println("<1> for Ascending sorting..");
                System.out.println("<2> for Descending sorting..");
 
                choose = input.nextInt();
 
                if(choose == 1)
                {
                    int startScan;   // Starting position of the scan
                    int index;     // To hold a subscript value
                    int minIndex;   // Element with smallest value in the scan
                    int minValue;   // The smallest value found in the scan
 
                    System.out.println("Please key in the 10 integers...");
 
                    for(i = 0; i < array.length; i++)

                  {

                       array[i] = input.nextInt();
                    }
 
                    for (startScan = 0; startScan < (array.length); startScan++)
                    {

                      minIndex = startScan;

                      minValue = array[startScan];


                        for(index = startScan + 1; index < array.length; index++)

                         {
                            if (array[index] < minValue)
                              {

                              minValue = array[index];
                                  minIndex = index;
                            }

                      }


                        array[minIndex] = array[startScan];

                         array[startScan] = minValue;

                          System.out.print(array[startScan] + " ");
                    }
                }

                if(choose == 2)
                {

                   int startScan;   // Starting position of the scan
                    int index;     // To hold a subscript value
                    int maxIndex;   // Element with biggest value in the scan
                    int maxValue;   // The biggest value found in the scan

                    System.out.println("Please key in the 10 integers...");

                    for(i = 0; i < array.length; i++)
                    {
                        array[i] = input.nextInt();
                    }
 
                    for (startScan = 0; startScan < (array.length); startScan++)
                    {
                        maxIndex = startScan;
                        maxValue = array[startScan]; 
                        for(index = startScan + 1; index < array.length; index++)
                        {
                           if (array[index] > maxValue)
                            {
                                maxValue = array[index];
                                maxIndex = index;
                              }
                        }
 
                        array[maxIndex] = array[startScan];
                        array[startScan] = maxValue;
                        System.out.print(array[startScan] + " ");
                    }
                }
 
            break;
 
            case 3:
                System.out.println("This is Bubble Sorting");
                System.out.println("<1> for Ascending sorting..");
               System.out.println("<2> for Descending sorting..");
 
                choose = input.nextInt();
 
                if(choose == 1)
                {
                    int minElement;   // Marks the last element to compare
                    int index = 0;    // Index of an element to compare
                    int temp;           // Used to swap to elements
 
                    System.out.println("Please key in the 10 integers...");
 
                    for(i = 0; i < array.length; i++)
                    {
                        array[i] = input.nextInt();
                    }
 
                    for (minElement = array.length - 1; minElement >= 0; minElement--)
                    {

                        for (index = 0; index <= minElement - 1; index++)
                        {
                            if (array[index] < array[index + 1])
                              {
                                temp = array[index];
                                array[index] = array[index + 1];
                                  array[index + 1] = temp;
                            }
                        }

                       System.out.print(array[index] + " ");

                  }

                }
 
                    if(choose ==2)

                  {

                      int maxElement;  // Marks the last element to compare
                        int index = 0;     // Index of an element to compare
                        int temp;       // Used to swap to elements
 

                      System.out.println("Please key in the 10 integers...");

                       for(i = 0; i < array.length; i++)
                        {
                            array[i] = input.nextInt();
                        }

                        for (maxElement = array.length - 1; maxElement >= 0; maxElement--)
                        {
                            for (index = 0; index <= maxElement - 1; index++)
                            {
                                if (array[index] > array[index + 1])
                                {
                                      temp = array[index];

                                  array[index] = array[index + 1];

                                    array[index + 1] = temp;
                                }
                            }
                            System.out.print(array[index] + " ");
                        }
                    }
                break;
 
                case 99:
                    System.out.println(">>>>> Thanks for using the program. <<<<<");
 
                break;
            }
 
            System.out.println("\nDo you want to repeat? (Y/N)");
            repeat = input.nextLine();
 
        }while(repeat == "y" || repeat == "Y");
    }
}
