/**
 * 【10-3】
 * Matangoクラスを継承したPoisonMatangoクラス
 */
public class PoisonMatango extends Matango {
    int poison = 5;

    public PoisonMatango(char sufffix) {
        super(sufffix);
    }

    public void attack(Hero h) {
        super.attack(h);

        if (this.poison != 0) {
            System.out.println("さらに毒の胞子をばらまいた！");
            int poisonDamage = h.hp / 5;
            h.hp -= poisonDamage;
            System.out.println(poisonDamage + "ポイントのダメージ！");
            this.poison--;
        }
    }
}
