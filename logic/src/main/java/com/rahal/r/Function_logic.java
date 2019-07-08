package com.rahal.r;

import java.util.ArrayList;
import java.util.Scanner;

public class Function_logic {

    public ArrayList<Integer> bubbleSort(ArrayList<Integer> arr)
    {
        int n = arr.size();
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr.get(j) > arr.get(j + 1))
                {
                    // swap arr[j+1] and arr[i]
                    int temp = arr.get(j);
                    arr.set(j, arr.get(j + 1));
                    arr.set(j + 1, temp);
                }
        return arr;
    }

    public ArrayList<Integer> insertionsort(ArrayList<Integer> arr)
    {
        int n = arr.size();
        for (int i = 1; i < n; ++i) {
            int key = arr.get(i);
            int j = i - 1;


            while (j >= 0 && arr.get(j) > key) {
                arr.set(j+1,arr.get(j));
                j = j - 1;
            }
            arr.set(j+1,key);
        }
        return arr;
    }

    public  int menue (){
        Scanner input = new Scanner(System.in) ;
        int choose;
        do{
            System.out.println("0 : Bubble Sort");
            System.out.println("1 : Insertion Sort");
            choose=input.nextInt();

        }while(choose!=0

                && choose!=1);

        return choose;

    }
}
