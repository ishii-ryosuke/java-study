package Java_test.kadai05;

/**
 * 【5-3】
 * メソッド「email」オーバーロード
 */
public class Test5_3 {
    public static void main(String[] args) {
        email("000@email.com", "おはようございます");
    }

    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました\n件名:" + title + "\n本文:" + text);
    }

    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました\n件名:無題" + "\n本文:" + text);
    }
}

