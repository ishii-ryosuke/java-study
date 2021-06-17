package Java_test.kadai17;

/**
 * 【17-2】
 * try-catch文を用いて例外処理をするプログラム
 */
public class Test17_2 {
    public static void main(String[] args) {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException例外をcatchしました");
            System.out.println("ーースタックトレース（ここから）ーー");
            e.printStackTrace();
            System.out.println("ーースタックトレース（ここまで）ーー");
        }
    }
}
