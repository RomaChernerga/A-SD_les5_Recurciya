package Files.CW_les3;

public class BinarySearch {
    public static int search (Integer[] arr, int num){  // класс массива интовых чисел и число, которое будем искать в массиве

        int start = 0; // левая граница
        int end = arr.length - 1; // последний элемент
        int base; // базовый элемент для вычисления - середина
        int i = 0;

        while (end >= start) {
            i++;
            base = (start + end) / 2;
            System.out.println("Base: " + base);
            if(arr[base] == num) { // если это число соответствует тому, которое ищем, мы его возвращаем
                System.out.println("Кол-во итераций: " + i);
                return base;
            } else if (arr[base] < num) { //если искомое число больше базового, то переносим старт на +1 от базового
                start = base + 1;
            } else {
                end = base - 1;
            }
        }
        System.out.println("Кол-во итераций: " + i);
        return -1;
    }
}
