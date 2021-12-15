package lesson5;

public class Countdown {
    public static void main(String[] args) {
        countdown(5);

    }
    public static void countdown(int n){
        if(n < 1) {return;} // этим условием делаем ограничение по вычитанию из n
        System.out.println(n);
        countdown(n-1); // просим при следующей итерации вычесть из n - 1
        System.out.println("End n = " + n);
    }

}
