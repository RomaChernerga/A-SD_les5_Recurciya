package Files.MassiveWithoutElement;

public class SearchElement {
    public static boolean search (int[] arr) {

        int start = 0; // левая граница
        int end = arr.length-1; // последний элемент
        int dif_elements = ((arr[end] + arr[start])); // сумма между последним и 1 элементом
        int length_mas = arr.length;
        int base; // базовый элемент для вычисления - середин


        while ((dif_elements - length_mas) > 1  ) {
            base = (start + end)/2 ;  // = 2
            System.out.println(base + "-> base1");
            if((arr[base] - base) == 2 ) {
                System.out.println("пропущенный элемент на позиции->" + base);
                break;
            } else if ( (arr[base] - base) == 1  ) {
                start = base + 1;
            } else {
                end = base - 1;
            }
        }
        return false;
    }

}
