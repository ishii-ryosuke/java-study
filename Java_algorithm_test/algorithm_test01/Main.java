package Java_algorithm_test.algorithm_test01;

/**
 * [アルゴリズム課題1]
 * 西暦から干支を算出するプログラムを作成してください。
 * 算出した結果を元に下記のようなメッセージをSystem.out.printで表示してください。
 * 例：2019年の干支は亥です。
 * <p>
 * ※西暦はグレゴリオ暦に限定する。
 */
public class Main {
    public static void main(String[] args) {
        for (int year = 2020; year <= 2031; year++) {
            outputMessage(year);
        }
    }
    public static void outputMessage(int year) {
        Zodiac getZodiac = new Zodiac();
        System.out.println(year + "の干支は" + getZodiac.getNameByYear(year) + "です。");
    }
}
