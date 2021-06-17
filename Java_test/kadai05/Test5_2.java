package Java_test.kadai05;

/**
 * 【5-2】
 * メソッド「email」
 */
public class Test5_2 {
    public static void main(String[] args) {
        email("挨拶", "000@email.com", "おはようございます");
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました\n件名:" + title + "\n本文:" + text);
    }

}
