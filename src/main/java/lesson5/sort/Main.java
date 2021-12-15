package lesson5.sort;

import Files.CW_les3.MyArray;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        MyArray.isRepeat = false;  // повторяющиеся значения
        MyArray.isShuffle = true;  // перемешивание
        final int SIZE = 20;  //Размер массива

        Integer[] arr = MyArray.getArray(SIZE,2); // шаг не более 5

        System.out.println(Arrays.toString(arr));  //вывод изначального массива

        SpeedTest.startTime();  //вывод времени начала

        QuickSort.sort(arr);  // 63 ms при 50к

        SpeedTest.endTime();    //вывод времени окончания

        System.out.println(Arrays.toString(arr));  //вывод массива после сортировки

    }
}
