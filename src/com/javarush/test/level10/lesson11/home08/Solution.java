package com.javarush.test.level10.lesson11.home08;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String>[] arrayOfStringList = new ArrayList[5];
        for (int i = 0; i < 5; i++)
        {
            arrayOfStringList[i] = new ArrayList<String>();
            for (Integer j = 0; j < 3; j++)
            {
                String s = j.toString();
                arrayOfStringList[i].add(s);
            }
        }
        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}