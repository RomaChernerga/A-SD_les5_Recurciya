package Files.CW_les3;

public class SpeedTest {
    private static long time;


    public static void startTime() {
        time = System.currentTimeMillis();
    }

    public static void endTime() {
        time = System.currentTimeMillis() - time;
        System.out.println(time);
    }
}
