/**
 * 【3-6】
 * 数当てゲーム
 */
public class Test3_6 {
    public static void main(String[] args) {
        System.out.println("【数あてゲーム】");

        int answer = new java.util.Random().nextInt(9);

        for (int i = 0 ; i < 5 ; i++) {
            System.out.println("0〜9の数字を入力してください");
            int number = new java.util.Scanner(System.in).nextInt();

            if (number == answer) {
                System.out.println("アタリ！");
                break;
            } else {
                System.out.println("違います");
            }
        }

        System.out.println("ゲームを終了します");
    }
}
