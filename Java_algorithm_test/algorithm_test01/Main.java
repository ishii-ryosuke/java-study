package Java_algorithm_test.algorithm_test01;

/**
 * [アルゴリズム課題1]
 * 西暦から干支を算出するプログラムを作成してください。
 * 算出した結果を元に下記のようなメッセージをSystem.out.printで表示してください。
 * 例：2019年の干支は亥です。
 *
 * ※西暦はグレゴリオ暦に限定する。
 */
public class Main {
    public static void main(String[] args) {
        // 2020年
        outputMessage(2020);
        // 2021年
        outputMessage(2021);
        // 2022年
        outputMessage(2022);
        // 2023年
        outputMessage(2023);
        // 2024年
        outputMessage(2024);
        // 2025年
        outputMessage(2025);
        // 2026年
        outputMessage(2026);
        // 2027年
        outputMessage(2027);
        // 2028年
        outputMessage(2028);
        // 2029年
        outputMessage(2029);
        // 2030年
        outputMessage(2030);
        // 2031年
        outputMessage(2031);
    }
    public static void outputMessage(int year) {
        Zodiac getZodiac = new Zodiac();
        System.out.println(year + "の干支は" + getZodiac.getNameByYear(year) + "です。");
    }
}
