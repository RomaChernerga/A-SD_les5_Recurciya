package Files.CW_les3;

public class InterpolationSearch {
    public static int search (Integer[] arr, int num){  // класс массива интовых чисел и число, которое будем искать в массиве

        int start = 0; // левая граница
        int end = arr.length - 1; // последний элемент
        int base; // базовый элемент для вычисления - середина
        int i = 0;

        while (end >= start && num>= arr[start] && num <= arr[end]) {
            if(arr[end].equals(arr[start])) { // при условии что end и start это один и тот же элемент
                break;
            }
            i++;
            base = (int)(start +
                    1.0 *(end - start) / (arr[end] - arr[start])
            * (num - arr[start]));

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
        if (arr[start] == num) {  //сравниваем искомое число со стартом
            return start;
        }

        System.out.println("Кол-во итераций: " + i);
        return -1;
    }
}
