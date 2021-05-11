package kadai16;

import java.util.HashMap;
import java.util.Map;

/**
 * 【16-3】
 * 勇者のペアをコレクションに格納し、一つずつ取り出して画面に表示するプログラム
 */
public class Test16_3 {
    public static void main(String[] args) {
        Hero heroSaitou = new Hero("斎藤");
        Hero heroSuzuki = new Hero("鈴木");

        Map<Hero, Integer> heroKillCountMap = new HashMap<Hero, Integer>();
        heroKillCountMap.put(heroSaitou, 3);
        heroKillCountMap.put(heroSuzuki, 7);

        for (Hero hero : heroKillCountMap.keySet()) {
            int kill = heroKillCountMap.get(hero);
            System.out.println(hero.getName() + "が倒した敵=" + kill);
        }
    }
}
