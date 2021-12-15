package lesson5;

import java.io.File;

public class ShowFiles {
    public static void main(String[] args) {
        File file = new File("B:\\java\\A&DS_Rec_les5");
        viewFiles(file); // отправляем файл который будем проверять
    }

    private static void viewFiles(File file, int level) { // метод для проверки файла
        StringBuilder prefix = new StringBuilder(); // формирование табуляции для увеличении level-а
        prefix.append("\t".repeat(level));  // повторять табуляцию столько раз, сколько level

        if(file.isFile()) {
            System.out.println(prefix +"File: " + file.getName());
        } else {
            System.out.println(prefix + "Dir: " + file.getName());
            level++;
            for (File listFiles : file.listFiles()) {
                viewFiles(listFiles, level);// вывод директорий
            }
        }
    }
    private static void viewFiles(File file) {
        viewFiles(file, 0);
    }
}
