package com.javarush.task.task09.task0926;

import java.util.ArrayList;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] arr1 = {3,2,5,6,23};
        int[] arr2 = {3,2};
        int[] arr3 = {3,2,1,4};
        int[] arr4 = {3,2,5,6,23,245,1};
        int[] arr5 = new int[0];
        arrayList.add(arr1);
        arrayList.add(arr2);
        arrayList.add(arr3);
        arrayList.add(arr4);
        arrayList.add(arr5);
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
}
