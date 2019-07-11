package com.rahal.r;


import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestBubbleSort {

    List<Integer> unsortedList;
    List<Integer> sortedList;
    List<Integer> alreadysortedList;

    @BeforeClass()
    public void initilize(){
         unsortedList = new ArrayList<Integer>();
         sortedList = new ArrayList<Integer>();
         alreadysortedList = new ArrayList<Integer>();


    }


    @Test()
    public void Test1 () {


        unsortedList.add(5);
        unsortedList.add(1);
        unsortedList.add(9);
        unsortedList.add(2);
        unsortedList.add(3);

        alreadysortedList.add(1);
        alreadysortedList.add(2);
        alreadysortedList.add(3);
        alreadysortedList.add(5);
        alreadysortedList.add(9);

        Function_logic fobj = new Function_logic();
        sortedList=fobj.bubbleSort((ArrayList<Integer>) unsortedList);

        Assert.assertEquals(sortedList, alreadysortedList);

    }

    @Test()
    public void Test2 (){



        unsortedList.add(9);
        unsortedList.add(8);
        unsortedList.add(7);
        unsortedList.add(6);
        unsortedList.add(5);

        alreadysortedList.add(5);
        alreadysortedList.add(6);
        alreadysortedList.add(7);
        alreadysortedList.add(8);
        alreadysortedList.add(9);

        Function_logic fobj = new Function_logic();
        sortedList=fobj.bubbleSort((ArrayList<Integer>) unsortedList);

        Assert.assertEquals(sortedList, alreadysortedList);

    }


    @Test()
    public void Test3 (){



        unsortedList.add(9);
        unsortedList.add(8);
        unsortedList.add(0);
        unsortedList.add(2);
        unsortedList.add(3);

        alreadysortedList.add(0);
        alreadysortedList.add(2);
        alreadysortedList.add(3);
        alreadysortedList.add(8);
        alreadysortedList.add(9);

        Function_logic fobj = new Function_logic();
        sortedList=fobj.bubbleSort((ArrayList<Integer>) unsortedList);

        Assert.assertEquals(sortedList, alreadysortedList);

    }


    @Test()
    public void Test4 (){



        unsortedList.add(-9);
        unsortedList.add(-8);
        unsortedList.add(0);
        unsortedList.add(-2);
        unsortedList.add(-3);

        alreadysortedList.add(-9);
        alreadysortedList.add(-8);
        alreadysortedList.add(-3);
        alreadysortedList.add(-2);
        alreadysortedList.add(0);

        Function_logic fobj = new Function_logic();
        sortedList=fobj.bubbleSort((ArrayList<Integer>) unsortedList);

        Assert.assertEquals(sortedList, alreadysortedList);

    }

    @Test()
    public void Test5 (){



        unsortedList.add(9);
        unsortedList.add(8);
        unsortedList.add(0);
        unsortedList.add(-2);
        unsortedList.add(-3);

        alreadysortedList.add(-3);
        alreadysortedList.add(-2);
        alreadysortedList.add(0);
        alreadysortedList.add(8);
        alreadysortedList.add(9);

        Function_logic fobj = new Function_logic();
        sortedList=fobj.bubbleSort((ArrayList<Integer>) unsortedList);

        Assert.assertEquals(sortedList, alreadysortedList);

    }

    @AfterClass()
    public void clear(){
        unsortedList.clear();
        sortedList.clear();
        alreadysortedList.clear();
    }
}
