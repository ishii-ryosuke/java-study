package kadai17;

/**
 * 【17-3】
 * Integer.parseInt()の例外処理
 */
public class Test17_3 {
    public static void main(String[] args) {
        try {
            String stringThree = "三";
            int intThree = Integer.parseInt(stringThree);
            System.out.println(intThree);
        } catch (NumberFormatException e) {
            System.out.println("文字列が構文解析不可能な整数型です");
        }
    }
}
