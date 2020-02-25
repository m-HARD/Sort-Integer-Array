/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Arrays;
/**
 *
 * @author mumus
 */
public class Sort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num[] = {95,24,56,2,47,561,6,9,0,90,-17,21,95,32,6,329,565,333,5,329,0,0,-5,65,32,2,55,32,8,98,54,4};
        System.out.println("By Bubble Sort : ");
        bubbleSort(num);
        System.out.println("By Selection Sort : ");
        selectionSort(num);
        System.out.println("By Musab Sort : ");
        musabSort(num);
    }

    private static void bubbleSort(int num[]) {
        int swap;
        for (int j = 0; j < num.length; j++) {
            boolean isswap = false;
            for (int i = 0; i < num.length; i++)
                if(i+1 != num.length)
                    if(num[i] > num[i+1]){
                        swap = num[i];
                        num[i] = num[i+1];
                        num[i+1] = swap;
                        isswap = true;
                    }
            if(!isswap)break;
        }
            
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i] + (i+1<num.length?",":""));
            
        }System.out.println("");
    }

    private static void selectionSort(int num[]) {
        int swap,min;
        for (int j = 0; j < num.length; j++) {
            min = j;
            for (int i = j+1; i < num.length; i++) {
                if(num[min] > num[i]){
                    min = i;
                }
            }
            swap = num[j];
            num[j] = num[min];
            num[min] = swap;
        }
        for (int i = 0; i < num.length; i++) {
                System.out.print(num[i] + (i+1<num.length?",":""));
            }System.out.println("");
    }

    private static void musabSort(int[] num) {
        int[] sortArray = new int[num.length] ;
        int max = num[0];
        
        for (int i = 0; i < num.length; i++)
            if(num[i] > max)
                max = num[i];
        
        Arrays.fill(sortArray, max);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < sortArray.length; j++) {
                if(num[i] < sortArray[j]){
                    sortArray = insertX(sortArray.length, sortArray, num[i], j+1);
                    break;
                }
            }
        }
        
        
        for (int i = 0; i < sortArray.length; i++) {
                System.out.print(sortArray[i] + (i+1<sortArray.length?",":""));
            }System.out.println("");
    }
    
    private static int[] insertX(int n,int arr[],int x,int pos){
        int newarr[] = new int[n];
        for (int i = 0; i < n; i++) {
            if(i < pos - 1)
                newarr[i] = arr[i];
            else if (i == pos - 1)
                newarr[i] = x;
            else
                newarr[i] = arr[i-1];
        }
        return newarr;
    }
}
    
