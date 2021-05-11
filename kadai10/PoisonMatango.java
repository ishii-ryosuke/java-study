package kadai10;

/**
 * 【10-3】
 * Matangoクラスを継承したPoisonMatangoクラス
 */
public class PoisonMatango extends Matango {
    int poison = 5;

    public PoisonMatango(char suffix) {
        super(suffix);
    }

    public void attack(Hero poisonedHero) {
        super.attack(poisonedHero);

        if (this.poison != 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int poisonDamage = poisonedHero.hp / 5;
            poisonedHero.hp -= poisonDamage;
            System.out.println(poisonDamage + "ポイントのダメージ！");
            this.poison--;
        }
    }
}
