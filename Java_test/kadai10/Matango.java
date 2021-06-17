package Java_test.kadai10;

public class Matango {
    int hp = 50;
    char monsterSymbol;
    public Matango (char monsterSymbol) {
        this.monsterSymbol = monsterSymbol;
    }

    public void attack(Hero h) {
        System.out.println("キノコ" + this.monsterSymbol + "の攻撃");
        System.out.println("10のダメージ");
        h.hp -= 10;
    }
}
