package Java_test.kadai04;

/**
 * 【4-2】
 * 口座残高表示プログラム
 */
public class Test4_2 {
    public static void main(String[] args) {
        int[] moneyList = {121902, 8302, 55100};

        for (int i = 0 ; i < moneyList.length ; i++) {
            System.out.println(moneyList[i]);
        }

        for (int money : moneyList) {
            System.out.println(money);
        }
    }
}
