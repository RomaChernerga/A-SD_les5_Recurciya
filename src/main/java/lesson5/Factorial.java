package lesson5;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(fac(10));
    }

    private static int fac(int n) {
        if(n == 1){ // факториал 1 = 1
            return n;
        }
        return n * fac(n-1); // если у нас не 1
    }
}
