package comment;

public class Kouhan {
    public static void callDeae() {
        System.out.println("えぇい、こしゃくな。くせものだ！であえい！");
    }
    public static void showMondokoro() {
        System.out.println("飛車さん、角さん。もういいでしょう。");

        try {
            java.lang.Thread.sleep(3000);// 10秒(10000ms)間、今のスレッドを停止させる
        } catch (InterruptedException e) {
        }

        System.out.println("この紋所が目に入らぬか！");
        Zenhan.doTogame();
    }
}
