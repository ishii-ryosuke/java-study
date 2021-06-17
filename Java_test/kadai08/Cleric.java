package Java_test.kadai08;

/**
 * 【8-1~8-4】
 * 聖職者「クレリック」を表現するクラス
 * ・名前、HP、MPの追加
 * ・「セルフエイド」
 * ・「祈る」
 */
public class Cleric {
    String name;
    int hp;
    final int MAX_HP = 50;
    int mp;
    final int MAX_MP = 10;

    public void selfAid() {
        System.out.println(this.name + "は、セルフエイドを唱えた！");
        this.hp = this.MAX_HP;
        this.mp -= 5;
        System.out.println("HPは、" + this.hp + "になった");
    }

    public int pray(int second) {
        System.out.println(this.name + "は、" + second + "秒祈った！");
        int healMp = second + new java.util.Random().nextInt(3);
        this.mp += healMp;

        if(this.mp > this.MAX_MP) {
            this.mp = this.MAX_MP;
        }

        System.out.println("MPは、" + healMp + "回復した");
        return healMp;
    }
}
