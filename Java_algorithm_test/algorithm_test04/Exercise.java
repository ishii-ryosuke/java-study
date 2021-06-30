package Java_algorithm_test.algorithm_test04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * [アルゴリズム課題4]
 * CoinCase クラスを使用して次のプログラムを作成しなさい。
 * ・CoinCase クラスのインスタンスを作成する。
 * ・種類と枚数を入力し、addCoins メソッドで硬貨を追加することを 10 回繰り返す。
 * ・getCountメソッドで各硬貨が何枚あるかを表示する。
 * ・getAmountメソッドで総額を表示する。
 */
public class Exercise {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            CoinCase myCase = new CoinCase();
            for (int index = 0; index < 10; index++) {
                // 入力フェーズ
                System.out.println("硬貨の種類は？");
                int kind = Integer.parseInt(reader.readLine());
                System.out.println("硬貨の枚数は?");
                int count = Integer.parseInt(reader.readLine());
                myCase.addCoins(kind, count);
                // 出力フェーズ
                outputMessage(myCase);
            }
        } catch (IOException e) {
            System.out.println("入力エラー：" + e.getMessage());
        }
    }

    public static void outputMessage(CoinCase myCase) {
        int[] coinKindList = {500, 100, 50, 10, 5, 1};
        for (int coinKind : coinKindList) {
            StringBuilder coinStatusString = new StringBuilder();
            coinStatusString.append(coinKind);
            coinStatusString.append("円は");
            coinStatusString.append(myCase.getCount(coinKind));
            coinStatusString.append("枚");
            System.out.println(coinStatusString);
        }
        System.out.println("総額は" + myCase.getAmount() + "円");
    }
}
