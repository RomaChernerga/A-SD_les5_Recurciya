package Files.MassiveWithoutElement;

public class Main4 {
    public static void main(String[] args) {




        final int SIZE = 15;  //Размер массива
//        Integer[] arr = MyArray.getArray(SIZE,3); // шаг не более
        int[]arr = new int[]{1,2,3,4,5,6,7,9};
//        System.out.println(Arrays.toString(arr) + " <- исходный массив");
//        System.out.println(arr.length + " <- длинна массива");
//        System.out.println(arr[0] + (arr[arr.length-1]) + " <- сумма 1 и последнего элемента");
//        System.out.println(arr[0] + " <- первый элемент");
//        System.out.println(arr[arr.length-1] + " <- последний элемент");
//        System.out.println(((arr[arr.length-1] + arr[0])) - arr.length +" <- Разница между длинной массива и суммой крайних элементов");

        System.out.println(SearchElement.search(arr));






    }

}
