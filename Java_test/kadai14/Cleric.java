package Java_test.kadai14;

/**
 * 【14-2】
 * 最大HPと最大MPを静的フィールドにしたClericクラス
 */
public class Cleric {
    private String name;
    private int hp;
    public static final int MAX_HP = 50;
    private int mp;
    public static final int MAX_MP = 10;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void selfAid() {
        System.out.println(this.getName() + "は、セルフエイドを唱えた！");
        this.setHp(Cleric.MAX_HP);
        this.setMp(this.getMp() - 5);
        System.out.println("HPは、" + this.getHp() + "になった");
    }

    public int pray(int second) {
        System.out.println(this.getName() + "は、" + second + "秒祈った！");
        int healMp = second + new java.util.Random().nextInt(3);
        this.setMp(this.getMp() + healMp);

        if (this.getMp() > Cleric.MAX_MP) {
            this.setMp(Cleric.MAX_MP);
        }

        System.out.println("MPは、" + healMp + "回復した");
        return healMp;
    }
}
