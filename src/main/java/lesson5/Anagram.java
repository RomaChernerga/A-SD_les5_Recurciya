package lesson5;

import java.util.LinkedHashSet;
import java.util.Set;

public class Anagram {

    private Set<String> resultSet = new LinkedHashSet<>();
    private char[] chars; // массив из всех символов

    public static void main(String[] args) {

        System.out.println(new Anagram().findAllStrings("КБАН"));

    }




    private Set<String> findAllStrings(String word) {
        resultSet.clear(); // сбрасываем сет
        chars = word.toCharArray(); // разбиваем массив на символы

        find(chars.length);  // метод для перебора массива, передаем на вход длину символов

        return resultSet;  // вернуть ответ
    }

    private void find(int length) {
        if(length == 1) {   // выполняем метод ниже, пока длинна неравна 1
            return;
        }

         // МЕТОД ДЛЯ СДВИГА
        for (int i = 0; i < length; i++) { // этот цикл будет заниматься сдвигами
            find(length - 1);       // первый сдвиг
            resultSet.add(String.valueOf(chars)); // добавляем элемент в resultSet после рекурсии/сдвига
            rotate(length);
        }
    }

    private void rotate(int length) {
        int first = chars.length - length; // вычисление первого элемента

        char temp = chars[first]; // переменная для сохранения промежуточного результата
        for (int i = first + 1; i < chars.length; i++) {    // проходимся по массиву начиная с первого после прошлого первого элемента
            chars[i - 1] = chars[i];  // сдвигаем элементы еще на 1 и присваиваем
        }
        chars[chars.length - 1] = temp;

    }
}
