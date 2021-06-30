package Java_algorithm_test.algorithm_test04;

import java.io.IOException;
import java.util.HashMap;

/**
 * コインケースのクラス。
 * 500 円、100 円、50 円、10 円、5 円、1 円が、それぞれ何枚あるかを管理する。
 */
public class CoinCase {
    private HashMap<Integer, Integer> coins = new HashMap();

    public CoinCase() {
        int[] coinKindList = {500, 100, 50, 10, 5, 1};
        for (int coinKind : coinKindList) {
            coins.put(coinKind, 0);
        }
    }

    /**
     * addCoins メソッドで硬貨を追加する。
     * 500 円、100 円、50 円、10 円、5 円、1 円以外の硬貨が入った場合は例外を投げる。
     *
     * @param kind  硬貨の種類
     * @param count 枚数
     */
    public void addCoins(int kind, int count) throws IOException {
        if (coins.containsKey(kind)) {
            coins.put(kind, count);
        } else {
            throw new IOException("不正な値が入力されたため処理を中断しました。硬貨の種類は500 円、100 円、50 円、10 円、5 円、1 円で入力してください。");
        }
    }

    /**
     * getCount メソッドで、指定した硬貨が、何枚あるかを取得する。
     *
     * @param kind 硬貨の種類
     * @return 硬貨の枚数
     */
    public int getCount(int kind) {
        return coins.get(kind);
    }

    /**
     * getAmount メソッドで硬貨の総額を取得する。
     *
     * @return 硬貨の総額
     */
    public int getAmount() {
        int amount = 0;
        for (int coinKind : coins.keySet()) {
            amount += coinKind * coins.get(coinKind);
        }
        return amount;
    }
}

