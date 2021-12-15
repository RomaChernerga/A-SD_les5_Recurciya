package Files.MassiveWithoutElement;

import java.util.Random;

public class MyArray {

    public static final Random random   = new Random();  //рандомайзер
    public static boolean isRepeat = false;  // переменная для повторения элементов
    public static boolean isShuffle = false;  // переменная для смешивания

//                                                  макс разрыв между элементами массива
//    public static Integer[] getArray(int length, int gapElements) {
//        Integer[] arr = new Integer[length];  // массив из чисел

//        arr[0] = 0;
//        for (int i = 1; i<length; i++) {
//            arr[i] = arr[i-1] + random.nextInt(gapElements + 1) + ((isRepeat) ? 0  : 1);
//        }
//        if (isShuffle) {
//            shuffleArray(arr);
//        }
//        return arr;
//    }
//
//    public static Integer[] getArray(int length){
//        return getArray(length,3);
//    }
//
//    public static void shuffleArray(Integer[] arr) {
//        if(!isShuffle) {
//            return;
//        }
//        int n = arr.length;
//        random.nextInt();
//        for(int i = 0; i < n; i++) {
//            int change = i + random.nextInt(n - i);
//            swap(arr, i, change);
//        }
//
//    }
//
//    private static void swap(Integer[] a, int i, int change) {
//        int temp = a[i];
//        a[i] = a[change];
//        a[change] = temp;
//    }
}
