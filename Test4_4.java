/**
 *【4-4】
 * 数当てクイズver.2
 */
public class Test4_4 {
    public static void main(String[] args) {
        int[] numbers = {3, 4, 9};

        System.out.println("1桁の数字を入力してください");

        int input = new java.util.Scanner(System.in).nextInt();

        for (int hitNumber : numbers) {
            if(input == hitNumber) {
                System.out.println("アタリ！");
            }
        }
    }
}
