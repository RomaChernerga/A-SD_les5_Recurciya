package lesson5.sort;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QuickSort {
    public static List<Integer> quickSort(List<Integer> arr) {

        if(arr.isEmpty()) {return arr;}  // метод в случае, если массив у нас пустой

        List<Integer> left = new LinkedList<>();  // то что левее базового элемента создаем
        List<Integer> right = new LinkedList<>();  // то что правее базового элемента создаем
        List<Integer> middle = new LinkedList<>();

        Integer base = arr.get(0); // находим базовый элемент, сделаем его первым в листе для простоты

        // ПРОПИСЫВАЕМ МЕТОДЫ ДЕЛЕНИЯ МАССИВА НА 3 ЧАСТИ - ПОСЕРЕДИНЕ, СПРАВА И СЛЕВА - через итератор
        for (Integer n : arr) {
            if(n.equals(base)) { // сравниваем, если базовое число = число которое проверяем, то добавляем n в middle
                middle.add(n);
            } else if (n.compareTo(base) > 0) {  //если число
                right.add(n);  // отправляем в правую коллекцию
            } else {
                left.add(n);  // иначе отправляем в левую коллекцию
            }
        }
        //МЕТОДЫ ДЛЯ СОРТИРОВКИ МАССИВА
        left = quickSort(left);
        right = quickSort(right);

        //  СКЛЕИВАНИЕ МАССИВА
        left.addAll(middle); // добавляем к левой части среднюю
        left.addAll(right); // и после добавляем и правую часть

        return left;
    }

    public static void sort(Integer[] arr) {
        List<Integer> list = Arrays.asList(arr); // создаем arrayList

        quickSort(list).toArray(arr);   // отдаем ArrayList на вход quickSort
    }
}
