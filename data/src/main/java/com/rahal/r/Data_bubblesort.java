package com.rahal.r;

import java.util.ArrayList;
import java.util.List;

public class Data_bubblesort {
    List<Integer> arr = new ArrayList<Integer>();

    public ArrayList<Integer> addData(ArrayList<Integer> arr) {

        int num=0;
        for (int i = 0; i < 20; i++) {
            num = (int) (Math.random()*10);
            arr.add(num);
        }
        return arr;
    }

//    public static void main (String args[]){
//
//        int [] dataarray = addData();
//        for (int i=0;i<20;i++){
//            System.out.print(dataarray[i]+"  ");
//           // System.out.println(Math.random());
//        }
//    }
}
