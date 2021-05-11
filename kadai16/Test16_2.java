package kadai16;

import java.util.ArrayList;

/**
 * 【16-2】
 * HeroをArrayListに格納し、名前を順番に取り出して表示するプログラム
 */
public class Test16_2 {
    public static void main(String[] args) {
        Hero heroSaitou = new Hero("斎藤");
        Hero heroSuzuki = new Hero("鈴木");

        ArrayList<Hero> heroArrayList = new ArrayList<Hero>();
        heroArrayList.add(heroSaitou);
        heroArrayList.add(heroSuzuki);

        for (Hero hero : heroArrayList) {
            System.out.println(hero.getName());
        }
    }
}
