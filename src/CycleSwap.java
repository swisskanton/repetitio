package com.epam.rd.autotasks;

import java.util.Arrays;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if (array.length > 0) {
            int temp  = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
            array[0] = temp;
        }
        System.out.println(Arrays.toString(array));
    }

    static void cycleSwap(int[] array, int shift) {
        if (array.length > 0) {
            int[] tempEnd = new int[shift];
            System.arraycopy(array, array.length - shift, tempEnd, 0, shift);
            int[] tempStart = new int[array.length - shift];
            System.arraycopy(array, 0, tempStart, 0, array.length - shift);
            System.arraycopy(tempEnd, 0, array, 0, tempEnd.length);
            System.arraycopy(tempStart, 0, array, tempEnd.length, tempStart.length);
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        int[] array = new int[]{ 1, 3, 2, 7, 4 };
        System.out.println(Arrays.toString(array));
        CycleSwap.cycleSwap(array);
        CycleSwap.cycleSwap(array, 3);
        CycleSwap.cycleSwap(array, 2);
    }

}
