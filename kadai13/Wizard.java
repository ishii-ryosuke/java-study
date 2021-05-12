package kadai13;

/**
 * 【13-1~13-4】
 * カプセル化を意識した魔法使いのクラス
 */
public class Wizard {
    private int hp;
    private int mp;
    private String name;
    private Wand wand;

    public int getHp() {
        return this.hp;
    }

    public void setHp(int hp) {
        if (hp < 0) {
            hp = 0;
        }
        this.hp = hp;
    }

    public int getMp() {
        return this.mp;
    }

    public void setMp(int mp) {
        if (mp < 0) {
            throw new IllegalArgumentException("MPは0以上で設定してください。処理を中断します。");
        }
        this.mp = mp;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("名前は3文字以上で設定してください。処理を中断します。");
        }
        this.name = name;
    }

    public Wand getWand() {
        return this.wand;
    }

    public void setWand(Wand wand) {
        if (wand == null) {
            throw new IllegalArgumentException("杖が設定されていません。魔法使いの使う杖を設定してください。処理を中断します。");
        }
        this.wand = wand;
    }

    public void heal(Hero hero) {
        int basePoint = 10;
        int recovPoint = (int) (basePoint * this.wand.getPower());
        hero.setHp(hero.getHp() + recovPoint);
        System.out.println(hero.getName() + "のHPを" + recovPoint + "回復した！");
    }
}
