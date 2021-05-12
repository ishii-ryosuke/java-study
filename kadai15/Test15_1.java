package kadai15;

/**
 * 【15-1】
 * 文字列を連結したり分割したりするプログラム
 */
public class Test15_1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0 ; i < 100 ; i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(",");
        }

        String numberString = stringBuilder.toString();

        System.out.println(numberString);

        String[] stringList = numberString.split(",");

        for (int i = 0 ; i < 10 ; i++) {
            System.out.println(stringList[i]);
        }
    }
}
