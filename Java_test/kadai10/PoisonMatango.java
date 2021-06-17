package Java_test.kadai10;

/**
 * 【10-3】
 * Matangoクラスを継承したPoisonMatangoクラス
 */
public class PoisonMatango extends Matango {
    int poison = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero hero) {
        super.attack(hero);

        if (this.poison != 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int poisonDamage = hero.hp / 5;
            hero.hp -= poisonDamage;
            System.out.println(poisonDamage + "ポイントのダメージ！");
            this.poison--;
        }
    }
}
