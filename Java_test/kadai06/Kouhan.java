package Java_test.kadai06;

public class Kouhan {
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせものだ！であえい！");
    }

    public static void showMondokoro() {
        System.out.println("飛車さん、角さん。もういいでしょう。");

        try {
            Thread.sleep(3000); // 3秒(3000ms)間、今のスレッドを停止させる
        } catch (InterruptedException e) {
        }

        System.out.println("この紋所が目に入らぬか！");
        Zenhan.doTogame();
    }
}
