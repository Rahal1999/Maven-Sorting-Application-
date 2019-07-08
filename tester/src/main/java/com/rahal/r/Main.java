package com.rahal.r;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Your name
 */
public class Main {
    static List<Integer> arr = new ArrayList<Integer>();
    List<Integer> arrdata = new ArrayList<Integer>();
    public static void main(String args[]) {

        Function_logic logic = new Function_logic();
        Data_bubblesort data = new Data_bubblesort();




        if(logic.menue()==0){
            arr = logic.bubbleSort(data.addData( new ArrayList<>()));
        }else{
            arr = logic.insertionsort(data.addData( new ArrayList<>()));
        }

        for (int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+"  ");
        }
    }
}