package Java_test.kadai05;

/**
 * 【5-1】
 * メソッド「introduceOneself」
 */
public class Test5_1 {
    public static void main(String[] args) {
        introduceOneself();
    }

    public static void introduceOneself() {
        String name = "石井亮佑";
        int age = 22;
        double height = 178.0;
        char eto = '寅';

        System.out.println("私の名前は" + name + "です。\n年齢は" + age +
                "歳で、身長は" + height + "cmです。\n私の干支は" + eto + "年です。");
    }
}
